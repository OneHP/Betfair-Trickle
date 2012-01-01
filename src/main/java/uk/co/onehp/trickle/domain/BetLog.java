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

import org.joda.time.LocalDateTime;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Serialized;

@Embedded
public class BetLog extends BaseDomainObject {

	@Serialized
	private final LocalDateTime placedDateTime;
	@Serialized
	private final BigDecimal liability;
	@Serialized
	private final BigDecimal price;
	@Embedded
	private final BetType betType;

	public BetLog(){
		this.placedDateTime = null;
		this.liability = null;
		this.price = null;
		this.betType = null;
	}

	public BetLog(LocalDateTime placedDateTime, BigDecimal liability, BigDecimal price, BetType betType){
		this.placedDateTime = placedDateTime;
		this.liability = liability;
		this.price = price;
		this.betType = betType;
	}

	public LocalDateTime getPlacedDateTime() {
		return this.placedDateTime;
	}

	public BigDecimal getLiability() {
		return this.liability;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BetType getBetType() {
		return this.betType;
	}
}
