package java.nio.channels

import java.lang.Object

// A typesafe enumeration for file-mapping modes.
object FileChannel.MapMode extends Object {

    @stub
    // Mode for a private (copy-on-write) mapping.
    def PRIVATE: FileChannel.MapMode = ???

    @stub
    // Mode for a read-only mapping.
    def READ_ONLY: FileChannel.MapMode = ???
}
