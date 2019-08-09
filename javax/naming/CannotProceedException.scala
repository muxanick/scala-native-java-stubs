package javax.naming

import java.lang.{Exception, Object, Throwable}
import java.util.Hashtable

// This exception is thrown to indicate that the operation reached
// a point in the name where the operation cannot proceed any further.
// When performing an operation on a composite name, a naming service
// provider may reach a part of the name that does not belong to its
// namespace.  At that point, it can construct a
// CannotProceedException and then invoke methods provided by
// javax.naming.spi.NamingManager (such as getContinuationContext())
// to locate another provider to continue the operation.  If this is
// not possible, this exception is raised to the caller of the
// context operation.
//
// If the program wants to handle this exception in particular, it
// should catch CannotProceedException explicitly before attempting to
// catch NamingException.
//
// A CannotProceedException instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// CannotProceedException should lock the object.
class CannotProceedException extends NamingException {

    @stub
    // Constructs a new instance of CannotProceedException.
    def this() = ???

    @stub
    // Contains the name of the resolved object, relative
    // to the context altNameCtx.
    protected def altName: Name = ???

    @stub
    // Contains the context relative to which
    // altName is specified.
    protected def altNameCtx: Context = ???

    @stub
    // Contains the environment
    // relevant for the Context or DirContext method that cannot proceed.
    protected def environment: Hashtable[_, _] = ???

    @stub
    // Retrieves the altName field of this exception.
    def getAltName(): Name = ???

    @stub
    // Retrieves the altNameCtx field of this exception.
    def getAltNameCtx(): Context = ???

    @stub
    // Retrieves the environment that was in effect when this exception
    // was created.
    def getEnvironment(): Hashtable[_, _] = ???

    @stub
    // Retrieves the "remaining new name" field of this exception, which is
    // used when this exception is thrown during a rename() operation.
    def getRemainingNewName(): Name = ???

    @stub
    // Sets the altName field of this exception.
    def setAltName(altName: Name): Unit = ???

    @stub
    // Sets the altNameCtx field of this exception.
    def setAltNameCtx(altNameCtx: Context): Unit = ???

    @stub
    // Sets the environment that will be returned when getEnvironment()
    // is called.
    def setEnvironment(environment: Hashtable[_, _]): Unit = ???
}
