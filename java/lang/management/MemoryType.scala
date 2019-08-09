package java.lang.management

import java.lang.{Enum, Object, String}

/** Types of memory pools. */
class MemoryType private (name: String, ordinal: Int) extends Enum[MemoryType](name, ordinal) {
}

object MemoryType {
    /** Heap memory type. */
    final val HEAP = new MemoryType(HEAP, 0)

    /** Returns the string representation of this MemoryType. */
    @stub
    def toString(): String = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MemoryType = ???
}
