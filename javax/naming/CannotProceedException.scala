package javax.naming

import java.lang.{Exception, Object, Throwable}
import java.util.Hashtable

/** This exception is thrown to indicate that the operation reached
 *  a point in the name where the operation cannot proceed any further.
 *  When performing an operation on a composite name, a naming service
 *  provider may reach a part of the name that does not belong to its
 *  namespace.  At that point, it can construct a
 *  CannotProceedException and then invoke methods provided by
 *  javax.naming.spi.NamingManager (such as getContinuationContext())
 *  to locate another provider to continue the operation.  If this is
 *  not possible, this exception is raised to the caller of the
 *  context operation.
 * 
 *  If the program wants to handle this exception in particular, it
 *  should catch CannotProceedException explicitly before attempting to
 *  catch NamingException.
 * 
 *  A CannotProceedException instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  CannotProceedException should lock the object.
 */
class CannotProceedException extends NamingException {

    /** Constructs a new instance of CannotProceedException. */
    @stub
    def this() = ???

    /** Contains the name of the resolved object, relative
     *  to the context altNameCtx.
     */
    @stub
    protected val altName: Name = ???

    /** Contains the context relative to which
     *  altName is specified.
     */
    @stub
    protected val altNameCtx: Context = ???

    /** Contains the environment
     *  relevant for the Context or DirContext method that cannot proceed.
     */
    @stub
    protected val environment: Hashtable[_, _] = ???

    /** Retrieves the altName field of this exception. */
    @stub
    def getAltName(): Name = ???

    /** Retrieves the altNameCtx field of this exception. */
    @stub
    def getAltNameCtx(): Context = ???

    /** Retrieves the environment that was in effect when this exception
     *  was created.
     */
    @stub
    def getEnvironment(): Hashtable[_, _] = ???

    /** Retrieves the "remaining new name" field of this exception, which is
     *  used when this exception is thrown during a rename() operation.
     */
    @stub
    def getRemainingNewName(): Name = ???

    /** Sets the altName field of this exception. */
    @stub
    def setAltName(altName: Name): Unit = ???

    /** Sets the altNameCtx field of this exception. */
    @stub
    def setAltNameCtx(altNameCtx: Context): Unit = ???

    /** Sets the environment that will be returned when getEnvironment()
     *  is called.
     */
    @stub
    def setEnvironment(environment: Hashtable[_, _]): Unit = ???
}
