package java.util.logging

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

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

    /** Construct a new formatter. */
    @stub
    protected def this() = ???

    /** Format the given log record and return the formatted string. */
    def format(record: LogRecord): String

    /** Localize and format the message string from a log record. */
    def formatMessage(record: LogRecord): String

    /** Return the header string for a set of formatted records. */
    def getHead(h: Handler): String

    /** Return the tail string for a set of formatted records. */
    def getTail(h: Handler): String
}
