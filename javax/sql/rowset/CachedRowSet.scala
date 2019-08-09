package javax.sql.rowset

import java.lang.String
import java.sql.{Connection, ResultSet, Savepoint}
import java.util.Collection
import javax.sql.{RowSet, RowSetEvent, RowSetMetaData}
import javax.sql.rowset.spi.SyncProvider

// The interface that all standard implementations of
// CachedRowSet must implement.
// 
// The reference implementation of the CachedRowSet interface provided
// by Oracle Corporation is a standard implementation. Developers may use this implementation
// just as it is, they may extend it, or they may choose to write their own implementations
// of this interface.
// 
// A CachedRowSet object is a container for rows of data
// that caches its rows in memory, which makes it possible to operate without always being
// connected to its data source. Further, it is a
// JavaBeans™ component and is scrollable,
// updatable, and serializable. A CachedRowSet object typically
// contains rows from a result set, but it can also contain rows from any file
// with a tabular format, such as a spread sheet.  The reference implementation
// supports getting data only from a ResultSet object, but
// developers can extend the SyncProvider implementations to provide
// access to other tabular data sources.
// 
// An application can modify the data in a CachedRowSet object, and
// those modifications can then be propagated back to the source of the data.
// 
// A CachedRowSet object is a disconnected rowset, which means
// that it makes use of a connection to its data source only briefly. It connects to its
// data source while it is reading data to populate itself with rows and again
// while it is propagating changes back to its underlying data source. The rest
// of the time, a CachedRowSet object is disconnected, including
// while its data is being modified. Being disconnected makes a RowSet
// object much leaner and therefore much easier to pass to another component.  For
// example, a disconnected RowSet object can be serialized and passed
// over the wire to a thin client such as a personal digital assistant (PDA).
//
//
// 1.0 Creating a CachedRowSet Object
// The following line of code uses the default constructor for
// CachedRowSet
// supplied in the reference implementation (RI) to create a default
// CachedRowSet object.
// 
//     CachedRowSetImpl crs = new CachedRowSetImpl();
// 
// This new CachedRowSet object will have its properties set to the
// default properties of a BaseRowSet object, and, in addition, it will
// have an RIOptimisticProvider object as its synchronization provider.
// RIOptimisticProvider, one of two SyncProvider
// implementations included in the RI, is the default provider that the
// SyncFactory singleton will supply when no synchronization
// provider is specified.
// 
// A SyncProvider object provides a CachedRowSet object
// with a reader (a RowSetReader object) for reading data from a
// data source to populate itself with data. A reader can be implemented to read
// data from a ResultSet object or from a file with a tabular format.
// A SyncProvider object also provides
// a writer (a RowSetWriter object) for synchronizing any
// modifications to the CachedRowSet object's data made while it was
// disconnected with the data in the underlying data source.
// 
// A writer can be implemented to exercise various degrees of care in checking
// for conflicts and in avoiding them.
// (A conflict occurs when a value in the data source has been changed after
// the rowset populated itself with that value.)
// The RIOptimisticProvider implementation assumes there will be
// few or no conflicts and therefore sets no locks. It updates the data source
// with values from the CachedRowSet object only if there are no
// conflicts.
// Other writers can be implemented so that they always write modified data to
// the data source, which can be accomplished either by not checking for conflicts
// or, on the other end of the spectrum, by setting locks sufficient to prevent data
// in the data source from being changed. Still other writer implementations can be
// somewhere in between.
// 
// A CachedRowSet object may use any
// SyncProvider implementation that has been registered
// with the SyncFactory singleton. An application
// can find out which SyncProvider implementations have been
// registered by calling the following line of code.
// 
//      java.util.Enumeration providers = SyncFactory.getRegisteredProviders();
// 
// 
// There are two ways for a CachedRowSet object to specify which
// SyncProvider object it will use.
// 
//     Supplying the name of the implementation to the constructor
//     The following line of code creates the CachedRowSet
//     object crs2 that is initialized with default values except that its
//     SyncProvider object is the one specified.
//     
//          CachedRowSetImpl crs2 = new CachedRowSetImpl(
//                                 "com.fred.providers.HighAvailabilityProvider");
//     
//     Setting the SyncProvider using the CachedRowSet
//         method setSyncProvider
//      The following line of code resets the SyncProvider object
//      for crs, the CachedRowSet object created with the
//      default constructor.
//      
//           crs.setSyncProvider("com.fred.providers.HighAvailabilityProvider");
//      
// 
// See the comments for SyncFactory and SyncProvider for
// more details.
//
//
// 2.0 Retrieving Data from a CachedRowSet Object
// Data is retrieved from a CachedRowSet object by using the
// getter methods inherited from the ResultSet
// interface.  The following examples, in which crs is a
// CachedRowSet
// object, demonstrate how to iterate through the rows, retrieving the column
// values in each row.  The first example uses the version of the
// getter methods that take a column number; the second example
// uses the version that takes a column name. Column numbers are generally
// used when the RowSet object's command
// is of the form SELECT * FROM TABLENAME; column names are most
// commonly used when the command specifies columns by name.
// 
//    while (crs.next()) {
//        String name = crs.getString(1);
//        int id = crs.getInt(2);
//        Clob comment = crs.getClob(3);
//        short dept = crs.getShort(4);
//        System.out.println(name + "  " + id + "  " + comment + "  " + dept);
//    }
// 
//
// 
//    while (crs.next()) {
//        String name = crs.getString("NAME");
//        int id = crs.getInt("ID");
//        Clob comment = crs.getClob("COM");
//        short dept = crs.getShort("DEPT");
//        System.out.println(name + "  " + id + "  " + comment + "  " + dept);
//    }
// 
// 2.1 Retrieving RowSetMetaData
// An application can get information about the columns in a CachedRowSet
// object by calling ResultSetMetaData and RowSetMetaData
// methods on a RowSetMetaData object. The following code fragment,
// in which crs is a CachedRowSet object, illustrates the process.
// The first line creates a RowSetMetaData object with information
// about the columns in crs.  The method getMetaData,
// inherited from the ResultSet interface, returns a
// ResultSetMetaData object, which is cast to a
// RowSetMetaData object before being assigned to the variable
// rsmd.  The second line finds out how many columns jrs has, and
// the third line gets the JDBC type of values stored in the second column of
// jrs.
// 
//     RowSetMetaData rsmd = (RowSetMetaData)crs.getMetaData();
//     int count = rsmd.getColumnCount();
//     int type = rsmd.getColumnType(2);
// 
// The RowSetMetaData interface differs from the
// ResultSetMetaData interface in two ways.
// 
//   It includes setter methods: A RowSet
//   object uses these methods internally when it is populated with data from a
//   different ResultSet object.
//
//   It contains fewer getter methods: Some
//   ResultSetMetaData methods to not apply to a RowSet
//   object. For example, methods retrieving whether a column value is writable
//   or read only do not apply because all of a RowSet object's
//   columns will be writable or read only, depending on whether the rowset is
//   updatable or not.
// 
// NOTE: In order to return a RowSetMetaData object, implementations must
// override the getMetaData() method defined in
// java.sql.ResultSet and return a RowSetMetaData object.
//
// 3.0 Updating a CachedRowSet Object
// Updating a CachedRowSet object is similar to updating a
// ResultSet object, but because the rowset is not connected to
// its data source while it is being updated, it must take an additional step
// to effect changes in its underlying data source. After calling the method
// updateRow or insertRow, a
// CachedRowSet
// object must also call the method acceptChanges to have updates
// written to the data source. The following example, in which the cursor is
// on a row in the CachedRowSet object crs, shows
// the code required to update two column values in the current row and also
// update the RowSet object's underlying data source.
// 
//     crs.updateShort(3, 58);
//     crs.updateInt(4, 150000);
//     crs.updateRow();
//     crs.acceptChanges();
// 
// 
// The next example demonstrates moving to the insert row, building a new
// row on the insert row, inserting it into the rowset, and then calling the
// method acceptChanges to add the new row to the underlying data
// source.  Note that as with the getter methods, the  updater methods may take
// either a column index or a column name to designate the column being acted upon.
// 
//     crs.moveToInsertRow();
//     crs.updateString("Name", "Shakespeare");
//     crs.updateInt("ID", 10098347);
//     crs.updateShort("Age", 58);
//     crs.updateInt("Sal", 150000);
//     crs.insertRow();
//     crs.moveToCurrentRow();
//     crs.acceptChanges();
// 
// 
// NOTE: Where the insertRow() method inserts the contents of a
// CachedRowSet object's insert row is implementation-defined.
// The reference implementation for the CachedRowSet interface
// inserts a new row immediately following the current row, but it could be
// implemented to insert new rows in any number of other places.
// 
// Another thing to note about these examples is how they use the method
// acceptChanges.  It is this method that propagates changes in
// a CachedRowSet object back to the underlying data source,
// calling on the RowSet object's writer internally to write
// changes to the data source. To do this, the writer has to incur the expense
// of establishing a connection with that data source. The
// preceding two code fragments call the method acceptChanges
// immediately after calling updateRow or insertRow.
// However, when there are multiple rows being changed, it is more efficient to call
// acceptChanges after all calls to updateRow
// and insertRow have been made.  If acceptChanges
// is called only once, only one connection needs to be established.
//
// 4.0 Updating the Underlying Data Source
// When the method acceptChanges is executed, the
// CachedRowSet object's writer, a RowSetWriterImpl
// object, is called behind the scenes to write the changes made to the
// rowset to the underlying data source. The writer is implemented to make a
// connection to the data source and write updates to it.
// 
// A writer is made available through an implementation of the
// SyncProvider interface, as discussed in section 1,
// "Creating a CachedRowSet Object."
// The default reference implementation provider, RIOptimisticProvider,
// has its writer implemented to use an optimistic concurrency control
// mechanism. That is, it maintains no locks in the underlying database while
// the rowset is disconnected from the database and simply checks to see if there
// are any conflicts before writing data to the data source.  If there are any
// conflicts, it does not write anything to the data source.
// 
// The reader/writer facility
// provided by the SyncProvider class is pluggable, allowing for the
// customization of data retrieval and updating. If a different concurrency
// control mechanism is desired, a different implementation of
// SyncProvider can be plugged in using the method
// setSyncProvider.
// 
// In order to use the optimistic concurrency control routine, the
// RIOptismisticProvider maintains both its current
// value and its original value (the value it had immediately preceding the
// current value). Note that if no changes have been made to the data in a
// RowSet object, its current values and its original values are the same,
// both being the values with which the RowSet object was initially
// populated.  However, once any values in the RowSet object have been
// changed, the current values and the original values will be different, though at
// this stage, the original values are still the initial values. With any subsequent
// changes to data in a RowSet object, its original values and current
// values will still differ, but its original values will be the values that
// were previously the current values.
// 
// Keeping track of original values allows the writer to compare the RowSet
// object's original value with the value in the database. If the values in
// the database differ from the RowSet object's original values, which means that
// the values in the database have been changed, there is a conflict.
// Whether a writer checks for conflicts, what degree of checking it does, and how
// it handles conflicts all depend on how it is implemented.
//
// 5.0 Registering and Notifying Listeners
// Being JavaBeans components, all rowsets participate in the JavaBeans event
// model, inheriting methods for registering listeners and notifying them of
// changes from the BaseRowSet class.  A listener for a
// CachedRowSet object is a component that wants to be notified
// whenever there is a change in the rowset.  For example, if a
// CachedRowSet object contains the results of a query and
// those
// results are being displayed in, say, a table and a bar graph, the table and
// bar graph could be registered as listeners with the rowset so that they can
// update themselves to reflect changes. To become listeners, the table and
// bar graph classes must implement the RowSetListener interface.
// Then they can be added to the CachedRowSet object's list of
// listeners, as is illustrated in the following lines of code.
// 
//    crs.addRowSetListener(table);
//    crs.addRowSetListener(barGraph);
// 
// Each CachedRowSet method that moves the cursor or changes
// data also notifies registered listeners of the changes, so
// table and barGraph will be notified when there is
// a change in crs.
//
// 6.0 Passing Data to Thin Clients
// One of the main reasons to use a CachedRowSet object is to
// pass data between different components of an application. Because it is
// serializable, a CachedRowSet object can be used, for example,
// to send the result of a query executed by an enterprise JavaBeans component
// running in a server environment over a network to a client running in a
// web browser.
// 
// While a CachedRowSet object is disconnected, it can be much
// leaner than a ResultSet object with the same data.
// As a result, it can be especially suitable for sending data to a thin client
// such as a PDA, where it would be inappropriate to use a JDBC driver
// due to resource limitations or security considerations.
// Thus, a CachedRowSet object provides a means to "get rows in"
// without the need to implement the full JDBC API.
//
// 7.0 Scrolling and Updating
// A second major use for CachedRowSet objects is to provide
// scrolling and updating for ResultSet objects that
// do not provide these capabilities themselves.  In other words, a
// CachedRowSet object can be used to augment the
// capabilities of a JDBC technology-enabled driver (hereafter called a
// "JDBC driver") when the DBMS does not provide full support for scrolling and
// updating. To achieve the effect of making a non-scrollble and read-only
// ResultSet object scrollable and updatable, a programmer
// simply needs to create a CachedRowSet object populated
// with that ResultSet object's data.  This is demonstrated
// in the following code fragment, where stmt is a
// Statement object.
// 
//    ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");
//    CachedRowSetImpl crs = new CachedRowSetImpl();
//    crs.populate(rs);
// 
// 
// The object crs now contains the data from the table
// EMPLOYEES, just as the object rs does.
// The difference is that the cursor for crs can be moved
// forward, backward, or to a particular row even if the cursor for
// rs can move only forward.  In addition, crs is
// updatable even if rs is not because by default, a
// CachedRowSet object is both scrollable and updatable.
// 
// In summary, a CachedRowSet object can be thought of as simply
// a disconnected set of rows that are being cached outside of a data source.
// Being thin and serializable, it can easily be sent across a wire,
// and it is well suited to sending data to a thin client. However, a
// CachedRowSet object does have a limitation: It is limited in
// size by the amount of data it can store in memory at one time.
//
// 8.0 Getting Universal Data Access
// Another advantage of the CachedRowSet class is that it makes it
// possible to retrieve and store data from sources other than a relational
// database. The reader for a rowset can be implemented to read and populate
// its rowset with data from any tabular data source, including a spreadsheet
// or flat file.
// Because both a CachedRowSet object and its metadata can be
// created from scratch, a component that acts as a factory for rowsets
// can use this capability to create a rowset containing data from
// non-SQL data sources. Nevertheless, it is expected that most of the time,
// CachedRowSet objects will contain data that was fetched
// from an SQL database using the JDBC API.
//
// 9.0 Setting Properties
// All rowsets maintain a set of properties, which will usually be set using
// a tool.  The number and kinds of properties a rowset has will vary,
// depending on what the rowset does and how it gets its data.  For example,
// rowsets that get their data from a ResultSet object need to
// set the properties that are required for making a database connection.
// If a rowset uses the DriverManager facility to make a
// connection, it needs to set a property for the JDBC URL that identifies
// the appropriate driver, and it needs to set the properties that give the
// user name and password.
// If, on the other hand, the rowset uses a DataSource object
// to make the connection, which is the preferred method, it does not need to
// set the property for the JDBC URL.  Instead, it needs to set
// properties for the logical name of the data source, for the user name,
// and for the password.
// 
// NOTE:  In order to use a DataSource object for making a
// connection, the DataSource object must have been registered
// with a naming service that uses the Java Naming and Directory
// Interface™ (JNDI) API.  This registration
// is usually done by a person acting in the capacity of a system
// administrator.
// 
// In order to be able to populate itself with data from a database, a rowset
// needs to set a command property.  This property is a query that is a
// PreparedStatement object, which allows the query to have
// parameter placeholders that are set at run time, as opposed to design time.
// To set these placeholder parameters with values, a rowset provides
// setter methods for setting values of each data type,
// similar to the setter methods provided by the PreparedStatement
// interface.
// 
// The following code fragment illustrates how the CachedRowSet
// object crs might have its command property set.  Note that if a
// tool is used to set properties, this is the code that the tool would use.
// 
//    crs.setCommand("SELECT FIRST_NAME, LAST_NAME, ADDRESS FROM CUSTOMERS " +
//                   "WHERE CREDIT_LIMIT > ? AND REGION = ?");
//  
// 
// The values that will be used to set the command's placeholder parameters are
// contained in the RowSet object's params field, which is a
// Vector object.
// The CachedRowSet class provides a set of setter
// methods for setting the elements in its params field.  The
// following code fragment demonstrates setting the two parameters in the
// query from the previous example.
// 
//    crs.setInt(1, 5000);
//    crs.setString(2, "West");
// 
// 
// The params field now contains two elements, each of which is
// an array two elements long.  The first element is the parameter number;
// the second is the value to be set.
// In this case, the first element of params is
// 1, 5000, and the second element is 2,
// "West".  When an application calls the method
// execute, it will in turn call on this RowSet object's reader,
// which will in turn invoke its readData method. As part of
// its implementation, readData will get the values in
// params and use them to set the command's placeholder
// parameters.
// The following code fragment gives an idea of how the reader
// does this, after obtaining the Connection object
// con.
// 
//    PreparedStatement pstmt = con.prepareStatement(crs.getCommand());
//    reader.decodeParams();
//    // decodeParams figures out which setter methods to use and does something
//    // like the following:
//    //    for (i = 0; i < params.length; i++) {
//    //        pstmt.setObject(i + 1, params[i]);
//    //    }
// 
// 
// At this point, the command for crs is the query "SELECT
// FIRST_NAME, LAST_NAME, ADDRESS FROM CUSTOMERS WHERE CREDIT_LIMIT > 5000
// AND REGION = "West".  After the readData method executes
// this command with the following line of code, it will have the data from
// rs with which to populate crs.
// 
//     ResultSet rs = pstmt.executeQuery();
// 
// 
// The preceding code fragments give an idea of what goes on behind the
// scenes; they would not appear in an application, which would not invoke
// methods like readData and decodeParams.
// In contrast, the following code fragment shows what an application might do.
// It sets the rowset's command, sets the command's parameters, and executes
// the command. Simply by calling the execute method,
// crs populates itself with the requested data from the
// table CUSTOMERS.
// 
//    crs.setCommand("SELECT FIRST_NAME, LAST_NAME, ADDRESS FROM CUSTOMERS" +
//                   "WHERE CREDIT_LIMIT > ? AND REGION = ?");
//    crs.setInt(1, 5000);
//    crs.setString(2, "West");
//    crs.execute();
// 
//
// 10.0 Paging Data
// Because a CachedRowSet object stores data in memory,
// the amount of data that it can contain at any one
// time is determined by the amount of memory available. To get around this limitation,
// a CachedRowSet object can retrieve data from a ResultSet
// object in chunks of data, called pages. To take advantage of this mechanism,
// an application sets the number of rows to be included in a page using the method
// setPageSize. In other words, if the page size is set to five, a chunk
// of five rows of
// data will be fetched from the data source at one time. An application can also
// optionally set the maximum number of rows that may be fetched at one time.  If the
// maximum number of rows is set to zero, or no maximum number of rows is set, there is
// no limit to the number of rows that may be fetched at a time.
// 
// After properties have been set,
// the CachedRowSet object must be populated with data
// using either the method populate or the method execute.
// The following lines of code demonstrate using the method populate.
// Note that this version of the method takes two parameters, a ResultSet
// handle and the row in the ResultSet object from which to start
// retrieving rows.
// 
//     CachedRowSet crs = new CachedRowSetImpl();
//     crs.setMaxRows(20);
//     crs.setPageSize(4);
//     crs.populate(rsHandle, 10);
// 
// When this code runs, crs will be populated with four rows from
// rsHandle starting with the tenth row.
// 
// The next code fragment shows populating a CachedRowSet object using the
// method execute, which may or may not take a Connection
// object as a parameter.  This code passes execute the Connection
// object conHandle.
// 
// Note that there are two differences between the following code
// fragment and the previous one. First, the method setMaxRows is not
// called, so there is no limit set for the number of rows that crs may contain.
// (Remember that crs always has the overriding limit of how much data it can
// store in memory.) The second difference is that the you cannot pass the method
// execute the number of the row in the ResultSet object
// from which to start retrieving rows. This method always starts with the first row.
// 
//     CachedRowSet crs = new CachedRowSetImpl();
//     crs.setPageSize(5);
//     crs.execute(conHandle);
// 
// After this code has run, crs will contain five rows of data from the
// ResultSet object produced by the command for crs. The writer
// for crs will use conHandle to connect to the data source and
// execute the command for crs. An application is then able to operate on the
// data in crs in the same way that it would operate on data in any other
// CachedRowSet object.
// 
// To access the next page (chunk of data), an application calls the method
// nextPage.  This method creates a new CachedRowSet object
// and fills it with the next page of data.  For example, assume that the
// CachedRowSet object's command returns a ResultSet object
// rs with 1000 rows of data.  If the page size has been set to 100, the first
//  call to the method nextPage will create a CachedRowSet object
// containing the first 100 rows of rs. After doing what it needs to do with the
// data in these first 100 rows, the application can again call the method
// nextPage to create another CachedRowSet object
// with the second 100 rows from rs. The data from the first CachedRowSet
// object will no longer be in memory because it is replaced with the data from the
// second CachedRowSet object. After the tenth call to the method nextPage,
// the tenth CachedRowSet object will contain the last 100 rows of data from
// rs, which are stored in memory. At any given time, the data from only one
// CachedRowSet object is stored in memory.
// 
// The method nextPage returns true as long as the current
// page is not the last page of rows and false when there are no more pages.
// It can therefore be used in a while loop to retrieve all of the pages,
// as is demonstrated in the following lines of code.
// 
//     CachedRowSet crs = CachedRowSetImpl();
//     crs.setPageSize(100);
//     crs.execute(conHandle);
//
//     while(crs.nextPage()) {
//         while(crs.next()) {
//             . . . // operate on chunks (of 100 rows each) in crs,
//                   // row by row
//         }
//     }
// 
// After this code fragment has been run, the application will have traversed all
// 1000 rows, but it will have had no more than 100 rows in memory at a time.
// 
// The CachedRowSet interface also defines the method previousPage.
// Just as the method nextPage is analogous to the ResultSet
// method next, the method previousPage is analogous to
// the ResultSet method previous.  Similar to the method
// nextPage, previousPage creates a CachedRowSet
// object containing the number of rows set as the page size.  So, for instance, the
// method previousPage could be used in a while loop at
// the end of the preceding code fragment to navigate back through the pages from the last
// page to the first page.
// The method previousPage is also similar to nextPage
// in that it can be used in a while
// loop, except that it returns true as long as there is another page
// preceding it and false when there are no more pages ahead of it.
// 
// By positioning the cursor after the last row for each page,
// as is done in the following code fragment, the method previous
// navigates from the last row to the first row in each page.
// The code could also have left the cursor before the first row on each page and then
// used the method next in a while loop to navigate each page
// from the first row to the last row.
// 
// The following code fragment assumes a continuation from the previous code fragment,
// meaning that the cursor for the tenth CachedRowSet object is on the
// last row.  The code moves the cursor to after the last row so that the first
// call to the method previous will put the cursor back on the last row.
// After going through all of the rows in the last page (the CachedRowSet
// object crs), the code then enters
// the while loop to get to the ninth page, go through the rows backwards,
// go to the eighth page, go through the rows backwards, and so on to the first row
// of the first page.
//
// 
//     crs.afterLast();
//     while(crs.previous())  {
//         . . . // navigate through the rows, last to first
//     {
//     while(crs.previousPage())  {
//         crs.afterLast();
//         while(crs.previous())  {
//             . . . // go from the last row to the first row of each page
//         }
//     }
// 
trait CachedRowSet extends RowSet , Joinable {

