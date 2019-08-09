package java.time

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// Exception used to indicate a problem while calculating a date-time.
// 
// This exception is used to indicate problems with creating, querying
// and manipulating date-time objects.
class DateTimeException extends RuntimeException {

    @stub
    // Constructs a new date-time exception with the specified message.
    def this(message: String) = ???
}
