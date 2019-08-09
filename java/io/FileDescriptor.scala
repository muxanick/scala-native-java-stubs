package java.io

import java.lang.Object

// Instances of the file descriptor class serve as an opaque handle
// to the underlying machine-specific structure representing an open
// file, an open socket, or another source or sink of bytes. The
// main practical use for a file descriptor is to create a
// FileInputStream or FileOutputStream to
// contain it.
// 
// Applications should not create their own file descriptors.
final class FileDescriptor extends Object {

    @stub
    // Force all system buffers to synchronize with the underlying
    // device.
    def sync(): Unit = ???
}

object FileDescriptor {
    @stub
    // A handle to the standard error stream.
    def err: FileDescriptor = ???

    @stub
    // A handle to the standard input stream.
    def in: FileDescriptor = ???
}
