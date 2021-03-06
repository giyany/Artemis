/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:24:25 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QualifierVector_ESTest extends QualifierVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("", "<dB:l6");
      qualifierVector0.addQualifierValues(qualifier0);
      QualifierVector qualifierVector1 = qualifierVector0.copy();
      assertEquals(1, qualifierVector1.capacity());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      // Undeclared exception!
      try { 
        qualifierVector0.setQualifier((Qualifier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier();
      qualifierVector0.addElement(qualifier0);
      // Undeclared exception!
      try { 
        qualifierVector0.removeQualifierByName("sTcy4]I");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      qualifierVector0.setSize(2044);
      // Undeclared exception!
      try { 
        qualifierVector0.getQualifierByName("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      qualifierVector0.add((Qualifier) null);
      // Undeclared exception!
      try { 
        qualifierVector0.contains("<E).");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      // Undeclared exception!
      try { 
        qualifierVector0.addQualifierValues((Qualifier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("Q", "");
      qualifierVector0.setQualifier(qualifier0);
      int int0 = qualifierVector0.indexOfQualifierWithName("Q");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("Q", "");
      qualifierVector0.setQualifier(qualifier0);
      int int0 = qualifierVector0.indexOfQualifierWithName("");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      qualifierVector0.addElement((Qualifier) null);
      // Undeclared exception!
      try { 
        qualifierVector0.indexOfQualifierWithName("yW.#|Sdug");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("Q", "");
      qualifierVector0.setQualifier(qualifier0);
      qualifierVector0.removeQualifierByName("Q");
      assertTrue(qualifierVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("");
      qualifierVector0.addElement(qualifier0);
      Qualifier qualifier1 = qualifierVector0.getQualifierByName("");
      assertSame(qualifier1, qualifier0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("");
      qualifierVector0.addElement(qualifier0);
      Qualifier qualifier1 = qualifierVector0.getQualifierByName("{>");
      assertNull(qualifier1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      boolean boolean0 = qualifierVector0.contains("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      StringVector stringVector0 = new StringVector((String) null);
      Qualifier qualifier0 = new Qualifier("??q6DXIo$h@*dC$=h", stringVector0);
      qualifierVector0.addQualifierValues(qualifier0);
      boolean boolean0 = qualifierVector0.contains("??q6DXIo$h@*dC$=h");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      qualifierVector0.removeQualifierByName("u0FR~,C\"&`");
      assertEquals("[]", qualifierVector0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("Q", "");
      qualifierVector0.setQualifier(qualifier0);
      qualifierVector0.setQualifier(qualifier0);
      assertEquals(1, qualifierVector0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier();
      // Undeclared exception!
      try { 
        qualifierVector0.addQualifierValues(qualifier0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // 
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier("", "<dB:l6");
      qualifierVector0.addQualifierValues(qualifier0);
      Qualifier qualifier1 = new Qualifier("", "");
      qualifierVector0.addQualifierValues(qualifier1);
      assertEquals(1, qualifierVector0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QualifierVector qualifierVector0 = new QualifierVector();
      QualifierVector qualifierVector1 = qualifierVector0.copy();
      assertTrue(qualifierVector1.equals((Object)qualifierVector0));
  }
}
