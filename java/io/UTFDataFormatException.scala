package java.io

import java.lang.{Exception, Object, Throwable}

/** Signals that a malformed string in
 *  modified UTF-8
 *  format has been read in a data
 *  input stream or by any class that implements the data input
 *  interface.
 *  See the
 *  DataInput
 *  class description for the format in
 *  which modified UTF-8 strings are read and written.
 */
class UTFDataFormatException extends IOException {

    /** Constructs a UTFDataFormatException with
     *  null as its error detail message.
     */
    @stub
    def this() = ???
}
