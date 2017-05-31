package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;



import static org.junit.Assert.*;

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
        //String[] methodArray = new String[] {"setTitle","setDescription", "setStartHour"};// The list of the of methods to be tested in the Appt class
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class


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


    	System.out.println("Start testing...");


    	for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				//long randomseed =10;//System.currentTimeMillis();
    		long randomseed = System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
    		Random random = new Random(randomseed);

    		GregorianCalendar gregCal = new GregorianCalendar(2017,6,5);
    		CalDay calday = new CalDay(gregCal);



    		int startHour=13;
    		int startMinute=30;
    		int startDay=6;
    		int startMonth=5;
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
    		Appt appt2 = new Appt(startHour,
    			startMinute ,
    			startDay ,
    			startMonth ,
    			startYear ,
    			title,
    			description);
    		Appt appt3 = new Appt(startHour,
    			startMinute ,
    			startDay ,
    			startMonth ,
    			startYear ,
    			title,
    			description);

    		for (int i = 0; i < NUM_TESTS; i++) {
    			String methodName = CalDayRandomTest.RandomSelectMethod(random);
    			if (methodName.equals("addAppt")){

    				int newDay = 6;
    				appt.setStartDay(newDay);		   

    				int newHour = ValuesGenerator.getRandomIntBetween(random, 0, 23);
    				appt.setStartHour(newHour);
    				newHour = ValuesGenerator.getRandomIntBetween(random, 0, 23);
    				appt2.setStartHour(newHour);
    				newHour = ValuesGenerator.getRandomIntBetween(random, 0, 23);
    				appt3.setStartHour(newHour);


    				int newMinute = ValuesGenerator.getRandomIntBetween(random, 0, 59);
    				appt.setStartMinute(newMinute);


    				int newMonth = ValuesGenerator.getRandomIntBetween(random, 1, 12);
    				appt.setStartMonth(newMonth);

    				int newYear = ValuesGenerator.getRandomIntBetween(random, 1980, 2050);
    				appt.setStartYear(newYear);

    				if(ValuesGenerator.getRandomIntBetween(random, 0, 10) == 1){
    					String nullDescription = null;
    					appt.setDescription(nullDescription);
    				}
    				else {
    					String newDescription=(String) ValuesGenerator.getString(random);
    					appt.setDescription(newDescription);
    				}

						   //occasionally use an invalid appointment
    				if(ValuesGenerator.getRandomIntBetween(random, 0, 10) == 1){
    					newDay = 99999;
    					appt.setStartDay(newDay);
    				}


    				calday.addAppt(appt);
    				calday.addAppt(appt2);
    				calday.addAppt(appt3);
    			}


    		}

    		elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
    		if((iteration%10000)==0 && iteration!=0 )
    			System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

    	}


    	System.out.println("Done testing...");


    }



}
