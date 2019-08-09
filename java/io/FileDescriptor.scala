package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

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

    /** Constructs an (invalid) FileDescriptor
     *  object.
     */
    @stub
    def this() = ???

    /** Force all system buffers to synchronize with the underlying
     *  device.
     */
    @stub
    def sync(): Unit = ???

    /** Tests if this file descriptor object is valid. */
    @stub
    def valid(): Boolean = ???
}

object FileDescriptor {
    /** A handle to the standard error stream. */
    @stub
    val err: FileDescriptor = ???

    /** A handle to the standard input stream. */
    @stub
    val in: FileDescriptor = ???

    /** A handle to the standard output stream. */
    @stub
    val out: FileDescriptor = ???
}
