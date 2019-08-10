package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is used to describe problems encounter while resolving links.
 *  Addition information is added to the base NamingException for pinpointing
 *  the problem with the link.
 * 
 *  Analogous to how NamingException captures name resolution information,
 *  LinkException captures "link"-name resolution information pinpointing
 *  the problem encountered while resolving a link. All these fields may
 *  be null.
 *  
 *   Link Resolved Name. Portion of link name that has been resolved.
 *   Link Resolved Object. Object to which resolution of link name proceeded.
 *   Link Remaining Name. Portion of link name that has not been resolved.
 *   Link Explanation. Detail explaining why link resolution failed.
 * 
 * 
 * 
 *  A LinkException instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single LinkException instance should lock the object.
 */
class LinkException extends NamingException {

    /** Constructs a new instance of LinkException. */
    @stub
    def this() = ???

    /** Constructs a new instance of LinkException with an explanation
     *  All the other fields are initialized to null.
     */
    @stub
    def this(explanation: String) = ???

    /** Contains the exception of why resolution of the link failed. */
    @stub
    protected val linkExplanation: String = ???

    /** Contains the remaining link name that has not been resolved yet. */
    @stub
    protected val linkRemainingName: Name = ???

    /** Contains the part of the link that has been successfully resolved. */
    @stub
    protected val linkResolvedName: Name = ???

    /** Contains the object to which resolution of the part of the link was successful. */
    @stub
    protected val linkResolvedObj: Any = ???

    /** Retrieves the explanation associated with the problem encounter
     *  when resolving a link.
     */
    @stub
    def getLinkExplanation(): String = ???

    /** Retrieves the remaining unresolved portion of the link name. */
    @stub
    def getLinkRemainingName(): Name = ???

    /** Retrieves the leading portion of the link name that was resolved
     *  successfully.
     */
    @stub
    def getLinkResolvedName(): Name = ???

    /** Retrieves the object to which resolution was successful. */
    @stub
    def getLinkResolvedObj(): Any = ???

    /** Sets the explanation associated with the problem encounter
     *  when resolving a link.
     */
    @stub
    def setLinkExplanation(msg: String): Unit = ???

    /** Sets the remaining link name field of this exception. */
    @stub
    def setLinkRemainingName(name: Name): Unit = ???

    /** Sets the resolved link name field of this exception. */
    @stub
    def setLinkResolvedName(name: Name): Unit = ???

    /** Sets the link resolved object field of this exception. */
    @stub
    def setLinkResolvedObj(obj: Any): Unit = ???

    /** Generates the string representation of this exception. */
    @stub
    def toString(): String = ???

    /** Generates the string representation of this exception. */
    @stub
    def toString(detail: Boolean): String = ???
}
