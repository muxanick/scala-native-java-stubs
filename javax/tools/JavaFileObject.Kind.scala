package javax.tools

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Kinds of JavaFileObjects. */
class JavaFileObject_Kind private (name: String, ordinal: Int) extends Enum[JavaFileObject.Kind](name, ordinal) {
}

object JavaFileObject_Kind {
    /** Class files for the Java Virtual Machine. */
    final val CLASS = new JavaFileObject.Kind(CLASS, 0)

    /** HTML files. */
    final val HTML = new JavaFileObject.Kind(HTML, 1)

    /** Any other kind. */
    final val OTHER = new JavaFileObject.Kind(OTHER, 2)

    /** Source files written in the Java programming language. */
    final val SOURCE = new JavaFileObject.Kind(SOURCE, 3)

    /** The extension which (by convention) is normally used for
     *  this kind of file object.
     */
    @stub
    val extension: String = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): JavaFileObject.Kind = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[JavaFileObject.Kind] = ???
}
