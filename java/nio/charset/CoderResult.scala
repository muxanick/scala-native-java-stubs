package java.nio.charset

import java.lang.{Object, String}

// A description of the result state of a coder.
//
//  A charset coder, that is, either a decoder or an encoder, consumes bytes
// (or characters) from an input buffer, translates them, and writes the
// resulting characters (or bytes) to an output buffer.  A coding process
// terminates for one of four categories of reasons, which are described by
// instances of this class:
//
// 
//
//    Underflow is reported when there is no more input to be
//   processed, or there is insufficient input and additional input is
//   required.  This condition is represented by the unique result object
//   UNDERFLOW, whose isUnderflow method
//   returns true.  
//
//    Overflow is reported when there is insufficient room
//   remaining in the output buffer.  This condition is represented by the
//   unique result object OVERFLOW, whose isOverflow method returns true.  
//
//    A malformed-input error is reported when a sequence of
//   input units is not well-formed.  Such errors are described by instances of
//   this class whose isMalformed method returns
//   true and whose length method returns the length
//   of the malformed sequence.  There is one unique instance of this class for
//   all malformed-input errors of a given length.  
//
//    An unmappable-character error is reported when a sequence
//   of input units denotes a character that cannot be represented in the
//   output charset.  Such errors are described by instances of this class
//   whose isUnmappable method returns true and
//   whose length method returns the length of the input
//   sequence denoting the unmappable character.  There is one unique instance
//   of this class for all unmappable-character errors of a given length.
//   
//
// 
//
//  For convenience, the isError method returns true
// for result objects that describe malformed-input and unmappable-character
// errors but false for those that describe underflow or overflow
// conditions.  
class CoderResult extends Object {

    @stub
    // Tells whether or not this object describes an error condition.
    def isError(): Boolean = ???

    @stub
    // Tells whether or not this object describes a malformed-input error.
    def isMalformed(): Boolean = ???

    @stub
    // Tells whether or not this object describes an overflow condition.
    def isOverflow(): Boolean = ???

    @stub
    // Tells whether or not this object describes an underflow condition.
    def isUnderflow(): Boolean = ???

    @stub
    // Tells whether or not this object describes an unmappable-character
    // error.
    def isUnmappable(): Boolean = ???

    @stub
    // Returns the length of the erroneous input described by this
    // object  (optional operation).
    def length(): Int = ???

    @stub
    // Throws an exception appropriate to the result described by this object.
    def throwException(): Unit = ???

    @stub
    // Returns a string describing this coder result.
    def toString(): String = ???
}

object CoderResult {
    @stub
    // Result object indicating overflow, meaning that there is insufficient
    // room in the output buffer.
    def OVERFLOW: CoderResult = ???

    @stub
    // Static factory method that returns the unique object describing a
    // malformed-input error of the given length.
    def malformedForLength(length: Int): CoderResult = ???
}
