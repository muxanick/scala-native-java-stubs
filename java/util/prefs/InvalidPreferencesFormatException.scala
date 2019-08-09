package java.util.prefs

import java.lang.{Exception, Object, String, Throwable}

// Thrown to indicate that an operation could not complete because
// the input did not conform to the appropriate XML document type
// for a collection of preferences, as per the Preferences
// specification.
class InvalidPreferencesFormatException extends Exception {

    @stub
    // Constructs an InvalidPreferencesFormatException with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs an InvalidPreferencesFormatException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
