package javax.naming.spi

import java.io.Serializable
import java.lang.{Object, String}
import javax.naming.Name

// This class represents the result of resolution of a name.
// It contains the object to which name was resolved, and the portion
// of the name that has not been resolved.
//
// A ResolveResult instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single ResolveResult instance should lock the object.
class ResolveResult extends Object with Serializable {

    @stub
    // Constructs an instance of ResolveResult with the
    // resolved object and remaining name both initialized to null.
    protected def this() = ???

    @stub
    // Constructs a new instance of ResolveResult consisting of
    // the resolved Object and the remaining name.
    def this(robj: Object, rname: Name) = ???

    @stub
    // Field containing the remaining name yet to be resolved.
    protected def remainingName: Name = ???

    @stub
    // Adds a single component to the end of remaining name.
    def appendRemainingComponent(name: String): Unit = ???

    @stub
    // Adds components to the end of remaining name.
    def appendRemainingName(name: Name): Unit = ???

    @stub
    // Retrieves the remaining unresolved portion of the name.
    def getRemainingName(): Name = ???

    @stub
    // Retrieves the Object to which resolution was successful.
    def getResolvedObj(): Object = ???

    @stub
    // Sets the remaining name field of this result to name.
    def setRemainingName(name: Name): Unit = ???
}
