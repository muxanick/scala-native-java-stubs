package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that an assertion has failed.
 * 
 *  The seven one-argument public constructors provided by this
 *  class ensure that the assertion error returned by the invocation:
 *  
 *      new AssertionError(expression)
 *  
 *  has as its detail message the string conversion of
 *  expression (as defined in section 15.18.1.1 of
 *  The Java™ Language Specification),
 *  regardless of the type of expression.
 */
class AssertionError extends Error {

    /** Constructs an AssertionError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified boolean, which is converted to
     *  a string as defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Boolean) = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified char, which is converted to a
     *  string as defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Char) = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified double, which is converted to a
     *  string as defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Double) = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified float, which is converted to a
     *  string as defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Float) = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified int, which is converted to a
     *  string as defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Int) = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified long, which is converted to a
     *  string as defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Long) = ???

    /** Constructs an AssertionError with its detail message derived
     *  from the specified object, which is converted to a string as
     *  defined in section 15.18.1.1 of
     *  The Java™ Language Specification.
     */
    @stub
    def this(detailMessage: Any) = ???

    /** Constructs a new AssertionError with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
