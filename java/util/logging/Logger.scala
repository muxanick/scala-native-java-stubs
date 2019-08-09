package java.util.logging

import java.lang.{Object, String, Throwable}
import java.util.ResourceBundle
import java.util.function.Supplier

// A Logger object is used to log messages for a specific
// system or application component.  Loggers are normally named,
// using a hierarchical dot-separated namespace.  Logger names
// can be arbitrary strings, but they should normally be based on
// the package name or class name of the logged component, such
// as java.net or javax.swing.  In addition it is possible to create
// "anonymous" Loggers that are not stored in the Logger namespace.
// 
// Logger objects may be obtained by calls on one of the getLogger
// factory methods.  These will either create a new Logger or
// return a suitable existing Logger. It is important to note that
// the Logger returned by one of the getLogger factory methods
// may be garbage collected at any time if a strong reference to the
// Logger is not kept.
// 
// Logging messages will be forwarded to registered Handler
// objects, which can forward the messages to a variety of
// destinations, including consoles, files, OS logs, etc.
// 
// Each Logger keeps track of a "parent" Logger, which is its
// nearest existing ancestor in the Logger namespace.
// 
// Each Logger has a "Level" associated with it.  This reflects
// a minimum Level that this logger cares about.  If a Logger's
// level is set to null, then its effective level is inherited
// from its parent, which may in turn obtain it recursively from its
// parent, and so on up the tree.
// 
// The log level can be configured based on the properties from the
// logging configuration file, as described in the description
// of the LogManager class.  However it may also be dynamically changed
// by calls on the Logger.setLevel method.  If a logger's level is
// changed the change may also affect child loggers, since any child
// logger that has null as its level will inherit its
// effective level from its parent.
// 
// On each logging call the Logger initially performs a cheap
// check of the request level (e.g., SEVERE or FINE) against the
// effective log level of the logger.  If the request level is
// lower than the log level, the logging call returns immediately.
// 
// After passing this initial (cheap) test, the Logger will allocate
// a LogRecord to describe the logging message.  It will then call a
// Filter (if present) to do a more detailed check on whether the
// record should be published.  If that passes it will then publish
// the LogRecord to its output Handlers.  By default, loggers also
// publish to their parent's Handlers, recursively up the tree.
// 
// Each Logger may have a ResourceBundle associated with it.
// The ResourceBundle may be specified by name, using the
// getLogger(java.lang.String, java.lang.String) factory
// method, or by value - using the setResourceBundle method.
// This bundle will be used for localizing logging messages.
// If a Logger does not have its own ResourceBundle or resource bundle
// name, then it will inherit the ResourceBundle or resource bundle name
// from its parent, recursively up the tree.
// 
// Most of the logger output methods take a "msg" argument.  This
// msg argument may be either a raw value or a localization key.
// During formatting, if the logger has (or inherits) a localization
// ResourceBundle and if the ResourceBundle has a mapping for
// the msg string, then the msg string is replaced by the localized value.
// Otherwise the original msg string is used.  Typically, formatters use
// java.text.MessageFormat style formatting to format parameters, so
// for example a format string "{0} {1}" would format two parameters
// as strings.
// 
// A set of methods alternatively take a "msgSupplier" instead of a "msg"
// argument.  These methods take a Supplier<String> function
// which is invoked to construct the desired log message only when the message
// actually is to be logged based on the effective log level thus eliminating
// unnecessary message construction. For example, if the developer wants to
// log system health status for diagnosis, with the String-accepting version,
// the code would look like:
// 
//
//   class DiagnosisMessages {
//     static String systemHealthStatus() {
//       // collect system health information
//       ...
//     }
//   }
//   ...
//   logger.log(Level.FINER, DiagnosisMessages.systemHealthStatus());
//
// With the above code, the health status is collected unnecessarily even when
// the log level FINER is disabled. With the Supplier-accepting version as
// below, the status will only be collected when the log level FINER is
// enabled.
// 
//
//   logger.log(Level.FINER, DiagnosisMessages::systemHealthStatus);
//
// 
// When looking for a ResourceBundle, the logger will first look at
// whether a bundle was specified using setResourceBundle, and then
// only whether a resource bundle name was specified through the getLogger factory method.
// If no ResourceBundle or no resource bundle name is found,
// then it will use the nearest ResourceBundle or resource bundle
// name inherited from its parent tree.
// When a ResourceBundle was inherited or specified through the
// setResourceBundle method, then
// that ResourceBundle will be used. Otherwise if the logger only
// has or inherited a resource bundle name, then that resource bundle name
// will be mapped to a ResourceBundle object, using the default Locale
// at the time of logging.
// When mapping resource bundle names to
// ResourceBundle objects, the logger will first try to use the
// Thread's context class
// loader to map the given resource bundle name to a ResourceBundle.
// If the thread context class loader is null, it will try the
// system class loader
// instead.  If the ResourceBundle is still not found, it will use the
// class loader of the first caller of the getLogger factory method.
// 
// Formatting (including localization) is the responsibility of
// the output Handler, which will typically call a Formatter.
// 
// Note that formatting need not occur synchronously.  It may be delayed
// until a LogRecord is actually written to an external sink.
// 
// The logging methods are grouped in five main categories:
// 
// 
//     There are a set of "log" methods that take a log level, a message
//     string, and optionally some parameters to the message string.
// 
//     There are a set of "logp" methods (for "log precise") that are
//     like the "log" methods, but also take an explicit source class name
//     and method name.
// 
//     There are a set of "logrb" method (for "log with resource bundle")
//     that are like the "logp" method, but also take an explicit resource
//     bundle object for use in localizing the log message.
// 
//     There are convenience methods for tracing method entries (the
//     "entering" methods), method returns (the "exiting" methods) and
//     throwing exceptions (the "throwing" methods).
// 
//     Finally, there are a set of convenience methods for use in the
//     very simplest cases, when a developer simply wants to log a
//     simple string at a given log level.  These methods are named
//     after the standard Level names ("severe", "warning", "info", etc.)
//     and take a single argument, a message string.
// 
// 
// For the methods that do not take an explicit source name and
// method name, the Logging framework will make a "best effort"
// to determine which class and method called into the logging method.
// However, it is important to realize that this automatically inferred
// information may only be approximate (or may even be quite wrong!).
// Virtual machines are allowed to do extensive optimizations when
// JITing and may entirely remove stack frames, making it impossible
// to reliably locate the calling class and method.
// 
// All methods on Logger are multi-thread safe.
// 
// Subclassing Information: Note that a LogManager class may
// provide its own implementation of named Loggers for any point in
// the namespace.  Therefore, any subclasses of Logger (unless they
// are implemented in conjunction with a new LogManager class) should
// take care to obtain a Logger instance from the LogManager class and
// should delegate operations such as "isLoggable" and "log(LogRecord)"
// to that instance.  Note that in order to intercept all logging
// output, subclasses need only override the log(LogRecord) method.
// All the other logging methods are implemented as calls on this
// log(LogRecord) method.
class Logger extends Object {

