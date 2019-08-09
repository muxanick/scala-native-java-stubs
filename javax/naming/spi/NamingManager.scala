package javax.naming.spi

import java.lang.{Object, String}
import java.util.Hashtable
import javax.naming.{CannotProceedException, Context, Name}

/** This class contains methods for creating context objects
 *  and objects referred to by location information in the naming
 *  or directory service.
 * 
 *  This class cannot be instantiated.  It has only static methods.
 * 
 *  The mention of URL in the documentation for this class refers to
 *  a URL string as defined by RFC 1738 and its related RFCs. It is
 *  any string that conforms to the syntax described therein, and
 *  may not always have corresponding support in the java.net.URL
 *  class or Web browsers.
 * 
 *  NamingManager is safe for concurrent access by multiple threads.
 * 
 *  Except as otherwise noted,
 *  a Name or environment parameter
 *  passed to any method is owned by the caller.
 *  The implementation will not modify the object or keep a reference
 *  to it, although it may keep a reference to a clone or copy.
 */
class NamingManager extends Object {
}

object NamingManager {
    /** Creates a context in which to continue a context operation. */
    @stub
    def getContinuationContext(cpe: CannotProceedException): Context = ???

    /** Creates an initial context using the specified environment
     *  properties.
     */
    @stub
    def getInitialContext(env: Hashtable[_, _]): Context = ???

    /** Creates an instance of an object for the specified object
     *  and environment.
     */
    @stub
    def getObjectInstance(refInfo: Object, name: Name, nameCtx: Context, environment: Hashtable[_, _]): Object = ???

    /** Retrieves the state of an object for binding. */
    @stub
    def getStateToBind(obj: Object, name: Name, nameCtx: Context, environment: Hashtable[_, _]): Object = ???

    /** Creates a context for the given URL scheme id. */
    @stub
    def getURLContext(scheme: String, environment: Hashtable[_, _]): Context = ???

    /** Determines whether an initial context factory builder has
     *  been set.
     */
    @stub
    def hasInitialContextFactoryBuilder(): Boolean = ???

    /** Sets the InitialContextFactory builder to be builder. */
    @stub
    def setInitialContextFactoryBuilder(builder: InitialContextFactoryBuilder): Unit = ???
}
