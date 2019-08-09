package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** An exception that provides information on  database access
 *  warnings. Warnings are silently chained to the object whose method
 *  caused it to be reported.
 *  
 *  Warnings may be retrieved from Connection, Statement,
 *  and ResultSet objects.  Trying to retrieve a warning on a
 *  connection after it has been closed will cause an exception to be thrown.
 *  Similarly, trying to retrieve a warning on a statement after it has been
 *  closed or on a result set after it has been closed will cause
 *  an exception to be thrown. Note that closing a statement also
 *  closes a result set that it might have produced.
 */
class SQLWarning extends SQLException {

    /** Constructs a  SQLWarning object. */
    @stub
    def this() = ???

    /** Constructs a SQLWarning object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLWarning object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a  SQLWarning object
     *   with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs aSQLWarning object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLWarning object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLWarning object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???

    /** Retrieves the warning chained to this SQLWarning object by
     *  setNextWarning.
     */
    @stub
    def getNextWarning(): SQLWarning = ???
}
