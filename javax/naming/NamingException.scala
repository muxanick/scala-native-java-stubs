package javax.naming

import java.lang.{Exception, Object, String, Throwable}

/** This is the superclass of all exceptions thrown by
 *  operations in the Context and DirContext interfaces.
 *  The nature of the failure is described by the name of the subclass.
 *  This exception captures the information pinpointing where the operation
 *  failed, such as where resolution last proceeded to.
 *  
 *   Resolved Name. Portion of name that has been resolved.
 *   Resolved Object. Object to which resolution of name proceeded.
 *   Remaining Name. Portion of name that has not been resolved.
 *   Explanation. Detail explaining why name resolution failed.
 *   Root Exception. The exception that caused this naming exception
 *                      to be thrown.
 * 
 *  null is an acceptable value for any of these fields. When null,
 *  it means that no such information has been recorded for that field.
 * 
 *  A NamingException instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single NamingException instance should lock the object.
 * 
 *  This exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The
 *  root exception (or root cause) is the same object as the
 *  cause returned by the Throwable.getCause() method.
 */
class NamingException extends Exception {

    /** Constructs a new NamingException. */
    @stub
    def this() = ???

    /** Contains the remaining name that has not been resolved yet. */
    @stub
    protected val remainingName: Name = ???

    /** Contains the part of the name that has been successfully resolved. */
    @stub
    protected val resolvedName: Name = ???

    /** Contains the object to which resolution of the part of the name was
     *  successful.
     */
    @stub
    protected val resolvedObj: Object = ???

    /** Add name as the last component in remaining name. */
    @stub
    def appendRemainingComponent(name: String): Unit = ???

    /** Add components from 'name' as the last components in
     *  remaining name.
     */
    @stub
    def appendRemainingName(name: Name): Unit = ???

    /** Returns the cause of this exception. */
    @stub
    def getCause(): Throwable = ???

    /** Retrieves the explanation associated with this exception. */
    @stub
    def getExplanation(): String = ???

    /** Retrieves the remaining unresolved portion of the name. */
    @stub
    def getRemainingName(): Name = ???

    /** Retrieves the leading portion of the name that was resolved
     *  successfully.
     */
    @stub
    def getResolvedName(): Name = ???

    /** Retrieves the object to which resolution was successful. */
    @stub
    def getResolvedObj(): Object = ???

    /** Retrieves the root cause of this NamingException, if any. */
    @stub
    def getRootCause(): Throwable = ???

    /** Initializes the cause of this exception to the specified value. */
    @stub
    def initCause(cause: Throwable): Throwable = ???

    /** Sets the remaining name field of this exception. */
    @stub
    def setRemainingName(name: Name): Unit = ???

    /** Sets the resolved name field of this exception. */
    @stub
    def setResolvedName(name: Name): Unit = ???

    /** Sets the resolved object field of this exception. */
    @stub
    def setResolvedObj(obj: Object): Unit = ???

    /** Records the root cause of this NamingException. */
    @stub
    def setRootCause(e: Throwable): Unit = ???

    /** Generates the string representation of this exception. */
    @stub
    def toString(): String = ???
}
