package java.util.logging

import java.lang.{Exception, Object, String}

// A Handler object takes log messages from a Logger and
// exports them.  It might for example, write them to a console
// or write them to a file, or send them to a network logging service,
// or forward them to an OS log, or whatever.
// 
// A Handler can be disabled by doing a setLevel(Level.OFF)
// and can  be re-enabled by doing a setLevel with an appropriate level.
// 
// Handler classes typically use LogManager properties to set
// default values for the Handler's Filter, Formatter,
// and Level.  See the specific documentation for each concrete
// Handler class.
abstract class Handler extends Object {

    // Close the Handler and free all associated resources.
    def close(): Unit

    // Flush any buffered output.
    def flush(): Unit

    // Return the character encoding for this Handler.
    def getEncoding(): String

    // Retrieves the ErrorManager for this Handler.
    def getErrorManager(): ErrorManager

    // Get the current Filter for this Handler.
    def getFilter(): Filter

    // Return the Formatter for this Handler.
    def getFormatter(): Formatter

    // Get the log level specifying which messages will be
    // logged by this Handler.
    def getLevel(): Level

    // Check if this Handler would actually log a given LogRecord.
    def isLoggable(record: LogRecord): Boolean

    // Publish a LogRecord.
    def publish(record: LogRecord): Unit

    // Protected convenience method to report an error to this Handler's
    // ErrorManager.
    protected def reportError(msg: String, ex: Exception, code: Int): Unit

    // Set the character encoding used by this Handler.
    def setEncoding(encoding: String): Unit

    // Define an ErrorManager for this Handler.
    def setErrorManager(em: ErrorManager): Unit

    // Set a Filter to control output on this Handler.
    def setFilter(newFilter: Filter): Unit

    // Set a Formatter.
    def setFormatter(newFormatter: Formatter): Unit
}
