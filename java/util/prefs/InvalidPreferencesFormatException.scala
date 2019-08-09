package java.util.prefs

import java.lang.{Exception, Object, String, Throwable}

/** Thrown to indicate that an operation could not complete because
 *  the input did not conform to the appropriate XML document type
 *  for a collection of preferences, as per the Preferences
 *  specification.
 */
class InvalidPreferencesFormatException extends Exception {

    /** Constructs an InvalidPreferencesFormatException with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs an InvalidPreferencesFormatException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
