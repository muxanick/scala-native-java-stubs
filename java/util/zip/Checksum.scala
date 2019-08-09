package java.util.zip

// An interface representing a data checksum.
trait Checksum {

    @stub
    // Returns the current checksum value.
    def getValue(): Long = ???

    @stub
    // Resets the checksum to its initial value.
    def reset(): Unit = ???

    @stub
    // Updates the current checksum with the specified array of bytes.
    def update(b: Array[Byte], off: Int, len: Int): Unit = ???
}
