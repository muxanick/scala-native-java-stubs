package javax.tools

import java.lang.{Enum, Object, String}

// Kinds of JavaFileObjects.
class JavaFileObject.Kind private (name: String, ordinal: Int) extends Enum[JavaFileObject.Kind](name, ordinal) {
}

object JavaFileObject.Kind {
    // Class files for the Java Virtual Machine.
    final val CLASS = new JavaFileObject.Kind(CLASS, 0)

    // HTML files.
    final val HTML = new JavaFileObject.Kind(HTML, 1)

    // Any other kind.
    final val OTHER = new JavaFileObject.Kind(OTHER, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): JavaFileObject.Kind = ???
}
