package java.util.logging

import java.lang.{Object, String}

// Stream based logging Handler.
// 
// This is primarily intended as a base class or support class to
// be used in implementing other logging Handlers.
// 
// LogRecords are published to a given java.io.OutputStream.
// 
// Configuration:
// By default each StreamHandler is initialized using the following
// LogManager configuration properties where <handler-name>
// refers to the fully-qualified class name of the handler.
// If properties are not defined
// (or have invalid values) then the specified default values are used.
// 
//    <handler-name>.level
//        specifies the default level for the Handler
//        (defaults to Level.INFO). 
//    <handler-name>.filter
//        specifies the name of a Filter class to use
//         (defaults to no Filter). 
//    <handler-name>.formatter
//        specifies the name of a Formatter class to use
//        (defaults to java.util.logging.SimpleFormatter). 
//    <handler-name>.encoding
//        the name of the character set encoding to use (defaults to
//        the default platform encoding). 
// 
// 
// For example, the properties for StreamHandler would be:
// 
//    java.util.logging.StreamHandler.level=INFO 
//    java.util.logging.StreamHandler.formatter=java.util.logging.SimpleFormatter 
// 
// 
// For a custom handler, e.g. com.foo.MyHandler, the properties would be:
// 
//    com.foo.MyHandler.level=INFO 
//    com.foo.MyHandler.formatter=java.util.logging.SimpleFormatter 
// 
// 
class StreamHandler extends Handler {

    @stub
    // Create a StreamHandler, with no current output stream.
    def this() = ???

    @stub
    // Close the current output stream.
    def close(): Unit = ???

    @stub
    // Flush any buffered messages.
    def flush(): Unit = ???

    @stub
    // Check if this Handler would actually log a given LogRecord.
    def isLoggable(record: LogRecord): Boolean = ???

    @stub
    // Format and publish a LogRecord.
    def publish(record: LogRecord): Unit = ???

    @stub
    // Set (or change) the character encoding used by this Handler.
    def setEncoding(encoding: String): Unit = ???
}
