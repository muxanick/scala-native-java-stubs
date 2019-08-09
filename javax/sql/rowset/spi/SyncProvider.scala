package javax.sql.rowset.spi

import java.lang.{Object, String}
import javax.sql.{RowSetReader, RowSetWriter}

/** The synchronization mechanism that provides reader/writer capabilities for
 *  disconnected RowSet objects.
 *  A SyncProvider implementation is a class that extends the
 *  SyncProvider abstract class.
 *  
 *  A SyncProvider implementation is
 *  identified by a unique ID, which is its fully qualified class name.
 *  This name must be registered with the
 *  SyncFactory SPI, thus making the implementation available to
 *  all RowSet implementations.
 *  The factory mechanism in the reference implementation uses this name to instantiate
 *  the implementation, which can then provide a RowSet object with its
 *  reader (a javax.sql.RowSetReader object) and its writer (a
 *  javax.sql.RowSetWriter object).
 *  
 *  The Jdbc RowSet Implementations specification provides two
 *  reference implementations of the SyncProvider abstract class:
 *  RIOptimisticProvider and RIXMLProvider.
 *  The RIOptimisticProvider can set any RowSet
 *  implementation with a RowSetReader object and a
 *  RowSetWriter object.  However, only the RIXMLProvider
 *  implementation can set an XmlReader object and an
 *  XmlWriter object. A WebRowSet object uses the
 *  XmlReader object to read data in XML format to populate itself with that
 *  data.  It uses the XmlWriter object to write itself to a stream or
 *  java.io.Writer object in XML format.
 * 
 *  1.0 Naming Convention for Implementations
 *  As a guide  to naming SyncProvider
 *  implementations, the following should be noted:
 *  
 *  The name for a SyncProvider implementation
 *  is its fully qualified class name.
 *  It is recommended that vendors supply a
 *  SyncProvider implementation in a package named providers.
 *  
 *  
 *  For instance, if a vendor named Fred, Inc. offered a
 *  SyncProvider implementation, you could have the following:
 *  
 *      Vendor name:  Fred, Inc.
 *      Domain name of vendor:  com.fred
 *      Package name:  com.fred.providers
 *      SyncProvider implementation class name:  HighAvailabilityProvider
 * 
 *      Fully qualified class name of SyncProvider implementation:
 *                         com.fred.providers.HighAvailabilityProvider
 *  
 *  
 *  The following line of code uses the fully qualified name to register
 *  this implementation with the SyncFactory static instance.
 *  
 *      SyncFactory.registerProvider(
 *                           "com.fred.providers.HighAvailabilityProvider");
 *  
 *  
 *  The default SyncProvider object provided with the reference
 *  implementation uses the following name:
 *  
 *      com.sun.rowset.providers.RIOptimisticProvider
 *  
 *  
 *  A vendor can register a SyncProvider implementation class name
 *  with Oracle Corporation by sending email to jdbc@sun.com.
 *  Oracle will maintain a database listing the
 *  available SyncProvider implementations for use with compliant
 *  RowSet implementations.  This database will be similar to the
 *  one already maintained to list available JDBC drivers.
 *  
 *  Vendors should refer to the reference implementation synchronization
 *  providers for additional guidance on how to implement a new
 *  SyncProvider implementation.
 * 
 *  2.0 How a RowSet Object Gets Its Provider
 * 
 *  A disconnected Rowset object may get access to a
 *  SyncProvider object in one of the following two ways:
 *  
 *   Using a constructor
 *       
 *        CachedRowSet crs = new CachedRowSet(
 *                   "com.fred.providers.HighAvailabilitySyncProvider");
 *       
 *   Using the setSyncProvider method
 *       
 *        CachedRowSet crs = new CachedRowSet();
 *        crs.setSyncProvider("com.fred.providers.HighAvailabilitySyncProvider");
 *       
 * 
 *  
 *  
 *  By default, the reference implementations of the RowSet synchronization
 *  providers are always available to the Java platform.
 *  If no other pluggable synchronization providers have been correctly
 *  registered, the SyncFactory will automatically generate
 *  an instance of the default SyncProvider reference implementation.
 *  Thus, in the preceding code fragment, if no implementation named
 *  com.fred.providers.HighAvailabilitySyncProvider has been
 *  registered with the SyncFactory instance, crs will be
 *  assigned the default provider in the reference implementation, which is
 *  com.sun.rowset.providers.RIOptimisticProvider.
 * 
 *  3.0 Violations and Synchronization Issues
 *  If an update between a disconnected RowSet object
 *  and a data source violates
 *  the original query or the underlying data source constraints, this will
 *  result in undefined behavior for all disconnected RowSet implementations
 *  and their designated SyncProvider implementations.
 *  Not defining the behavior when such violations occur offers greater flexibility
 *  for a SyncProvider
 *  implementation to determine its own best course of action.
 *  
 *  A SyncProvider implementation
 *  may choose to implement a specific handler to
 *  handle a subset of query violations.
 *  However if an original query violation or a more general data source constraint
 *  violation is not handled by the SyncProvider implementation,
 *  all SyncProvider
 *  objects must throw a SyncProviderException.
 * 
 *  4.0 Updatable SQL VIEWs
 *  It is possible for any disconnected or connected RowSet object to be populated
 *  from an SQL query that is formulated originally from an SQL VIEW.
 *  While in many cases it is possible for an update to be performed to an
 *  underlying view, such an update requires additional metadata, which may vary.
 *  The SyncProvider class provides two constants to indicate whether
 *  an implementation supports updating an SQL VIEW.
 *  
 *  NONUPDATABLE_VIEW_SYNC - Indicates that a SyncProvider
 *  implementation does not support synchronization with an SQL VIEW as the
 *  underlying source of data for the RowSet object.
 *  UPDATABLE_VIEW_SYNC - Indicates that a
 *  SyncProvider implementation
 *  supports synchronization with an SQL VIEW as the underlying source
 *  of data.
 *  
 *  
 *  The default is for a RowSet object not to be updatable if it was
 *  populated with data from an SQL VIEW.
 * 
 *  5.0 SyncProvider Constants
 *  The SyncProvider class provides three sets of constants that
 *  are used as return values or parameters for SyncProvider methods.
 *  SyncProvider objects may be implemented to perform synchronization
 *  between a RowSet object and its underlying data source with varying
 *  degrees of of care. The first group of constants indicate how synchronization
 *  is handled. For example, GRADE_NONE indicates that a
 *  SyncProvider object will not take any care to see what data is
 *  valid and will simply write the RowSet data to the data source.
 *  GRADE_MODIFIED_AT_COMMIT indicates that the provider will check
 *  only modified data for validity.  Other grades check all data for validity
 *  or set locks when data is modified or loaded.
 *  
 *   Constants to indicate the synchronization grade of a
 *      SyncProvider object
 *    
 *     SyncProvider.GRADE_NONE
 *     SyncProvider.GRADE_MODIFIED_AT_COMMIT
 *     SyncProvider.GRADE_CHECK_ALL_AT_COMMIT
 *     SyncProvider.GRADE_LOCK_WHEN_MODIFIED
 *     SyncProvider.GRADE_LOCK_WHEN_LOADED
 *    
 *   Constants to indicate what locks are set on the data source
 *    
 *      SyncProvider.DATASOURCE_NO_LOCK
 *      SyncProvider.DATASOURCE_ROW_LOCK
 *      SyncProvider.DATASOURCE_TABLE_LOCK
 *      SyncProvider.DATASOURCE_DB_LOCK
 *    
 *   Constants to indicate whether a SyncProvider object can
 *        perform updates to an SQL VIEW 
 *        These constants are explained in the preceding section (4.0).
 *    
 *      SyncProvider.UPDATABLE_VIEW_SYNC
 *      SyncProvider.NONUPDATABLE_VIEW_SYNC
 *    
 *  
 */
