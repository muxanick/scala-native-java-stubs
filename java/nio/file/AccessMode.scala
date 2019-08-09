package java.nio.file

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines access modes used to test the accessibility of a file. */
class AccessMode private (name: String, ordinal: Int) extends Enum[AccessMode](name, ordinal) {
}

object AccessMode {
    /** Test execute access. */
    final val EXECUTE = new AccessMode(EXECUTE, 0)

    /** Test read access. */
    final val READ = new AccessMode(READ, 1)

    /** Test write access. */
    final val WRITE = new AccessMode(WRITE, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): AccessMode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[AccessMode] = ???
}
