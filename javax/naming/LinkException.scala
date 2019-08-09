package javax.naming

import java.lang.{Exception, Object, String, Throwable}

// This exception is used to describe problems encounter while resolving links.
// Addition information is added to the base NamingException for pinpointing
// the problem with the link.
//
// Analogous to how NamingException captures name resolution information,
// LinkException captures "link"-name resolution information pinpointing
// the problem encountered while resolving a link. All these fields may
// be null.
// 
//  Link Resolved Name. Portion of link name that has been resolved.
//  Link Resolved Object. Object to which resolution of link name proceeded.
//  Link Remaining Name. Portion of link name that has not been resolved.
//  Link Explanation. Detail explaining why link resolution failed.
//
//
//
// A LinkException instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single LinkException instance should lock the object.
class LinkException extends NamingException {

    @stub
    // Constructs a new instance of LinkException.
    def this() = ???

    @stub
    // Contains the exception of why resolution of the link failed.
    protected def linkExplanation: String = ???

    @stub
    // Contains the remaining link name that has not been resolved yet.
    protected def linkRemainingName: Name = ???

    @stub
    // Contains the part of the link that has been successfully resolved.
    protected def linkResolvedName: Name = ???

    @stub
    // Retrieves the explanation associated with the problem encounter
    // when resolving a link.
    def getLinkExplanation(): String = ???

    @stub
    // Retrieves the remaining unresolved portion of the link name.
    def getLinkRemainingName(): Name = ???

    @stub
    // Retrieves the leading portion of the link name that was resolved
    // successfully.
    def getLinkResolvedName(): Name = ???

    @stub
    // Retrieves the object to which resolution was successful.
    def getLinkResolvedObj(): Object = ???

    @stub
    // Sets the explanation associated with the problem encounter
    // when resolving a link.
    def setLinkExplanation(msg: String): Unit = ???

    @stub
    // Sets the remaining link name field of this exception.
    def setLinkRemainingName(name: Name): Unit = ???

    @stub
    // Sets the resolved link name field of this exception.
    def setLinkResolvedName(name: Name): Unit = ???

    @stub
    // Sets the link resolved object field of this exception.
    def setLinkResolvedObj(obj: Object): Unit = ???

    @stub
    // Generates the string representation of this exception.
    def toString(): String = ???
}
