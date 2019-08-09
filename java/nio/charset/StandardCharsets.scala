package java.nio.charset

import java.lang.Object

/** Constant definitions for the standard Charsets. These
 *  charsets are guaranteed to be available on every implementation of the Java
 *  platform.
 */
final class StandardCharsets extends Object {
}

object StandardCharsets {
    /** ISO Latin Alphabet No. */
    @stub
    val ISO_8859_1: Charset = ???

    /** Seven-bit ASCII, a.k.a. */
    @stub
    val US_ASCII: Charset = ???

    /** Sixteen-bit UCS Transformation Format, byte order identified by an
     *  optional byte-order mark
     */
    @stub
    val UTF_16: Charset = ???

    /** Sixteen-bit UCS Transformation Format, big-endian byte order */
    @stub
    val UTF_16BE: Charset = ???

    /** Sixteen-bit UCS Transformation Format, little-endian byte order */
    @stub
    val UTF_16LE: Charset = ???
}
