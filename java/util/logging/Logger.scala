package java.util.logging

import java.lang.{Object, String, Throwable}
import java.util.ResourceBundle
import java.util.function.Supplier
import scala.scalanative.annotation.stub

/** A Logger object is used to log messages for a specific
 *  system or application component.  Loggers are normally named,
 *  using a hierarchical dot-separated namespace.  Logger names
 *  can be arbitrary strings, but they should normally be based on
 *  the package name or class name of the logged component, such
 *  as java.net or javax.swing.  In addition it is possible to create
 *  "anonymous" Loggers that are not stored in the Logger namespace.
 *  
 *  Logger objects may be obtained by calls on one of the getLogger
 *  factory methods.  These will either create a new Logger or
 *  return a suitable existing Logger. It is important to note that
 *  the Logger returned by one of the getLogger factory methods
 *  may be garbage collected at any time if a strong reference to the
 *  Logger is not kept.
 *  
 *  Logging messages will be forwarded to registered Handler
 *  objects, which can forward the messages to a variety of
 *  destinations, including consoles, files, OS logs, etc.
 *  
 *  Each Logger keeps track of a "parent" Logger, which is its
 *  nearest existing ancestor in the Logger namespace.
 *  
 *  Each Logger has a "Level" associated with it.  This reflects
 *  a minimum Level that this logger cares about.  If a Logger's
 *  level is set to null, then its effective level is inherited
 *  from its parent, which may in turn obtain it recursively from its
 *  parent, and so on up the tree.
 *  
 *  The log level can be configured based on the properties from the
 *  logging configuration file, as described in the description
 *  of the LogManager class.  However it may also be dynamically changed
 *  by calls on the Logger.setLevel method.  If a logger's level is
 *  changed the change may also affect child loggers, since any child
 *  logger that has null as its level will inherit its
 *  effective level from its parent.
 *  
 *  On each logging call the Logger initially performs a cheap
 *  check of the request level (e.g., SEVERE or FINE) against the
 *  effective log level of the logger.  If the request level is
 *  lower than the log level, the logging call returns immediately.
 *  
 *  After passing this initial (cheap) test, the Logger will allocate
 *  a LogRecord to describe the logging message.  It will then call a
 *  Filter (if present) to do a more detailed check on whether the
 *  record should be published.  If that passes it will then publish
 *  the LogRecord to its output Handlers.  By default, loggers also
 *  publish to their parent's Handlers, recursively up the tree.
 *  
 *  Each Logger may have a ResourceBundle associated with it.
 *  The ResourceBundle may be specified by name, using the
 *  getLogger(java.lang.String, java.lang.String) factory
 *  method, or by value - using the setResourceBundle method.
 *  This bundle will be used for localizing logging messages.
 *  If a Logger does not have its own ResourceBundle or resource bundle
 *  name, then it will inherit the ResourceBundle or resource bundle name
 *  from its parent, recursively up the tree.
 *  
 *  Most of the logger output methods take a "msg" argument.  This
 *  msg argument may be either a raw value or a localization key.
 *  During formatting, if the logger has (or inherits) a localization
 *  ResourceBundle and if the ResourceBundle has a mapping for
 *  the msg string, then the msg string is replaced by the localized value.
 *  Otherwise the original msg string is used.  Typically, formatters use
 *  java.text.MessageFormat style formatting to format parameters, so
 *  for example a format string "{0} {1}" would format two parameters
 *  as strings.
 *  
 *  A set of methods alternatively take a "msgSupplier" instead of a "msg"
 *  argument.  These methods take a Supplier<String> function
 *  which is invoked to construct the desired log message only when the message
 *  actually is to be logged based on the effective log level thus eliminating
 *  unnecessary message construction. For example, if the developer wants to
 *  log system health status for diagnosis, with the String-accepting version,
 *  the code would look like:
 *  
 * 
 *    class DiagnosisMessages {
 *      static String systemHealthStatus() {
 *        // collect system health information
 *        ...
 *      }
 *    }
 *    ...
 *    logger.log(Level.FINER, DiagnosisMessages.systemHealthStatus());
 * 
 *  With the above code, the health status is collected unnecessarily even when
 *  the log level FINER is disabled. With the Supplier-accepting version as
 *  below, the status will only be collected when the log level FINER is
 *  enabled.
 *  
 * 
 *    logger.log(Level.FINER, DiagnosisMessages::systemHealthStatus);
 * 
 *  
 *  When looking for a ResourceBundle, the logger will first look at
 *  whether a bundle was specified using setResourceBundle, and then
 *  only whether a resource bundle name was specified through the getLogger factory method.
 *  If no ResourceBundle or no resource bundle name is found,
 *  then it will use the nearest ResourceBundle or resource bundle
 *  name inherited from its parent tree.
 *  When a ResourceBundle was inherited or specified through the
 *  setResourceBundle method, then
 *  that ResourceBundle will be used. Otherwise if the logger only
 *  has or inherited a resource bundle name, then that resource bundle name
 *  will be mapped to a ResourceBundle object, using the default Locale
 *  at the time of logging.
 *  When mapping resource bundle names to
 *  ResourceBundle objects, the logger will first try to use the
 *  Thread's context class
 *  loader to map the given resource bundle name to a ResourceBundle.
 *  If the thread context class loader is null, it will try the
 *  system class loader
 *  instead.  If the ResourceBundle is still not found, it will use the
 *  class loader of the first caller of the getLogger factory method.
 *  
 *  Formatting (including localization) is the responsibility of
 *  the output Handler, which will typically call a Formatter.
 *  
 *  Note that formatting need not occur synchronously.  It may be delayed
 *  until a LogRecord is actually written to an external sink.
 *  
 *  The logging methods are grouped in five main categories:
 *  
 *  
 *      There are a set of "log" methods that take a log level, a message
 *      string, and optionally some parameters to the message string.
 *  
 *      There are a set of "logp" methods (for "log precise") that are
 *      like the "log" methods, but also take an explicit source class name
 *      and method name.
 *  
 *      There are a set of "logrb" method (for "log with resource bundle")
 *      that are like the "logp" method, but also take an explicit resource
 *      bundle object for use in localizing the log message.
 *  
 *      There are convenience methods for tracing method entries (the
 *      "entering" methods), method returns (the "exiting" methods) and
 *      throwing exceptions (the "throwing" methods).
 *  
 *      Finally, there are a set of convenience methods for use in the
 *      very simplest cases, when a developer simply wants to log a
 *      simple string at a given log level.  These methods are named
 *      after the standard Level names ("severe", "warning", "info", etc.)
 *      and take a single argument, a message string.
 *  
 *  
 *  For the methods that do not take an explicit source name and
 *  method name, the Logging framework will make a "best effort"
 *  to determine which class and method called into the logging method.
 *  However, it is important to realize that this automatically inferred
 *  information may only be approximate (or may even be quite wrong!).
 *  Virtual machines are allowed to do extensive optimizations when
 *  JITing and may entirely remove stack frames, making it impossible
 *  to reliably locate the calling class and method.
 *  
 *  All methods on Logger are multi-thread safe.
 *  
 *  Subclassing Information: Note that a LogManager class may
 *  provide its own implementation of named Loggers for any point in
 *  the namespace.  Therefore, any subclasses of Logger (unless they
 *  are implemented in conjunction with a new LogManager class) should
 *  take care to obtain a Logger instance from the LogManager class and
 *  should delegate operations such as "isLoggable" and "log(LogRecord)"
 *  to that instance.  Note that in order to intercept all logging
 *  output, subclasses need only override the log(LogRecord) method.
 *  All the other logging methods are implemented as calls on this
 *  log(LogRecord) method.
 */
