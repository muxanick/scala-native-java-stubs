package java.nio

import java.lang.Object

/** A typesafe enumeration for byte orders. */
final class ByteOrder extends Object {
}

object ByteOrder {
    /** Constant denoting big-endian byte order. */
    @stub
    val BIG_ENDIAN: ByteOrder = ???

    /** Retrieves the native byte order of the underlying platform. */
    @stub
    def nativeOrder(): ByteOrder = ???
}