abstract class SyncProvider extends Object {

    /** Returns the current data source lock severity level active in this
     *  SyncProvider implementation.
     */
    def getDataSourceLock(): Int

    /** Returns a constant indicating the
     *  grade of synchronization a RowSet object can expect from
     *  this SyncProvider object.
     */
    def getProviderGrade(): Int

    /** Returns the unique identifier for this SyncProvider object. */
    def getProviderID(): String

    /** Returns a javax.sql.RowSetReader object, which can be used to
     *  populate a RowSet object with data.
     */
    def getRowSetReader(): RowSetReader

    /** Returns a javax.sql.RowSetWriter object, which can be
     *  used to write a RowSet object's data back to the
     *  underlying data source.
     */
    def getRowSetWriter(): RowSetWriter

    /** Returns the vendor name of this SyncProvider instance */
    def getVendor(): String

    /** Returns the release version of this SyncProvider instance. */
    def getVersion(): String

    /** Sets a lock on the underlying data source at the level indicated by
     *  datasource_lock.
     */
    def setDataSourceLock(datasource_lock: Int): Unit
}

object SyncProvider {
    /** Indicates that a lock is placed on the entire data source that is the source of
     *  data for the RowSet object
     *  that is using this SyncProvider object.
     */
    @stub
    val DATASOURCE_DB_LOCK: Int = ???

    /** Indicates that no locks remain on the originating data source. */
    @stub
    val DATASOURCE_NO_LOCK: Int = ???

    /** Indicates that a lock is placed on the rows that are touched by the original
     *  SQL statement used to populate the RowSet object
     *  that is using this SyncProvider object.
     */
    @stub
    val DATASOURCE_ROW_LOCK: Int = ???

    /** Indicates that a lock is placed on all tables that are touched by the original
     *  SQL statement used to populate the RowSet object
     *  that is using this SyncProvider object.
     */
    @stub
    val DATASOURCE_TABLE_LOCK: Int = ???

    /** Indicates a high level optimistic synchronization grade with
     *  respect to the originating data source.
     */
    @stub
    val GRADE_CHECK_ALL_AT_COMMIT: Int = ???

    /** Indicates a low level optimistic synchronization grade with
     *  respect to the originating data source.
     */
    @stub
    val GRADE_CHECK_MODIFIED_AT_COMMIT: Int = ???

    /** Indicates the most pessimistic synchronization grade with
     *  respect to the originating
     *  data source.
     */
    @stub
    val GRADE_LOCK_WHEN_LOADED: Int = ???

    /** Indicates a pessimistic synchronization grade with
     *  respect to the originating data source.
     */
    @stub
    val GRADE_LOCK_WHEN_MODIFIED: Int = ???

    /** Indicates that no synchronization with the originating data source is
     *  provided.
     */
    @stub
    val GRADE_NONE: Int = ???

    /** Indicates that a SyncProvider implementation
     *  does not support synchronization between a RowSet
     *  object and the SQL VIEW used to populate it.
     */
    @stub
    val NONUPDATABLE_VIEW_SYNC: Int = ???
}
