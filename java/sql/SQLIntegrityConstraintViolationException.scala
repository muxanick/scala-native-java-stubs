package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException thrown when the SQLState class value
 *  is '23', or under vendor-specified conditions.
 *  This indicates that an integrity
 *  constraint (foreign key, primary key or unique key) has been violated.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLIntegrityConstraintViolationException extends SQLNonTransientException {

    /** Constructs a SQLIntegrityConstraintViolationException object. */
    @stub
    def this() = ???

    /** Constructs a SQLIntegrityConstraintViolationException
     *   with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLIntegrityConstraintViolationException
     *  object with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLIntegrityConstraintViolationException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLIntegrityConstraintViolationException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLIntegrityConstraintViolationException object
     *   with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLIntegrityConstraintViolationException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
