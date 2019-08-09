package java.lang

/** RuntimeException is the superclass of those
 *  exceptions that can be thrown during the normal operation of the
 *  Java Virtual Machine.
 * 
 *  RuntimeException and its subclasses are unchecked
 *  exceptions.  Unchecked exceptions do not need to be
 *  declared in a method or constructor's throws clause if they
 *  can be thrown by the execution of the method or constructor and
 *  propagate outside the method or constructor boundary.
 */
class RuntimeException extends Exception {

    /** Constructs a new runtime exception with null as its
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new runtime exception with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new runtime exception with the specified detail message and
     *  cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new runtime exception with the specified detail
     *  message, cause, suppression enabled or disabled, and writable
     *  stack trace enabled or disabled.
     */
    @stub
    protected def this(message: String, cause: Throwable, enableSuppression: Boolean, writableStackTrace: Boolean) = ???
}
