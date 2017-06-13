/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import java.util.concurrent.ThreadLocalRandom;




/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

 private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
    super(testName);
  }



  public void testManualTest()
  {

   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

   System.out.println(urlVal.isValid("http://www.amazon.com"));
   System.out.println("Expected True\n");

   System.out.println(urlVal.isValid("http:/www.amazon.com" ));
   System.out.println("Expected False\n");

   System.out.println(urlVal.isValid("http://www.amazon" ));
   System.out.println("Expected False\n");

   System.out.println(urlVal.isValid("http://www.amazn.com" ));
   System.out.println("Expected True\n");

   System.out.println(urlVal.isValid("http://ww.amazon.com" ));
   System.out.println("Expected True\n");

   System.out.println(urlVal.isValid("ttp://www.amazon.com" ));      
   System.out.println("Expected True\n");

     System.out.println(urlVal.isValid("http://www.amazon.jp"));//Missing this country suffix
     System.out.println("Expected True\n");

     System.out.println(urlVal.isValid("http://www.amazon.com:65535"));//5 digit port should be valid
     System.out.println("Expected True\n");

     System.out.println(urlVal.isValid("http://www.amazon.com:6553"));//4 digit port should be valid
     System.out.println("Expected True\n");

     System.out.println(urlVal.isValid("http://www.amazon.com:655"));//Fine here
     System.out.println("Expected True\n");

     System.out.println(urlVal.isValid("http://www.amazon.com:65"));//Fine here
     System.out.println("Expected True\n");

     
   }
   
   
   public void testYourFirstPartition()//Scheme
   {

     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
     System.out.println("\n~~~~~Scheme Tests~~~~~\n");
     System.out.println(urlVal.isValid("http://www.amazon.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("ftp://www.amazon.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("h3t://www.amazon.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("3ht://www.amazon.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http:/www.amazon.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http:www.amazon.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("://www.amazon.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("www.amazon.com"));
     System.out.println("Expected True\n");
   }
   
   public void testYourSecondPartition(){//Authority

     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
     System.out.println("\n~~~~~Authority Tests~~~~~\n");
     System.out.println(urlVal.isValid("http://www.google.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.go.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.go.au"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.0.0.0.0.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.255.255.255.com"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.256.256.256.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.255.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.1.2.3.4.5.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.1.2.3.4.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.1.2.3.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www..1.2.3.4.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.go.a"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.go.a1a"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.go.cc"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.go.1aa"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.aaa..com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www..aaa.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.aaa.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www..com"));
     System.out.println("Expected False\n");

   }

   public void testYourThirdPartition(){//Port

     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
     System.out.println("\n~~~~~Port Tests~~~~~\n");
     System.out.println(urlVal.isValid("http://www.google.com:80"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.google.com:65535"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.google.com:0"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.google.com"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.google.com:-1"));
     System.out.println("Expected False\n");
     System.out.println(urlVal.isValid("http://www.google.com:65636"));
     System.out.println("Expected True\n");
     System.out.println(urlVal.isValid("http://www.google.com:65a"));
     System.out.println("Expected False\n");

   }
   
   
   public void testIsValid()
   {

    //<scheme>://<authority><path>?<query>
    String[] goodSchemeArray = {"http://", "", "ftp://"};
    String[] badSchemeArray = {"http//", "http:/", "9xx://"};

    String[] goodAuthorityArray = {"google.com", "www.amazon.com", "oregonstate.edu", "34.34.34.34", "oregonstate.us", "oregonstate.uk", "google.com:6745", "google.com:745", "google.com:45"};
    String[] badAuthorityArray = {"300.23.45.13", "34.34.34", ".edu", "34.34.34.34.34", "google.com:999999"};

    String[] goodPathArray = {"/path", "/alongpath/", "/path/path"};
    String[] badPathArray = {"/../", "/..", "//", "/path//path"};

    //example queries are from Wikipedia
    String[] goodQueryArray = {"there?name=ferret", "page?name=ferret&color=purple", ""};
    // String[] badQueryArray = {"/path", "/alongpath/", "/path/path"};

    System.out.println("\n\n");
    System.out.println("Testing 1000 random good URLs");
     //test 1000 random combinations of good URLs
    int goodCount = 0;
    int badCount = 0;
    for(int i = 0; i<1000; i++)
    {

      String goodURL = goodSchemeArray[ThreadLocalRandom.current().nextInt(0, goodSchemeArray.length)] + 
      goodAuthorityArray[ThreadLocalRandom.current().nextInt(0, goodAuthorityArray.length)] +
      goodPathArray[ThreadLocalRandom.current().nextInt(0, goodPathArray.length)]; 

      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

      if(urlVal.isValid(goodURL) == false) {
        System.out.println("Error. "+ goodURL + " is a valid URL");
      }
      if(urlVal.isValid(goodURL) == false) {
        badCount++;
      }
      else {
        goodCount++;
      }

    }
    System.out.println("good count: "+goodCount+" bad count: "+badCount);


    goodCount = 0;
    badCount = 0;

    // System.out.println("\n\n");
    // System.out.println("Testing 1000 random good URLs");

    System.out.println("\nTesting 100 URLS with bad schemes\n");
    //test 100 random URLs with bad schemes. 
    for(int i = 0;i<100;i++)
    {
      String badURL = badSchemeArray[ThreadLocalRandom.current().nextInt(0, badSchemeArray.length)] + 
      goodAuthorityArray[ThreadLocalRandom.current().nextInt(0, goodAuthorityArray.length)] +
      goodPathArray[ThreadLocalRandom.current().nextInt(0, goodPathArray.length)];

      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

      if(urlVal.isValid(badURL) == true) {
        System.out.println("Error. "+ badURL + " is an invalid URL");
      }
      if(urlVal.isValid(badURL) == true) {
        badCount++;
      }
      else {
        goodCount++;
      }

    }

    System.out.println("\nTesting 100 URLS with bad authority\n");
    //test 100 random URLs with bad authorities. 
    for(int i = 0;i<100;i++)
    {
      String badURL = goodSchemeArray[ThreadLocalRandom.current().nextInt(0, goodSchemeArray.length)] + 
      badAuthorityArray[ThreadLocalRandom.current().nextInt(0, badAuthorityArray.length)] +
      goodPathArray[ThreadLocalRandom.current().nextInt(0, goodPathArray.length)];

      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

      if(urlVal.isValid(badURL) == true) {
        System.out.println("Error. "+ badURL + " is an invalid URL");
      }
      if(urlVal.isValid(badURL) == true) {
        badCount++;
      }
      else {
        goodCount++;
      }

    }
    
    System.out.println("\nTesting 100 URLS with bad path\n");
    //test 100 random URLs with bad paths. 
    for(int i = 0;i<100;i++)
    {
      String badURL = goodSchemeArray[ThreadLocalRandom.current().nextInt(0, goodSchemeArray.length)] + 
      goodAuthorityArray[ThreadLocalRandom.current().nextInt(0, goodAuthorityArray.length)] +
      badPathArray[ThreadLocalRandom.current().nextInt(0, badPathArray.length)];

      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

      if(urlVal.isValid(badURL) == true) {
        System.out.println("Error. "+ badURL + " is an invalid URL");
      }
      if(urlVal.isValid(badURL) == true) {
        badCount++;
      }
      else {
        goodCount++;
      }

    }
    



  }

  public void testAnyOtherUnitTest()
  {

  }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

 }