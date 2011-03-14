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
package uk.co.onehp.trickle.dao;

import org.joda.time.LocalDateTime;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.onehp.trickle.domain.SessionToken;
import uk.co.onehp.trickle.domain.SessionType;


public class HibernateSessionTokenDaoCustomT {

	@Ignore
	public static void main(final String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:/spring-trickle.xml");
		final SessionTokenDao dao = (SessionTokenDao) applicationContext
				.getBean("sessionTokenDao");

		final SessionToken token = new SessionToken();
		token.setSessionType(SessionType.GLOBAL);
		token.setToken("kjngshjgsdlhkjn");
		token.setUpdatedDateTime(new LocalDateTime());
		
		dao.saveOrUpdate(token);
		
		final SessionToken result = dao.getSessionToken(SessionType.GLOBAL);
		System.out.println(result);
		
		result.setToken("sdgnsdlgsgdsag");
		result.setUpdatedDateTime(new LocalDateTime());
		
		dao.saveOrUpdate(result);
		
		final SessionToken result2 = dao.getSessionToken(SessionType.GLOBAL);
		System.out.println(result2);
	}

}