    @stub
    // Propagates row update, insert and delete changes made to this
    // CachedRowSet object to the underlying data source.
    def acceptChanges(): Unit = ???

    @stub
    // Propagates all row update, insert and delete changes to the
    // data source backing this CachedRowSet object
    // using the specified Connection object to establish a
    // connection to the data source.
    def acceptChanges(con: Connection): Unit = ???

    @stub
    // Indicates whether the designated column in the current row of this
    // CachedRowSet object has been updated.
    def columnUpdated(idx: Int): Boolean = ???

    @stub
    // Indicates whether the designated column in the current row of this
    // CachedRowSet object has been updated.
    def columnUpdated(columnName: String): Boolean = ???

    @stub
    // Each CachedRowSet object's SyncProvider contains
    // a Connection object from the ResultSet or JDBC
    // properties passed to it's constructors.
    def commit(): Unit = ???

    @stub
    // Creates a RowSet object that is a deep copy of the data in
    // this CachedRowSet object.
    def createCopy(): CachedRowSet = ???

    @stub
    // Creates a CachedRowSet object that is a deep copy of
    // this CachedRowSet object's data but is independent of it.
    def createCopyNoConstraints(): CachedRowSet = ???

    @stub
    // Creates a CachedRowSet object that is an empty copy of this
    // CachedRowSet object.
    def createCopySchema(): CachedRowSet = ???

