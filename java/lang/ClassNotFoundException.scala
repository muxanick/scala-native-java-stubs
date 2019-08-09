package java.lang

/** Thrown when an application tries to load in a class through its
 *  string name using:
 *  
 *  The forName method in class Class.
 *  The findSystemClass method in class
 *      ClassLoader .
 *  The loadClass method in class ClassLoader.
 *  
 *  
 *  but no definition for the class with the specified name could be found.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The "optional exception
 *  that was raised while loading the class" that may be provided at
 *  construction time and accessed via the getException() method is
 *  now known as the cause, and may be accessed via the Throwable.getCause() method, as well as the aforementioned "legacy method."
 */
class ClassNotFoundException extends ReflectiveOperationException {

    /** Constructs a ClassNotFoundException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a ClassNotFoundException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???

    /** Returns the cause of this exception (the exception that was raised
     *  if an error occurred while attempting to load the class; otherwise
     *  null).
     */
    @stub
    def getCause(): Throwable = ???
}
