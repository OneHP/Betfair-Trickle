/*
 * Betfair Trickle. Automatic bet pimport java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.LocalDateTime;
tion; either version 2 of the License, or (at your
 * option) any later version. This program is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package uk.co.onehp.trickle.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.LocalDateTime;

@Entity
public class BetLog extends BaseDomainObject {

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	private final LocalDateTime placedDateTime;
	private final BigDecimal liability;
	private final BigDecimal price;
	private final BetType betType;
	
	public BetLog(){
		placedDateTime = null;
		liability = null;
		price = null;
		betType = null;
	}
	
	public BetLog(LocalDateTime placedDateTime, BigDecimal liability, BigDecimal price, BetType betType){
		this.placedDateTime = placedDateTime;
		this.liability = liability;
		this.price = price;
		this.betType = betType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getPlacedDateTime() {
		return placedDateTime;
	}

	public BigDecimal getLiability() {
		return liability;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BetType getBetType() {
		return betType;
	}
}
