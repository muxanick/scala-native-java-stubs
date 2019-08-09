package java.io

import java.lang.Object

/** Instances of the file descriptor class serve as an opaque handle
 *  to the underlying machine-specific structure representing an open
 *  file, an open socket, or another source or sink of bytes. The
 *  main practical use for a file descriptor is to create a
 *  FileInputStream or FileOutputStream to
 *  contain it.
 *  
 *  Applications should not create their own file descriptors.
 */
final class FileDescriptor extends Object {

    /** Force all system buffers to synchronize with the underlying
     *  device.
     */
    @stub
    def sync(): Unit = ???
}

object FileDescriptor {
    /** A handle to the standard error stream. */
    @stub
    val err: FileDescriptor = ???

    /** A handle to the standard input stream. */
    @stub
    val in: FileDescriptor = ???
}
