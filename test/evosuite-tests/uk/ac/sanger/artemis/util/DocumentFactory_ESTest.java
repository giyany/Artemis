/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:45:03 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.DocumentFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentFactory_ESTest extends DocumentFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        DocumentFactory.makeDocument((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DocumentFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Document document0 = DocumentFactory.makeDocument("o.{&LZC,mR1n-dbgi");
      assertNull(document0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Document document0 = DocumentFactory.makeDocument("");
      assertTrue(document0.readable());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Document document0 = DocumentFactory.makeDocument("://");
      assertFalse(document0.writable());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Document document0 = DocumentFactory.makeDocument("*X0DM;J\"Y4q`/");
      assertTrue(document0.writable());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DocumentFactory documentFactory0 = new DocumentFactory();
  }
}