/*
 * Betfair Trickle. Automatic bet placement application. Copyright (C) 2011
 * Thomas Inman. This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version. This program is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package uk.co.onehp.trickle.util;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import uk.co.onehp.trickle.domain.BettingAspect;
import uk.co.onehp.trickle.domain.Pricing;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class BettingUtil {

	private static List<BigDecimal> PRICE_TICKS = Lists.newArrayList(
			bd("1.01"), bd("1.02"), bd("1.03"), bd("1.04"), bd("1.05"),
			bd("1.06"), bd("1.07"), bd("1.08"), bd("1.09"), bd("1.1"),
			bd("1.11"), bd("1.12"), bd("1.13"), bd("1.14"), bd("1.15"),
			bd("1.16"), bd("1.17"), bd("1.18"), bd("1.19"), bd("1.2"),
			bd("1.21"), bd("1.22"), bd("1.23"), bd("1.24"), bd("1.25"),
			bd("1.26"), bd("1.27"), bd("1.28"), bd("1.29"), bd("1.3"),
			bd("1.31"), bd("1.32"), bd("1.33"), bd("1.34"), bd("1.35"),
			bd("1.36"), bd("1.37"), bd("1.38"), bd("1.39"), bd("1.4"),
			bd("1.41"), bd("1.42"), bd("1.43"), bd("1.44"), bd("1.45"),
			bd("1.46"), bd("1.47"), bd("1.48"), bd("1.49"), bd("1.5"),
			bd("1.51"), bd("1.52"), bd("1.53"), bd("1.54"), bd("1.55"),
			bd("1.56"), bd("1.57"), bd("1.58"), bd("1.59"), bd("1.6"),
			bd("1.61"), bd("1.62"), bd("1.63"), bd("1.64"), bd("1.65"),
			bd("1.66"), bd("1.67"), bd("1.68"), bd("1.69"), bd("1.7"),
			bd("1.71"), bd("1.72"), bd("1.73"), bd("1.74"), bd("1.75"),
			bd("1.76"), bd("1.77"), bd("1.78"), bd("1.79"), bd("1.8"),
			bd("1.81"), bd("1.82"), bd("1.83"), bd("1.84"), bd("1.85"),
			bd("1.86"), bd("1.87"), bd("1.88"), bd("1.89"), bd("1.9"),
			bd("1.91"), bd("1.92"), bd("1.93"), bd("1.94"), bd("1.95"),
			bd("1.96"), bd("1.97"), bd("1.98"), bd("1.99"), bd("2"),
			bd("2.02"), bd("2.04"), bd("2.06"), bd("2.08"), bd("2.1"),
			bd("2.12"), bd("2.14"), bd("2.16"), bd("2.18"), bd("2.2"),
			bd("2.22"), bd("2.24"), bd("2.26"), bd("2.28"), bd("2.3"),
			bd("2.32"), bd("2.34"), bd("2.36"), bd("2.38"), bd("2.4"),
			bd("2.42"), bd("2.44"), bd("2.46"), bd("2.48"), bd("2.5"),
			bd("2.52"), bd("2.54"), bd("2.56"), bd("2.58"), bd("2.6"),
			bd("2.62"), bd("2.64"), bd("2.66"), bd("2.68"), bd("2.7"),
			bd("2.72"), bd("2.74"), bd("2.76"), bd("2.78"), bd("2.8"),
			bd("2.82"), bd("2.84"), bd("2.86"), bd("2.88"), bd("2.9"),
			bd("2.92"), bd("2.94"), bd("2.96"), bd("2.98"), bd("3"),
			bd("3.05"), bd("3.1"), bd("3.15"), bd("3.2"), bd("3.25"),
			bd("3.3"), bd("3.35"), bd("3.4"), bd("3.45"), bd("3.5"),
			bd("3.55"), bd("3.6"), bd("3.65"), bd("3.7"), bd("3.75"),
			bd("3.8"), bd("3.85"), bd("3.9"), bd("3.95"), bd("4"), bd("4.1"),
			bd("4.2"), bd("4.3"), bd("4.4"), bd("4.5"), bd("4.6"), bd("4.7"),
			bd("4.8"), bd("4.9"), bd("5"), bd("5.1"), bd("5.2"), bd("5.3"),
			bd("5.4"), bd("5.5"), bd("5.6"), bd("5.7"), bd("5.8"), bd("5.9"),
			bd("6"), bd("6.2"), bd("6.4"), bd("6.6"), bd("6.8"), bd("7"),
			bd("7.2"), bd("7.4"), bd("7.6"), bd("7.8"), bd("8"), bd("8.2"),
			bd("8.4"), bd("8.6"), bd("8.8"), bd("9"), bd("9.2"), bd("9.4"),
			bd("9.6"), bd("9.8"), bd("10"), bd("10.5"), bd("11"), bd("11.5"),
			bd("12"), bd("12.5"), bd("13"), bd("13.5"), bd("14"), bd("14.5"),
			bd("15"), bd("15.5"), bd("16"), bd("16.5"), bd("17"), bd("17.5"),
			bd("18"), bd("18.5"), bd("19"), bd("19.5"), bd("20"), bd("21"),
			bd("22"), bd("23"), bd("24"), bd("25"), bd("26"), bd("27"),
			bd("28"), bd("29"), bd("30"), bd("32"), bd("34"), bd("36"),
			bd("38"), bd("40"), bd("42"), bd("44"), bd("46"), bd("48"),
			bd("50"), bd("55"), bd("60"), bd("65"), bd("70"), bd("75"),
			bd("80"), bd("85"), bd("90"), bd("95"), bd("100"), bd("110"),
			bd("120"), bd("130"), bd("140"), bd("150"), bd("160"), bd("170"),
			bd("180"), bd("190"), bd("200"), bd("210"), bd("220"), bd("230"),
			bd("240"), bd("250"), bd("260"), bd("270"), bd("280"), bd("290"),
			bd("300"), bd("310"), bd("320"), bd("330"), bd("340"), bd("350"),
			bd("360"), bd("370"), bd("380"), bd("390"), bd("400"), bd("410"),
			bd("420"), bd("430"), bd("440"), bd("450"), bd("460"), bd("470"),
			bd("480"), bd("490"), bd("500"), bd("510"), bd("520"), bd("530"),
			bd("540"), bd("550"), bd("560"), bd("570"), bd("580"), bd("590"),
			bd("600"), bd("610"), bd("620"), bd("630"), bd("640"), bd("650"),
			bd("660"), bd("670"), bd("680"), bd("690"), bd("700"), bd("710"),
			bd("720"), bd("730"), bd("740"), bd("750"), bd("760"), bd("770"),
			bd("780"), bd("790"), bd("800"), bd("810"), bd("820"), bd("830"),
			bd("840"), bd("850"), bd("860"), bd("870"), bd("880"), bd("890"),
			bd("900"), bd("910"), bd("920"), bd("930"), bd("940"), bd("950"),
			bd("960"), bd("970"), bd("980"), bd("990"), bd("1000"));

	public static BigDecimal libilityToStake(BigDecimal liability,
			BigDecimal price) {
		return liability.divide(price.subtract(BigDecimal.ONE), BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal findChasePrice(BigDecimal price, int ticks, BettingAspect aspect) {
		return aspect == BettingAspect.BACK ? PRICE_TICKS.get(PRICE_TICKS.indexOf(price.stripTrailingZeros()) + ticks) 
											: PRICE_TICKS.get(PRICE_TICKS.indexOf(price.stripTrailingZeros()) - ticks);
	}

	public static Pricing bestPrice(List<Pricing> pricings,
			final BettingAspect aspect) {
		List<Pricing> filtereredPricings = sortedForAspect(pricings, aspect);
		return filtereredPricings.size() > 0 ? filtereredPricings.get(0) : new Pricing(BigDecimal.ZERO, BigDecimal.ZERO, aspect);
	}

	public static Pricing secondBestPrice(List<Pricing> pricings,
			final BettingAspect aspect) {
		List<Pricing> filtereredPricings = sortedForAspect(pricings, aspect);
		return filtereredPricings.size() > 1 ? filtereredPricings.get(1) : new Pricing(BigDecimal.ZERO, BigDecimal.ZERO, aspect);
	}

	private static List<Pricing> sortedForAspect(List<Pricing> pricings,
			final BettingAspect aspect) {
		List<Pricing> filtereredPricings = Lists.newArrayList(Iterables.filter(
				pricings, new Predicate<Pricing>() {

					@Override
					public boolean apply(Pricing pricing) {
						return pricing.getBettingAspect() == aspect;
					}
				}));

		Collections.sort(filtereredPricings, new Comparator<Pricing>() {

			@Override
			public int compare(Pricing o1, Pricing o2) {
				return aspect == BettingAspect.BACK ? o2.getPrice().compareTo(
						o1.getPrice()) : o1.getPrice().compareTo(o2.getPrice());
			}
		});
		return filtereredPricings;
	}

	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
}
