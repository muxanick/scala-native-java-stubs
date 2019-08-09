package javax.sql

import java.lang.Object
import java.sql.{Connection, ResultSet}

// The interface that a RowSet object implements in order to
// present itself to a RowSetReader or RowSetWriter
// object. The RowSetInternal interface contains
// methods that let the reader or writer access and modify the internal
// state of the rowset.
trait RowSetInternal {

    @stub
    // Retrieves the Connection object that was passed to this
    // RowSet object.
    def getConnection(): Connection = ???

    @stub
    // Retrieves a ResultSet object containing the original
    // value of this RowSet object.
    def getOriginal(): ResultSet = ???

    @stub
    // Retrieves a ResultSet object containing the original value
    // of the current row only.
    def getOriginalRow(): ResultSet = ???

    @stub
    // Retrieves the parameters that have been set for this
    // RowSet object's command.
    def getParams(): Array[Object] = ???
}
