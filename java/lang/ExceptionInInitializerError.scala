package java.lang

/** Signals that an unexpected exception has occurred in a static initializer.
 *  An ExceptionInInitializerError is thrown to indicate that an
 *  exception occurred during evaluation of a static initializer or the
 *  initializer for a static variable.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The "saved throwable
 *  object" that may be provided at construction time and accessed via
 *  the getException() method is now known as the cause,
 *  and may be accessed via the Throwable.getCause() method, as well
 *  as the aforementioned "legacy method."
 */
class ExceptionInInitializerError extends LinkageError {

    /** Constructs an ExceptionInInitializerError with
     *  null as its detail message string and with no saved
     *  throwable object.
     */
    @stub
    def this() = ???

    /** Constructs an ExceptionInInitializerError with the specified detail
     *  message string.
     */
    @stub
    def this(s: String) = ???

    /** Returns the cause of this error (the exception that occurred
     *  during a static initialization that caused this error to be created).
     */
    @stub
    def getCause(): Throwable = ???
}