    @stub
    // Returns a new RowSet object backed by the same data as
    // that of this CachedRowSet object.
    def createShared(): RowSet = ???

    @stub
    // Populates this CachedRowSet object with data, using the
    // given connection to produce the result set from which the data will be read.
    def execute(conn: Connection): Unit = ???

    @stub
    // Returns an array containing one or more column numbers indicating the columns
    // that form a key that uniquely
    // identifies a row in this CachedRowSet object.
    def getKeyColumns(): Array[Int] = ???

    @stub
    // Returns a ResultSet object containing the original value of this
    // CachedRowSet object.
    def getOriginal(): ResultSet = ???

    @stub
    // Returns a ResultSet object containing the original value for the
    // current row only of this CachedRowSet object.
    def getOriginalRow(): ResultSet = ???

    @stub
    // Returns the page-size for the CachedRowSet object
    def getPageSize(): Int = ???

    @stub
    // Retrieves the first warning reported by calls on this RowSet object.
    def getRowSetWarnings(): RowSetWarning = ???

    @stub
    // Retrieves a boolean indicating whether rows marked
    // for deletion appear in the set of current rows.
    def getShowDeleted(): Boolean = ???

    @stub
    // Retrieves the SyncProvider implementation for this
    // CachedRowSet object.
    def getSyncProvider(): SyncProvider = ???

