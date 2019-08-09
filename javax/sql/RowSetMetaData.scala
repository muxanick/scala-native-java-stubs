package javax.sql

import java.lang.String
import java.sql.ResultSetMetaData

// An object that contains information about the columns in a
// RowSet object.  This interface is
// an extension of the ResultSetMetaData interface with
// methods for setting the values in a RowSetMetaData object.
// When a RowSetReader object reads data into a RowSet
// object, it creates a RowSetMetaData object and initializes it
// using the methods in the RowSetMetaData interface.  Then the
// reader passes the RowSetMetaData object to the rowset.
// 
// The methods in this interface are invoked internally when an application
// calls the method RowSet.execute; an application
// programmer would not use them directly.
trait RowSetMetaData extends ResultSetMetaData {

    @stub
    // Sets whether the designated column is automatically numbered,
    // The default is for a RowSet object's
    // columns not to be automatically numbered.
    def setAutoIncrement(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets whether the designated column is case sensitive.
    def setCaseSensitive(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets the designated column's table's catalog name, if any, to the given
    // String.
    def setCatalogName(columnIndex: Int, catalogName: String): Unit = ???

    @stub
    // Sets the number of columns in the RowSet object to
    // the given number.
    def setColumnCount(columnCount: Int): Unit = ???

    @stub
    // Sets the designated column's normal maximum width in chars to the
    // given int.
    def setColumnDisplaySize(columnIndex: Int, size: Int): Unit = ???

    @stub
    // Sets the suggested column title for use in printouts and
    // displays, if any, to the given String.
    def setColumnLabel(columnIndex: Int, label: String): Unit = ???

    @stub
    // Sets the name of the designated column to the given String.
    def setColumnName(columnIndex: Int, columnName: String): Unit = ???

    @stub
    // Sets the designated column's SQL type to the one given.
    def setColumnType(columnIndex: Int, SQLType: Int): Unit = ???

    @stub
    // Sets the designated column's type name that is specific to the
    // data source, if any, to the given String.
    def setColumnTypeName(columnIndex: Int, typeName: String): Unit = ???

    @stub
    // Sets whether the designated column is a cash value.
    def setCurrency(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets whether the designated column's value can be set to
    // NULL.
    def setNullable(columnIndex: Int, property: Int): Unit = ???

    @stub
    // Sets the designated column's number of decimal digits to the
    // given int.
    def setPrecision(columnIndex: Int, precision: Int): Unit = ???

    @stub
    // Sets the designated column's number of digits to the
    // right of the decimal point to the given int.
    def setScale(columnIndex: Int, scale: Int): Unit = ???

    @stub
    // Sets the name of the designated column's table's schema, if any, to
    // the given String.
    def setSchemaName(columnIndex: Int, schemaName: String): Unit = ???

    @stub
    // Sets whether the designated column can be used in a where clause.
    def setSearchable(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets whether the designated column is a signed number.
    def setSigned(columnIndex: Int, property: Boolean): Unit = ???
}