class Logger extends Object {

    /** Protected method to construct a logger for a named subsystem. */
    @stub
    protected def this(name: String, resourceBundleName: String) = ???

    /** Add a log Handler to receive logging messages. */
    @stub
    def addHandler(handler: Handler): Unit = ???

    /** Log a CONFIG message. */
    @stub
    def config(msg: String): Unit = ???

    /** Log a CONFIG message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def config(msgSupplier: Supplier[String]): Unit = ???

    /** Log a method entry. */
    @stub
    def entering(sourceClass: String, sourceMethod: String): Unit = ???

    /** Log a method entry, with one parameter. */
    @stub
    def entering(sourceClass: String, sourceMethod: String, param1: Any): Unit = ???

    /** Log a method entry, with an array of parameters. */
    @stub
    def entering(sourceClass: String, sourceMethod: String, params: Array[Object]): Unit = ???

    /** Log a method return. */
    @stub
    def exiting(sourceClass: String, sourceMethod: String): Unit = ???

    /** Log a method return, with result object. */
    @stub
    def exiting(sourceClass: String, sourceMethod: String, result: Any): Unit = ???

    /** Log a FINE message. */
    @stub
    def fine(msg: String): Unit = ???

    /** Log a FINE message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def fine(msgSupplier: Supplier[String]): Unit = ???

    /** Log a FINER message. */
    @stub
    def finer(msg: String): Unit = ???

