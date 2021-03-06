/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:29:19 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.net.URL;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.database.DatabaseEntrySource;
import uk.ac.sanger.artemis.components.filetree.RemoteFileNode;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.QualifierInfoHash;
import uk.ac.sanger.artemis.io.ReadAndWriteEntry;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.io.UI;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;
import uk.ac.sanger.artemis.util.RemoteFileDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadAndWriteEntry_ESTest extends ReadAndWriteEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      assertFalse(databaseEntrySource0.isReadOnly());
      assertNull(databaseEntrySource0.getLocation());
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertNotNull(databaseEntrySource0);
      
      boolean boolean0 = databaseEntrySource0.setLocation(false);
      assertFalse(databaseEntrySource0.isReadOnly());
      assertEquals("jdbc:postgresql://localhost:5432/chado?user=", databaseEntrySource0.getLocation());
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertTrue(boolean0);
      
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      ReadAndWriteEntry readAndWriteEntry0 = new ReadAndWriteEntry();
      assertNotNull(readAndWriteEntry0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.getFeatureId(databaseEntrySource0, "-_BV.-#'sO|");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertNull(databaseEntrySource0.getLocation());
      assertFalse(databaseEntrySource0.isReadOnly());
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertNotNull(databaseEntrySource0);
      
      SystemInUtil.addInputLine("");
      boolean boolean0 = databaseEntrySource0.setLocation(false);
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertFalse(databaseEntrySource0.isReadOnly());
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertEquals("jdbc:postgresql://localhost:5432/chado?user=", databaseEntrySource0.getLocation());
      assertTrue(boolean0);
      
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase("", databaseEntrySource0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertNull(databaseEntrySource0.getLocation());
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertFalse(databaseEntrySource0.isReadOnly());
      assertNotNull(databaseEntrySource0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase("zym~;19 uoZBm", databaseEntrySource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ReadAndWriteEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(blastEntryInformation0);
      
      Key key0 = new Key((String) null);
      assertNull(key0.toString());
      assertNull(key0.getKeyString());
      assertNotNull(key0);
      
      boolean boolean0 = blastEntryInformation0.isValidQualifier(key0, "qQ}yO8&VCbc8Qx/");
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNull(key0.toString());
      assertNull(key0.getKeyString());
      assertTrue(boolean0);
      
      boolean boolean1 = blastEntryInformation0.isRequiredQualifier(key0, "qQ}yO8&VCbc8Qx/");
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNull(key0.toString());
      assertNull(key0.getKeyString());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
      assertEquals(0, chadoCanonicalGene0.getSeqlen());
      assertNotNull(chadoCanonicalGene0);
      
      boolean boolean2 = blastEntryInformation0.isRequiredQualifier(key0, "-08-");
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNull(key0.toString());
      assertNull(key0.getKeyString());
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      Feature feature0 = chadoCanonicalGene0.getProteinOfTranscript("");
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
      assertEquals(0, chadoCanonicalGene0.getSeqlen());
      assertNull(feature0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.addAllKeysQualifiers(blastEntryInformation0, (Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ReadAndWriteEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = ReadAndWriteEntry.getEntrySource();
      assertNull(databaseEntrySource0);
      
      ReadAndWriteEntry readAndWriteEntry0 = new ReadAndWriteEntry();
      assertNotNull(readAndWriteEntry0);
      
      UI.UIMode uI_UIMode0 = UI.UIMode.CONSOLE;
      UI.mode = uI_UIMode0;
      LogLog.setInternalDebugging(false);
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
      assertNotNull(mSPcrunchEntryInformation0);
      
      QualifierInfoHash qualifierInfoHash0 = mSPcrunchEntryInformation0.getAllQualifierInfo();
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
      assertNull(qualifierInfoHash0);
      
      ReadAndWriteEntry.addQualifierToEntryInfo(mSPcrunchEntryInformation0, "<W]ezc");
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase("O1_wVQDA6uf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.UI", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      assertNull(databaseEntrySource0.getLocation());
      assertFalse(databaseEntrySource0.isReadOnly());
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertNotNull(databaseEntrySource0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.getFeatureId(databaseEntrySource0, (String) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = ReadAndWriteEntry.getEntrySource();
      assertNull(databaseEntrySource0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.getFeatureId((DatabaseEntrySource) null, "K3H");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ReadAndWriteEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReadAndWriteEntry readAndWriteEntry0 = new ReadAndWriteEntry();
      assertNotNull(readAndWriteEntry0);
      
      URL uRL0 = Loader.getResource("");
      assertEquals("", uRL0.getAuthority());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("", uRL0.getHost());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getQuery());
      assertNotNull(uRL0);
      
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      assertFalse(entryInformation0.useEMBLFormat());
      assertNotNull(entryInformation0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.addQualifierToEntryInfo(entryInformation0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis((-3912L));
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertNull(databaseEntrySource0.getLocation());
      assertFalse(databaseEntrySource0.isReadOnly());
      assertNotNull(databaseEntrySource0);
      
      boolean boolean0 = databaseEntrySource0.setLocation(false);
      assertTrue(databaseEntrySource0.isFullEntrySource());
      assertEquals("Database", databaseEntrySource0.getSourceName());
      assertFalse(databaseEntrySource0.isReadOnly());
      assertEquals("jdbc:postgresql://localhost:5432/chado?user=", databaseEntrySource0.getLocation());
      assertTrue(boolean0);
      
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase("", databaseEntrySource0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReadAndWriteEntry.getEntrySource();
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase(";@(5KWNQ:muP2C+o_", (DatabaseEntrySource) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase("");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      ReadAndWriteEntry.addAllKeysQualifiers(entryInformation0, emblStreamFeature0);
      assertFalse(entryInformation0.useEMBLFormat());
      
      ReadAndWriteEntry.getEntrySource();
      // Undeclared exception!
      try { 
        ReadAndWriteEntry.readEntryFromDatabase("updateFeatureLoc", (DatabaseEntrySource) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("p`jy~s");
      blastEntryInformation0.isValidKey(key0);
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation(blastEntryInformation0);
      blastEntryInformation0.getSortedValidKeys();
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      ReadAndWriteEntry.getEntrySource();
      ReadAndWriteEntry.addQualifierToEntryInfo(blastEntryInformation0, "-z\t[y|n] gzip output, default is y");
      String string0 = BorderLayout.LINE_END;
      assertEquals("After", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReadAndWriteEntry readAndWriteEntry0 = new ReadAndWriteEntry();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      RemoteFileDocument remoteFileDocument0 = new RemoteFileDocument(remoteFileNode0);
      remoteFileNode0.getPreviousSibling();
      IndexedGFFDocumentEntry indexedGFFDocumentEntry0 = new IndexedGFFDocumentEntry(remoteFileDocument0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleEntryInformation.getDefaultEntryInformation();
      String string0 = null;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }
}
