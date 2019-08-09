package java.util.logging

import java.lang.Object
import scala.scalanative.annotation.stub

/** Handler that buffers requests in a circular buffer in memory.
 *  
 *  Normally this Handler simply stores incoming LogRecords
 *  into its memory buffer and discards earlier records.  This buffering
 *  is very cheap and avoids formatting costs.  On certain trigger
 *  conditions, the MemoryHandler will push out its current buffer
 *  contents to a target Handler, which will typically publish
 *  them to the outside world.
 *  
 *  There are three main models for triggering a push of the buffer:
 *  
 *  
 *  An incoming LogRecord has a type that is greater than
 *  a pre-defined level, the pushLevel. 
 *  
 *  An external class calls the push method explicitly. 
 *  
 *  A subclass overrides the log method and scans each incoming
 *  LogRecord and calls push if a record matches some
 *  desired criteria. 
 *  
 *  
 *  Configuration:
 *  By default each MemoryHandler is initialized using the following
 *  LogManager configuration properties where <handler-name>
 *  refers to the fully-qualified class name of the handler.
 *  If properties are not defined
 *  (or have invalid values) then the specified default values are used.
 *  If no default value is defined then a RuntimeException is thrown.
 *  
 *     <handler-name>.level
 *         specifies the level for the Handler
 *         (defaults to Level.ALL). 
 *     <handler-name>.filter
 *         specifies the name of a Filter class to use
 *         (defaults to no Filter). 
 *     <handler-name>.size
 *         defines the buffer size (defaults to 1000). 
 *     <handler-name>.push
 *         defines the pushLevel (defaults to level.SEVERE). 
 *     <handler-name>.target
 *         specifies the name of the target Handler  class.
 *         (no default). 
 *  
 *  
 *  For example, the properties for MemoryHandler would be:
 *  
 *     java.util.logging.MemoryHandler.level=INFO 
 *     java.util.logging.MemoryHandler.formatter=java.util.logging.SimpleFormatter 
 *  
 *  
 *  For a custom handler, e.g. com.foo.MyHandler, the properties would be:
 *  
 *     com.foo.MyHandler.level=INFO 
 *     com.foo.MyHandler.formatter=java.util.logging.SimpleFormatter 
 *  
 *  
 */
class MemoryHandler extends Handler {

    /** Create a MemoryHandler and configure it based on
     *  LogManager configuration properties.
     */
    @stub
    def this() = ???

    /** Create a MemoryHandler. */
    @stub
    def this(target: Handler, size: Int, pushLevel: Level) = ???

    /** Close the Handler and free all associated resources. */
    @stub
    def close(): Unit = ???

    /** Causes a flush on the target Handler. */
    @stub
    def flush(): Unit = ???

    /** Get the pushLevel. */
    @stub
    def getPushLevel(): Level = ???

    /** Check if this Handler would actually log a given
     *  LogRecord into its internal buffer.
     */
    @stub
    def isLoggable(record: LogRecord): Boolean = ???

    /** Store a LogRecord in an internal buffer. */
    @stub
    def publish(record: LogRecord): Unit = ???

    /** Push any buffered output to the target Handler. */
    @stub
    def push(): Unit = ???

    /** Set the pushLevel. */
    @stub
    def setPushLevel(newLevel: Level): Unit = ???
}
