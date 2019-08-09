package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException thrown when the SQLState class value
 *  is '42', or under vendor-specified conditions. This indicates that the
 *  in-progress query has violated SQL syntax rules.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLSyntaxErrorException extends SQLNonTransientException {

    /** Constructs a SQLSyntaxErrorException object. */
    @stub
    def this() = ???

    /** Constructs a SQLSyntaxErrorException object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLSyntaxErrorException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLSyntaxErrorException object
     *   with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLSyntaxErrorException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLSyntaxErrorException object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLSyntaxErrorException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
