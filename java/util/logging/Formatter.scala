package java.util.logging

import java.lang.{Object, String}

/** A Formatter provides support for formatting LogRecords.
 *  
 *  Typically each logging Handler will have a Formatter associated
 *  with it.  The Formatter takes a LogRecord and converts it to
 *  a string.
 *  
 *  Some formatters (such as the XMLFormatter) need to wrap head
 *  and tail strings around a set of formatted records. The getHeader
 *  and getTail methods can be used to obtain these strings.
 */
abstract class Formatter extends Object {

    /** Format the given log record and return the formatted string. */
    def format(record: LogRecord): String

    /** Localize and format the message string from a log record. */
    def formatMessage(record: LogRecord): String

    /** Return the header string for a set of formatted records. */
    def getHead(h: Handler): String
}
