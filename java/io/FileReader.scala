package java.io

import java.lang.Object

// Convenience class for reading character files.  The constructors of this
// class assume that the default character encoding and the default byte-buffer
// size are appropriate.  To specify these values yourself, construct an
// InputStreamReader on a FileInputStream.
//
// FileReader is meant for reading streams of characters.
// For reading streams of raw bytes, consider using a
// FileInputStream.
class FileReader extends InputStreamReader {

    @stub
    // Creates a new FileReader, given the File
    // to read from.
    def this(file: File) = ???

    @stub
    // Creates a new FileReader, given the
    // FileDescriptor to read from.
    def this(fd: FileDescriptor) = ???
}
