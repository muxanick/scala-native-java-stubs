package javax.sql.rowset

import java.io.Serializable
import java.lang.{Class, Object, String}
import javax.sql.RowSetMetaData

// Provides implementations for the methods that set and get
// metadata information about a RowSet object's columns.
// A RowSetMetaDataImpl object keeps track of the
// number of columns in the rowset and maintains an internal array
// of column attributes for each column.
// 
// A RowSet object creates a RowSetMetaDataImpl
// object internally in order to set and retrieve information about
// its columns.
// 
// NOTE: All metadata in a RowSetMetaDataImpl object
// should be considered as unavailable until the RowSet object
// that it describes is populated.
// Therefore, any RowSetMetaDataImpl method that retrieves information
// is defined as having unspecified behavior when it is called
// before the RowSet object contains data.
class RowSetMetaDataImpl extends Object with RowSetMetaData, with Serializable {

    @stub
    // Retrieves the catalog name of the table from which the value
    // in the designated column was derived.
    def getCatalogName(columnIndex: Int): String = ???

    @stub
    // Retrieves the fully-qualified name of the class in the Java
    // programming language to which a value in the designated column
    // will be mapped.
    def getColumnClassName(columnIndex: Int): String = ???

    @stub
    // Retrieves the number of columns in the RowSet object
    // for which this RowSetMetaDataImpl object was created.
    def getColumnCount(): Int = ???

    @stub
    // Retrieves the normal maximum width in chars of the designated column.
    def getColumnDisplaySize(columnIndex: Int): Int = ???

    @stub
    // Retrieves the suggested column title for the designated
    // column for use in printouts and displays.
    def getColumnLabel(columnIndex: Int): String = ???

    @stub
    // Retrieves the name of the designated column.
    def getColumnName(columnIndex: Int): String = ???

    @stub
    // Retrieves the type code (one of the java.sql.Types
    // constants) for the SQL type of the value stored in the
    // designated column.
    def getColumnType(columnIndex: Int): Int = ???

    @stub
    // Retrieves the DBMS-specific type name for values stored in the
    // designated column.
    def getColumnTypeName(columnIndex: Int): String = ???

    @stub
    // Retrieves the total number of digits for values stored in
    // the designated column.
    def getPrecision(columnIndex: Int): Int = ???

    @stub
    // Retrieves the number of digits to the right of the decimal point
    // for values stored in the designated column.
    def getScale(columnIndex: Int): Int = ???

    @stub
    // Retrieves the schema name of the table from which the value
    // in the designated column was derived.
    def getSchemaName(columnIndex: Int): String = ???

    @stub
    // Retrieves the name of the table from which the value
    // in the designated column was derived.
    def getTableName(columnIndex: Int): String = ???

    @stub
    // Retrieves whether a value stored in the designated column is
    // automatically numbered, and thus readonly.
    def isAutoIncrement(columnIndex: Int): Boolean = ???

    @stub
    // Indicates whether the case of the designated column's name
    // matters.
    def isCaseSensitive(columnIndex: Int): Boolean = ???

    @stub
    // Indicates whether a value stored in the designated column
    // is a cash value.
    def isCurrency(columnIndex: Int): Boolean = ???

    @stub
    // Indicates whether a write operation on the designated column
    // will definitely succeed.
    def isDefinitelyWritable(columnIndex: Int): Boolean = ???

    @stub
    // Retrieves a constant indicating whether it is possible
    // to store a NULL value in the designated column.
    def isNullable(columnIndex: Int): Int = ???

    @stub
    // Indicates whether the designated column is definitely
    // not writable, thus readonly.
    def isReadOnly(columnIndex: Int): Boolean = ???

    @stub
    // Indicates whether a value stored in the designated column
    // can be used in a WHERE clause.
    def isSearchable(columnIndex: Int): Boolean = ???

    @stub
    // Indicates whether a value stored in the designated column is
    // a signed number.
    def isSigned(columnIndex: Int): Boolean = ???

    @stub
    // Returns true if this either implements the interface argument or is directly or indirectly a wrapper
    // for an object that does.
    def isWrapperFor(interfaces: Class[_]): Boolean = ???

    @stub
    // Indicates whether it is possible for a write operation on
    // the designated column to succeed.
    def isWritable(columnIndex: Int): Boolean = ???

    @stub
    // Sets whether the designated column is automatically
    // numbered, thus read-only, to the given boolean
    // value.
    def setAutoIncrement(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets whether the name of the designated column is case sensitive to
    // the given boolean.
    def setCaseSensitive(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets the catalog name of the table from which the designated
    // column was derived to catalogName.
    def setCatalogName(columnIndex: Int, catalogName: String): Unit = ???

    @stub
    // Sets to the given number the number of columns in the RowSet
    // object for which this RowSetMetaDataImpl object was created.
    def setColumnCount(columnCount: Int): Unit = ???

    @stub
    // Sets the normal maximum number of chars in the designated column
    // to the given number.
    def setColumnDisplaySize(columnIndex: Int, size: Int): Unit = ???

    @stub
    // Sets the suggested column label for use in printouts and
    // displays, if any, to label.
    def setColumnLabel(columnIndex: Int, label: String): Unit = ???

    @stub
    // Sets the column name of the designated column to the given name.
    def setColumnName(columnIndex: Int, columnName: String): Unit = ???

    @stub
    // Sets the SQL type code for values stored in the designated column
    // to the given type code from the class java.sql.Types.
    def setColumnType(columnIndex: Int, SQLType: Int): Unit = ???

    @stub
    // Sets the type name used by the data source for values stored in the
    // designated column to the given type name.
    def setColumnTypeName(columnIndex: Int, typeName: String): Unit = ???

    @stub
    // Sets whether a value stored in the designated column is a cash
    // value to the given boolean.
    def setCurrency(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets whether a value stored in the designated column can be set
    // to NULL to the given constant from the interface
    // ResultSetMetaData.
    def setNullable(columnIndex: Int, property: Int): Unit = ???

    @stub
    // Sets the total number of decimal digits in a value stored in the
    // designated column to the given number.
    def setPrecision(columnIndex: Int, precision: Int): Unit = ???

    @stub
    // Sets the number of digits to the right of the decimal point in a value
    // stored in the designated column to the given number.
    def setScale(columnIndex: Int, scale: Int): Unit = ???

    @stub
    // Sets the designated column's table's schema name, if any, to
    // schemaName.
    def setSchemaName(columnIndex: Int, schemaName: String): Unit = ???

    @stub
    // Sets whether a value stored in the designated column can be used
    // in a WHERE clause to the given boolean value.
    def setSearchable(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets whether a value stored in the designated column is a signed
    // number to the given boolean.
    def setSigned(columnIndex: Int, property: Boolean): Unit = ???

    @stub
    // Sets the name of the table from which the designated column
    // was derived to the given table name.
    def setTableName(columnIndex: Int, tableName: String): Unit = ???
}
