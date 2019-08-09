package java.lang.management

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Types of memory pools. */
class MemoryType private (name: String, ordinal: Int) extends Enum[MemoryType](name, ordinal) {
}

object MemoryType {
    /** Heap memory type. */
    final val HEAP = new MemoryType(HEAP, 0)

    /** Non-heap memory type. */
    final val NON_HEAP = new MemoryType(NON_HEAP, 1)

    /** Returns the string representation of this MemoryType. */
    @stub
    def toString(): String = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MemoryType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[MemoryType] = ???
}
