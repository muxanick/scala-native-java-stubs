package java.io

import java.lang.{Exception, Object, Throwable}

/** Signals that an attempt to open the file denoted by a specified pathname
 *  has failed.
 * 
 *   This exception will be thrown by the FileInputStream, FileOutputStream, and RandomAccessFile constructors when a file
 *  with the specified pathname does not exist.  It will also be thrown by these
 *  constructors if the file does exist but for some reason is inaccessible, for
 *  example when an attempt is made to open a read-only file for writing.
 */
class FileNotFoundException extends IOException {

    /** Constructs a FileNotFoundException with
     *  null as its error detail message.
     */
    @stub
    def this() = ???
}
