package java.text

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that an error has been reached unexpectedly
 *  while parsing.
 */
class ParseException extends Exception {

    /** Constructs a ParseException with the specified detail message and
     *  offset.
     */
    @stub
    def this(s: String, errorOffset: Int) = ???

    /** Returns the position where the error was found. */
    @stub
    def getErrorOffset(): Int = ???
}
