/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 16:57:04 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RemoteFileDocument_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.util.RemoteFileDocument"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RemoteFileDocument_ESTest_scaffolding.class.getClassLoader() ,
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "htsjdk.variant.vcf.VCFHeader",
      "org.apache.log4j.DefaultCategoryFactory",
      "htsjdk.samtools.util.Log$LogLevel",
      "com.sshtools.j2ssh.subsystem.SubsystemMessageStore",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "com.sshtools.j2ssh.transport.Service",
      "com.sshtools.j2ssh.sftp.SshFxpStat",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "com.sshtools.j2ssh.sftp.SshFxpMkdir",
      "org.apache.log4j.Level",
      "com.sshtools.j2ssh.sftp.SshFxpRmdir",
      "com.sshtools.j2ssh.sftp.SshFxpOpen",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "com.sshtools.j2ssh.sftp.SshFxpOpenDir",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "com.sshtools.j2ssh.authentication.TerminatedStateException",
      "com.sshtools.j2ssh.SshClient",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "uk.ac.sanger.artemis.j2ssh.FileTransferProgressMonitor",
      "org.apache.log4j.CategoryKey",
      "com.sshtools.j2ssh.sftp.SshFxpSetStat",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "com.sshtools.j2ssh.sftp.SshFxpFSetStat",
      "com.sshtools.j2ssh.sftp.SshFxpRemove",
      "org.emboss.jemboss.JembossParams",
      "com.sshtools.j2ssh.sftp.SshFxpReadlink",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "com.sshtools.j2ssh.transport.AsyncService",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.TransferCancelledException",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "org.apache.log4j.Hierarchy",
      "com.sshtools.j2ssh.sftp.SshFxpInit",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.emboss.jemboss.gui.Browser$3",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "org.emboss.jemboss.gui.Browser$6",
      "org.emboss.jemboss.gui.Browser",
      "com.sshtools.j2ssh.connection.Channel",
      "com.sshtools.j2ssh.sftp.MessageRequestId",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "com.sshtools.j2ssh.sftp.SshFxpReadDir",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "com.sshtools.j2ssh.sftp.SshFxpSymlink",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "org.apache.log4j.spi.RendererSupport",
      "htsjdk.samtools.util.Log",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "org.apache.log4j.helpers.OptionConverter",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "org.apache.log4j.or.ObjectRenderer",
      "htsjdk.tribble.TribbleException",
      "org.apache.log4j.Logger",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolListener",
      "org.apache.log4j.helpers.LogLog",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolClient",
      "org.apache.log4j.Category",
      "htsjdk.samtools.SAMException",
      "com.sshtools.j2ssh.sftp.SftpFileOutputStream",
      "com.sshtools.j2ssh.sftp.SshFxpClose",
      "org.apache.log4j.spi.RepositorySelector",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "com.sshtools.j2ssh.transport.MessageNotAvailableException",
      "com.sshtools.j2ssh.transport.TransportProtocolEventHandler",
      "com.sshtools.j2ssh.FileTransferProgress",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "com.sshtools.j2ssh.transport.SshMessage",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.apache.log4j.or.DefaultRenderer",
      "htsjdk.variant.vcf.VCFHeaderLine",
      "com.sshtools.j2ssh.util.State",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.apache.log4j.PropertyWatchdog",
      "com.sshtools.j2ssh.transport.TransportProtocolState",
      "org.apache.log4j.PropertyConfigurator",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "uk.ac.sanger.artemis.util.Document",
      "com.sshtools.j2ssh.sftp.SshFxpRead",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "com.sshtools.j2ssh.sftp.SshFxpFStat",
      "org.apache.log4j.Appender",
      "com.sshtools.j2ssh.sftp.SshFxpWrite",
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "uk.ac.sanger.artemis.j2ssh.SshPSUClient",
      "htsjdk.samtools.SAMSequenceDictionary",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "com.sshtools.j2ssh.SshException",
      "com.sshtools.j2ssh.session.SessionChannelClient",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "com.sshtools.j2ssh.SftpClient",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "com.sshtools.j2ssh.sftp.SshFxpRealPath",
      "com.sshtools.j2ssh.sftp.SshFxpRename",
      "uk.ac.sanger.artemis.util.PushBackException",
      "org.apache.log4j.Priority",
      "com.sshtools.j2ssh.connection.IOChannel",
      "org.apache.log4j.spi.LoggerRepository",
      "com.sshtools.j2ssh.transport.TransportProtocolException",
      "org.apache.log4j.LogManager",
      "htsjdk.samtools.SAMSequenceRecord",
      "com.sshtools.j2ssh.sftp.SftpFileInputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RemoteFileDocument_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "org.emboss.jemboss.JembossParams",
      "org.emboss.jemboss.gui.Browser",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.j2ssh.SshPSUClient",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "htsjdk.variant.vcf.VCFHeader",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.samtools.SAMSequenceRecord"
    );
  }
}