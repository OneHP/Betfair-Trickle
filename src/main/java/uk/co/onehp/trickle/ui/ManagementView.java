package uk.co.onehp.trickle.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import uk.co.onehp.trickle.controller.domain.DomainController;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.BaseTheme;

@Configurable(preConstruction=true)
public class ManagementView extends CustomComponent {

	private static final long serialVersionUID = -7685951505228975943L;

	@Autowired
	private DomainController domainController;

	private VerticalLayout mainLayout;

	private Button wipeButton;
	private Button rebuildButton;
	private Button updatePricesButton;

	private final MenuContainer parent;

	public ManagementView(MenuContainer parent){
		buildView();
		setCompositionRoot(this.mainLayout);
		this.parent = parent;
	}

	private void buildView(){

		this.mainLayout = new VerticalLayout();
		this.mainLayout.setSpacing(true);
		this.mainLayout.setMargin(true);

		this.wipeButton = new Button("Wipe Database", this.wipeListener);
		this.wipeButton.setStyleName(BaseTheme.BUTTON_LINK);
		this.rebuildButton = new Button("Rebuild Database", this.rebuildListener);
		this.rebuildButton.setStyleName(BaseTheme.BUTTON_LINK);
		this.updatePricesButton = new Button("Update Prices", this.updatePricesListener);
		this.updatePricesButton.setStyleName(BaseTheme.BUTTON_LINK);

		this.mainLayout.addComponent(this.wipeButton);
		this.mainLayout.addComponent(this.rebuildButton);
		this.mainLayout.addComponent(this.updatePricesButton);

	}

	private final ClickListener wipeListener = new ClickListener() {
		private static final long serialVersionUID = 7142953766674438128L;
		@Override
		public void buttonClick(ClickEvent event) {
			ManagementView.this.domainController.wipeDatabase();
			ManagementView.this.parent.resetMeetings();
		}
	};

	private final ClickListener rebuildListener = new ClickListener() {
		private static final long serialVersionUID = -8746037845684399012L;
		@Override
		public void buttonClick(ClickEvent event) {
			ManagementView.this.domainController.rebuildDatabase();
		}
	};

	private final ClickListener updatePricesListener = new ClickListener() {
		private static final long serialVersionUID = -4962076307699601379L;
		@Override
		public void buttonClick(ClickEvent event) {
			ManagementView.this.domainController.updatePrices();
		}
	};
}
