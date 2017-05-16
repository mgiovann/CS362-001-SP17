package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {

	  	GregorianCalendar gregCal = new GregorianCalendar(2017,6,5);
	  	CalDay calday = new CalDay(gregCal);

	  	int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);

		calday.addAppt(appt);

		assertTrue(calday.isValid());

		//create empty CalDay
		CalDay invalidCalDay = new CalDay();
		
		assertFalse(invalidCalDay.isValid());

		assertEquals(invalidCalDay.iterator(), null);

		//test iterator function with valid calday
		assertNotNull(calday.iterator());

		appt.setStartHour(25);
		invalidCalDay.addAppt(appt);
		appt.setStartHour(13);
		
		startHour=16;
		startMinute=30;
		startDay=10;
		startMonth=4;
		startYear=2017;
		title="Birthday Party";
		description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt2 = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);

	 	calday.addAppt(appt2);

	 	startHour=10;
		startMinute=30;
		startDay=10;
		startMonth=4;
		startYear=2017;
		title="Birthday Party";
		description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt3 = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);

	 	calday.addAppt(appt3);

	 	assertEquals(calday.getSizeAppts(), 3);

	 	assertEquals(calday.getDay(), 5);
	 	assertEquals(calday.getMonth(), 6);
	 	assertEquals(calday.getYear(), 2017);
	 	

		//test toString
	 	//System.out.println("!!!!!!!!!!!!!!!!"+calday.toString()+"!!!!!!!!!!!!!!!!!");
	 	assertNotNull(calday.toString());
	 	assertNotNull(invalidCalDay.toString());

		//assertEquals("5/6/2017", calday.toString());

	 	//make sure the appointments are in the right order
	 	for (int i = 0; i < calday.getAppts().size(); i++) {
	 		

	 		//calday.getAppts().get(i)).getStartHour()
	 	}
	 	boolean testApptOrder = false;

	 // 	if(calday.getAppts().get(0)).getStartHour() > calday.getAppts().get(1)).getStartHour())
		// {
		// 	testApptOrder = true;
		// }
		if (calday.getAppts().get(0).getStartHour() > calday.getAppts().get(1).getStartHour() || calday.getAppts().get(2).getStartHour() < calday.getAppts().get(1).getStartHour())
		{
			testApptOrder = true;
		}

		assertFalse(testApptOrder);
	 }


	 
	
}
