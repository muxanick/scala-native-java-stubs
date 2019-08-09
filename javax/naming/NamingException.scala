package javax.naming

import java.lang.{Exception, Object, String, Throwable}

// This is the superclass of all exceptions thrown by
// operations in the Context and DirContext interfaces.
// The nature of the failure is described by the name of the subclass.
// This exception captures the information pinpointing where the operation
// failed, such as where resolution last proceeded to.
// 
//  Resolved Name. Portion of name that has been resolved.
//  Resolved Object. Object to which resolution of name proceeded.
//  Remaining Name. Portion of name that has not been resolved.
//  Explanation. Detail explaining why name resolution failed.
//  Root Exception. The exception that caused this naming exception
//                     to be thrown.
//
// null is an acceptable value for any of these fields. When null,
// it means that no such information has been recorded for that field.
//
// A NamingException instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single NamingException instance should lock the object.
//
// This exception has been retrofitted to conform to
// the general purpose exception-chaining mechanism.  The
// root exception (or root cause) is the same object as the
// cause returned by the Throwable.getCause() method.
class NamingException extends Exception {

    @stub
    // Constructs a new NamingException.
    def this() = ???

    @stub
    // Contains the remaining name that has not been resolved yet.
    protected def remainingName: Name = ???

    @stub
    // Contains the part of the name that has been successfully resolved.
    protected def resolvedName: Name = ???

    @stub
    // Contains the object to which resolution of the part of the name was
    // successful.
    protected def resolvedObj: Object = ???

    @stub
    // Add name as the last component in remaining name.
    def appendRemainingComponent(name: String): Unit = ???

    @stub
    // Add components from 'name' as the last components in
    // remaining name.
    def appendRemainingName(name: Name): Unit = ???

    @stub
    // Returns the cause of this exception.
    def getCause(): Throwable = ???

    @stub
    // Retrieves the explanation associated with this exception.
    def getExplanation(): String = ???

    @stub
    // Retrieves the remaining unresolved portion of the name.
    def getRemainingName(): Name = ???

    @stub
    // Retrieves the leading portion of the name that was resolved
    // successfully.
    def getResolvedName(): Name = ???

    @stub
    // Retrieves the object to which resolution was successful.
    def getResolvedObj(): Object = ???

    @stub
    // Retrieves the root cause of this NamingException, if any.
    def getRootCause(): Throwable = ???

    @stub
    // Initializes the cause of this exception to the specified value.
    def initCause(cause: Throwable): Throwable = ???

    @stub
    // Sets the remaining name field of this exception.
    def setRemainingName(name: Name): Unit = ???

    @stub
    // Sets the resolved name field of this exception.
    def setResolvedName(name: Name): Unit = ???

    @stub
    // Sets the resolved object field of this exception.
    def setResolvedObj(obj: Object): Unit = ???

    @stub
    // Records the root cause of this NamingException.
    def setRootCause(e: Throwable): Unit = ???

    @stub
    // Generates the string representation of this exception.
    def toString(): String = ???
}
