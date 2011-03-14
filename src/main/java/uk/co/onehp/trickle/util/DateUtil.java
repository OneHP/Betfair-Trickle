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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.LocalDateTime;

public class DateUtil {

	public static LocalDateTime gregorianCalendarToLocalDateTime(XMLGregorianCalendar calendar){
		return new LocalDateTime(calendar.getYear(), calendar.getMonth(), calendar.getDay(), calendar.getHour(), calendar.getMinute(), calendar.getSecond());
	}
	
	public static int getMostSeconds(List<Integer> seconds){
		Collections.sort(seconds, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		return seconds.get(0);
	}
	
	public static String toShortString(LocalDateTime localDateTime){
		return String.format("%s %s %s:%s", localDateTime.toDateTime().monthOfYear().getAsShortText()
				, localDateTime.toDateTime().dayOfMonth().getAsText(), localDateTime.getHourOfDay()
				, localDateTime.getMinuteOfHour());
	}
	
}
