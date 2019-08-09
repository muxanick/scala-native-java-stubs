package javax.naming.spi

import java.io.Serializable
import java.lang.{Object, String}
import javax.naming.Name
import scala.scalanative.annotation.stub

/** This class represents the result of resolution of a name.
 *  It contains the object to which name was resolved, and the portion
 *  of the name that has not been resolved.
 * 
 *  A ResolveResult instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single ResolveResult instance should lock the object.
 */
class ResolveResult extends Object with Serializable {

    /** Constructs an instance of ResolveResult with the
     *  resolved object and remaining name both initialized to null.
     */
    @stub
    protected def this() = ???

    /** Constructs a new instance of ResolveResult consisting of
     *  the resolved Object and the remaining name.
     */
    @stub
    def this(robj: Object, rname: Name) = ???

    /** Constructs a new instance of ResolveResult consisting of
     *  the resolved object and the remaining unresolved component.
     */
    @stub
    def this(robj: Object, rcomp: String) = ???

    /** Field containing the remaining name yet to be resolved. */
    @stub
    protected val remainingName: Name = ???

    /** Field containing the Object that was resolved to successfully. */
    @stub
    protected val resolvedObj: Object = ???

    /** Adds a single component to the end of remaining name. */
    @stub
    def appendRemainingComponent(name: String): Unit = ???

    /** Adds components to the end of remaining name. */
    @stub
    def appendRemainingName(name: Name): Unit = ???

    /** Retrieves the remaining unresolved portion of the name. */
    @stub
    def getRemainingName(): Name = ???

    /** Retrieves the Object to which resolution was successful. */
    @stub
    def getResolvedObj(): Object = ???

    /** Sets the remaining name field of this result to name. */
    @stub
    def setRemainingName(name: Name): Unit = ???

    /** Sets the resolved Object field of this result to obj. */
    @stub
    def setResolvedObj(obj: Object): Unit = ???
}
