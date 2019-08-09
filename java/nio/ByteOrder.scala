package java.nio

import java.lang.Object

// A typesafe enumeration for byte orders.
final class ByteOrder extends Object {
}

object ByteOrder {
    @stub
    // Constant denoting big-endian byte order.
    def BIG_ENDIAN: ByteOrder = ???

    @stub
    // Retrieves the native byte order of the underlying platform.
    def nativeOrder(): ByteOrder = ???
}
