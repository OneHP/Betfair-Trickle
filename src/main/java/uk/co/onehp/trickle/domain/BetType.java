package uk.co.onehp.trickle.domain;

public enum BetType {

	LIMITED_SP("limitedSp"),
	
	MOC_EXCHANGE("mocExchange");
	
	private String type;
	
	BetType(String type){
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
