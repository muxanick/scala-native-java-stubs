package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Convenience class for writing character files.  The constructors of this
 *  class assume that the default character encoding and the default byte-buffer
 *  size are acceptable.  To specify these values yourself, construct an
 *  OutputStreamWriter on a FileOutputStream.
 * 
 *  Whether or not a file is available or may be created depends upon the
 *  underlying platform.  Some platforms, in particular, allow a file to be
 *  opened for writing by only one FileWriter (or other file-writing
 *  object) at a time.  In such situations the constructors in this class
 *  will fail if the file involved is already open.
 * 
 *  FileWriter is meant for writing streams of characters.
 *  For writing streams of raw bytes, consider using a
 *  FileOutputStream.
 */
class FileWriter extends OutputStreamWriter {

    /** Constructs a FileWriter object given a File object. */
    @stub
    def this(file: File) = ???

    /** Constructs a FileWriter object given a File object. */
    @stub
    def this(file: File, append: Boolean) = ???

    /** Constructs a FileWriter object associated with a file descriptor. */
    @stub
    def this(fd: FileDescriptor) = ???

    /** Constructs a FileWriter object given a file name. */
    @stub
    def this(fileName: String) = ???

    /** Constructs a FileWriter object given a file name with a boolean
     *  indicating whether or not to append the data written.
     */
    @stub
    def this(fileName: String, append: Boolean) = ???
}
