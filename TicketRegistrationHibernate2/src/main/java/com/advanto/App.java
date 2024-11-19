package com.advanto;

import java.util.Scanner;

import com.advanto.implemented.TRPClass;
public class App 
{
    public static void main( String[] args )
    {
TRPClass t = new TRPClass ();
    	
        //t.insert_buses();
    	
    	
    	Scanner sc = new Scanner (System.in);
    	
    	boolean flag = true ; 
    	while (flag) {
    		  System.out.println("--Select one of the below -- ");
    	        System.out.println(" 1) Register New User ");
    	        System.out.println(" 2) Search Buses ");
    	        System.out.println(" 3) Cancel Your Ticket ");
    	        System.out.println(" 4) Update Info From the ticket");
    	        System.out.println(" 5) Exit ");
    	        
    	       int choice = sc.nextInt();
    	       switch (choice) {
    	       case 1 : t.login ();
    	       break ;
    	       
    	       case 2 : t.showBuses();
    	       break ;
    	       
    	       case 3 : t.cancelTicket();
    	       break ;
    	        
    	       case 4 : t.updateInfo();
    	       break;
    	       
    	       case 5 : 
    	    	   System.out.println("we valued your willingness to wait...ThankYou");
    	          flag = false;
    	       break ;
    	       
    	       default: System.out.println("You are out of choice ");
               break ;    	       

    	       }
    		
    	}
    		
      
       
    }
    }

