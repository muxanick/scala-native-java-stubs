package java.sql

import java.lang.{Enum, Integer, Object, String}
import scala.scalanative.annotation.stub

/** Defines the constants that are used to identify generic
 *  SQL types, called JDBC types.
 *  
 */
class JDBCType private (name: String, ordinal: Int) extends Enum[JDBCType](name, ordinal) with SQLType {

    /** Returns the SQLType name that represents a SQL data type. */
    @stub
    def getName(): String = ???

    /** Returns the name of the vendor that supports this data type. */
    @stub
    def getVendor(): String = ???

    /** Returns the vendor specific type number for the data type. */
    @stub
    def getVendorTypeNumber(): Integer = ???
}

object JDBCType {
    /** Identifies the generic SQL type ARRAY. */
    final val ARRAY: JDBCType = new JDBCType("ARRAY", 0)

    /** Identifies the generic SQL type BIGINT. */
    final val BIGINT: JDBCType = new JDBCType("BIGINT", 1)

    /** Identifies the generic SQL type BINARY. */
    final val BINARY: JDBCType = new JDBCType("BINARY", 2)

    /** Identifies the generic SQL type BIT. */
    final val BIT: JDBCType = new JDBCType("BIT", 3)

    /** Identifies the generic SQL type BLOB. */
    final val BLOB: JDBCType = new JDBCType("BLOB", 4)

    /** Identifies the generic SQL type BOOLEAN. */
    final val BOOLEAN: JDBCType = new JDBCType("BOOLEAN", 5)

    /** Identifies the generic SQL type CHAR. */
    final val CHAR: JDBCType = new JDBCType("CHAR", 6)

    /** Identifies the generic SQL type CLOB. */
    final val CLOB: JDBCType = new JDBCType("CLOB", 7)

    /** Identifies the generic SQL type DATALINK. */
    final val DATALINK: JDBCType = new JDBCType("DATALINK", 8)

    /** Identifies the generic SQL type DATE. */
    final val DATE: JDBCType = new JDBCType("DATE", 9)

    /** Identifies the generic SQL type DECIMAL. */
    final val DECIMAL: JDBCType = new JDBCType("DECIMAL", 10)

    /** Identifies the generic SQL type DISTINCT. */
    final val DISTINCT: JDBCType = new JDBCType("DISTINCT", 11)

    /** Identifies the generic SQL type DOUBLE. */
    final val DOUBLE: JDBCType = new JDBCType("DOUBLE", 12)

    /** Identifies the generic SQL type FLOAT. */
    final val FLOAT: JDBCType = new JDBCType("FLOAT", 13)

    /** Identifies the generic SQL type INTEGER. */
    final val INTEGER: JDBCType = new JDBCType("INTEGER", 14)

    /** Indicates that the SQL type
     *  is database-specific and gets mapped to a Java object that can be
     *  accessed via the methods getObject and setObject.
     */
    final val JAVA_OBJECT: JDBCType = new JDBCType("JAVA_OBJECT", 15)

    /** Identifies the generic SQL type LONGNVARCHAR. */
    final val LONGNVARCHAR: JDBCType = new JDBCType("LONGNVARCHAR", 16)

    /** Identifies the generic SQL type LONGVARBINARY. */
    final val LONGVARBINARY: JDBCType = new JDBCType("LONGVARBINARY", 17)

    /** Identifies the generic SQL type LONGVARCHAR. */
    final val LONGVARCHAR: JDBCType = new JDBCType("LONGVARCHAR", 18)

    /** Identifies the generic SQL type NCHAR. */
    final val NCHAR: JDBCType = new JDBCType("NCHAR", 19)

    /** Identifies the generic SQL type NCLOB. */
    final val NCLOB: JDBCType = new JDBCType("NCLOB", 20)

    /** Identifies the generic SQL value NULL. */
    final val NULL: JDBCType = new JDBCType("NULL", 21)

    /** Identifies the generic SQL type NUMERIC. */
    final val NUMERIC: JDBCType = new JDBCType("NUMERIC", 22)

    /** Identifies the generic SQL type NVARCHAR. */
    final val NVARCHAR: JDBCType = new JDBCType("NVARCHAR", 23)

    /** Indicates that the SQL type
     *  is database-specific and gets mapped to a Java object that can be
     *  accessed via the methods getObject and setObject.
     */
    final val OTHER: JDBCType = new JDBCType("OTHER", 24)

    /** Identifies the generic SQL type REAL. */
    final val REAL: JDBCType = new JDBCType("REAL", 25)

    /** Identifies the generic SQL type REF. */
    final val REF: JDBCType = new JDBCType("REF", 26)

    /** Identifies the generic SQL type REF_CURSOR. */
    final val REF_CURSOR: JDBCType = new JDBCType("REF_CURSOR", 27)

    /** Identifies the SQL type ROWID. */
    final val ROWID: JDBCType = new JDBCType("ROWID", 28)

    /** Identifies the generic SQL type SMALLINT. */
    final val SMALLINT: JDBCType = new JDBCType("SMALLINT", 29)

    /** Identifies the generic SQL type SQLXML. */
    final val SQLXML: JDBCType = new JDBCType("SQLXML", 30)

    /** Identifies the generic SQL type STRUCT. */
    final val STRUCT: JDBCType = new JDBCType("STRUCT", 31)

    /** Identifies the generic SQL type TIME. */
    final val TIME: JDBCType = new JDBCType("TIME", 32)

    /** Identifies the generic SQL type TIME_WITH_TIMEZONE. */
    final val TIME_WITH_TIMEZONE: JDBCType = new JDBCType("TIME_WITH_TIMEZONE", 33)

    /** Identifies the generic SQL type TIMESTAMP. */
    final val TIMESTAMP: JDBCType = new JDBCType("TIMESTAMP", 34)

    /** Identifies the generic SQL type TIMESTAMP_WITH_TIMEZONE. */
    final val TIMESTAMP_WITH_TIMEZONE: JDBCType = new JDBCType("TIMESTAMP_WITH_TIMEZONE", 35)

    /** Identifies the generic SQL type TINYINT. */
    final val TINYINT: JDBCType = new JDBCType("TINYINT", 36)

    /** Identifies the generic SQL type VARBINARY. */
    final val VARBINARY: JDBCType = new JDBCType("VARBINARY", 37)

    /** Identifies the generic SQL type VARCHAR. */
    final val VARCHAR: JDBCType = new JDBCType("VARCHAR", 38)

    /** Returns the JDBCType that corresponds to the specified
     *  Types value
     */
    @stub
    def valueOf(type: Int): JDBCType = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): JDBCType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[JDBCType] = ???
}
