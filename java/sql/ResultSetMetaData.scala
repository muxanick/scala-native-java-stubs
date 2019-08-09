package java.sql

import java.lang.String

// An object that can be used to get information about the types
// and properties of the columns in a ResultSet object.
// The following code fragment creates the ResultSet object rs,
// creates the ResultSetMetaData object rsmd, and uses rsmd
// to find out how many columns rs has and whether the first column in rs
// can be used in a WHERE clause.
// 
//
//     ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
//     ResultSetMetaData rsmd = rs.getMetaData();
//     int numberOfColumns = rsmd.getColumnCount();
//     boolean b = rsmd.isSearchable(1);
//
// 
trait ResultSetMetaData extends Wrapper {

    @stub
    // Gets the designated column's table's catalog name.
    def getCatalogName(column: Int): String = ???

    @stub
    // Returns the fully-qualified name of the Java class whose instances
    // are manufactured if the method ResultSet.getObject
    // is called to retrieve a value
    // from the column.
    def getColumnClassName(column: Int): String = ???

    @stub
    // Returns the number of columns in this ResultSet object.
    def getColumnCount(): Int = ???

    @stub
    // Indicates the designated column's normal maximum width in characters.
    def getColumnDisplaySize(column: Int): Int = ???

    @stub
    // Gets the designated column's suggested title for use in printouts and
    // displays.
    def getColumnLabel(column: Int): String = ???

    @stub
    // Get the designated column's name.
    def getColumnName(column: Int): String = ???

    @stub
    // Retrieves the designated column's SQL type.
    def getColumnType(column: Int): Int = ???

    @stub
    // Retrieves the designated column's database-specific type name.
    def getColumnTypeName(column: Int): String = ???

    @stub
    // Get the designated column's specified column size.
    def getPrecision(column: Int): Int = ???

    @stub
    // Gets the designated column's number of digits to right of the decimal point.
    def getScale(column: Int): Int = ???

    @stub
    // Get the designated column's table's schema.
    def getSchemaName(column: Int): String = ???

    @stub
    // Gets the designated column's table name.
    def getTableName(column: Int): String = ???

    @stub
    // Indicates whether the designated column is automatically numbered.
    def isAutoIncrement(column: Int): Boolean = ???

    @stub
    // Indicates whether a column's case matters.
    def isCaseSensitive(column: Int): Boolean = ???

    @stub
    // Indicates whether the designated column is a cash value.
    def isCurrency(column: Int): Boolean = ???

    @stub
    // Indicates whether a write on the designated column will definitely succeed.
    def isDefinitelyWritable(column: Int): Boolean = ???

    @stub
    // Indicates the nullability of values in the designated column.
    def isNullable(column: Int): Int = ???

    @stub
    // Indicates whether the designated column is definitely not writable.
    def isReadOnly(column: Int): Boolean = ???

    @stub
    // Indicates whether the designated column can be used in a where clause.
    def isSearchable(column: Int): Boolean = ???

    @stub
    // Indicates whether values in the designated column are signed numbers.
    def isSigned(column: Int): Boolean = ???
}

object ResultSetMetaData {
    @stub
    // The constant indicating that a
    // column does not allow NULL values.
    def columnNoNulls: Int = ???

    @stub
    // The constant indicating that a
    // column allows NULL values.
    def columnNullable: Int = ???
}
