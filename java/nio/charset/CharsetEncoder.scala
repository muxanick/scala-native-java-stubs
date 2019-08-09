package java.nio.charset

import java.lang.{CharSequence, Object}
import java.nio.{ByteBuffer, CharBuffer}

/** An engine that can transform a sequence of sixteen-bit Unicode characters into a sequence of
 *  bytes in a specific charset.
 * 
 *  
 * 
 *   The input character sequence is provided in a character buffer or a series
 *  of such buffers.  The output byte sequence is written to a byte buffer
 *  or a series of such buffers.  An encoder should always be used by making
 *  the following sequence of method invocations, hereinafter referred to as an
 *  encoding operation:
 * 
 *  
 * 
 *     Reset the encoder via the reset method, unless it
 *    has not been used before; 
 * 
 *     Invoke the encode method zero or more times, as
 *    long as additional input may be available, passing false for the
 *    endOfInput argument and filling the input buffer and flushing the
 *    output buffer between invocations; 
 * 
 *     Invoke the encode method one final time, passing
 *    true for the endOfInput argument; and then 
 * 
 *     Invoke the flush method so that the encoder can
 *    flush any internal state to the output buffer. 
 * 
 *  
 * 
 *  Each invocation of the encode method will encode as many
 *  characters as possible from the input buffer, writing the resulting bytes
 *  to the output buffer.  The encode method returns when more
 *  input is required, when there is not enough room in the output buffer, or
 *  when an encoding error has occurred.  In each case a CoderResult
 *  object is returned to describe the reason for termination.  An invoker can
 *  examine this object and fill the input buffer, flush the output buffer, or
 *  attempt to recover from an encoding error, as appropriate, and try again.
 * 
 *  
 * 
 *   There are two general types of encoding errors.  If the input character
 *  sequence is not a legal sixteen-bit Unicode sequence then the input is considered malformed.  If
 *  the input character sequence is legal but cannot be mapped to a valid
 *  byte sequence in the given charset then an unmappable character has been encountered.
 * 
 *  
 * 
 *   How an encoding error is handled depends upon the action requested for
 *  that type of error, which is described by an instance of the CodingErrorAction class.  The possible error actions are to ignore the erroneous input, report the error to the invoker via
 *  the returned CoderResult object, or replace the erroneous input with the current value of the
 *  replacement byte array.  The replacement
 * 
 * 
 *  is initially set to the encoder's default replacement, which often
 *  (but not always) has the initial value { (byte)'?' };
 * 
 * 
 * 
 * 
 * 
 *  its value may be changed via the replaceWith method.
 * 
 *   The default action for malformed-input and unmappable-character errors
 *  is to report them.  The
 *  malformed-input error action may be changed via the onMalformedInput method; the
 *  unmappable-character action may be changed via the onUnmappableCharacter method.
 * 
 *   This class is designed to handle many of the details of the encoding
 *  process, including the implementation of error actions.  An encoder for a
 *  specific charset, which is a concrete subclass of this class, need only
 *  implement the abstract encodeLoop method, which
 *  encapsulates the basic encoding loop.  A subclass that maintains internal
 *  state should, additionally, override the implFlush and
 *  implReset methods.
 * 
 *   Instances of this class are not safe for use by multiple concurrent
 *  threads.  
 */
abstract class CharsetEncoder extends Object {

    /** Initializes a new encoder. */
    @stub
    protected def this(cs: Charset, averageBytesPerChar: Float, maxBytesPerChar: Float) = ???

    /** Returns the average number of bytes that will be produced for each
     *  character of input.
     */
    def averageBytesPerChar(): Float

    /** Tells whether or not this encoder can encode the given character. */
    def canEncode(c: Char): Boolean

    /** Tells whether or not this encoder can encode the given character
     *  sequence.
     */
    def canEncode(cs: CharSequence): Boolean

    /** Returns the charset that created this encoder. */
    def charset(): Charset

    /** Convenience method that encodes the remaining content of a single input
     *  character buffer into a newly-allocated byte buffer.
     */
    def encode(in: CharBuffer): ByteBuffer

    /** Encodes as many characters as possible from the given input buffer,
     *  writing the results to the given output buffer.
     */
    def encode(in: CharBuffer, out: ByteBuffer, endOfInput: Boolean): CoderResult

    /** Encodes one or more characters into one or more bytes. */
    protected def encodeLoop(in: CharBuffer, out: ByteBuffer): CoderResult

    /** Flushes this encoder. */
    def flush(out: ByteBuffer): CoderResult

    /** Flushes this encoder. */
    protected def implFlush(out: ByteBuffer): CoderResult

    /** Reports a change to this encoder's malformed-input action. */
    protected def implOnMalformedInput(newAction: CodingErrorAction): Unit

    /** Reports a change to this encoder's unmappable-character action. */
    protected def implOnUnmappableCharacter(newAction: CodingErrorAction): Unit

    /** Reports a change to this encoder's replacement value. */
    protected def implReplaceWith(newReplacement: Array[Byte]): Unit

    /** Resets this encoder, clearing any charset-specific internal state. */
    protected def implReset(): Unit

    /** Tells whether or not the given byte array is a legal replacement value
     *  for this encoder.
     */
    def isLegalReplacement(repl: Array[Byte]): Boolean

    /** Returns this encoder's current action for malformed-input errors. */
    def malformedInputAction(): CodingErrorAction

    /** Returns the maximum number of bytes that will be produced for each
     *  character of input.
     */
    def maxBytesPerChar(): Float

    /** Changes this encoder's action for malformed-input errors. */
    def onMalformedInput(newAction: CodingErrorAction): CharsetEncoder

    /** Changes this encoder's action for unmappable-character errors. */
    def onUnmappableCharacter(newAction: CodingErrorAction): CharsetEncoder

    /** Returns this encoder's replacement value. */
    def replacement(): Array[Byte]

    /** Changes this encoder's replacement value. */
    def replaceWith(newReplacement: Array[Byte]): CharsetEncoder

    /** Resets this encoder, clearing any internal state. */
    def reset(): CharsetEncoder
}
