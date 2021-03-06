/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:50:58 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.FileDialog;
import java.awt.Scrollbar;
import java.util.Hashtable;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.editor.DataViewInternalFrame;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.MSPcrunchStreamFeature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataViewInternalFrame_ESTest extends DataViewInternalFrame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane(jDesktopPane0);
      DataViewInternalFrame dataViewInternalFrame0 = null;
      try {
        dataViewInternalFrame0 = new DataViewInternalFrame((Hashtable) null, jDesktopPane0, jScrollPane0, 1778, 1778, ".", (Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hashtable<Scrollbar, FileDialog> hashtable0 = new Hashtable<Scrollbar, FileDialog>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 86, 0, "[", (Feature) null);
      DataViewInternalFrame.ActiveJSplitPane dataViewInternalFrame_ActiveJSplitPane0 = dataViewInternalFrame0.new ActiveJSplitPane(0, jDesktopPane0, jDesktopPane0);
      // Undeclared exception!
      try { 
        dataViewInternalFrame_ActiveJSplitPane0.setActive(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame$ActiveJSplitPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hashtable<Scrollbar, FileDialog> hashtable0 = new Hashtable<Scrollbar, FileDialog>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 86, 0, "[", (Feature) null);
      dataViewInternalFrame0.stopGetz();
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultBoundedRangeModel defaultBoundedRangeModel0 = new DefaultBoundedRangeModel(138, 138, 138, 906);
      JSlider jSlider0 = new JSlider(defaultBoundedRangeModel0);
      Hashtable hashtable0 = jSlider0.createStandardLabels(906, 138);
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane(jDesktopPane0);
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature(emblStreamFeature0);
      Feature feature0 = new Feature(mSPcrunchStreamFeature0);
      DataViewInternalFrame dataViewInternalFrame0 = null;
      try {
        dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 8, 138, "", feature0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Hashtable<Scrollbar, FileDialog> hashtable0 = new Hashtable<Scrollbar, FileDialog>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 86, 0, "[", (Feature) null);
      dataViewInternalFrame0.deleteNote();
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Hashtable<Scrollbar, FileDialog> hashtable0 = new Hashtable<Scrollbar, FileDialog>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 86, 0, "[", (Feature) null);
      dataViewInternalFrame0.updateNote();
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Hashtable<Scrollbar, FileDialog> hashtable0 = new Hashtable<Scrollbar, FileDialog>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 86, 0, "[", (Feature) null);
      DataViewInternalFrame.ActiveJSplitPane dataViewInternalFrame_ActiveJSplitPane0 = dataViewInternalFrame0.new ActiveJSplitPane(0, jDesktopPane0, jDesktopPane0);
      // Undeclared exception!
      try { 
        dataViewInternalFrame_ActiveJSplitPane0.setActive(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame$ActiveJSplitPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Hashtable<Scrollbar, FileDialog> hashtable0 = new Hashtable<Scrollbar, FileDialog>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      JScrollPane jScrollPane0 = new JScrollPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 86, 0, "[", (Feature) null);
      DataViewInternalFrame.TabChangeListener dataViewInternalFrame_TabChangeListener0 = dataViewInternalFrame0.new TabChangeListener();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      ChangeEvent changeEvent0 = new ChangeEvent(mockHijrahDate0);
      // Undeclared exception!
      try { 
        dataViewInternalFrame_TabChangeListener0.stateChanged(changeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame$TabChangeListener", e);
      }
  }
}
