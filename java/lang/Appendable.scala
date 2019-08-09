package java.lang

/** An object to which char sequences and values can be appended.  The
 *  Appendable interface must be implemented by any class whose
 *  instances are intended to receive formatted output from a Formatter.
 * 
 *   The characters to be appended should be valid Unicode characters as
 *  described in Unicode Character
 *  Representation.  Note that supplementary characters may be composed of
 *  multiple 16-bit char values.
 * 
 *   Appendables are not necessarily safe for multithreaded access.  Thread
 *  safety is the responsibility of classes that extend and implement this
 *  interface.
 * 
 *   Since this interface may be implemented by existing classes
 *  with different styles of error handling there is no guarantee that
 *  errors will be propagated to the invoker.
 */
trait Appendable {

    /** Appends the specified character to this Appendable. */
    @stub
    def append(c: Char): Appendable = ???

    /** Appends the specified character sequence to this Appendable. */
    @stub
    def append(csq: CharSequence): Appendable = ???
}
