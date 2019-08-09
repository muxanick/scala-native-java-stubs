package javax.sql

import java.lang.Object
import java.sql.{Connection, ResultSet}
import scala.scalanative.annotation.stub

/** The interface that a RowSet object implements in order to
 *  present itself to a RowSetReader or RowSetWriter
 *  object. The RowSetInternal interface contains
 *  methods that let the reader or writer access and modify the internal
 *  state of the rowset.
 */
trait RowSetInternal {

    /** Retrieves the Connection object that was passed to this
     *  RowSet object.
     */
    @stub
    def getConnection(): Connection = ???

    /** Retrieves a ResultSet object containing the original
     *  value of this RowSet object.
     */
    @stub
    def getOriginal(): ResultSet = ???

    /** Retrieves a ResultSet object containing the original value
     *  of the current row only.
     */
    @stub
    def getOriginalRow(): ResultSet = ???

    /** Retrieves the parameters that have been set for this
     *  RowSet object's command.
     */
    @stub
    def getParams(): Array[Object] = ???

    /** Sets the given RowSetMetaData object as the
     *  RowSetMetaData object for this RowSet
     *  object.
     */
    @stub
    def setMetaData(md: RowSetMetaData): Unit = ???
}
