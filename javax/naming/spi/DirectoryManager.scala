package javax.naming.spi

import java.lang.Object
import java.util.Hashtable
import javax.naming.{CannotProceedException, Context, Name}
import javax.naming.directory.{Attributes, DirContext}
import scala.scalanative.annotation.stub

/** This class contains methods for supporting DirContext
 *  implementations.
 * 
 *  This class is an extension of NamingManager.  It contains methods
 *  for use by service providers for accessing object factories and
 *  state factories, and for getting continuation contexts for
 *  supporting federation.
 * 
 *  DirectoryManager is safe for concurrent access by multiple threads.
 * 
 *  Except as otherwise noted,
 *  a Name, Attributes, or environment parameter
 *  passed to any method is owned by the caller.
 *  The implementation will not modify the object or keep a reference
 *  to it, although it may keep a reference to a clone or copy.
 */
class DirectoryManager extends NamingManager {
}

object DirectoryManager {
    /** Creates a context in which to continue a DirContext operation. */
    @stub
    def getContinuationDirContext(cpe: CannotProceedException): DirContext = ???

    /** Creates an instance of an object for the specified object,
     *  attributes, and environment.
     */
    @stub
    def getObjectInstance(refInfo: Object, name: Name, nameCtx: Context, environment: Hashtable[_, _], attrs: Attributes): Object = ???

    /** Retrieves the state of an object for binding when given the original
     *  object and its attributes.
     */
    @stub
    def getStateToBind(obj: Object, name: Name, nameCtx: Context, environment: Hashtable[_, _], attrs: Attributes): DirStateFactory.Result = ???
}
