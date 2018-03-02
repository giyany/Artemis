/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:22:45 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.SelectionChangeEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionChangeEvent_ESTest extends SelectionChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent("", 0);
      int int0 = selectionChangeEvent0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent("C_Cyn|g", 1028);
      int int0 = selectionChangeEvent0.getType();
      assertEquals(1028, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SelectionChangeEvent selectionChangeEvent0 = null;
      try {
        selectionChangeEvent0 = new SelectionChangeEvent((Object) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent(object0, (-1));
      int int0 = selectionChangeEvent0.getType();
      assertEquals((-1), int0);
  }
}