    /** Log a FINER message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def finer(msgSupplier: Supplier[String]): Unit = ???

    /** Log a FINEST message. */
    @stub
    def finest(msg: String): Unit = ???

    /** Log a FINEST message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def finest(msgSupplier: Supplier[String]): Unit = ???

    /** Get the current filter for this Logger. */
    @stub
    def getFilter(): Filter = ???

    /** Get the Handlers associated with this logger. */
    @stub
    def getHandlers(): Array[Handler] = ???

    /** Get the log Level that has been specified for this Logger. */
    @stub
    def getLevel(): Level = ???

    /** Get the name for this logger. */
    @stub
    def getName(): String = ???

    /** Return the parent for this Logger. */
    @stub
    def getParent(): Logger = ???

    /** Retrieve the localization resource bundle for this
     *  logger.
     */
    @stub
    def getResourceBundle(): ResourceBundle = ???

    /** Retrieve the localization resource bundle name for this
     *  logger.
     */
    @stub
    def getResourceBundleName(): String = ???

    /** Discover whether or not this logger is sending its output
     *  to its parent logger.
     */
    @stub
    def getUseParentHandlers(): Boolean = ???

    /** Log an INFO message. */
    @stub
    def info(msg: String): Unit = ???

    /** Log a INFO message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def info(msgSupplier: Supplier[String]): Unit = ???

    /** Check if a message of the given level would actually be logged
     *  by this logger.
     */
    @stub
    def isLoggable(level: Level): Boolean = ???

    /** Log a message, with no arguments. */
    @stub
    def log(level: Level, msg: String): Unit = ???

    /** Log a message, with one object parameter. */
    @stub
    def log(level: Level, msg: String, param1: Any): Unit = ???

    /** Log a message, with an array of object arguments. */
    @stub
    def log(level: Level, msg: String, params: Array[Object]): Unit = ???

    /** Log a message, with associated Throwable information. */
    @stub
    def log(level: Level, msg: String, thrown: Throwable): Unit = ???

    /** Log a message, which is only to be constructed if the logging level
     *  is such that the message will actually be logged.
     */
    @stub
    def log(level: Level, msgSupplier: Supplier[String]): Unit = ???

    /** Log a lazily constructed message, with associated Throwable information. */
    @stub
    def log(level: Level, thrown: Throwable, msgSupplier: Supplier[String]): Unit = ???

    /** Log a LogRecord. */
    @stub
    def log(record: LogRecord): Unit = ???

