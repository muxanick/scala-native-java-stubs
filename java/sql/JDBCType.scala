package java.sql

import java.lang.{Enum, Integer, Object, String}

/** Defines the constants that are used to identify generic
 *  SQL types, called JDBC types.
 *  
 */
class JDBCType private (name: String, ordinal: Int) extends Enum[JDBCType](name, ordinal) with SQLType {
}

object JDBCType {
    /** Identifies the generic SQL type ARRAY. */
    final val ARRAY = new JDBCType(ARRAY, 0)

    /** Identifies the generic SQL type BIGINT. */
    final val BIGINT = new JDBCType(BIGINT, 1)

    /** Identifies the generic SQL type BINARY. */
    final val BINARY = new JDBCType(BINARY, 2)

    /** Identifies the generic SQL type BIT. */
    final val BIT = new JDBCType(BIT, 3)

    /** Identifies the generic SQL type BLOB. */
    final val BLOB = new JDBCType(BLOB, 4)

    /** Identifies the generic SQL type BOOLEAN. */
    final val BOOLEAN = new JDBCType(BOOLEAN, 5)

    /** Identifies the generic SQL type CHAR. */
    final val CHAR = new JDBCType(CHAR, 6)

    /** Identifies the generic SQL type CLOB. */
    final val CLOB = new JDBCType(CLOB, 7)

    /** Identifies the generic SQL type DATALINK. */
    final val DATALINK = new JDBCType(DATALINK, 8)

    /** Identifies the generic SQL type DATE. */
    final val DATE = new JDBCType(DATE, 9)

    /** Identifies the generic SQL type DECIMAL. */
    final val DECIMAL = new JDBCType(DECIMAL, 10)

    /** Identifies the generic SQL type DISTINCT. */
    final val DISTINCT = new JDBCType(DISTINCT, 11)

    /** Identifies the generic SQL type DOUBLE. */
    final val DOUBLE = new JDBCType(DOUBLE, 12)

    /** Identifies the generic SQL type FLOAT. */
    final val FLOAT = new JDBCType(FLOAT, 13)

    /** Identifies the generic SQL type INTEGER. */
    final val INTEGER = new JDBCType(INTEGER, 14)

    /** Indicates that the SQL type
     *  is database-specific and gets mapped to a Java object that can be
     *  accessed via the methods getObject and setObject.
     */
    final val JAVA_OBJECT = new JDBCType(JAVA_OBJECT, 15)

    /** Identifies the generic SQL type LONGNVARCHAR. */
    final val LONGNVARCHAR = new JDBCType(LONGNVARCHAR, 16)

    /** Identifies the generic SQL type LONGVARBINARY. */
    final val LONGVARBINARY = new JDBCType(LONGVARBINARY, 17)

    /** Identifies the generic SQL type LONGVARCHAR. */
    final val LONGVARCHAR = new JDBCType(LONGVARCHAR, 18)

    /** Identifies the generic SQL type NCHAR. */
    final val NCHAR = new JDBCType(NCHAR, 19)

    /** Identifies the generic SQL type NCLOB. */
    final val NCLOB = new JDBCType(NCLOB, 20)

    /** Identifies the generic SQL value NULL. */
    final val NULL = new JDBCType(NULL, 21)

    /** Identifies the generic SQL type NUMERIC. */
    final val NUMERIC = new JDBCType(NUMERIC, 22)

    /** Identifies the generic SQL type NVARCHAR. */
    final val NVARCHAR = new JDBCType(NVARCHAR, 23)

    /** Indicates that the SQL type
     *  is database-specific and gets mapped to a Java object that can be
     *  accessed via the methods getObject and setObject.
     */
    final val OTHER = new JDBCType(OTHER, 24)

    /** Identifies the generic SQL type REAL. */
    final val REAL = new JDBCType(REAL, 25)

    /** Identifies the generic SQL type REF. */
    final val REF = new JDBCType(REF, 26)

    /** Identifies the generic SQL type REF_CURSOR. */
    final val REF_CURSOR = new JDBCType(REF_CURSOR, 27)

    /** Identifies the SQL type ROWID. */
    final val ROWID = new JDBCType(ROWID, 28)

    /** Identifies the generic SQL type SMALLINT. */
    final val SMALLINT = new JDBCType(SMALLINT, 29)

    /** Identifies the generic SQL type SQLXML. */
    final val SQLXML = new JDBCType(SQLXML, 30)

    /** Identifies the generic SQL type STRUCT. */
    final val STRUCT = new JDBCType(STRUCT, 31)

    /** Identifies the generic SQL type TIME. */
    final val TIME = new JDBCType(TIME, 32)

    /** Identifies the generic SQL type TIME_WITH_TIMEZONE. */
    final val TIME_WITH_TIMEZONE = new JDBCType(TIME_WITH_TIMEZONE, 33)

    /** Identifies the generic SQL type TIMESTAMP. */
    final val TIMESTAMP = new JDBCType(TIMESTAMP, 34)

    /** Identifies the generic SQL type TIMESTAMP_WITH_TIMEZONE. */
    final val TIMESTAMP_WITH_TIMEZONE = new JDBCType(TIMESTAMP_WITH_TIMEZONE, 35)

    /** Identifies the generic SQL type TINYINT. */
    final val TINYINT = new JDBCType(TINYINT, 36)

    /** Identifies the generic SQL type VARBINARY. */
    final val VARBINARY = new JDBCType(VARBINARY, 37)

    /** Returns the SQLType name that represents a SQL data type. */
    @stub
    def getName(): String = ???

    /** Returns the name of the vendor that supports this data type. */
    @stub
    def getVendor(): String = ???

    /** Returns the vendor specific type number for the data type. */
    @stub
    def getVendorTypeNumber(): Integer = ???

    /** Returns the JDBCType that corresponds to the specified
     *  Types value
     */
    @stub
    def valueOf(type: Int): JDBCType = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): JDBCType = ???
}
