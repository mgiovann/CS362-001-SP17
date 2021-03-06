/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 00:20:03 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CalDay_ESTest extends CalDay_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.isValid();
  }

  @Test
  public void test01()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.isValid();
  }

  @Test
  public void test02()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getYear();
  }

  @Test
  public void test03()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.year = (-985);
      calDay0.getYear();
  }

  @Test
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 3115, 8, 16, 8, 8);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(8, 3115, 8, 0, 3115, "Ia'tSL7TQ=", "Ia'tSL7TQ=");
      linkedList0.add(appt0);
      calDay0.appts = linkedList0;
      calDay0.getSizeAppts();
  }

  @Test
  public void test05()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getMonth();
  }

  @Test
  public void test06()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-1);
      calDay0.getMonth();
  }

  @Test
  public void test07()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getDay();
  }

  @Test
  public void test08()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = (-1);
      calDay0.getDay();
  }

  @Test
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getAppts();
  }

  @Test
  public void test10()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 5, 5, 0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(0, 5, 5, 5, 0, "gregory", "gregory");
      calDay0.addAppt(appt0);
      Appt appt1 = new Appt(21, 5, 7, 5, 59, "--%M-%D%z", "N&][vH~&|-");
      calDay0.addAppt(appt1);
  }

  @Test
  public void test11()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try { 
        calDay0.getSizeAppts();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        calDay0.addAppt((Appt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), 0, 0, 0, 2);
      mockGregorianCalendar0.set(0, 1539);
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         assertThrownBy("java.util.GregorianCalendar", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "=K)em", "eHG~HwV? _WbX@m`($");
      calDay0.addAppt(appt0);
  }

  @Test
  public void test18()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      Appt appt0 = new Appt((-3163), (-3163), (-3163), (-3163), (-3163), "javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field)", "javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field)");
      linkedList0.add(appt0);
      calDay0.toString();
  }

  @Test
  public void test19()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.iterator();
  }

  @Test
  public void test20()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.iterator();
  }

  @Test
  public void test21()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.toString();
  }

  @Test
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 3115, 8, 16, 8, 8);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getSizeAppts();
  }

  @Test
  public void test23()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 3115, 8, 16, 8, 8);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      int int0 = calDay0.getMonth();
      assertTrue(calDay0.isValid());
      assertEquals(267, calDay0.getYear());
      assertEquals(8, calDay0.getDay());
      assertEquals(7, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 5, 5, 0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(0, 5, 5, 5, 0, "gregory", "gregory");
      calDay0.addAppt(appt0);
      calDay0.addAppt(appt0);
      assertEquals(2, calDay0.getSizeAppts());
  }

  @Test
  public void test25()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 3115, 8, 16, 8, 8);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      int int0 = calDay0.getDay();
      assertEquals(267, calDay0.getYear());
      assertEquals(8, int0);
      assertTrue(calDay0.isValid());
      assertEquals(7, calDay0.getMonth());
  }

  @Test
  public void test26()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getYear();
      assertEquals(0, int0);
      assertFalse(calDay0.isValid());
  }
}
