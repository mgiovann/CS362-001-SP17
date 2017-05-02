package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 
		 

		

		 assertEquals(13, appt.getStartHour());

		 //test set functions
		 appt.setStartHour(14);
		 assertEquals(14, appt.getStartHour());


		 assertEquals(30, appt.getStartMinute());
		 appt.setStartMinute(31);
		 assertEquals(31, appt.getStartMinute());

		 assertEquals(10, appt.getStartDay());
		 appt.setStartDay(5);
		 assertEquals(5, appt.getStartDay());

		 assertEquals(04, appt.getStartMonth());
		 appt.setStartMonth(12);
		 assertEquals(12, appt.getStartMonth());


		 assertEquals(2017, appt.getStartYear());
		 appt.setStartYear(2016);
		 assertEquals(2016, appt.getStartYear());



		 assertEquals("Birthday Party", appt.getTitle());
		 appt.setTitle("test");
		 assertEquals("test", appt.getTitle());

		 assertEquals("This is my birthday party.", appt.getDescription());
		 appt.setDescription("test2");
		 assertEquals("test2", appt.getDescription());

		 appt.setTitle(null);
		 assertEquals("", appt.getTitle());

		 appt.setDescription(null);
		 assertEquals("", appt.getDescription());

		 appt.setTitle("title");
		 appt.setDescription("description");



		 //branch coverage
		 
		 appt.setStartHour(-25);
		 assertFalse(appt.getValid());

		 //test toString
		 assertNull(appt.toString());

		 appt.setStartHour(23);
		 appt.setStartHour(25);
		 assertFalse(appt.getValid());
		 appt.setStartHour(23);  



		 appt.setStartMinute(-61);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(30);
		 appt.setStartMinute(61);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(30);
		 

		 appt.setStartDay(-40);
		 assertFalse(appt.getValid());
		 appt.setStartDay(15);
		 appt.setStartDay(40);
		 assertFalse(appt.getValid());
		 appt.setStartDay(15);

		 appt.setStartMonth(999);
		 assertFalse(appt.getValid());
		 appt.setStartMonth(10);
		 appt.setStartMonth(-2);
		 assertFalse(appt.getValid());
		 appt.setStartMonth(10);


		 //System.out.println("<"+appt.toString()+">");

		 assertEquals("\t10/15/2016 at 11:30pm ,title, description\n", appt.toString());


	 }


	
}
