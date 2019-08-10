package java.nio.channels

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A typesafe enumeration for file-mapping modes. */
object FileChannel_MapMode extends Object {

    /** Mode for a private (copy-on-write) mapping. */
    @stub
    val PRIVATE: FileChannel.MapMode = ???

    /** Mode for a read-only mapping. */
    @stub
    val READ_ONLY: FileChannel.MapMode = ???

    /** Mode for a read/write mapping. */
    @stub
    val READ_WRITE: FileChannel.MapMode = ???

    /** Returns a string describing this file-mapping mode. */
    @stub
    def toString(): String = ???
}
