
package org.wildfly.extension.undertow.logging;

import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.dmr.ModelNode;
import org.jboss.jandex.ClassInfo;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.Logger;
import org.jboss.modules.ModuleIdentifier;
import org.jboss.msc.service.ServiceName;
import org.jboss.vfs.VirtualFile;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2015-04-28T19:41:11+0200")
public class UndertowLogger_$logger
    extends DelegatingBasicLogger
    implements Serializable, BasicLogger, UndertowLogger
{

    private final static long serialVersionUID = 1L;
    private final static java.lang.String FQCN = UndertowLogger_$logger.class.getName();
    private final static java.lang.String alpnNotFound = "WFLYUT0071: Jetty ALPN not found. HTTP2 and SPDY are not available. Please make sure Jetty ALPN is on the boot class path.";
    private final static java.lang.String cannotActivateContext = "WFLYUT0058: Cannot activate context: %s";
    private final static java.lang.String cannotCreateHttpHandler = "WFLYUT0059: Could not construct handler for class: %s. with parameters %s";
    private final static java.lang.String cannotLoadDesignatedHandleTypes = "WFLYUT0009: Could not load class designated by HandlesTypes [%s].";
    private final static java.lang.String clusteringNotSupported = "WFLYUT0020: Clustering not supported, falling back to non-clustered session manager";
    private final static java.lang.String couldNotCreateLogDirectory = "WFLYUT0062: Could not create log directory: %s";
    private final static java.lang.String couldNotDeleteTempFile = "WFLYUT0017: Could not delete servlet temp file %s";
    private final static java.lang.String couldNotFindExternalPath = "WFLYUT0072: Could not find configured external path %s";
    private final static java.lang.String couldNotInitJsp = "WFLYUT0001: Could not initialize JSP";
    private final static java.lang.String couldNotLoadHandlerFromModule = "WFLYUT0070: Could not load handler %s from %s module";
    private final static java.lang.String couldNotLoadWebSocketConfig = "WFLYUT0011: Could not load web socket application config %s.";
    private final static java.lang.String couldNotLoadWebSocketEndpoint = "WFLYUT0010: Could not load web socket endpoint %s.";
    private final static java.lang.String creatingFileHandler = "WFLYUT0014: Creating file handler for path %s";
    private final static java.lang.String errorLoadingSCIFromModule = "WFLYUT0049: Error loading SCI from module: %s";
    private final static java.lang.String errorProcessingSCI = "WFLYUT0051: Deployment error processing SCI for jar: %s";
    private final static java.lang.String failToCreateSecurityContext = "WFLYUT0052: Security context creation failed";
    private final static java.lang.String failToParseXMLDescriptor1 = "WFLYUT0028: Failed to parse XML descriptor %s";
    private final static java.lang.String failToParseXMLDescriptor3 = "WFLYUT0027: Failed to parse XML descriptor %s at [%s,%s]";
    private final static java.lang.String failToProcessWebInfLib = "WFLYUT0048: Failed to process WEB-INF/lib: %s";
    private final static java.lang.String failedToConfigureHandler = "WFLYUT0064: Failed to configure handler %s";
    private final static java.lang.String failedToConfigureHandlerClass = "WFLYUT0066: Failed to configure handler %s";
    private final static java.lang.String failedToCreatePersistentSessionDir = "WFLYUT0061: Failed to create persistent sessions dir %s";
    private final static java.lang.String failedToPersistSessionAttribute = "WFLYUT0024: Failed to persist session attribute %s with value %s for session %s";
    private final static java.lang.String failedToRegisterPolicyContextHandler = "WFLYUT0025: Failed to register policy context handler for key %s";
    private final static java.lang.String failedToResolveModule = "WFLYUT0039: Failed to resolve module for deployment %s";
    private final static java.lang.String handlerWasNotAHandlerOrWrapper = "WFLYUT0065: Handler class %s was not a handler or a wrapper";
    private final static java.lang.String hostStarting = "WFLYUT0018: Host %s starting";
    private final static java.lang.String hostStopping = "WFLYUT0019: Host %s stopping";
    private final static java.lang.String invalidAbsoluteOrdering = "WFLYUT0016: Could not resolve name in absolute ordering: %s";
    private final static java.lang.String invalidDeclareRolesAnnotation = "WFLYUT0034: @DeclareRoles needs to specify role names on %s";
    private final static java.lang.String invalidMultipartConfigAnnotation = "WFLYUT0035: @MultipartConfig is only allowed at class level %s";
    private final static java.lang.String invalidMultipleOthers = "WFLYUT0040: Duplicate others in absolute ordering";
    private final static java.lang.String invalidPersistentSessionDir = "WFLYUT0060: Invalid persistent sessions directory %s";
    private final static java.lang.String invalidRedirectURI = "WFLYUT0013: Could not create redirect URI.";
    private final static java.lang.String invalidRelativeOrdering0 = "WFLYUT0041: Invalid relative ordering";
    private final static java.lang.String invalidRelativeOrdering1 = "WFLYUT0043: Relative ordering processing error with JAR: %s";
    private final static java.lang.String invalidRelativeOrderingBeforeAndAfter = "WFLYUT0044: Ordering includes both before and after others in JAR: %s";
    private final static java.lang.String invalidRelativeOrderingConflict = "WFLYUT0047: Relative ordering conflict with JAR: %s";
    private final static java.lang.String invalidRelativeOrderingDuplicateName = "WFLYUT0045: Duplicate name declared in JAR: %s";
    private final static java.lang.String invalidRelativeOrderingUnknownName = "WFLYUT0046: Unknown web fragment name declared in JAR: %s";
    private final static java.lang.String invalidRunAsAnnotation = "WFLYUT0033: @RunAs needs to specify a role name on %s";
    private final static java.lang.String invalidServletSecurityAnnotation = "WFLYUT0036: @ServletSecurity is only allowed at class level %s";
    private final static java.lang.String invalidWebFilterAnnotation = "WFLYUT0031: @WebFilter is only allowed at class level %s";
    private final static java.lang.String invalidWebFragment = "WFLYUT0042: Conflict occurred processing web fragment in JAR: %s";
    private final static java.lang.String invalidWebInitParamAnnotation = "WFLYUT0030: @WebInitParam requires name and value on %s";
    private final static java.lang.String invalidWebListenerAnnotation = "WFLYUT0032: @WebListener is only allowed at class level %s";
    private final static java.lang.String invalidWebServletAnnotation = "WFLYUT0029: @WebServlet is only allowed at class level %s";
    private final static java.lang.String listenerStarted = "WFLYUT0006: Undertow %s listener %s listening on %s";
    private final static java.lang.String listenerStopped = "WFLYUT0007: Undertow %s listener %s stopped, was bound to %s";
    private final static java.lang.String listenerSuspend = "WFLYUT0008: Undertow %s listener %s suspending";
    private final static java.lang.String noAuthorizationHelper = "WFLYUT0068: Error obtaining authorization helper";
    private final static java.lang.String noPortListeningForProtocol = "WFLYUT0063: Could not find the port number listening for protocol %s";
    private final static java.lang.String noSecurityContext = "WFLYUT0053: No security context found";
    private final static java.lang.String nullDefaultHost = "WFLYUT0055: Null default host";
    private final static java.lang.String nullHostName = "WFLYUT0056: Null host name";
    private final static java.lang.String nullParamter = "WFLYUT0057: Null parameter %s";
    private final static java.lang.String registerWebapp = "WFLYUT0021: Registered web context: %s";
    private final static java.lang.String secureListenerNotAvailableForPort = "WFLYUT0005: Secure listener for protocol: '%s' not found! Using non secure port!";
    private final static java.lang.String serverStarting = "WFLYUT0003: Undertow %s starting";
    private final static java.lang.String serverStopping = "WFLYUT0004: Undertow %s stopping";
    private final static java.lang.String servletClassNotDefined = "WFLYUT0067: Servlet class not defined for servlet %s";
    private final static java.lang.String sharedSessionConfigNotInRootDeployment = "WFLYUT0069: Ignoring shared-session-config in jboss-all.xml in deployment %s. This entry is only valid in top level deployments.";
    private final static java.lang.String skippedSCI = "WFLYUT0023: Skipped SCI for jar: %s.";
    private final static java.lang.String startedServer = "WFLYUT0012: Started server %s.";
    private final static java.lang.String tldFileNotContainedInRoot = "WFLYUT0038: TLD file %s not contained in root %s";
    private final static java.lang.String unableToResolveAnnotationIndex = "WFLYUT0050: Unable to resolve annotation index for deployment unit: %s";
    private final static java.lang.String unknownMetric = "WFLYUT0054: Unknown metric %s";
    private final static java.lang.String unregisterWebapp = "WFLYUT0022: Unregistered web context: %s";
    private final static java.lang.String wrongComponentType = "WFLYUT0037: %s has the wrong component type, it cannot be used as a web component";

    public UndertowLogger_$logger(final Logger log) {
        super(log);
    }

    public final void alpnNotFound() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, alpnNotFound$str());
    }

    protected java.lang.String alpnNotFound$str() {
        return alpnNotFound;
    }

    public final java.lang.IllegalStateException cannotActivateContext(final java.lang.Throwable th, final ServiceName service) {
        java.lang.IllegalStateException result = new java.lang.IllegalStateException(java.lang.String.format(cannotActivateContext$str(), service), th);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String cannotActivateContext$str() {
        return cannotActivateContext;
    }

    public final java.lang.RuntimeException cannotCreateHttpHandler(final java.lang.Class handlerClass, final ModelNode parameters, final java.lang.Throwable cause) {
        java.lang.RuntimeException result = new java.lang.RuntimeException(java.lang.String.format(cannotCreateHttpHandler$str(), handlerClass, parameters), cause);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String cannotCreateHttpHandler$str() {
        return cannotCreateHttpHandler;
    }

    public final void cannotLoadDesignatedHandleTypes(final ClassInfo classInfo, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), (e), cannotLoadDesignatedHandleTypes$str(), classInfo);
    }

    protected java.lang.String cannotLoadDesignatedHandleTypes$str() {
        return cannotLoadDesignatedHandleTypes;
    }

    public final void clusteringNotSupported() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, clusteringNotSupported$str());
    }

    protected java.lang.String clusteringNotSupported$str() {
        return clusteringNotSupported;
    }

    public final org.jboss.msc.service.StartException couldNotCreateLogDirectory(final java.io.File directory) {
        org.jboss.msc.service.StartException result = new org.jboss.msc.service.StartException(java.lang.String.format(couldNotCreateLogDirectory$str(), directory));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String couldNotCreateLogDirectory$str() {
        return couldNotCreateLogDirectory;
    }

    public final void couldNotDeleteTempFile(final java.io.File file) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, couldNotDeleteTempFile$str(), file);
    }

    protected java.lang.String couldNotDeleteTempFile$str() {
        return couldNotDeleteTempFile;
    }

    public final org.jboss.as.server.deployment.DeploymentUnitProcessingException couldNotFindExternalPath(final java.io.File path) {
        org.jboss.as.server.deployment.DeploymentUnitProcessingException result = new org.jboss.as.server.deployment.DeploymentUnitProcessingException(java.lang.String.format(couldNotFindExternalPath$str(), path));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String couldNotFindExternalPath$str() {
        return couldNotFindExternalPath;
    }

    public final void couldNotInitJsp(final ClassNotFoundException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), couldNotInitJsp$str());
    }

    protected java.lang.String couldNotInitJsp$str() {
        return couldNotInitJsp;
    }

    public final java.lang.RuntimeException couldNotLoadHandlerFromModule(final java.lang.String className, final java.lang.String moduleName, final java.lang.Exception e) {
        java.lang.RuntimeException result = new java.lang.RuntimeException(java.lang.String.format(couldNotLoadHandlerFromModule$str(), className, moduleName), e);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String couldNotLoadHandlerFromModule$str() {
        return couldNotLoadHandlerFromModule;
    }

    public final void couldNotLoadWebSocketConfig(final java.lang.String s, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), couldNotLoadWebSocketConfig$str(), s);
    }

    protected java.lang.String couldNotLoadWebSocketConfig$str() {
        return couldNotLoadWebSocketConfig;
    }

    public final void couldNotLoadWebSocketEndpoint(final java.lang.String s, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), couldNotLoadWebSocketEndpoint$str(), s);
    }

    protected java.lang.String couldNotLoadWebSocketEndpoint$str() {
        return couldNotLoadWebSocketEndpoint;
    }

    public final void creatingFileHandler(final java.lang.String path) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, creatingFileHandler$str(), path);
    }

    protected java.lang.String creatingFileHandler$str() {
        return creatingFileHandler;
    }

    public final org.jboss.as.server.deployment.DeploymentUnitProcessingException errorLoadingSCIFromModule(final ModuleIdentifier identifier, final java.lang.Exception e) {
        org.jboss.as.server.deployment.DeploymentUnitProcessingException result = new org.jboss.as.server.deployment.DeploymentUnitProcessingException(java.lang.String.format(errorLoadingSCIFromModule$str(), identifier), e);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String errorLoadingSCIFromModule$str() {
        return errorLoadingSCIFromModule;
    }

    public final org.jboss.as.server.deployment.DeploymentUnitProcessingException errorProcessingSCI(final java.lang.String jar, final java.lang.Exception e) {
        org.jboss.as.server.deployment.DeploymentUnitProcessingException result = new org.jboss.as.server.deployment.DeploymentUnitProcessingException(java.lang.String.format(errorProcessingSCI$str(), jar), e);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String errorProcessingSCI$str() {
        return errorProcessingSCI;
    }

    public final java.lang.RuntimeException failToCreateSecurityContext(final java.lang.Throwable t) {
        java.lang.RuntimeException result = new java.lang.RuntimeException(java.lang.String.format(failToCreateSecurityContext$str()), t);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String failToCreateSecurityContext$str() {
        return failToCreateSecurityContext;
    }

    public final java.lang.String failToParseXMLDescriptor(final java.lang.String xmlFile) {
        java.lang.String result = java.lang.String.format(failToParseXMLDescriptor1$str(), xmlFile);
        return result;
    }

    protected java.lang.String failToParseXMLDescriptor1$str() {
        return failToParseXMLDescriptor1;
    }

    public final java.lang.String failToParseXMLDescriptor(final java.lang.String xmlFile, final java.lang.Integer line, final java.lang.Integer column) {
        java.lang.String result = java.lang.String.format(failToParseXMLDescriptor3$str(), xmlFile, line, column);
        return result;
    }

    protected java.lang.String failToParseXMLDescriptor3$str() {
        return failToParseXMLDescriptor3;
    }

    public final java.lang.String failToProcessWebInfLib(final VirtualFile xmlFile) {
        java.lang.String result = java.lang.String.format(failToProcessWebInfLib$str(), xmlFile);
        return result;
    }

    protected java.lang.String failToProcessWebInfLib$str() {
        return failToProcessWebInfLib;
    }

    public final java.lang.RuntimeException failedToConfigureHandler(final java.lang.Class handlerClass, final java.lang.Exception e) {
        java.lang.RuntimeException result = new java.lang.RuntimeException(java.lang.String.format(failedToConfigureHandler$str(), handlerClass), e);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String failedToConfigureHandler$str() {
        return failedToConfigureHandler;
    }

    public final java.lang.RuntimeException failedToConfigureHandlerClass(final java.lang.String handlerClass, final java.lang.Exception e) {
        java.lang.RuntimeException result = new java.lang.RuntimeException(java.lang.String.format(failedToConfigureHandlerClass$str(), handlerClass), e);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String failedToConfigureHandlerClass$str() {
        return failedToConfigureHandlerClass;
    }

    public final org.jboss.msc.service.StartException failedToCreatePersistentSessionDir(final java.io.File baseDir) {
        org.jboss.msc.service.StartException result = new org.jboss.msc.service.StartException(java.lang.String.format(failedToCreatePersistentSessionDir$str(), baseDir));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String failedToCreatePersistentSessionDir$str() {
        return failedToCreatePersistentSessionDir;
    }

    public final void failedToPersistSessionAttribute(final java.lang.String attributeName, final java.lang.Object value, final java.lang.String sessionID, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), failedToPersistSessionAttribute$str(), attributeName, value, sessionID);
    }

    protected java.lang.String failedToPersistSessionAttribute$str() {
        return failedToPersistSessionAttribute;
    }

    public final void failedToRegisterPolicyContextHandler(final java.lang.String key, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), failedToRegisterPolicyContextHandler$str(), key);
    }

    protected java.lang.String failedToRegisterPolicyContextHandler$str() {
        return failedToRegisterPolicyContextHandler;
    }

    public final org.jboss.as.server.deployment.DeploymentUnitProcessingException failedToResolveModule(final org.jboss.as.server.deployment.DeploymentUnit deploymentUnit) {
        org.jboss.as.server.deployment.DeploymentUnitProcessingException result = new org.jboss.as.server.deployment.DeploymentUnitProcessingException(java.lang.String.format(failedToResolveModule$str(), deploymentUnit));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String failedToResolveModule$str() {
        return failedToResolveModule;
    }

    public final java.lang.IllegalArgumentException handlerWasNotAHandlerOrWrapper(final java.lang.Class handlerClass) {
        java.lang.IllegalArgumentException result = new java.lang.IllegalArgumentException(java.lang.String.format(handlerWasNotAHandlerOrWrapper$str(), handlerClass));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String handlerWasNotAHandlerOrWrapper$str() {
        return handlerWasNotAHandlerOrWrapper;
    }

    public final void hostStarting(final java.lang.String version) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, hostStarting$str(), version);
    }

    protected java.lang.String hostStarting$str() {
        return hostStarting;
    }

    public final void hostStopping(final java.lang.String version) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, hostStopping$str(), version);
    }

    protected java.lang.String hostStopping$str() {
        return hostStopping;
    }

    public final void invalidAbsoluteOrdering(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidAbsoluteOrdering$str(), name);
    }

    protected java.lang.String invalidAbsoluteOrdering$str() {
        return invalidAbsoluteOrdering;
    }

    public final java.lang.String invalidDeclareRolesAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidDeclareRolesAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidDeclareRolesAnnotation$str() {
        return invalidDeclareRolesAnnotation;
    }

    public final java.lang.String invalidMultipartConfigAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidMultipartConfigAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidMultipartConfigAnnotation$str() {
        return invalidMultipartConfigAnnotation;
    }

    public final java.lang.String invalidMultipleOthers() {
        java.lang.String result = java.lang.String.format(invalidMultipleOthers$str());
        return result;
    }

    protected java.lang.String invalidMultipleOthers$str() {
        return invalidMultipleOthers;
    }

    public final org.jboss.msc.service.StartException invalidPersistentSessionDir(final java.io.File baseDir) {
        org.jboss.msc.service.StartException result = new org.jboss.msc.service.StartException(java.lang.String.format(invalidPersistentSessionDir$str(), baseDir));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String invalidPersistentSessionDir$str() {
        return invalidPersistentSessionDir;
    }

    public final void invalidRedirectURI(final java.lang.Throwable cause) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (cause), invalidRedirectURI$str());
    }

    protected java.lang.String invalidRedirectURI$str() {
        return invalidRedirectURI;
    }

    public final java.lang.String invalidRelativeOrdering() {
        java.lang.String result = java.lang.String.format(invalidRelativeOrdering0$str());
        return result;
    }

    protected java.lang.String invalidRelativeOrdering0$str() {
        return invalidRelativeOrdering0;
    }

    public final java.lang.String invalidRelativeOrdering(final java.lang.String jar) {
        java.lang.String result = java.lang.String.format(invalidRelativeOrdering1$str(), jar);
        return result;
    }

    protected java.lang.String invalidRelativeOrdering1$str() {
        return invalidRelativeOrdering1;
    }

    public final java.lang.String invalidRelativeOrderingBeforeAndAfter(final java.lang.String jar) {
        java.lang.String result = java.lang.String.format(invalidRelativeOrderingBeforeAndAfter$str(), jar);
        return result;
    }

    protected java.lang.String invalidRelativeOrderingBeforeAndAfter$str() {
        return invalidRelativeOrderingBeforeAndAfter;
    }

    public final java.lang.String invalidRelativeOrderingConflict(final java.lang.String jar) {
        java.lang.String result = java.lang.String.format(invalidRelativeOrderingConflict$str(), jar);
        return result;
    }

    protected java.lang.String invalidRelativeOrderingConflict$str() {
        return invalidRelativeOrderingConflict;
    }

    public final java.lang.String invalidRelativeOrderingDuplicateName(final java.lang.String jar) {
        java.lang.String result = java.lang.String.format(invalidRelativeOrderingDuplicateName$str(), jar);
        return result;
    }

    protected java.lang.String invalidRelativeOrderingDuplicateName$str() {
        return invalidRelativeOrderingDuplicateName;
    }

    public final void invalidRelativeOrderingUnknownName(final java.lang.String jar) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidRelativeOrderingUnknownName$str(), jar);
    }

    protected java.lang.String invalidRelativeOrderingUnknownName$str() {
        return invalidRelativeOrderingUnknownName;
    }

    public final java.lang.String invalidRunAsAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidRunAsAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidRunAsAnnotation$str() {
        return invalidRunAsAnnotation;
    }

    public final java.lang.String invalidServletSecurityAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidServletSecurityAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidServletSecurityAnnotation$str() {
        return invalidServletSecurityAnnotation;
    }

    public final java.lang.String invalidWebFilterAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidWebFilterAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidWebFilterAnnotation$str() {
        return invalidWebFilterAnnotation;
    }

    public final java.lang.String invalidWebFragment(final java.lang.String jar) {
        java.lang.String result = java.lang.String.format(invalidWebFragment$str(), jar);
        return result;
    }

    protected java.lang.String invalidWebFragment$str() {
        return invalidWebFragment;
    }

    public final java.lang.String invalidWebInitParamAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidWebInitParamAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidWebInitParamAnnotation$str() {
        return invalidWebInitParamAnnotation;
    }

    public final java.lang.String invalidWebListenerAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidWebListenerAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidWebListenerAnnotation$str() {
        return invalidWebListenerAnnotation;
    }

    public final java.lang.String invalidWebServletAnnotation(final org.jboss.jandex.AnnotationTarget target) {
        java.lang.String result = java.lang.String.format(invalidWebServletAnnotation$str(), target);
        return result;
    }

    protected java.lang.String invalidWebServletAnnotation$str() {
        return invalidWebServletAnnotation;
    }

    public final void listenerStarted(final java.lang.String type, final java.lang.String name, final java.net.InetSocketAddress address) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, listenerStarted$str(), type, name, address);
    }

    protected java.lang.String listenerStarted$str() {
        return listenerStarted;
    }

    public final void listenerStopped(final java.lang.String type, final java.lang.String name, final java.net.InetSocketAddress address) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, listenerStopped$str(), type, name, address);
    }

    protected java.lang.String listenerStopped$str() {
        return listenerStopped;
    }

    public final void listenerSuspend(final java.lang.String type, final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, listenerSuspend$str(), type, name);
    }

    protected java.lang.String listenerSuspend$str() {
        return listenerSuspend;
    }

    public final void noAuthorizationHelper(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), noAuthorizationHelper$str());
    }

    protected java.lang.String noAuthorizationHelper$str() {
        return noAuthorizationHelper;
    }

    public final java.lang.IllegalStateException noPortListeningForProtocol(final java.lang.String protocol) {
        java.lang.IllegalStateException result = new java.lang.IllegalStateException(java.lang.String.format(noPortListeningForProtocol$str(), protocol));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String noPortListeningForProtocol$str() {
        return noPortListeningForProtocol;
    }

    public final java.lang.IllegalStateException noSecurityContext() {
        java.lang.IllegalStateException result = new java.lang.IllegalStateException(java.lang.String.format(noSecurityContext$str()));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String noSecurityContext$str() {
        return noSecurityContext;
    }

    public final java.lang.IllegalArgumentException nullDefaultHost() {
        java.lang.IllegalArgumentException result = new java.lang.IllegalArgumentException(java.lang.String.format(nullDefaultHost$str()));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String nullDefaultHost$str() {
        return nullDefaultHost;
    }

    public final java.lang.IllegalStateException nullHostName() {
        java.lang.IllegalStateException result = new java.lang.IllegalStateException(java.lang.String.format(nullHostName$str()));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String nullHostName$str() {
        return nullHostName;
    }

    public final java.lang.IllegalArgumentException nullParamter(final java.lang.String id) {
        java.lang.IllegalArgumentException result = new java.lang.IllegalArgumentException(java.lang.String.format(nullParamter$str(), id));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String nullParamter$str() {
        return nullParamter;
    }

    public final void registerWebapp(final java.lang.String webappPath) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, registerWebapp$str(), webappPath);
    }

    protected java.lang.String registerWebapp$str() {
        return registerWebapp;
    }

    public final void secureListenerNotAvailableForPort(final java.lang.String protocol) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, secureListenerNotAvailableForPort$str(), protocol);
    }

    protected java.lang.String secureListenerNotAvailableForPort$str() {
        return secureListenerNotAvailableForPort;
    }

    public final void serverStarting(final java.lang.String version) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, serverStarting$str(), version);
    }

    protected java.lang.String serverStarting$str() {
        return serverStarting;
    }

    public final void serverStopping(final java.lang.String version) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, serverStopping$str(), version);
    }

    protected java.lang.String serverStopping$str() {
        return serverStopping;
    }

    public final java.lang.IllegalArgumentException servletClassNotDefined(final java.lang.String servletName) {
        java.lang.IllegalArgumentException result = new java.lang.IllegalArgumentException(java.lang.String.format(servletClassNotDefined$str(), servletName));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String servletClassNotDefined$str() {
        return servletClassNotDefined;
    }

    public final void sharedSessionConfigNotInRootDeployment(final java.lang.String deployment) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, sharedSessionConfigNotInRootDeployment$str(), deployment);
    }

    protected java.lang.String sharedSessionConfigNotInRootDeployment$str() {
        return sharedSessionConfigNotInRootDeployment;
    }

    public final void skippedSCI(final java.lang.String jar, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), (e), skippedSCI$str(), jar);
    }

    protected java.lang.String skippedSCI$str() {
        return skippedSCI;
    }

    public final void startedServer(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, startedServer$str(), name);
    }

    protected java.lang.String startedServer$str() {
        return startedServer;
    }

    public final java.lang.String tldFileNotContainedInRoot(final java.lang.String tldPath, final java.lang.String rootPath) {
        java.lang.String result = java.lang.String.format(tldFileNotContainedInRoot$str(), tldPath, rootPath);
        return result;
    }

    protected java.lang.String tldFileNotContainedInRoot$str() {
        return tldFileNotContainedInRoot;
    }

    public final org.jboss.as.server.deployment.DeploymentUnitProcessingException unableToResolveAnnotationIndex(final org.jboss.as.server.deployment.DeploymentUnit deploymentUnit) {
        org.jboss.as.server.deployment.DeploymentUnitProcessingException result = new org.jboss.as.server.deployment.DeploymentUnitProcessingException(java.lang.String.format(unableToResolveAnnotationIndex$str(), deploymentUnit));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String unableToResolveAnnotationIndex$str() {
        return unableToResolveAnnotationIndex;
    }

    public final java.lang.String unknownMetric(final java.lang.Object metric) {
        java.lang.String result = java.lang.String.format(unknownMetric$str(), metric);
        return result;
    }

    protected java.lang.String unknownMetric$str() {
        return unknownMetric;
    }

    public final void unregisterWebapp(final java.lang.String webappPath) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unregisterWebapp$str(), webappPath);
    }

    protected java.lang.String unregisterWebapp$str() {
        return unregisterWebapp;
    }

    public final java.lang.RuntimeException wrongComponentType(final java.lang.String clazz) {
        java.lang.RuntimeException result = new java.lang.RuntimeException(java.lang.String.format(wrongComponentType$str(), clazz));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String wrongComponentType$str() {
        return wrongComponentType;
    }

}
