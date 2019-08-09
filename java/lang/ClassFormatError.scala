package java.lang

import scala.scalanative.annotation.stub

/** Thrown when the Java Virtual Machine attempts to read a class
 *  file and determines that the file is malformed or otherwise cannot
 *  be interpreted as a class file.
 */
class ClassFormatError extends LinkageError {

    /** Constructs a ClassFormatError with no detail message. */
    @stub
    def this() = ???

    /** Constructs a ClassFormatError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
