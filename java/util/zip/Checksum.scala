package java.util.zip

/** An interface representing a data checksum. */
trait Checksum {

    /** Returns the current checksum value. */
    @stub
    def getValue(): Long = ???

    /** Resets the checksum to its initial value. */
    @stub
    def reset(): Unit = ???

    /** Updates the current checksum with the specified array of bytes. */
    @stub
    def update(b: Array[Byte], off: Int, len: Int): Unit = ???
}
