package java.sql

import java.lang.{Exception, Object, Throwable}
import scala.scalanative.annotation.stub

/** An exception  thrown as a DataTruncation exception
 *  (on writes) or reported as a
 *  DataTruncation warning (on reads)
 *   when a data values is unexpectedly truncated for reasons other than its having
 *   exceeded MaxFieldSize.
 * 
 *  The SQLstate for a DataTruncation during read is 01004.
 *  The SQLstate for a DataTruncation during write is 22001.
 */
class DataTruncation extends SQLWarning {

    /** Creates a DataTruncation object
     *  with the SQLState initialized
     *  to 01004 when read is set to true and 22001
     *  when read is set to false,
     *  the reason set to "Data truncation", the
     *  vendor code set to 0, and
     *  the other fields set to the given values.
     */
    @stub
    def this(index: Int, parameter: Boolean, read: Boolean, dataSize: Int, transferSize: Int) = ???

    /** Creates a DataTruncation object
     *  with the SQLState initialized
     *  to 01004 when read is set to true and 22001
     *  when read is set to false,
     *  the reason set to "Data truncation", the
     *  vendor code set to 0, and
     *  the other fields set to the given values.
     */
    @stub
    def this(index: Int, parameter: Boolean, read: Boolean, dataSize: Int, transferSize: Int, cause: Throwable) = ???

    /** Gets the number of bytes of data that should have been transferred. */
    @stub
    def getDataSize(): Int = ???

    /** Retrieves the index of the column or parameter that was truncated. */
    @stub
    def getIndex(): Int = ???

    /** Indicates whether the value truncated was a parameter value or
     *  a column value.
     */
    @stub
    def getParameter(): Boolean = ???

    /** Indicates whether or not the value was truncated on a read. */
    @stub
    def getRead(): Boolean = ???

    /** Gets the number of bytes of data actually transferred. */
    @stub
    def getTransferSize(): Int = ???
}