    @stub
    // Add a log Handler to receive logging messages.
    def addHandler(handler: Handler): Unit = ???

    @stub
    // Log a CONFIG message.
    def config(msg: String): Unit = ???

    @stub
    // Log a CONFIG message, which is only to be constructed if the logging
    // level is such that the message will actually be logged.
    def config(msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a method entry.
    def entering(sourceClass: String, sourceMethod: String): Unit = ???

    @stub
    // Log a method entry, with one parameter.
    def entering(sourceClass: String, sourceMethod: String, param1: Object): Unit = ???

    @stub
    // Log a method entry, with an array of parameters.
    def entering(sourceClass: String, sourceMethod: String, params: Array[Object]): Unit = ???

    @stub
    // Log a method return.
    def exiting(sourceClass: String, sourceMethod: String): Unit = ???

    @stub
    // Log a method return, with result object.
    def exiting(sourceClass: String, sourceMethod: String, result: Object): Unit = ???

    @stub
    // Log a FINE message.
    def fine(msg: String): Unit = ???

    @stub
    // Log a FINE message, which is only to be constructed if the logging
    // level is such that the message will actually be logged.
    def fine(msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a FINER message.
    def finer(msg: String): Unit = ???

    @stub
    // Log a FINER message, which is only to be constructed if the logging
    // level is such that the message will actually be logged.
    def finer(msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a FINEST message.
    def finest(msg: String): Unit = ???

    @stub
    // Log a FINEST message, which is only to be constructed if the logging
    // level is such that the message will actually be logged.
    def finest(msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Get the current filter for this Logger.
    def getFilter(): Filter = ???

    @stub
    // Get the Handlers associated with this logger.
    def getHandlers(): Array[Handler] = ???

    @stub
    // Get the log Level that has been specified for this Logger.
    def getLevel(): Level = ???

    @stub
    // Get the name for this logger.
    def getName(): String = ???

    @stub
    // Return the parent for this Logger.
    def getParent(): Logger = ???

    @stub
    // Retrieve the localization resource bundle for this
    // logger.
    def getResourceBundle(): ResourceBundle = ???

    @stub
    // Retrieve the localization resource bundle name for this
    // logger.
    def getResourceBundleName(): String = ???

    @stub
    // Discover whether or not this logger is sending its output
    // to its parent logger.
    def getUseParentHandlers(): Boolean = ???

    @stub
    // Log an INFO message.
    def info(msg: String): Unit = ???

    @stub
    // Log a INFO message, which is only to be constructed if the logging
    // level is such that the message will actually be logged.
    def info(msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Check if a message of the given level would actually be logged
    // by this logger.
    def isLoggable(level: Level): Boolean = ???

    @stub
    // Log a message, with no arguments.
    def log(level: Level, msg: String): Unit = ???

    @stub
    // Log a message, with one object parameter.
    def log(level: Level, msg: String, param1: Object): Unit = ???

    @stub
    // Log a message, with an array of object arguments.
    def log(level: Level, msg: String, params: Array[Object]): Unit = ???

    @stub
    // Log a message, with associated Throwable information.
    def log(level: Level, msg: String, thrown: Throwable): Unit = ???

    @stub
    // Log a message, which is only to be constructed if the logging level
    // is such that the message will actually be logged.
    def log(level: Level, msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a lazily constructed message, with associated Throwable information.
    def log(level: Level, thrown: Throwable, msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a LogRecord.
    def log(record: LogRecord): Unit = ???

    @stub
    // Log a message, specifying source class and method,
    // with no arguments.
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String): Unit = ???

    @stub
    // Log a message, specifying source class and method,
    // with a single object parameter to the log message.
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String, param1: Object): Unit = ???

    @stub
    // Log a message, specifying source class and method,
    // with an array of object arguments.
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String, params: Array[Object]): Unit = ???

    @stub
    // Log a message, specifying source class and method,
    // with associated Throwable information.
    def logp(level: Level, sourceClass: String, sourceMethod: String, msg: String, thrown: Throwable): Unit = ???

    @stub
    // Log a lazily constructed message, specifying source class and method,
    // with no arguments.
    def logp(level: Level, sourceClass: String, sourceMethod: String, msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a lazily constructed message, specifying source class and method,
    // with associated Throwable information.
    def logp(level: Level, sourceClass: String, sourceMethod: String, thrown: Throwable, msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log a message, specifying source class, method, and resource bundle,
    // with an optional list of message parameters.
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundle: ResourceBundle, msg: String, params: Object*): Unit = ???

    @stub
    // Log a message, specifying source class, method, and resource bundle,
    // with associated Throwable information.
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundle: ResourceBundle, msg: String, thrown: Throwable): Unit = ???

    @stub
    // Deprecated. 
    //Use logrb(java.util.logging.Level, java.lang.String,
    // java.lang.String, java.util.ResourceBundle, java.lang.String,
    // java.lang.Object...) instead.
    //
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String): Unit = ???

    @stub
    // Deprecated. 
    //Use logrb(java.util.logging.Level, java.lang.String,
    //   java.lang.String, java.util.ResourceBundle, java.lang.String,
    //   java.lang.Object...) instead
    //
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String, param1: Object): Unit = ???

    @stub
    // Deprecated. 
    //Use logrb(java.util.logging.Level, java.lang.String,
    //      java.lang.String, java.util.ResourceBundle, java.lang.String,
    //      java.lang.Object...) instead.
    //
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String, params: Array[Object]): Unit = ???

    @stub
    // Deprecated. 
    //Use logrb(java.util.logging.Level, java.lang.String,
    //     java.lang.String, java.util.ResourceBundle, java.lang.String,
    //     java.lang.Throwable) instead.
    //
    def logrb(level: Level, sourceClass: String, sourceMethod: String, bundleName: String, msg: String, thrown: Throwable): Unit = ???

    @stub
    // Remove a log Handler.
    def removeHandler(handler: Handler): Unit = ???

    @stub
    // Set a filter to control output on this Logger.
    def setFilter(newFilter: Filter): Unit = ???

    @stub
    // Set the log level specifying which message levels will be
    // logged by this logger.
    def setLevel(newLevel: Level): Unit = ???

    @stub
    // Set the parent for this Logger.
    def setParent(parent: Logger): Unit = ???

    @stub
    // Sets a resource bundle on this logger.
    def setResourceBundle(bundle: ResourceBundle): Unit = ???

    @stub
    // Specify whether or not this logger should send its output
    // to its parent Logger.
    def setUseParentHandlers(useParentHandlers: Boolean): Unit = ???

    @stub
    // Log a SEVERE message.
    def severe(msg: String): Unit = ???

    @stub
    // Log a SEVERE message, which is only to be constructed if the logging
    // level is such that the message will actually be logged.
    def severe(msgSupplier: Supplier[String]): Unit = ???

    @stub
    // Log throwing an exception.
    def throwing(sourceClass: String, sourceMethod: String, thrown: Throwable): Unit = ???

    @stub
    // Log a WARNING message.
    def warning(msg: String): Unit = ???
}

object Logger {
    @stub
    // Deprecated. 
    //Initialization of this field is prone to deadlocks.
    // The field must be initialized by the Logger class initialization
    // which may cause deadlocks with the LogManager class initialization.
    // In such cases two class initialization wait for each other to complete.
    // The preferred way to get the global logger object is via the call
    // Logger.getGlobal().
    // For compatibility with old JDK versions where the
    // Logger.getGlobal() is not available use the call
    // Logger.getLogger(Logger.GLOBAL_LOGGER_NAME)
    // or Logger.getLogger("global").
    //
    def global: Logger = ???

    @stub
    // Create an anonymous Logger.
    def getAnonymousLogger(): Logger = ???

    @stub
    // Create an anonymous Logger.
    def getAnonymousLogger(resourceBundleName: String): Logger = ???

    @stub
    // Return global logger object with the name Logger.GLOBAL_LOGGER_NAME.
    def getGlobal(): Logger = ???

    @stub
    // Find or create a logger for a named subsystem.
    def getLogger(name: String): Logger = ???

    @stub
    // Find or create a logger for a named subsystem.
    def getLogger(name: String, resourceBundleName: String): Logger = ???
}
