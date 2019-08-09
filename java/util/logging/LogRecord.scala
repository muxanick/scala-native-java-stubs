package java.util.logging

import java.io.Serializable
import java.lang.{Object, String, Throwable}
import java.util.ResourceBundle

/** LogRecord objects are used to pass logging requests between
 *  the logging framework and individual log Handlers.
 *  
 *  When a LogRecord is passed into the logging framework it
 *  logically belongs to the framework and should no longer be
 *  used or updated by the client application.
 *  
 *  Note that if the client application has not specified an
 *  explicit source method name and source class name, then the
 *  LogRecord class will infer them automatically when they are
 *  first accessed (due to a call on getSourceMethodName or
 *  getSourceClassName) by analyzing the call stack.  Therefore,
 *  if a logging Handler wants to pass off a LogRecord to another
 *  thread, or to transmit it over RMI, and if it wishes to subsequently
 *  obtain method name or class name information it should call
 *  one of getSourceClassName or getSourceMethodName to force
 *  the values to be filled in.
 *  
 *   Serialization notes:
 *  
 *  The LogRecord class is serializable.
 * 
 *   Because objects in the parameters array may not be serializable,
 *  during serialization all objects in the parameters array are
 *  written as the corresponding Strings (using Object.toString).
 * 
 *   The ResourceBundle is not transmitted as part of the serialized
 *  form, but the resource bundle name is, and the recipient object's
 *  readObject method will attempt to locate a suitable resource bundle.
 * 
 *  
 */
class LogRecord extends Object with Serializable {

    /** Get the logging message level, for example Level.SEVERE. */
    @stub
    def getLevel(): Level = ???

    /** Get the source Logger's name. */
    @stub
    def getLoggerName(): String = ???

    /** Get the "raw" log message, before localization or formatting. */
    @stub
    def getMessage(): String = ???

    /** Get event time in milliseconds since 1970. */
    @stub
    def getMillis(): Long = ???

    /** Get the parameters to the log message. */
    @stub
    def getParameters(): Array[Object] = ???

    /** Get the localization resource bundle */
    @stub
    def getResourceBundle(): ResourceBundle = ???

    /** Get the localization resource bundle name */
    @stub
    def getResourceBundleName(): String = ???

    /** Get the sequence number. */
    @stub
    def getSequenceNumber(): Long = ???

    /** Get the  name of the class that (allegedly) issued the logging request. */
    @stub
    def getSourceClassName(): String = ???

    /** Get the  name of the method that (allegedly) issued the logging request. */
    @stub
    def getSourceMethodName(): String = ???

    /** Get an identifier for the thread where the message originated. */
    @stub
    def getThreadID(): Int = ???

    /** Get any throwable associated with the log record. */
    @stub
    def getThrown(): Throwable = ???

    /** Set the logging message level, for example Level.SEVERE. */
    @stub
    def setLevel(level: Level): Unit = ???

    /** Set the source Logger's name. */
    @stub
    def setLoggerName(name: String): Unit = ???

    /** Set the "raw" log message, before localization or formatting. */
    @stub
    def setMessage(message: String): Unit = ???

    /** Set event time. */
    @stub
    def setMillis(millis: Long): Unit = ???

    /** Set the parameters to the log message. */
    @stub
    def setParameters(parameters: Array[Object]): Unit = ???

    /** Set the localization resource bundle. */
    @stub
    def setResourceBundle(bundle: ResourceBundle): Unit = ???

    /** Set the localization resource bundle name. */
    @stub
    def setResourceBundleName(name: String): Unit = ???

    /** Set the sequence number. */
    @stub
    def setSequenceNumber(seq: Long): Unit = ???

    /** Set the name of the class that (allegedly) issued the logging request. */
    @stub
    def setSourceClassName(sourceClassName: String): Unit = ???

    /** Set the name of the method that (allegedly) issued the logging request. */
    @stub
    def setSourceMethodName(sourceMethodName: String): Unit = ???

    /** Set an identifier for the thread where the message originated. */
    @stub
    def setThreadID(threadID: Int): Unit = ???
}
