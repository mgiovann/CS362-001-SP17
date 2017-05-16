package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {


	 @Test
	  public void test01()  throws Throwable  {
		 

		 TimeTable timeTable=new TimeTable();

		GregorianCalendar calDay1 = new GregorianCalendar(2017,6,5);
		GregorianCalendar calDay2 = new GregorianCalendar(2017,6,10);
	  	
		GregorianCalendar gregCal = new GregorianCalendar(2017,6,7);
	  	CalDay calday = new CalDay(gregCal);

	  	int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		LinkedList<Appt> listAppts = new LinkedList<Appt>();

		startHour=13;
		startMinute=30;
		startDay=7;
		startMonth=6;
		startYear=2017;
		Appt appt1 = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		calday.addAppt(appt1);
		listAppts.add(appt1);

		startHour=14;
		startMinute=30;
		startDay=7;
		startMonth=6;
		startYear=2017;
		title="Dentist";
		description="This is my dentist appt";
		Appt appt2 = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		calday.addAppt(appt2);
		listAppts.add(appt2);

		startHour=12;
		startMinute=30;
		startDay=7;
		startMonth=6;
		startYear=2017;
		title="Meeting";
		description="This is my meeting";
		Appt appt3 = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		calday.addAppt(appt3);
		listAppts.add(appt3);

		startHour=12;
		startMinute=30;
		startDay=7;
		startMonth=5;
		startYear=2017;
		title="Meeting";
		description="This is my meeting";
		Appt appt4 = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		//calday.addAppt(appt4);
		listAppts.add(appt4);


		timeTable.getApptRange(listAppts, calDay1, calDay2);

		try {
    		timeTable.getApptRange(listAppts, calDay2, calDay1);
	    	fail( "method was supposed to throw" );
		} catch (IllegalArgumentException e) {
		}

		// try {
  //   		timeTable.getApptRange(listAppts, calDay1, calDay2);
	    	
		// } catch (Throwable e) {
		// 	fail( "testing");
		// }



		appt3.setStartDay(99);
		timeTable.getApptRange(listAppts, calDay1, calDay2);
		appt3.setStartDay(7);

		timeTable.deleteAppt(listAppts, appt1);

		LinkedList<Appt> nullAppts = new LinkedList<Appt>();
		timeTable.deleteAppt(nullAppts, appt3);

		appt2.setStartDay(99);
		timeTable.deleteAppt(nullAppts, appt2);

		//calday.addAppt(appt1);
		//timeTable.addAppt(appt1);

		assertNotNull(timeTable.deleteAppt(listAppts, appt4));
		
		appt1 = null;
		assertNull(timeTable.deleteAppt(listAppts, appt1));


		// appts.size()
		// Appt appt=appts.get(i);
		// timeTable.getApptRange(listAppts, calDay1, calDay2);
		//assertNotNull( (listAppts.size())  );

		
	 }

}
