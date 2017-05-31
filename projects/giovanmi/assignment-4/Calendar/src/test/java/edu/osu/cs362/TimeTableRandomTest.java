package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
        //String[] methodArray = new String[] {"setTitle","setDescription", "setStartHour"};// The list of the of methods to be tested in the Appt class
        String[] methodArray = new String[] {"deleteAppt"};// The list of the of methods to be tested in the Appt class


    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

        return methodArray[n] ; // return the method name 
      }


    /**
     * Generate Random Tests that tests CalDay Class.
     */
    @Test
    public void radnomtest()  throws Throwable  {

    	long startTime = Calendar.getInstance().getTimeInMillis();
    	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
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
    	LinkedList<Appt> nullAppts = new LinkedList<Appt>();

    	Appt nullAppt = new Appt(startHour,
    		startMinute ,
    		startDay ,
    		startMonth ,
    		startYear ,
    		title,
    		description);
    	nullAppt = null;

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

      Appt appt2 = new Appt(startHour,
        startMinute ,
        startDay ,
        startMonth ,
        startYear ,
        title,
        description);
      calday.addAppt(appt2);
      listAppts.add(appt2);



      System.out.println("Start testing...");


      for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				//long randomseed =10;//System.currentTimeMillis();
        long randomseed = System.currentTimeMillis();
			//	System.out.println(" Seed:"+randomseed );
        Random random = new Random(randomseed);


        for (int i = 0; i < NUM_TESTS; i++) {
         String methodName = TimeTableRandomTest.RandomSelectMethod(random);
         if (methodName.equals("deleteAppt")){

          int randInt = ValuesGenerator.getRandomIntBetween(random, 0, 3);
          int randInt2 = ValuesGenerator.getRandomIntBetween(random, 0, 1);

          if(randInt2 ==1)
           appt1.setStartDay(9999);

         if(randInt==0){
           timeTable.deleteAppt(nullAppts, appt1);

         }
         else if(randInt==1)
         {
           timeTable.deleteAppt(nullAppts, nullAppt);

         }
         else if(randInt==2)
         {
           timeTable.deleteAppt(listAppts, nullAppt);

         }
         else if(randInt==3)
         {
           timeTable.deleteAppt(listAppts, appt1);
           listAppts.add(appt1);
           timeTable.deleteAppt(listAppts, appt2);

         } 

         appt1.setStartDay(7);   				


       }


     }

     elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
     if((iteration%10000)==0 && iteration!=0 )
       System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

   }


   System.out.println("Done testing...");


 }



}