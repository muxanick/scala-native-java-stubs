package java.util.jar

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.util.zip.ZipException
import scala.scalanative.annotation.stub

/** Signals that an error of some sort has occurred while reading from
 *  or writing to a JAR file.
 */
class JarException extends ZipException {

    /** Constructs a JarException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a JarException with the specified detail message. */
    @stub
    def this(s: String) = ???
}
