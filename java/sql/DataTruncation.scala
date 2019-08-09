package java.sql

import java.lang.{Exception, Object, Throwable}

// An exception  thrown as a DataTruncation exception
// (on writes) or reported as a
// DataTruncation warning (on reads)
//  when a data values is unexpectedly truncated for reasons other than its having
//  exceeded MaxFieldSize.
//
// The SQLstate for a DataTruncation during read is 01004.
// The SQLstate for a DataTruncation during write is 22001.
class DataTruncation extends SQLWarning {

    @stub
    // Creates a DataTruncation object
    // with the SQLState initialized
    // to 01004 when read is set to true and 22001
    // when read is set to false,
    // the reason set to "Data truncation", the
    // vendor code set to 0, and
    // the other fields set to the given values.
    def this(index: Int, parameter: Boolean, read: Boolean, dataSize: Int, transferSize: Int) = ???

    @stub
    // Gets the number of bytes of data that should have been transferred.
    def getDataSize(): Int = ???

    @stub
    // Retrieves the index of the column or parameter that was truncated.
    def getIndex(): Int = ???

    @stub
    // Indicates whether the value truncated was a parameter value or
    // a column value.
    def getParameter(): Boolean = ???

    @stub
    // Indicates whether or not the value was truncated on a read.
    def getRead(): Boolean = ???
}