    @stub
    // Returns an identifier for the object (table) that was used to
    // create this CachedRowSet object.
    def getTableName(): String = ???

    @stub
    // Increments the current page of the CachedRowSet.
    def nextPage(): Boolean = ???

    @stub
    // Populates this CachedRowSet object with data from
    // the given ResultSet object.
    def populate(data: ResultSet): Unit = ???

    @stub
    // Populates this CachedRowSet object with data from
    // the given ResultSet object.
    def populate(rs: ResultSet, startRow: Int): Unit = ???

    @stub
    // Decrements the current page of the CachedRowSet.
    def previousPage(): Boolean = ???

    @stub
    // Releases the current contents of this CachedRowSet
    // object and sends a rowSetChanged event to all
    // registered listeners.
    def release(): Unit = ???

    @stub
    // Restores this CachedRowSet object to its original
    // value, that is, its value before the last set of changes.
    def restoreOriginal(): Unit = ???

    @stub
    // Each CachedRowSet object's SyncProvider contains
    // a Connection object from the original ResultSet
    // or JDBC properties passed to it.
    def rollback(): Unit = ???

    @stub
    // Each CachedRowSet object's SyncProvider contains
    // a Connection object from the original ResultSet
    // or JDBC properties passed to it.
    def rollback(s: Savepoint): Unit = ???