    /** Log a message, specifying source class and method,
     *  with no arguments.
     */
    @stub
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String): Unit = ???

    /** Log a message, specifying source class and method,
     *  with a single object parameter to the log message.
     */
    @stub
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String, param1: Any): Unit = ???

    /** Log a message, specifying source class and method,
     *  with an array of object arguments.
     */
    @stub
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String, params: Array[Object]): Unit = ???

    /** Log a message, specifying source class and method,
     *  with associated Throwable information.
     */
    @stub
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String, thrown: Throwable): Unit = ???

    /** Log a lazily constructed message, specifying source class and method,
     *  with no arguments.
     */
    @stub
    def logp(level: Level, sourceClass: String, sourceMethod: String, msgSupplier: Supplier[String]): Unit = ???

    /** Log a lazily constructed message, specifying source class and method,
     *  with associated Throwable information.
     */
    @stub
    def logp(level: Level, sourceClass: String, sourceMethod: String, thrown: Throwable, msgSupplier: Supplier[String]): Unit = ???

    /** Log a message, specifying source class, method, and resource bundle,
     *  with an optional list of message parameters.
     */
    @stub
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundle: ResourceBundle, msg: String, params: Object*): Unit = ???

    /** Log a message, specifying source class, method, and resource bundle,
     *  with associated Throwable information.
     */
    @stub
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundle: ResourceBundle, msg: String, thrown: Throwable): Unit = ???

    /** Deprecated. 
     * Use logrb(java.util.logging.Level, java.lang.String,
     *  java.lang.String, java.util.ResourceBundle, java.lang.String,
     *  java.lang.Object...) instead.
     * 
     */
    @stub
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String): Unit = ???

    /** Deprecated. 
     * Use logrb(java.util.logging.Level, java.lang.String,
     *    java.lang.String, java.util.ResourceBundle, java.lang.String,
     *    java.lang.Object...) instead
     * 
     */
    @stub
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String, param1: Any): Unit = ???

    /** Deprecated. 
     * Use logrb(java.util.logging.Level, java.lang.String,
     *       java.lang.String, java.util.ResourceBundle, java.lang.String,
     *       java.lang.Object...) instead.
     * 
     */
    @stub
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String, params: Array[Object]): Unit = ???

    /** Deprecated. 
     * Use logrb(java.util.logging.Level, java.lang.String,
     *      java.lang.String, java.util.ResourceBundle, java.lang.String,
     *      java.lang.Throwable) instead.
     * 
     */
    @stub
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String, thrown: Throwable): Unit = ???

    /** Remove a log Handler. */
    @stub
    def removeHandler(handler: Handler): Unit = ???

    /** Set a filter to control output on this Logger. */
    @stub
    def setFilter(newFilter: Filter): Unit = ???

    /** Set the log level specifying which message levels will be
     *  logged by this logger.
     */
    @stub
    def setLevel(newLevel: Level): Unit = ???

    /** Set the parent for this Logger. */
    @stub
    def setParent(parent: Logger): Unit = ???

    /** Sets a resource bundle on this logger. */
    @stub
    def setResourceBundle(bundle: ResourceBundle): Unit = ???

    /** Specify whether or not this logger should send its output
     *  to its parent Logger.
     */
    @stub
    def setUseParentHandlers(useParentHandlers: Boolean): Unit = ???

    /** Log a SEVERE message. */
    @stub
    def severe(msg: String): Unit = ???

    /** Log a SEVERE message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def severe(msgSupplier: Supplier[String]): Unit = ???

    /** Log throwing an exception. */
    @stub
    def throwing(sourceClass: String, sourceMethod: String, thrown: Throwable): Unit = ???

    /** Log a WARNING message. */
    @stub
    def warning(msg: String): Unit = ???

    /** Log a WARNING message, which is only to be constructed if the logging
     *  level is such that the message will actually be logged.
     */
    @stub
    def warning(msgSupplier: Supplier[String]): Unit = ???
}

object Logger {
    /** Deprecated. 
     * Initialization of this field is prone to deadlocks.
     *  The field must be initialized by the Logger class initialization
     *  which may cause deadlocks with the LogManager class initialization.
     *  In such cases two class initialization wait for each other to complete.
     *  The preferred way to get the global logger object is via the call
     *  Logger.getGlobal().
     *  For compatibility with old JDK versions where the
     *  Logger.getGlobal() is not available use the call
     *  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME)
     *  or Logger.getLogger("global").
     * 
     */
    @stub
    val global: Logger = ???

    /** GLOBAL_LOGGER_NAME is a name for the global logger. */
    @stub
    val GLOBAL_LOGGER_NAME: String = ???

    /** Create an anonymous Logger. */
    @stub
    def getAnonymousLogger(): Logger = ???

    /** Create an anonymous Logger. */
    @stub
    def getAnonymousLogger(resourceBundleName: String): Logger = ???

    /** Return global logger object with the name Logger.GLOBAL_LOGGER_NAME. */
    @stub
    def getGlobal(): Logger = ???

    /** Find or create a logger for a named subsystem. */
    @stub
    def getLogger(name: String): Logger = ???

    /** Find or create a logger for a named subsystem. */
    @stub
    def getLogger(name: String, resourceBundleName: String): Logger = ???
}
