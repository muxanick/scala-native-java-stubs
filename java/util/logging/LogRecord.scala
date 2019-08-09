package java.util.logging

import java.io.Serializable
import java.lang.{Object, String, Throwable}
import java.util.ResourceBundle

// LogRecord objects are used to pass logging requests between
// the logging framework and individual log Handlers.
// 
// When a LogRecord is passed into the logging framework it
// logically belongs to the framework and should no longer be
// used or updated by the client application.
// 
// Note that if the client application has not specified an
// explicit source method name and source class name, then the
// LogRecord class will infer them automatically when they are
// first accessed (due to a call on getSourceMethodName or
// getSourceClassName) by analyzing the call stack.  Therefore,
// if a logging Handler wants to pass off a LogRecord to another
// thread, or to transmit it over RMI, and if it wishes to subsequently
// obtain method name or class name information it should call
// one of getSourceClassName or getSourceMethodName to force
// the values to be filled in.
// 
//  Serialization notes:
// 
// The LogRecord class is serializable.
//
//  Because objects in the parameters array may not be serializable,
// during serialization all objects in the parameters array are
// written as the corresponding Strings (using Object.toString).
//
//  The ResourceBundle is not transmitted as part of the serialized
// form, but the resource bundle name is, and the recipient object's
// readObject method will attempt to locate a suitable resource bundle.
//
// 
class LogRecord extends Object with Serializable {

    @stub
    // Get the logging message level, for example Level.SEVERE.
    def getLevel(): Level = ???

    @stub
    // Get the source Logger's name.
    def getLoggerName(): String = ???

    @stub
    // Get the "raw" log message, before localization or formatting.
    def getMessage(): String = ???

    @stub
    // Get event time in milliseconds since 1970.
    def getMillis(): Long = ???

    @stub
    // Get the parameters to the log message.
    def getParameters(): Array[Object] = ???

    @stub
    // Get the localization resource bundle
    def getResourceBundle(): ResourceBundle = ???

    @stub
    // Get the localization resource bundle name
    def getResourceBundleName(): String = ???

    @stub
    // Get the sequence number.
    def getSequenceNumber(): Long = ???

    @stub
    // Get the  name of the class that (allegedly) issued the logging request.
    def getSourceClassName(): String = ???

    @stub
    // Get the  name of the method that (allegedly) issued the logging request.
    def getSourceMethodName(): String = ???

    @stub
    // Get an identifier for the thread where the message originated.
    def getThreadID(): Int = ???

    @stub
    // Get any throwable associated with the log record.
    def getThrown(): Throwable = ???

    @stub
    // Set the logging message level, for example Level.SEVERE.
    def setLevel(level: Level): Unit = ???

    @stub
    // Set the source Logger's name.
    def setLoggerName(name: String): Unit = ???

    @stub
    // Set the "raw" log message, before localization or formatting.
    def setMessage(message: String): Unit = ???

    @stub
    // Set event time.
    def setMillis(millis: Long): Unit = ???

    @stub
    // Set the parameters to the log message.
    def setParameters(parameters: Array[Object]): Unit = ???

    @stub
    // Set the localization resource bundle.
    def setResourceBundle(bundle: ResourceBundle): Unit = ???

    @stub
    // Set the localization resource bundle name.
    def setResourceBundleName(name: String): Unit = ???

    @stub
    // Set the sequence number.
    def setSequenceNumber(seq: Long): Unit = ???

    @stub
    // Set the name of the class that (allegedly) issued the logging request.
    def setSourceClassName(sourceClassName: String): Unit = ???

    @stub
    // Set the name of the method that (allegedly) issued the logging request.
    def setSourceMethodName(sourceMethodName: String): Unit = ???

    @stub
    // Set an identifier for the thread where the message originated.
    def setThreadID(threadID: Int): Unit = ???
}
