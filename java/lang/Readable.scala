package java.lang

import java.nio.CharBuffer
import scala.scalanative.annotation.stub

/** A Readable is a source of characters. Characters from
 *  a Readable are made available to callers of the read
 *  method via a CharBuffer.
 */
trait Readable {

    /** Attempts to read characters into the specified character buffer. */
    @stub
    def read(cb: CharBuffer): Int = ???
}
