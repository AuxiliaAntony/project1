package org.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Solution1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the ad type ");
		String type = br.readLine();
		SessionFactory fs = new Configuration().configure().buildSessionFactory();
		Session session = fs.openSession();
		session.beginTransaction();

		UserDetails s = new UserDetails();
		s.setAdId(101);
		s.setAdType(type);
		s.setFirstName("saranya");
		s.setLastName("banu");
		s.setMailId("yyy@gmail.com");
		s.setPeriod(6);
		s.setCmpName("tcs");
		session.save(s);

		if (type.equals("Magazine")) {
			Magazine m = new Magazine();
			m.setFromDate("2-2-17");
			m.setToDate("1-2-17");
			m.setMagName("Hindu");
			m.setMagSize(52);
			m.setPageNo(1);
			session.save(m);
			session.getTransaction().commit();
			session.close();
		} 
		else if (type.equals("Television")) {
			Television t = new Television();
			t.setChannelName("suntv");
			t.setDuration(2);
			t.setFromDate("12-3-1980");
			t.setToDate("12-4-1980");
			session.save(t);
			session.getTransaction().commit();
			session.close();
		}
		else if(type.equals("Internet"))
		{
			Internet i= new Internet();
			i.setFromDate("1-1-16");
			i.setMedia("video");
			i.setSize(30);
			i.setToDate("1-1-16");
			i.setWebsiteName("hackerrank");
			session.save(i);
			session.getTransaction().commit();
			session.close();
		}
		else
		{
			NewsPaper n=new NewsPaper();
			n.setFromDate("2-3-17");
			n.setNewspaperName("Hindu");
			n.setNewspaperSize(3);
			n.setPageNo(1);
			n.setToDate("10-3-17");
			session.save(n);
			session.getTransaction().commit();
			session.close();
		}
	}

}
