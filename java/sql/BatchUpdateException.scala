package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown when an error
// occurs during a batch update operation.  In addition to the
// information provided by SQLException, a
// BatchUpdateException provides the update
// counts for all commands that were executed successfully during the
// batch update, that is, all commands that were executed before the error
// occurred.  The order of elements in an array of update counts
// corresponds to the order in which commands were added to the batch.
// 
// After a command in a batch update fails to execute properly
// and a BatchUpdateException is thrown, the driver
// may or may not continue to process the remaining commands in
// the batch.  If the driver continues processing after a failure,
// the array returned by the method
// BatchUpdateException.getUpdateCounts will have
// an element for every command in the batch rather than only
// elements for the commands that executed successfully before
// the error.  In the case where the driver continues processing
// commands, the array element for any command
// that failed is Statement.EXECUTE_FAILED.
// 
// A JDBC driver implementation should use
// the constructor BatchUpdateException(String reason, String SQLState,
// int vendorCode, long []updateCounts,Throwable cause)  instead of
// constructors that take int[] for the update counts to avoid the
// possibility of overflow.
// 
// If Statement.executeLargeBatch method is invoked it is recommended that
// getLargeUpdateCounts be called instead of getUpdateCounts
// in order to avoid a possible overflow of the integer update count.
class BatchUpdateException extends SQLException {

    @stub
    // Constructs a BatchUpdateException object.
    def this() = ???

    @stub
    // Constructs a BatchUpdateException object initialized with a given
    // updateCounts.
    def this(updateCounts: Array[Int]) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with a
    // given cause and updateCounts.
    def this(updateCounts: Array[Int], cause: Throwable) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with a given
    // reason and updateCounts.
    def this(reason: String, updateCounts: Array[Int]) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with
    // a given reason, cause
    // and updateCounts.
    def this(reason: String, updateCounts: Array[Int], cause: Throwable) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with a given
    // reason, SQLState and
    // updateCounts.
    def this(reason: String, SQLState: String, updateCounts: Array[Int]) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with
    // a given reason, SQLState,cause, and
    // updateCounts.
    def this(reason: String, SQLState: String, updateCounts: Array[Int], cause: Throwable) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with a given
    // reason, SQLState, vendorCode and
    // updateCounts.
    def this(reason: String, SQLState: String, vendorCode: Int, updateCounts: Array[Int]) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with
    // a given reason, SQLState, vendorCode
    // cause and updateCounts.
    def this(reason: String, SQLState: String, vendorCode: Int, updateCounts: Array[Int], cause: Throwable) = ???

    @stub
    // Constructs a BatchUpdateException object initialized with
    // a given reason, SQLState, vendorCode
    // cause and updateCounts.
    def this(reason: String, SQLState: String, vendorCode: Int, updateCounts: Array[Long], cause: Throwable) = ???

    @stub
    // Retrieves the update count for each update statement in the batch
    // update that executed successfully before this exception occurred.
    def getLargeUpdateCounts(): Array[Long] = ???
}
