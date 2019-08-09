package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException thrown when the SQLState class value
 *  is '22', or under vendor-specified conditions.  This indicates
 *  various data errors, including but not limited to data conversion errors,
 *  division by 0, and invalid arguments to functions.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLDataException extends SQLNonTransientException {

    /** Constructs a SQLDataException object. */
    @stub
    def this() = ???

    /** Constructs a SQLDataException object with a given
     *  reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLDataException object with a given
     *  reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLDataException object with a given
     *  reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLDataException object with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLDataException object with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLDataException object with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
