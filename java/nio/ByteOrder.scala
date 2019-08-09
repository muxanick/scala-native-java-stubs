package java.nio

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A typesafe enumeration for byte orders. */
final class ByteOrder extends Object {

    /** Constructs a string describing this object. */
    @stub
    def toString(): String = ???
}

object ByteOrder {
    /** Constant denoting big-endian byte order. */
    @stub
    val BIG_ENDIAN: ByteOrder = ???

    /** Constant denoting little-endian byte order. */
    @stub
    val LITTLE_ENDIAN: ByteOrder = ???

    /** Retrieves the native byte order of the underlying platform. */
    @stub
    def nativeOrder(): ByteOrder = ???
}
