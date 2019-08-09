package java.util.logging

import java.lang.Object

/** This Handler publishes log records to System.err.
 *  By default the SimpleFormatter is used to generate brief summaries.
 *  
 *  Configuration:
 *  By default each ConsoleHandler is initialized using the following
 *  LogManager configuration properties where <handler-name>
 *  refers to the fully-qualified class name of the handler.
 *  If properties are not defined
 *  (or have invalid values) then the specified default values are used.
 *  
 *     <handler-name>.level
 *         specifies the default level for the Handler
 *         (defaults to Level.INFO). 
 *     <handler-name>.filter
 *         specifies the name of a Filter class to use
 *         (defaults to no Filter). 
 *     <handler-name>.formatter
 *         specifies the name of a Formatter class to use
 *         (defaults to java.util.logging.SimpleFormatter). 
 *     <handler-name>.encoding
 *         the name of the character set encoding to use (defaults to
 *         the default platform encoding). 
 *  
 *  
 *  For example, the properties for ConsoleHandler would be:
 *  
 *     java.util.logging.ConsoleHandler.level=INFO 
 *     java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter 
 *  
 *  
 *  For a custom handler, e.g. com.foo.MyHandler, the properties would be:
 *  
 *     com.foo.MyHandler.level=INFO 
 *     com.foo.MyHandler.formatter=java.util.logging.SimpleFormatter 
 *  
 *  
 */
class ConsoleHandler extends StreamHandler {

    /** Override StreamHandler.close to do a flush but not
     *  to close the output stream.
     */
    @stub
    def close(): Unit = ???
}
