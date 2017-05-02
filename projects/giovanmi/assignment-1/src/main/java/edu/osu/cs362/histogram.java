
import java.util.Random;
import java.util.Scanner;
public class histogram {


    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Random generator = new Random();

    	int yourint;

    	System.out.print("Please enter an integer between 50 and 200: ");
    	yourint = scan.nextInt();
    	System.out.println();
    	while (yourint<50 || yourint>200)
    	{
    		System.out.println("Whoops! Please try again");
    		System.out.println("Please enter an integer between 50 and 200");
    		yourint = scan.nextInt();
    	}
    	int[] myarray = new int[10];
    	for(int i = 1;i<=yourint;i++)
    	{
    		int randomint;
    		randomint = generator.nextInt(100)+1;
    		myarray[(randomint-1)/10]++;
    	}
    	//for(int i=0;i<=9;i++)
    		//System.out.println(myarray[i]);
    	System.out.println();
    	for(int i=0;i<=9;i++)
    	{
    		switch (i)
    		{
    			case 0: System.out.print("1-10  |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 1: System.out.print("11-20 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 2: System.out.print("21-30 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 3: System.out.print("31-40 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 4: System.out.print("41-50 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 5: System.out.print("51-60 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 6: System.out.print("61-70 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 7: System.out.print("71-80 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 8: System.out.print("81-90 |");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    			case 9: System.out.print("91-100|");
    					for(int count=1;count<=myarray[i];count++)
    						System.out.print("*");
    					System.out.println();
    					break;
    		}
    	}
    	System.out.println();
    	System.out.println();
    	System.out.println();

    }

}