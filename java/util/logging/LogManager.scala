package java.util.logging

import java.beans.PropertyChangeListener
import java.io.InputStream
import java.lang.{Object, String}
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** There is a single global LogManager object that is used to
 *  maintain a set of shared state about Loggers and log services.
 *  
 *  This LogManager object:
 *  
 *   Manages a hierarchical namespace of Logger objects.  All
 *       named Loggers are stored in this namespace.
 *   Manages a set of logging control properties.  These are
 *       simple key-value pairs that can be used by Handlers and
 *       other logging objects to configure themselves.
 *  
 *  
 *  The global LogManager object can be retrieved using LogManager.getLogManager().
 *  The LogManager object is created during class initialization and
 *  cannot subsequently be changed.
 *  
 *  At startup the LogManager class is located using the
 *  java.util.logging.manager system property.
 *  
 *  The LogManager defines two optional system properties that allow control over
 *  the initial configuration:
 *  
 *  "java.util.logging.config.class"
 *  "java.util.logging.config.file"
 *  
 *  These two properties may be specified on the command line to the "java"
 *  command, or as system property definitions passed to JNI_CreateJavaVM.
 *  
 *  If the "java.util.logging.config.class" property is set, then the
 *  property value is treated as a class name.  The given class will be
 *  loaded, an object will be instantiated, and that object's constructor
 *  is responsible for reading in the initial configuration.  (That object
 *  may use other system properties to control its configuration.)  The
 *  alternate configuration class can use readConfiguration(InputStream)
 *  to define properties in the LogManager.
 *  
 *  If "java.util.logging.config.class" property is not set,
 *  then the "java.util.logging.config.file" system property can be used
 *  to specify a properties file (in java.util.Properties format). The
 *  initial logging configuration will be read from this file.
 *  
 *  If neither of these properties is defined then the LogManager uses its
 *  default configuration. The default configuration is typically loaded from the
 *  properties file "lib/logging.properties" in the Java installation
 *  directory.
 *  
 *  The properties for loggers and Handlers will have names starting
 *  with the dot-separated name for the handler or logger.
 *  
 *  The global logging properties may include:
 *  
 *  A property "handlers".  This defines a whitespace or comma separated
 *  list of class names for handler classes to load and register as
 *  handlers on the root Logger (the Logger named "").  Each class
 *  name must be for a Handler class which has a default constructor.
 *  Note that these Handlers may be created lazily, when they are
 *  first used.
 * 
 *  A property "<logger>.handlers". This defines a whitespace or
 *  comma separated list of class names for handlers classes to
 *  load and register as handlers to the specified logger. Each class
 *  name must be for a Handler class which has a default constructor.
 *  Note that these Handlers may be created lazily, when they are
 *  first used.
 * 
 *  A property "<logger>.useParentHandlers". This defines a boolean
 *  value. By default every logger calls its parent in addition to
 *  handling the logging message itself, this often result in messages
 *  being handled by the root logger as well. When setting this property
 *  to false a Handler needs to be configured for this logger otherwise
 *  no logging messages are delivered.
 * 
 *  A property "config".  This property is intended to allow
 *  arbitrary configuration code to be run.  The property defines a
 *  whitespace or comma separated list of class names.  A new instance will be
 *  created for each named class.  The default constructor of each class
 *  may execute arbitrary code to update the logging configuration, such as
 *  setting logger levels, adding handlers, adding filters, etc.
 *  
 *  
 *  Note that all classes loaded during LogManager configuration are
 *  first searched on the system class path before any user class path.
 *  That includes the LogManager class, any config classes, and any
 *  handler classes.
 *  
 *  Loggers are organized into a naming hierarchy based on their
 *  dot separated names.  Thus "a.b.c" is a child of "a.b", but
 *  "a.b1" and a.b2" are peers.
 *  
 *  All properties whose names end with ".level" are assumed to define
 *  log levels for Loggers.  Thus "foo.level" defines a log level for
 *  the logger called "foo" and (recursively) for any of its children
 *  in the naming hierarchy.  Log Levels are applied in the order they
 *  are defined in the properties file.  Thus level settings for child
 *  nodes in the tree should come after settings for their parents.
 *  The property name ".level" can be used to set the level for the
 *  root of the tree.
 *  
 *  All methods on the LogManager object are multi-thread safe.
 */
class LogManager extends Object {

    /** Protected constructor. */
    @stub
    protected def this() = ???

    /** Add a named logger. */
    @stub
    def addLogger(logger: Logger): Boolean = ???

    /** Deprecated. 
     * The dependency on PropertyChangeListener creates a
     *              significant impediment to future modularization of the Java
     *              platform. This method will be removed in a future release.
     *              The global LogManager can detect changes to the
     *              logging configuration by overridding the readConfiguration method.
     * 
     */
    @stub
    def addPropertyChangeListener(l: PropertyChangeListener): Unit = ???

    /** Check that the current context is trusted to modify the logging
     *  configuration.
     */
    @stub
    def checkAccess(): Unit = ???

    /** Method to find a named logger. */
    @stub
    def getLogger(name: String): Logger = ???

    /** Get an enumeration of known logger names. */
    @stub
    def getLoggerNames(): Enumeration[String] = ???

    /** Get the value of a logging property. */
    @stub
    def getProperty(name: String): String = ???

    /** Reinitialize the logging properties and reread the logging configuration. */
    @stub
    def readConfiguration(): Unit = ???

    /** Reinitialize the logging properties and reread the logging configuration
     *  from the given stream, which should be in java.util.Properties format.
     */
    @stub
    def readConfiguration(ins: InputStream): Unit = ???

    /** Deprecated. 
     * The dependency on PropertyChangeListener creates a
     *              significant impediment to future modularization of the Java
     *              platform. This method will be removed in a future release.
     *              The global LogManager can detect changes to the
     *              logging configuration by overridding the readConfiguration method.
     * 
     */
    @stub
    def removePropertyChangeListener(l: PropertyChangeListener): Unit = ???

    /** Reset the logging configuration. */
    @stub
    def reset(): Unit = ???
}

object LogManager {
    /** String representation of the
     *  ObjectName for the management interface
     *  for the logging facility.
     */
    @stub
    val LOGGING_MXBEAN_NAME: String = ???

    /** Returns LoggingMXBean for managing loggers. */
    @stub
    def getLoggingMXBean(): LoggingMXBean = ???

    /** Returns the global LogManager object. */
    @stub
    def getLogManager(): LogManager = ???
}
