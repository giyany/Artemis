/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:21:41 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.QualifierInfo;
import uk.ac.sanger.artemis.io.QualifierInfoHash;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QualifierInfoHash_ESTest extends QualifierInfoHash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 54, keyVector0, keyVector0, false);
      qualifierInfoHash0.put(qualifierInfo0);
      int int0 = qualifierInfoHash0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 54, keyVector0, keyVector0, false);
      qualifierInfoHash0.put(qualifierInfo0);
      QualifierInfo qualifierInfo1 = qualifierInfoHash0.get("");
      assertSame(qualifierInfo1, qualifierInfo0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo("C", (-3046), keyVector0, (KeyVector) null, false);
      qualifierInfoHash0.put(qualifierInfo0);
      QualifierInfo qualifierInfo1 = qualifierInfoHash0.get("C");
      assertEquals(4, QualifierInfo.OPTIONAL_QUOTED_TEXT);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo("C", (-3046), keyVector0, (KeyVector) null, false);
      qualifierInfoHash0.put(qualifierInfo0);
      QualifierInfoHash qualifierInfoHash1 = qualifierInfoHash0.copy();
      assertNotSame(qualifierInfoHash1, qualifierInfoHash0);
      assertEquals(1, qualifierInfoHash1.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo((String) null, 2041, keyVector0, keyVector0, false);
      // Undeclared exception!
      try { 
        qualifierInfoHash0.put(qualifierInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      // Undeclared exception!
      try { 
        qualifierInfoHash0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo("C", (-3046), keyVector0, (KeyVector) null, false);
      qualifierInfoHash0.put(qualifierInfo0);
      StringVector stringVector0 = qualifierInfoHash0.names();
      assertFalse(stringVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      qualifierInfoHash0.names();
      StringVector stringVector0 = qualifierInfoHash0.names();
      assertEquals("[]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, true);
      qualifierInfoHash0.put(qualifierInfo0);
      QualifierInfo qualifierInfo1 = qualifierInfoHash0.get("");
      assertEquals(3, QualifierInfo.NO_VALUE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      QualifierInfoHash qualifierInfoHash1 = qualifierInfoHash0.copy();
      assertNotSame(qualifierInfoHash1, qualifierInfoHash0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      QualifierInfo qualifierInfo0 = qualifierInfoHash0.get("");
      assertNull(qualifierInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QualifierInfoHash qualifierInfoHash0 = new QualifierInfoHash();
      int int0 = qualifierInfoHash0.size();
      assertEquals(0, int0);
  }
}