/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 18 07:07:14 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.WarmUp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WarmUp_ESTest extends WarmUp_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = (-1661);
      int int0 = WarmUp.oddOrPos(intArray0);
      assertEquals(0, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1080);
      int int0 = WarmUp.positive(intArray0);
      assertEquals(0, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        WarmUp.last(intArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[2] = (-16);
      int int0 = WarmUp.lastZero(intArray0);
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = (-1661);
      intArray0[2] = 193;
      int int0 = WarmUp.findInteger(intArray0, 0);
      assertEquals((-1), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        WarmUp.positive((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.WarmUp", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        WarmUp.oddOrPos((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.WarmUp", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        WarmUp.lastZero((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.WarmUp", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[10];
      intArray0[2] = 1478;
      int int0 = WarmUp.oddOrPos(intArray0);
      assertEquals(1, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      WarmUp warmUp0 = new WarmUp();
  }

  @Test
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2480;
      int int0 = WarmUp.positive(intArray0);
      assertEquals(1, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      int int0 = WarmUp.oddOrPos(intArray0);
      assertEquals(1, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2480;
      intArray0[2] = 931;
      intArray0[3] = 2480;
      int int0 = WarmUp.lastZero(intArray0);
      assertEquals((-1), int0);
  }

  @Test
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      int int0 = WarmUp.last(intArray0, 2);
      assertEquals(0, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = WarmUp.last((int[]) null, (-1));
      assertEquals((-1), int0);
  }

  @Test
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        WarmUp.last(intArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[2] = 1;
      int int0 = WarmUp.findInteger(intArray0, 1);
      assertEquals(2, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        WarmUp.findInteger((int[]) null, 1478);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.WarmUp", e);
      }
  }
}
