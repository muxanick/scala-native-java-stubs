package java.time.format

import java.lang.{CharSequence, Exception, Object, RuntimeException, String, Throwable}
import java.time.DateTimeException

// An exception thrown when an error occurs during parsing.
// 
// This exception includes the text being parsed and the error index.
class DateTimeParseException extends DateTimeException {

    @stub
    // Constructs a new exception with the specified message.
    def this(message: String, parsedData: CharSequence, errorIndex: Int) = ???

    @stub
    // Returns the index where the error was found.
    def getErrorIndex(): Int = ???
}
