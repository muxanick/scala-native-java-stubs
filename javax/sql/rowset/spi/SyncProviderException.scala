package javax.sql.rowset.spi

import java.lang.{Exception, Object, String, Throwable}
import java.sql.SQLException
import scala.scalanative.annotation.stub

/** Indicates an error with the SyncProvider mechanism. This exception
 *  is created by a SyncProvider abstract class extension if it
 *  encounters violations in reading from or writing to the originating data source.
 *  
 *  If it is implemented to do so, the SyncProvider object may also create a
 *  SyncResolver object and either initialize the SyncProviderException
 *  object with it at construction time or set it with the SyncProvider object at
 *  a later time.
 *  
 *  The method acceptChanges will throw this exception after the writer
 *  has finished checking for conflicts and has found one or more conflicts. An
 *  application may catch a SyncProviderException object and call its
 *  getSyncResolver method to get its SyncResolver object.
 *  See the code fragment in the interface comment for
 *  SyncResolver for an example.
 *  This SyncResolver object will mirror the RowSet
 *  object that generated the exception, except that it will contain only the values
 *  from the data source that are in conflict.  All other values in the SyncResolver
 *  object will be null.
 *  
 *  The SyncResolver object may be used to examine and resolve
 *  each conflict in a row and then go to the next row with a conflict to
 *  repeat the procedure.
 *  
 *  A SyncProviderException object may or may not contain a description of the
 *  condition causing the exception.  The inherited method getMessage may be
 *  called to retrieve the description if there is one.
 */
class SyncProviderException extends SQLException {

    /** Creates a new SyncProviderException object without a detail message. */
    @stub
    def this() = ???

    /** Constructs a SyncProviderException object with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???

    /** Constructs a SyncProviderException object with the specified
     *  SyncResolver instance.
     */
    @stub
    def this(syncResolver: SyncResolver) = ???

    /** Retrieves the SyncResolver object that has been set for
     *  this SyncProviderException object, or
     *  if none has been set, an instance of the default SyncResolver
     *  implementation included in the reference implementation.
     */
    @stub
    def getSyncResolver(): SyncResolver = ???

    /** Sets the SyncResolver object for this
     *  SyncProviderException object to the one supplied.
     */
    @stub
    def setSyncResolver(syncResolver: SyncResolver): Unit = ???
}
