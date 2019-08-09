package java.util.jar

import java.io.IOException
import java.lang.{Exception, Object, Throwable}
import java.util.zip.ZipException

/** Signals that an error of some sort has occurred while reading from
 *  or writing to a JAR file.
 */
class JarException extends ZipException {

    /** Constructs a JarException with no detail message. */
    @stub
    def this() = ???
}
