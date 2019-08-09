package java.sql

import java.lang.String

/** An object that can be used to get information about the types
 *  and properties of the columns in a ResultSet object.
 *  The following code fragment creates the ResultSet object rs,
 *  creates the ResultSetMetaData object rsmd, and uses rsmd
 *  to find out how many columns rs has and whether the first column in rs
 *  can be used in a WHERE clause.
 *  
 * 
 *      ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
 *      ResultSetMetaData rsmd = rs.getMetaData();
 *      int numberOfColumns = rsmd.getColumnCount();
 *      boolean b = rsmd.isSearchable(1);
 * 
 *  
 */
trait ResultSetMetaData extends Wrapper {

    /** Gets the designated column's table's catalog name. */
    @stub
    def getCatalogName(column: Int): String = ???

    /** Returns the fully-qualified name of the Java class whose instances
     *  are manufactured if the method ResultSet.getObject
     *  is called to retrieve a value
     *  from the column.
     */
    @stub
    def getColumnClassName(column: Int): String = ???

    /** Returns the number of columns in this ResultSet object. */
    @stub
    def getColumnCount(): Int = ???

    /** Indicates the designated column's normal maximum width in characters. */
    @stub
    def getColumnDisplaySize(column: Int): Int = ???

    /** Gets the designated column's suggested title for use in printouts and
     *  displays.
     */
    @stub
    def getColumnLabel(column: Int): String = ???

    /** Get the designated column's name. */
    @stub
    def getColumnName(column: Int): String = ???

    /** Retrieves the designated column's SQL type. */
    @stub
    def getColumnType(column: Int): Int = ???

    /** Retrieves the designated column's database-specific type name. */
    @stub
    def getColumnTypeName(column: Int): String = ???

    /** Get the designated column's specified column size. */
    @stub
    def getPrecision(column: Int): Int = ???

    /** Gets the designated column's number of digits to right of the decimal point. */
    @stub
    def getScale(column: Int): Int = ???

    /** Get the designated column's table's schema. */
    @stub
    def getSchemaName(column: Int): String = ???

    /** Gets the designated column's table name. */
    @stub
    def getTableName(column: Int): String = ???

    /** Indicates whether the designated column is automatically numbered. */
    @stub
    def isAutoIncrement(column: Int): Boolean = ???

    /** Indicates whether a column's case matters. */
    @stub
    def isCaseSensitive(column: Int): Boolean = ???

    /** Indicates whether the designated column is a cash value. */
    @stub
    def isCurrency(column: Int): Boolean = ???

    /** Indicates whether a write on the designated column will definitely succeed. */
    @stub
    def isDefinitelyWritable(column: Int): Boolean = ???

    /** Indicates the nullability of values in the designated column. */
    @stub
    def isNullable(column: Int): Int = ???

    /** Indicates whether the designated column is definitely not writable. */
    @stub
    def isReadOnly(column: Int): Boolean = ???

    /** Indicates whether the designated column can be used in a where clause. */
    @stub
    def isSearchable(column: Int): Boolean = ???

    /** Indicates whether values in the designated column are signed numbers. */
    @stub
    def isSigned(column: Int): Boolean = ???
}

object ResultSetMetaData {
    /** The constant indicating that a
     *  column does not allow NULL values.
     */
    @stub
    val columnNoNulls: Int = ???

    /** The constant indicating that a
     *  column allows NULL values.
     */
    @stub
    val columnNullable: Int = ???
}
