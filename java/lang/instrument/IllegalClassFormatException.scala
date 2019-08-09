package java.lang.instrument

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by an implementation of
 *  ClassFileTransformer.transform
 *  when its input parameters are invalid.
 *  This may occur either because the initial class file bytes were
 *  invalid or a previously applied transform corrupted the bytes.
 */
class IllegalClassFormatException extends Exception {

    /** Constructs an IllegalClassFormatException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IllegalClassFormatException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
