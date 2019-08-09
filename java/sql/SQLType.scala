package java.sql

import java.lang.{Integer, String}
import scala.scalanative.annotation.stub

/** An object that is used to identify a generic SQL type, called a JDBC type or
 *  a vendor specific data type.
 */
trait SQLType {

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
