/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:02:25 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureChangeEvent;
import uk.ac.sanger.artemis.components.DisplayAdjustmentEvent;
import uk.ac.sanger.artemis.components.FeaturePlot;
import uk.ac.sanger.artemis.io.BlastStreamFeature;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.plot.FeatureAlgorithm;
import uk.ac.sanger.artemis.plot.HydrophilicityAlgorithm;
import uk.ac.sanger.artemis.plot.HydrophobicityAlgorithm;
import uk.ac.sanger.artemis.plot.LineAttributes;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeaturePlot_ESTest extends FeaturePlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("feature_plot_height");
      Bases bases0 = new Bases(rawStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Feature feature0 = entry0.createFeature();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophilicityAlgorithm0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent(mockJapaneseDate0, 5, 0, 0, (-5), 891, false, 891);
      featurePlot0.displayAdjustmentValueChanged(displayAdjustmentEvent0);
      LineAttributes[] lineAttributesArray0 = new LineAttributes[6];
      // Undeclared exception!
      try { 
        featurePlot0.drawMultiValueGraph((Graphics) null, lineAttributesArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      int int0 = featurePlot0.getPointPosition((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      int int0 = featurePlot0.getPointPosition((-2355));
      assertEquals((-2354), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      featurePlot0.setBounds(100, 763, 100, 1285);
      Dimension dimension0 = featurePlot0.getMinimumSize();
      assertEquals(100, dimension0.width);
      assertEquals(160, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("feature_plot_height");
      Bases bases0 = new Bases(rawStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Feature feature0 = entry0.createFeature();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      hydrophilicityAlgorithm0.setScalingFlag(true);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophilicityAlgorithm0);
      FeatureAlgorithm featureAlgorithm0 = featurePlot0.getFeatureAlgorithm();
      assertEquals(1, featureAlgorithm0.getValueCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FeaturePlot featurePlot0 = null;
      try {
        featurePlot0 = new FeaturePlot((FeatureAlgorithm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      FeatureAlgorithm featureAlgorithm0 = featurePlot0.getFeatureAlgorithm();
      assertFalse(featureAlgorithm0.isUserMaxMin());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("feature_plot_height");
      Bases bases0 = new Bases(rawStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Feature feature0 = entry0.createFeature();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      hydrophilicityAlgorithm0.setScalingFlag(true);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophilicityAlgorithm0);
      featurePlot0.recalculateValues();
      assertFalse(featurePlot0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Key key0 = Key.CDS;
      QualifierVector qualifierVector0 = new QualifierVector();
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(key0, (Location) null, qualifierVector0);
      Feature feature0 = new Feature(blastStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      featurePlot0.calculateFeatures(false);
      assertTrue(featurePlot0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      int int0 = featurePlot0.getPointPosition(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("feature_plot_height");
      Bases bases0 = new Bases(rawStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Feature feature0 = entry0.createFeature();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophilicityAlgorithm0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent(mockJapaneseDate0, 5, (-1), 0, (-5), 875, false, 875);
      featurePlot0.displayAdjustmentValueChanged(displayAdjustmentEvent0);
      featurePlot0.recalculateValues();
      assertFalse(featurePlot0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      featurePlot0.showAveragesForRange();
      assertFalse(featurePlot0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      featurePlot0.stopListening();
      assertTrue(featurePlot0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      Dimension dimension0 = featurePlot0.getMinimumSize();
      assertEquals(160, dimension0.height);
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("feature_plot_height");
      Bases bases0 = new Bases(rawStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Feature feature0 = entry0.createFeature();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophilicityAlgorithm0);
      featurePlot0.featureChanged((FeatureChangeEvent) null);
      assertTrue(featurePlot0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = new Feature(emblStreamFeature0);
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      FeaturePlot featurePlot0 = new FeaturePlot(hydrophobicityAlgorithm0);
      Dimension dimension0 = featurePlot0.getPreferredSize();
      assertEquals(0, dimension0.width);
      assertEquals(160, dimension0.height);
  }
}
