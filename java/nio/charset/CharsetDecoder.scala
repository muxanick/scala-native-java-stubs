package java.nio.charset

import java.lang.{Object, String}
import java.nio.{ByteBuffer, CharBuffer}

/** An engine that can transform a sequence of bytes in a specific charset into a sequence of
 *  sixteen-bit Unicode characters.
 * 
 *  
 * 
 *   The input byte sequence is provided in a byte buffer or a series
 *  of such buffers.  The output character sequence is written to a character buffer
 *  or a series of such buffers.  A decoder should always be used by making
 *  the following sequence of method invocations, hereinafter referred to as a
 *  decoding operation:
 * 
 *  
 * 
 *     Reset the decoder via the reset method, unless it
 *    has not been used before; 
 * 
 *     Invoke the decode method zero or more times, as
 *    long as additional input may be available, passing false for the
 *    endOfInput argument and filling the input buffer and flushing the
 *    output buffer between invocations; 
 * 
 *     Invoke the decode method one final time, passing
 *    true for the endOfInput argument; and then 
 * 
 *     Invoke the flush method so that the decoder can
 *    flush any internal state to the output buffer. 
 * 
 *  
 * 
 *  Each invocation of the decode method will decode as many
 *  bytes as possible from the input buffer, writing the resulting characters
 *  to the output buffer.  The decode method returns when more
 *  input is required, when there is not enough room in the output buffer, or
 *  when a decoding error has occurred.  In each case a CoderResult
 *  object is returned to describe the reason for termination.  An invoker can
 *  examine this object and fill the input buffer, flush the output buffer, or
 *  attempt to recover from a decoding error, as appropriate, and try again.
 * 
 *  
 * 
 *   There are two general types of decoding errors.  If the input byte
 *  sequence is not legal for this charset then the input is considered malformed.  If
 *  the input byte sequence is legal but cannot be mapped to a valid
 *  Unicode character then an unmappable character has been encountered.
 * 
 *  
 * 
 *   How a decoding error is handled depends upon the action requested for
 *  that type of error, which is described by an instance of the CodingErrorAction class.  The possible error actions are to ignore the erroneous input, report the error to the invoker via
 *  the returned CoderResult object, or replace the erroneous input with the current value of the
 *  replacement string.  The replacement
 * 
 * 
 * 
 * 
 * 
 * 
 *  has the initial value "\uFFFD";
 * 
 * 
 *  its value may be changed via the replaceWith method.
 * 
 *   The default action for malformed-input and unmappable-character errors
 *  is to report them.  The
 *  malformed-input error action may be changed via the onMalformedInput method; the
 *  unmappable-character action may be changed via the onUnmappableCharacter method.
 * 
 *   This class is designed to handle many of the details of the decoding
 *  process, including the implementation of error actions.  A decoder for a
 *  specific charset, which is a concrete subclass of this class, need only
 *  implement the abstract decodeLoop method, which
 *  encapsulates the basic decoding loop.  A subclass that maintains internal
 *  state should, additionally, override the implFlush and
 *  implReset methods.
 * 
 *   Instances of this class are not safe for use by multiple concurrent
 *  threads.  
 */
abstract class CharsetDecoder extends Object {

    /** Returns the average number of characters that will be produced for each
     *  byte of input.
     */
    def averageCharsPerByte(): Float

    /** Returns the charset that created this decoder. */
    def charset(): Charset

    /** Convenience method that decodes the remaining content of a single input
     *  byte buffer into a newly-allocated character buffer.
     */
    def decode(in: ByteBuffer): CharBuffer

    /** Decodes as many bytes as possible from the given input buffer,
     *  writing the results to the given output buffer.
     */
    def decode(in: ByteBuffer, out: CharBuffer, endOfInput: Boolean): CoderResult

    /** Decodes one or more bytes into one or more characters. */
    protected def decodeLoop(in: ByteBuffer, out: CharBuffer): CoderResult

    /** Retrieves the charset that was detected by this
     *  decoder  (optional operation).
     */
    def detectedCharset(): Charset

    /** Flushes this decoder. */
    def flush(out: CharBuffer): CoderResult

    /** Flushes this decoder. */
    protected def implFlush(out: CharBuffer): CoderResult

    /** Reports a change to this decoder's malformed-input action. */
    protected def implOnMalformedInput(newAction: CodingErrorAction): Unit

    /** Reports a change to this decoder's unmappable-character action. */
    protected def implOnUnmappableCharacter(newAction: CodingErrorAction): Unit

    /** Reports a change to this decoder's replacement value. */
    protected def implReplaceWith(newReplacement: String): Unit

    /** Resets this decoder, clearing any charset-specific internal state. */
    protected def implReset(): Unit

    /** Tells whether or not this decoder implements an auto-detecting charset. */
    def isAutoDetecting(): Boolean

    /** Tells whether or not this decoder has yet detected a
     *  charset  (optional operation).
     */
    def isCharsetDetected(): Boolean

    /** Returns this decoder's current action for malformed-input errors. */
    def malformedInputAction(): CodingErrorAction

    /** Returns the maximum number of characters that will be produced for each
     *  byte of input.
     */
    def maxCharsPerByte(): Float

    /** Changes this decoder's action for malformed-input errors. */
    def onMalformedInput(newAction: CodingErrorAction): CharsetDecoder

    /** Changes this decoder's action for unmappable-character errors. */
    def onUnmappableCharacter(newAction: CodingErrorAction): CharsetDecoder

    /** Returns this decoder's replacement value. */
    def replacement(): String

    /** Changes this decoder's replacement value. */
    def replaceWith(newReplacement: String): CharsetDecoder

    /** Resets this decoder, clearing any internal state. */
    def reset(): CharsetDecoder
}
