/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:05:49 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.datatransfer.Clipboard;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.RunMenu;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RunMenu_ESTest extends RunMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      RunMenu runMenu0 = new RunMenu((JFrame) null, selection0);
      assertFalse(runMenu0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      RunMenu runMenu0 = new RunMenu((JFrame) null, selection0, "");
  }
}