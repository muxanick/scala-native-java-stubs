package java.net

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Thrown to indicate that a malformed URL has occurred. Either no
 *  legal protocol could be found in a specification string or the
 *  string could not be parsed.
 */
class MalformedURLException extends IOException {

    /** Constructs a MalformedURLException with no detail message. */
    @stub
    def this() = ???
}
