package java.nio.charset

import java.lang.{Object, String}

/** A description of the result state of a coder.
 * 
 *   A charset coder, that is, either a decoder or an encoder, consumes bytes
 *  (or characters) from an input buffer, translates them, and writes the
 *  resulting characters (or bytes) to an output buffer.  A coding process
 *  terminates for one of four categories of reasons, which are described by
 *  instances of this class:
 * 
 *  
 * 
 *     Underflow is reported when there is no more input to be
 *    processed, or there is insufficient input and additional input is
 *    required.  This condition is represented by the unique result object
 *    UNDERFLOW, whose isUnderflow method
 *    returns true.  
 * 
 *     Overflow is reported when there is insufficient room
 *    remaining in the output buffer.  This condition is represented by the
 *    unique result object OVERFLOW, whose isOverflow method returns true.  
 * 
 *     A malformed-input error is reported when a sequence of
 *    input units is not well-formed.  Such errors are described by instances of
 *    this class whose isMalformed method returns
 *    true and whose length method returns the length
 *    of the malformed sequence.  There is one unique instance of this class for
 *    all malformed-input errors of a given length.  
 * 
 *     An unmappable-character error is reported when a sequence
 *    of input units denotes a character that cannot be represented in the
 *    output charset.  Such errors are described by instances of this class
 *    whose isUnmappable method returns true and
 *    whose length method returns the length of the input
 *    sequence denoting the unmappable character.  There is one unique instance
 *    of this class for all unmappable-character errors of a given length.
 *    
 * 
 *  
 * 
 *   For convenience, the isError method returns true
 *  for result objects that describe malformed-input and unmappable-character
 *  errors but false for those that describe underflow or overflow
 *  conditions.  
 */
class CoderResult extends Object {

    /** Tells whether or not this object describes an error condition. */
    @stub
    def isError(): Boolean = ???

    /** Tells whether or not this object describes a malformed-input error. */
    @stub
    def isMalformed(): Boolean = ???

    /** Tells whether or not this object describes an overflow condition. */
    @stub
    def isOverflow(): Boolean = ???

    /** Tells whether or not this object describes an underflow condition. */
    @stub
    def isUnderflow(): Boolean = ???

    /** Tells whether or not this object describes an unmappable-character
     *  error.
     */
    @stub
    def isUnmappable(): Boolean = ???

    /** Returns the length of the erroneous input described by this
     *  object  (optional operation).
     */
    @stub
    def length(): Int = ???

    /** Throws an exception appropriate to the result described by this object. */
    @stub
    def throwException(): Unit = ???

    /** Returns a string describing this coder result. */
    @stub
    def toString(): String = ???
}

object CoderResult {
    /** Result object indicating overflow, meaning that there is insufficient
     *  room in the output buffer.
     */
    @stub
    val OVERFLOW: CoderResult = ???

    /** Static factory method that returns the unique object describing a
     *  malformed-input error of the given length.
     */
    @stub
    def malformedForLength(length: Int): CoderResult = ???
}
