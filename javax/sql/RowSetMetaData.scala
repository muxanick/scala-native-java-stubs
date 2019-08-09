package javax.sql

import java.lang.String
import java.sql.ResultSetMetaData

/** An object that contains information about the columns in a
 *  RowSet object.  This interface is
 *  an extension of the ResultSetMetaData interface with
 *  methods for setting the values in a RowSetMetaData object.
 *  When a RowSetReader object reads data into a RowSet
 *  object, it creates a RowSetMetaData object and initializes it
 *  using the methods in the RowSetMetaData interface.  Then the
 *  reader passes the RowSetMetaData object to the rowset.
 *  
 *  The methods in this interface are invoked internally when an application
 *  calls the method RowSet.execute; an application
 *  programmer would not use them directly.
 */
trait RowSetMetaData extends ResultSetMetaData {

    /** Sets whether the designated column is automatically numbered,
     *  The default is for a RowSet object's
     *  columns not to be automatically numbered.
     */
    @stub
    def setAutoIncrement(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets whether the designated column is case sensitive. */
    @stub
    def setCaseSensitive(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets the designated column's table's catalog name, if any, to the given
     *  String.
     */
    @stub
    def setCatalogName(columnIndex: Int, catalogName: String): Unit = ???

    /** Sets the number of columns in the RowSet object to
     *  the given number.
     */
    @stub
    def setColumnCount(columnCount: Int): Unit = ???

    /** Sets the designated column's normal maximum width in chars to the
     *  given int.
     */
    @stub
    def setColumnDisplaySize(columnIndex: Int, size: Int): Unit = ???

    /** Sets the suggested column title for use in printouts and
     *  displays, if any, to the given String.
     */
    @stub
    def setColumnLabel(columnIndex: Int, label: String): Unit = ???

    /** Sets the name of the designated column to the given String. */
    @stub
    def setColumnName(columnIndex: Int, columnName: String): Unit = ???

    /** Sets the designated column's SQL type to the one given. */
    @stub
    def setColumnType(columnIndex: Int, SQLType: Int): Unit = ???

    /** Sets the designated column's type name that is specific to the
     *  data source, if any, to the given String.
     */
    @stub
    def setColumnTypeName(columnIndex: Int, typeName: String): Unit = ???

    /** Sets whether the designated column is a cash value. */
    @stub
    def setCurrency(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets whether the designated column's value can be set to
     *  NULL.
     */
    @stub
    def setNullable(columnIndex: Int, property: Int): Unit = ???

    /** Sets the designated column's number of decimal digits to the
     *  given int.
     */
    @stub
    def setPrecision(columnIndex: Int, precision: Int): Unit = ???

    /** Sets the designated column's number of digits to the
     *  right of the decimal point to the given int.
     */
    @stub
    def setScale(columnIndex: Int, scale: Int): Unit = ???

    /** Sets the name of the designated column's table's schema, if any, to
     *  the given String.
     */
    @stub
    def setSchemaName(columnIndex: Int, schemaName: String): Unit = ???

    /** Sets whether the designated column can be used in a where clause. */
    @stub
    def setSearchable(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets whether the designated column is a signed number. */
    @stub
    def setSigned(columnIndex: Int, property: Boolean): Unit = ???
}
