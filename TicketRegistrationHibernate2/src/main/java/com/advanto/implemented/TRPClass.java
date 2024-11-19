package com.advanto.implemented;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.advanto.Entity.Buses;
import com.advanto.Entity.RegisterUser;
import com.advanto.Entity.User;
import com.advanto.unimplemented.TRPInterface;
import com.advanto.configuration.Connection;

	public class TRPClass  implements TRPInterface{
		 
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sf = Connection.connect();
		
		@Override
		public void login() {
			
			System.out.println("Enter your Name : ");
			String n = sc.next();
			
			System.out.println("Enter your age");
			int a = sc.nextInt();
			
			System.out.println("Enter your Contact detail : ");
			long c = sc.nextLong();
			
			System.out.println("Enter Mail Id : ");
			String e = sc.next();
			
			System.out.println("Enter password : ");
			String p = sc.next();
			
			User user1 = new User();
			user1.setId(1);
			user1.setUname(n);
			user1.setConNo(c);
			user1.setEmail(e);
			user1.setPassword(p);
			
			 SessionFactory sf = Connection.connect();
			 Session session = sf.openSession();
			 Transaction tx = session.beginTransaction();
			  
			 session.save(user1);
			 System.out.println("you have been register succesfully...");
			 	
		}

		public void showBuses() {
			
			Session session = sf.openSession();
			 
			Criteria c1 = session.createCriteria(Buses.class);
			
			List<Buses> l1  = c1.list();
			System.out.println(l1);
			for (Buses res : l1) {
				System.out.println(res);
				
			}
			
			System.out.println("Are you want to reserve seat : true/false ");
			boolean option = sc.nextBoolean();
			
			if(option) {
				bookBus();
			}
			else {
				System.out.println(" Co-operation = Success ! Thanks! --");
			}
			 
			 session.close();
			 sf.close();
		}
		
		public void bookBus() {
			System.out.println("Enter your bus choice : ");
			int choice = sc.nextInt();
			
			System.out.println("Enter your aadhar no : ");
			int aadhar = sc.nextInt();
			
			System.out.println("Enter your age : ");
			int a = sc.nextInt();
			
			System.out.println("Enter your Name");
			String n = sc.next();
			
			System.out.println("Boarding point");
			String b = sc.next();
			
			System.out.println("Destination point");
			String d = sc.next();
			
			System.out.println("---Enter Date of Departure---");
			System.out.println("Enter year");
			int y = sc.nextInt();
			
			y = y - 1990;
			
			System.out.println("Payment Status : True / False ");
			boolean status = sc.nextBoolean();
			
			System.out.println("Enter month");
			int m = sc.nextInt();
			
			System.out.println("Enter date");
			int d1 = sc.nextInt();
			
			System.out.println();
			Date date = new Date(y, m, d1);
			
			
			//RegisterUser ru = new RegisterUser(aadhar, n, a, b, d, date, status);
			RegisterUser ru = new RegisterUser(aadhar, a, n, b, d, date, status);
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			session.save(ru);
			
				RegisterUser ticket = session.get(RegisterUser.class, aadhar);
				 
				System.out.println("--this is your ticket details--");
				System.out.println(ticket.getName());
				System.out.println(ticket.getAge());
				System.out.println(ticket.getAadharno());
				System.out.println(ticket.getBoardingpoint());
				System.out.println(ticket.getDestinationpoint());
				System.out.println(ticket.getDateofDeparture());
			
			tx.commit();
		}

		public void cancelTicket() {	
			System.out.println("Enter your Aadhar no : ");
			int a = sc.nextInt();
			
			Session session = sf.openSession();
			
			Transaction tx = session.beginTransaction();
			
			RegisterUser ru = session.get(RegisterUser.class, a);
			session.delete(ru);
			
			tx.commit();
			session.close();
			sf.close();
		
			
		}

		public User updateInfo() {
			System.out.println("Enter info for updation : ");
			
			System.out.println("Enter your aadhar no");
			int a = sc.nextInt();
			
			Session session = sf.openSession();
			
			Transaction tx = session.beginTransaction();
			
			RegisterUser user = session.get(RegisterUser.class,a);
			
			boolean flag = true;
			
			while(flag) {
				System.out.println("1]Enter 1 for update your Name");
				System.out.println("1]Enter 2 for update your Age");
				System.out.println("1]Enter 3 for update your Date");
				System.out.println("1]Enter 4 for your Destination Point");
				System.out.println("1]Enter 5 for your Boarding point");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1 : System.out.println("Enter your Name");
				         String n = sc.next();
				     user.setName(n);
				     session.update(user);
				     
				     tx.commit();
				     session.close();
				     break;
				    
				case 2 : System.out.println("Enter age");
				         int age = sc.nextInt();
				         user.setAge(age);
				         session.update(user);
				         tx.commit();
				         session.close();
				         break;
				         
				case 3 : System.out.println("Enter Date");
				       //  Date date = new Date(a, age, a);
				         session.update(user);
				         
				     
				case 4 : System.out.println("Enter Destination point");
				         String d = sc.next();
				         user.setDestinationpoint(d);
				         session.update(user);
				         
				         tx.commit();
				         session.close();
				         break;
				         
				case 5 : System.out.println("Enter Boarding point");
				         String b = sc.next();
				         user.setBoardingpoint(b);
				         session.update(user);
				         
				         tx.commit();
				         session.close();
				         break;
				}	
			}
			return null;	
		}
		
		public void insert_buses() {
			Buses bus1 = new Buses(1, "RedBus" , " MH09532", "Seater");
			Buses bus2 = new Buses(1, "AbcBus" , " MH87644", "Sleeper");
			Buses bus3 = new Buses(1, "PqrBus" , " MH56437", "Seater");
			Buses bus4 = new Buses(1, "IjkBus" , " MH35538", "Sleeper");
			Buses bus5 = new Buses(1, "MnoBus" , " MH23573", "Sleeper/Seater");
			
			Session session = sf.openSession();
			
			Transaction tx = session.beginTransaction();
			
			session.save(bus1);
			session.save(bus2);
			session.save(bus3);
			session.save(bus4);
			session.save(bus5);
			
			tx.commit();
            session.close();


			
		}


		


}

	