    @stub
    // Notifies registered listeners that a RowSet object in the given RowSetEvent
    // object has populated a number of additional rows.
    def rowSetPopulated(event: RowSetEvent, numRows: Int): Unit = ???

    @stub
    // Sets this CachedRowSet object's keyCols
    // field with the given array of column numbers, which forms a key
    // for uniquely identifying a row in this CachedRowSet object.
    def setKeyColumns(keys: Array[Int]): Unit = ???

    @stub
    // Sets the metadata for this CachedRowSet object with
    // the given RowSetMetaData object.
    def setMetaData(md: RowSetMetaData): Unit = ???

    @stub
    // Sets the current row in this CachedRowSet object as the original
    // row.
    def setOriginalRow(): Unit = ???

    @stub
    // Sets the CachedRowSet object's page-size.
    def setPageSize(size: Int): Unit = ???

    @stub
    // Sets the property showDeleted to the given
    // boolean value, which determines whether
    // rows marked for deletion appear in the set of current rows.
    def setShowDeleted(b: Boolean): Unit = ???

    @stub
    // Sets the SyncProvider object for this CachedRowSet
    // object to the one specified.
    def setSyncProvider(provider: String): Unit = ???

    @stub
    // Sets the identifier for the table from which this CachedRowSet
    // object was derived to the given table name.
    def setTableName(tabName: String): Unit = ???

    @stub
    // Returns the number of rows in this CachedRowSet
    // object.
    def size(): Int = ???

    @stub
    // Converts this CachedRowSet object to a Collection
    // object that contains all of this CachedRowSet object's data.
    def toCollection(): Collection[_] = ???

    @stub
    // Converts the designated column in this CachedRowSet object
    // to a Collection object.
    def toCollection(column: Int): Collection[_] = ???

    @stub
    // Converts the designated column in this CachedRowSet object
    // to a Collection object.
    def toCollection(column: String): Collection[_] = ???

    @stub
    // Cancels the deletion of the current row and notifies listeners that
    // a row has changed.
    def undoDelete(): Unit = ???

    @stub
    // Immediately removes the current row from this CachedRowSet
    // object if the row has been inserted, and also notifies listeners that a
    // row has changed.
    def undoInsert(): Unit = ???
}
