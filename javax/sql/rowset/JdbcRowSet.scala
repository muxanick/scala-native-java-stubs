package javax.sql.rowset

import java.sql.Savepoint
import javax.sql.RowSet

// The standard interface that all standard implementations of
// JdbcRowSet must implement.
//
// 1.0 Overview
// A wrapper around a ResultSet object that makes it possible
// to use the result set as a JavaBeans™
// component.  Thus, a JdbcRowSet object can be one of the Beans that
// a tool makes available for composing an application.  Because
// a JdbcRowSet is a connected rowset, that is, it continually
// maintains its connection to a database using a JDBC technology-enabled
// driver, it also effectively makes the driver a JavaBeans component.
// 
// Because it is always connected to its database, an instance of
// JdbcRowSet
// can simply take calls invoked on it and in turn call them on its
// ResultSet object. As a consequence, a result set can, for
// example, be a component in a Swing application.
// 
// Another advantage of a JdbcRowSet object is that it can be
// used to make a ResultSet object scrollable and updatable.  All
// RowSet objects are by default scrollable and updatable. If
// the driver and database being used do not support scrolling and/or updating
// of result sets, an application can populate a JdbcRowSet object
// with the data of a ResultSet object and then operate on the
// JdbcRowSet object as if it were the ResultSet
// object.
//
// 2.0 Creating a JdbcRowSet Object
// The reference implementation of the JdbcRowSet interface,
// JdbcRowSetImpl, provides an implementation of
// the default constructor.  A new instance is initialized with
// default values, which can be set with new values as needed. A
// new instance is not really functional until its execute
// method is called. In general, this method does the following:
// 
//    establishes a connection with a database
//    creates a PreparedStatement object and sets any of its
//        placeholder parameters
//    executes the statement to create a ResultSet object
// 
// If the execute method is successful, it will set the
// appropriate private JdbcRowSet fields with the following:
// 
//   a Connection object -- the connection between the rowset
//       and the database
//   a PreparedStatement object -- the query that produces
//       the result set
//   a ResultSet object -- the result set that the rowset's
//       command produced and that is being made, in effect, a JavaBeans
//       component
// 
// If these fields have not been set, meaning that the execute
// method has not executed successfully, no methods other than
// execute and close may be called on the
// rowset.  All other public methods will throw an exception.
// 
// Before calling the execute method, however, the command
// and properties needed for establishing a connection must be set.
// The following code fragment creates a JdbcRowSetImpl object,
// sets the command and connection properties, sets the placeholder parameter,
// and then invokes the method execute.
// 
//     JdbcRowSetImpl jrs = new JdbcRowSetImpl();
//     jrs.setCommand("SELECT * FROM TITLES WHERE TYPE = ?");
//     jrs.setURL("jdbc:myDriver:myAttribute");
//     jrs.setUsername("cervantes");
//     jrs.setPassword("sancho");
//     jrs.setString(1, "BIOGRAPHY");
//     jrs.execute();
// 
// The variable jrs now represents an instance of
// JdbcRowSetImpl that is a thin wrapper around the
// ResultSet object containing all the rows in the
// table TITLES where the type of book is biography.
// At this point, operations called on jrs will
// affect the rows in the result set, which is effectively a JavaBeans
// component.
// 
// The implementation of the RowSet method execute in the
// JdbcRowSet reference implementation differs from that in the
// CachedRowSet™
// reference implementation to account for the different
// requirements of connected and disconnected RowSet objects.
// 
trait JdbcRowSet extends RowSet , Joinable {

    @stub
    // Each JdbcRowSet contains a Connection object from
    // the ResultSet or JDBC properties passed to it's constructors.
    def commit(): Unit = ???

    @stub
    // Each JdbcRowSet contains a Connection object from
    // the original ResultSet or JDBC properties passed to it.
    def getAutoCommit(): Boolean = ???

    @stub
    // Retrieves the first warning reported by calls on this JdbcRowSet
    // object.
    def getRowSetWarnings(): RowSetWarning = ???

    @stub
    // Retrieves a boolean indicating whether rows marked
    // for deletion appear in the set of current rows.
    def getShowDeleted(): Boolean = ???

    @stub
    // Each JdbcRowSet contains a Connection object from
    // the original ResultSet or JDBC properties passed to it.
    def rollback(): Unit = ???

    @stub
    // Each JdbcRowSet contains a Connection object from
    // the original ResultSet or JDBC properties passed to it.
    def rollback(s: Savepoint): Unit = ???

    @stub
    // Each JdbcRowSet contains a Connection object from
    // the original ResultSet or JDBC properties passed to it.
    def setAutoCommit(autoCommit: Boolean): Unit = ???
}
