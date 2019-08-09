package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException thrown when the SQLState class value is '0A'
 *  ( the value is 'zero' A).
 *  This indicates that the JDBC driver does not support an optional JDBC feature.
 *  Optional JDBC features can fall into the fallowing categories:
 * 
 * 
 * no support for an optional feature
 * no support for an optional overloaded method
 * no support for an optional mode for a method.  The mode for a method is
 * determined based on constants passed as parameter values to a method
 * 
 */
class SQLFeatureNotSupportedException extends SQLNonTransientException {

    /** Constructs a SQLFeatureNotSupportedException object. */
    @stub
    def this() = ???

    /** Constructs a SQLFeatureNotSupportedException object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLFeatureNotSupportedException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLFeatureNotSupportedException object
     *   with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLFeatureNotSupportedException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLFeatureNotSupportedException object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLFeatureNotSupportedException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
