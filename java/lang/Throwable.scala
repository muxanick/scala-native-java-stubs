package java.lang

import java.io.{PrintStream, PrintWriter, Serializable}
import scala.scalanative.annotation.stub

/** The Throwable class is the superclass of all errors and
 *  exceptions in the Java language. Only objects that are instances of this
 *  class (or one of its subclasses) are thrown by the Java Virtual Machine or
 *  can be thrown by the Java throw statement. Similarly, only
 *  this class or one of its subclasses can be the argument type in a
 *  catch clause.
 * 
 *  For the purposes of compile-time checking of exceptions, Throwable and any subclass of Throwable that is not also a
 *  subclass of either RuntimeException or Error are
 *  regarded as checked exceptions.
 * 
 *  Instances of two subclasses, Error and
 *  Exception, are conventionally used to indicate
 *  that exceptional situations have occurred. Typically, these instances
 *  are freshly created in the context of the exceptional situation so
 *  as to include relevant information (such as stack trace data).
 * 
 *  A throwable contains a snapshot of the execution stack of its
 *  thread at the time it was created. It can also contain a message
 *  string that gives more information about the error. Over time, a
 *  throwable can suppress other
 *  throwables from being propagated.  Finally, the throwable can also
 *  contain a cause: another throwable that caused this
 *  throwable to be constructed.  The recording of this causal information
 *  is referred to as the chained exception facility, as the
 *  cause can, itself, have a cause, and so on, leading to a "chain" of
 *  exceptions, each caused by another.
 * 
 *  One reason that a throwable may have a cause is that the class that
 *  throws it is built atop a lower layered abstraction, and an operation on
 *  the upper layer fails due to a failure in the lower layer.  It would be bad
 *  design to let the throwable thrown by the lower layer propagate outward, as
 *  it is generally unrelated to the abstraction provided by the upper layer.
 *  Further, doing so would tie the API of the upper layer to the details of
 *  its implementation, assuming the lower layer's exception was a checked
 *  exception.  Throwing a "wrapped exception" (i.e., an exception containing a
 *  cause) allows the upper layer to communicate the details of the failure to
 *  its caller without incurring either of these shortcomings.  It preserves
 *  the flexibility to change the implementation of the upper layer without
 *  changing its API (in particular, the set of exceptions thrown by its
 *  methods).
 * 
 *  A second reason that a throwable may have a cause is that the method
 *  that throws it must conform to a general-purpose interface that does not
 *  permit the method to throw the cause directly.  For example, suppose
 *  a persistent collection conforms to the Collection interface, and that its persistence is implemented atop
 *  java.io.  Suppose the internals of the add method
 *  can throw an IOException.  The implementation
 *  can communicate the details of the IOException to its caller
 *  while conforming to the Collection interface by wrapping the
 *  IOException in an appropriate unchecked exception.  (The
 *  specification for the persistent collection should indicate that it is
 *  capable of throwing such exceptions.)
 * 
 *  A cause can be associated with a throwable in two ways: via a
 *  constructor that takes the cause as an argument, or via the
 *  initCause(Throwable) method.  New throwable classes that
 *  wish to allow causes to be associated with them should provide constructors
 *  that take a cause and delegate (perhaps indirectly) to one of the
 *  Throwable constructors that takes a cause.
 * 
 *  Because the initCause method is public, it allows a cause to be
 *  associated with any throwable, even a "legacy throwable" whose
 *  implementation predates the addition of the exception chaining mechanism to
 *  Throwable.
 * 
 *  By convention, class Throwable and its subclasses have two
 *  constructors, one that takes no arguments and one that takes a
 *  String argument that can be used to produce a detail message.
 *  Further, those subclasses that might likely have a cause associated with
 *  them should have two more constructors, one that takes a
 *  Throwable (the cause), and one that takes a
 *  String (the detail message) and a Throwable (the
 *  cause).
 */
class Throwable extends Object with Serializable {

    /** Constructs a new throwable with null as its detail message. */
    @stub
    def this() = ???

    /** Constructs a new throwable with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new throwable with the specified detail message and
     *  cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new throwable with the specified detail message,
     *  cause, suppression enabled or
     *  disabled, and writable stack trace enabled or disabled.
     */
    @stub
    protected def this(message: String, cause: Throwable, enableSuppression: Boolean, writableStackTrace: Boolean) = ???

    /** Constructs a new throwable with the specified cause and a detail
     *  message of (cause==null ? null : cause.toString()) (which
     *  typically contains the class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???

    /** Appends the specified exception to the exceptions that were
     *  suppressed in order to deliver this exception.
     */
    @stub
    def addSuppressed(exception: Throwable): Unit = ???

    /** Fills in the execution stack trace. */
    @stub
    def fillInStackTrace(): Throwable = ???

    /** Returns the cause of this throwable or null if the
     *  cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Creates a localized description of this throwable. */
    @stub
    def getLocalizedMessage(): String = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???

    /** Provides programmatic access to the stack trace information printed by
     *  printStackTrace().
     */
    @stub
    def getStackTrace(): Array[StackTraceElement] = ???

    /** Returns an array containing all of the exceptions that were
     *  suppressed, typically by the try-with-resources
     *  statement, in order to deliver this exception.
     */
    @stub
    def getSuppressed(): Array[Throwable] = ???

    /** Initializes the cause of this throwable to the specified value. */
    @stub
    def initCause(cause: Throwable): Throwable = ???

    /** Prints this throwable and its backtrace to the
     *  standard error stream.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this throwable and its backtrace to the specified print stream. */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Prints this throwable and its backtrace to the specified
     *  print writer.
     */
    @stub
    def printStackTrace(s: PrintWriter): Unit = ???

    /** Sets the stack trace elements that will be returned by
     *  getStackTrace() and printed by printStackTrace()
     *  and related methods.
     */
    @stub
    def setStackTrace(stackTrace: Array[StackTraceElement]): Unit = ???

    /** Returns a short description of this throwable. */
    @stub
    def toString(): String = ???
}
