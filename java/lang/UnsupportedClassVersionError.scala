package java.lang

import scala.scalanative.annotation.stub

/** Thrown when the Java Virtual Machine attempts to read a class
 *  file and determines that the major and minor version numbers
 *  in the file are not supported.
 */
class UnsupportedClassVersionError extends ClassFormatError {

    /** Constructs a UnsupportedClassVersionError
     *  with no detail message.
     */
    @stub
    def this() = ???

    /** Constructs a UnsupportedClassVersionError with
     *  the specified detail message.
     */
    @stub
    def this(s: String) = ???
}
