package javax.sql

/** The facility that a disconnected RowSet object calls on
 *  to populate itself with rows of data. A reader (an object implementing the
 *  RowSetReader interface) may be registered with
 *  a RowSet object that supports the reader/writer paradigm.
 *  When the RowSet object's execute method is
 *  called, it in turn calls the reader's readData method.
 */
trait RowSetReader {
}
