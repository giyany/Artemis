/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:00:02 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.plot.CoilFeatureAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoilFeatureAlgorithm_ESTest extends CoilFeatureAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      float[] floatArray0 = new float[4];
      // Undeclared exception!
      try { 
        coilFeatureAlgorithm0.getValues(0, 1, floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.CoilFeatureAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Integer integer0 = coilFeatureAlgorithm0.getDefaultMinWindowSize();
      assertEquals(28, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Float float0 = coilFeatureAlgorithm0.getMinimumInternal();
      assertEquals((-0.01F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      int int0 = coilFeatureAlgorithm0.getValueCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Integer integer0 = coilFeatureAlgorithm0.getDefaultStepSize(947);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Integer integer0 = coilFeatureAlgorithm0.getDefaultMaxWindowSize();
      assertEquals(28, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Float float0 = coilFeatureAlgorithm0.getAverage();
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Float float0 = coilFeatureAlgorithm0.getMaximumInternal();
      assertEquals(1.01F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      coilFeatureAlgorithm0.getDefaultWindowSize();
  }
}
