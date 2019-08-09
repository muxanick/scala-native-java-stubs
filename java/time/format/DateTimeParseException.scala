package java.time.format

import java.lang.{CharSequence, Exception, Object, RuntimeException, String, Throwable}
import java.time.DateTimeException
import scala.scalanative.annotation.stub

/** An exception thrown when an error occurs during parsing.
 *  
 *  This exception includes the text being parsed and the error index.
 */
class DateTimeParseException extends DateTimeException {

    /** Constructs a new exception with the specified message. */
    @stub
    def this(message: String, parsedData: CharSequence, errorIndex: Int) = ???

    /** Constructs a new exception with the specified message and cause. */
    @stub
    def this(message: String, parsedData: CharSequence, errorIndex: Int, cause: Throwable) = ???

    /** Returns the index where the error was found. */
    @stub
    def getErrorIndex(): Int = ???

    /** Returns the string that was being parsed. */
    @stub
    def getParsedString(): String = ???
}
