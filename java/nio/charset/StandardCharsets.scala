package java.nio.charset

import java.lang.Object

// Constant definitions for the standard Charsets. These
// charsets are guaranteed to be available on every implementation of the Java
// platform.
final class StandardCharsets extends Object {
}

object StandardCharsets {
    @stub
    // ISO Latin Alphabet No.
    def ISO_8859_1: Charset = ???

    @stub
    // Seven-bit ASCII, a.k.a.
    def US_ASCII: Charset = ???

    @stub
    // Sixteen-bit UCS Transformation Format, byte order identified by an
    // optional byte-order mark
    def UTF_16: Charset = ???

    @stub
    // Sixteen-bit UCS Transformation Format, big-endian byte order
    def UTF_16BE: Charset = ???

    @stub
    // Sixteen-bit UCS Transformation Format, little-endian byte order
    def UTF_16LE: Charset = ???
}
