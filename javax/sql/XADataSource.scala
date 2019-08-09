package javax.sql

// A factory for XAConnection objects that is used internally.
// An object that implements the XADataSource interface is
// typically registered with a naming service that uses the
// Java Naming and Directory Interface™
// (JNDI).
//  
// An implementation of XADataSource must include a public no-arg
// constructor.
trait XADataSource extends CommonDataSource {

    @stub
    // Attempts to establish a physical database connection that can be
    // used in a distributed transaction.
    def getXAConnection(): XAConnection = ???
}
