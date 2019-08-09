package javax.naming.spi

import java.lang.{Object, String}
import java.util.Hashtable
import javax.naming.{CannotProceedException, Context, Name}

// This class contains methods for creating context objects
// and objects referred to by location information in the naming
// or directory service.
//
// This class cannot be instantiated.  It has only static methods.
//
// The mention of URL in the documentation for this class refers to
// a URL string as defined by RFC 1738 and its related RFCs. It is
// any string that conforms to the syntax described therein, and
// may not always have corresponding support in the java.net.URL
// class or Web browsers.
//
// NamingManager is safe for concurrent access by multiple threads.
//
// Except as otherwise noted,
// a Name or environment parameter
// passed to any method is owned by the caller.
// The implementation will not modify the object or keep a reference
// to it, although it may keep a reference to a clone or copy.
class NamingManager extends Object {
}

object NamingManager {
    @stub
    // Creates a context in which to continue a context operation.
    def getContinuationContext(cpe: CannotProceedException): Context = ???

    @stub
    // Creates an initial context using the specified environment
    // properties.
    def getInitialContext(env: Hashtable[_, _]): Context = ???

    @stub
    // Creates an instance of an object for the specified object
    // and environment.
    def getObjectInstance(refInfo: Object, name: Name, nameCtx: Context, environment: Hashtable[_, _]): Object = ???

    @stub
    // Retrieves the state of an object for binding.
    def getStateToBind(obj: Object, name: Name, nameCtx: Context, environment: Hashtable[_, _]): Object = ???

    @stub
    // Creates a context for the given URL scheme id.
    def getURLContext(scheme: String, environment: Hashtable[_, _]): Context = ???

    @stub
    // Determines whether an initial context factory builder has
    // been set.
    def hasInitialContextFactoryBuilder(): Boolean = ???

    @stub
    // Sets the InitialContextFactory builder to be builder.
    def setInitialContextFactoryBuilder(builder: InitialContextFactoryBuilder): Unit = ???
}
