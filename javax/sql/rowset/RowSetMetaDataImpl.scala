package javax.sql.rowset

import java.io.Serializable
import java.lang.{Class, Object, String}
import javax.sql.RowSetMetaData
import scala.scalanative.annotation.stub

/** Provides implementations for the methods that set and get
 *  metadata information about a RowSet object's columns.
 *  A RowSetMetaDataImpl object keeps track of the
 *  number of columns in the rowset and maintains an internal array
 *  of column attributes for each column.
 *  
 *  A RowSet object creates a RowSetMetaDataImpl
 *  object internally in order to set and retrieve information about
 *  its columns.
 *  
 *  NOTE: All metadata in a RowSetMetaDataImpl object
 *  should be considered as unavailable until the RowSet object
 *  that it describes is populated.
 *  Therefore, any RowSetMetaDataImpl method that retrieves information
 *  is defined as having unspecified behavior when it is called
 *  before the RowSet object contains data.
 */
class RowSetMetaDataImpl extends Object with RowSetMetaData with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Retrieves the catalog name of the table from which the value
     *  in the designated column was derived.
     */
    @stub
    def getCatalogName(columnIndex: Int): String = ???

    /** Retrieves the fully-qualified name of the class in the Java
     *  programming language to which a value in the designated column
     *  will be mapped.
     */
    @stub
    def getColumnClassName(columnIndex: Int): String = ???

    /** Retrieves the number of columns in the RowSet object
     *  for which this RowSetMetaDataImpl object was created.
     */
    @stub
    def getColumnCount(): Int = ???

    /** Retrieves the normal maximum width in chars of the designated column. */
    @stub
    def getColumnDisplaySize(columnIndex: Int): Int = ???

    /** Retrieves the suggested column title for the designated
     *  column for use in printouts and displays.
     */
    @stub
    def getColumnLabel(columnIndex: Int): String = ???

    /** Retrieves the name of the designated column. */
    @stub
    def getColumnName(columnIndex: Int): String = ???

    /** Retrieves the type code (one of the java.sql.Types
     *  constants) for the SQL type of the value stored in the
     *  designated column.
     */
    @stub
    def getColumnType(columnIndex: Int): Int = ???

    /** Retrieves the DBMS-specific type name for values stored in the
     *  designated column.
     */
    @stub
    def getColumnTypeName(columnIndex: Int): String = ???

    /** Retrieves the total number of digits for values stored in
     *  the designated column.
     */
    @stub
    def getPrecision(columnIndex: Int): Int = ???

    /** Retrieves the number of digits to the right of the decimal point
     *  for values stored in the designated column.
     */
    @stub
    def getScale(columnIndex: Int): Int = ???

    /** Retrieves the schema name of the table from which the value
     *  in the designated column was derived.
     */
    @stub
    def getSchemaName(columnIndex: Int): String = ???

    /** Retrieves the name of the table from which the value
     *  in the designated column was derived.
     */
    @stub
    def getTableName(columnIndex: Int): String = ???

    /** Retrieves whether a value stored in the designated column is
     *  automatically numbered, and thus readonly.
     */
    @stub
    def isAutoIncrement(columnIndex: Int): Boolean = ???

    /** Indicates whether the case of the designated column's name
     *  matters.
     */
    @stub
    def isCaseSensitive(columnIndex: Int): Boolean = ???

    /** Indicates whether a value stored in the designated column
     *  is a cash value.
     */
    @stub
    def isCurrency(columnIndex: Int): Boolean = ???

    /** Indicates whether a write operation on the designated column
     *  will definitely succeed.
     */
    @stub
    def isDefinitelyWritable(columnIndex: Int): Boolean = ???

    /** Retrieves a constant indicating whether it is possible
     *  to store a NULL value in the designated column.
     */
    @stub
    def isNullable(columnIndex: Int): Int = ???

    /** Indicates whether the designated column is definitely
     *  not writable, thus readonly.
     */
    @stub
    def isReadOnly(columnIndex: Int): Boolean = ???

    /** Indicates whether a value stored in the designated column
     *  can be used in a WHERE clause.
     */
    @stub
    def isSearchable(columnIndex: Int): Boolean = ???

    /** Indicates whether a value stored in the designated column is
     *  a signed number.
     */
    @stub
    def isSigned(columnIndex: Int): Boolean = ???

    /** Returns true if this either implements the interface argument or is directly or indirectly a wrapper
     *  for an object that does.
     */
    @stub
    def isWrapperFor(interfaces: Class[_]): Boolean = ???

    /** Indicates whether it is possible for a write operation on
     *  the designated column to succeed.
     */
    @stub
    def isWritable(columnIndex: Int): Boolean = ???

    /** Sets whether the designated column is automatically
     *  numbered, thus read-only, to the given boolean
     *  value.
     */
    @stub
    def setAutoIncrement(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets whether the name of the designated column is case sensitive to
     *  the given boolean.
     */
    @stub
    def setCaseSensitive(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets the catalog name of the table from which the designated
     *  column was derived to catalogName.
     */
    @stub
    def setCatalogName(columnIndex: Int, catalogName: String): Unit = ???

    /** Sets to the given number the number of columns in the RowSet
     *  object for which this RowSetMetaDataImpl object was created.
     */
    @stub
    def setColumnCount(columnCount: Int): Unit = ???

    /** Sets the normal maximum number of chars in the designated column
     *  to the given number.
     */
    @stub
    def setColumnDisplaySize(columnIndex: Int, size: Int): Unit = ???

    /** Sets the suggested column label for use in printouts and
     *  displays, if any, to label.
     */
    @stub
    def setColumnLabel(columnIndex: Int, label: String): Unit = ???

    /** Sets the column name of the designated column to the given name. */
    @stub
    def setColumnName(columnIndex: Int, columnName: String): Unit = ???

    /** Sets the SQL type code for values stored in the designated column
     *  to the given type code from the class java.sql.Types.
     */
    @stub
    def setColumnType(columnIndex: Int, SQLType: Int): Unit = ???

    /** Sets the type name used by the data source for values stored in the
     *  designated column to the given type name.
     */
    @stub
    def setColumnTypeName(columnIndex: Int, typeName: String): Unit = ???

    /** Sets whether a value stored in the designated column is a cash
     *  value to the given boolean.
     */
    @stub
    def setCurrency(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets whether a value stored in the designated column can be set
     *  to NULL to the given constant from the interface
     *  ResultSetMetaData.
     */
    @stub
    def setNullable(columnIndex: Int, property: Int): Unit = ???

    /** Sets the total number of decimal digits in a value stored in the
     *  designated column to the given number.
     */
    @stub
    def setPrecision(columnIndex: Int, precision: Int): Unit = ???

    /** Sets the number of digits to the right of the decimal point in a value
     *  stored in the designated column to the given number.
     */
    @stub
    def setScale(columnIndex: Int, scale: Int): Unit = ???

    /** Sets the designated column's table's schema name, if any, to
     *  schemaName.
     */
    @stub
    def setSchemaName(columnIndex: Int, schemaName: String): Unit = ???

    /** Sets whether a value stored in the designated column can be used
     *  in a WHERE clause to the given boolean value.
     */
    @stub
    def setSearchable(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets whether a value stored in the designated column is a signed
     *  number to the given boolean.
     */
    @stub
    def setSigned(columnIndex: Int, property: Boolean): Unit = ???

    /** Sets the name of the table from which the designated column
     *  was derived to the given table name.
     */
    @stub
    def setTableName(columnIndex: Int, tableName: String): Unit = ???

    /** Returns an object that implements the given interface to allow access to non-standard methods,
     *  or standard methods not exposed by the proxy.
     */
    @stub
    def unwrap[T](iface: Class[T]): T = ???
}
