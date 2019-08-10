package javax.sound.midi

import java.lang.Object
import scala.scalanative.annotation.stub

/** A SysexMessage object represents a MIDI system exclusive message.
 *  
 *  When a system exclusive message is read from a MIDI file, it always has
 *  a defined length.  Data from a system exclusive message from a MIDI file
 *  should be stored in the data array of a SysexMessage as
 *  follows: the system exclusive message status byte (0xF0 or 0xF7), all
 *  message data bytes, and finally the end-of-exclusive flag (0xF7).
 *  The length reported by the SysexMessage object is therefore
 *  the length of the system exclusive data plus two: one byte for the status
 *  byte and one for the end-of-exclusive flag.
 *  
 *  As dictated by the Standard MIDI Files specification, two status byte values are legal
 *  for a SysexMessage read from a MIDI file:
 *  
 *  0xF0: System Exclusive message (same as in MIDI wire protocol)
 *  0xF7: Special System Exclusive message
 *  
 *  
 *  When Java Sound is used to handle system exclusive data that is being received
 *  using MIDI wire protocol, it should place the data in one or more
 *  SysexMessages.  In this case, the length of the system exclusive data
 *  is not known in advance; the end of the system exclusive data is marked by an
 *  end-of-exclusive flag (0xF7) in the MIDI wire byte stream.
 *  
 *  0xF0: System Exclusive message (same as in MIDI wire protocol)
 *  0xF7: End of Exclusive (EOX)
 *  
 *  The first SysexMessage object containing data for a particular system
 *  exclusive message should have the status value 0xF0.  If this message contains all
 *  the system exclusive data
 *  for the message, it should end with the status byte 0xF7 (EOX).
 *  Otherwise, additional system exclusive data should be sent in one or more
 *  SysexMessages with a status value of 0xF7.  The SysexMessage
 *  containing the last of the data for the system exclusive message should end with the
 *  value 0xF7 (EOX) to mark the end of the system exclusive message.
 *  
 *  If system exclusive data from SysexMessages objects is being transmitted
 *  using MIDI wire protocol, only the initial 0xF0 status byte, the system exclusive
 *  data itself, and the final 0xF7 (EOX) byte should be propagated; any 0xF7 status
 *  bytes used to indicate that a SysexMessage contains continuing system
 *  exclusive data should not be propagated via MIDI wire protocol.
 */
class SysexMessage extends MidiMessage {

    /** Constructs a new SysexMessage. */
    @stub
    def this() = ???

    /** Constructs a new SysexMessage. */
    @stub
    protected def this(data: Array[Byte]) = ???

    /** Constructs a new SysexMessage and sets the data for
     *  the message.
     */
    @stub
    def this(data: Array[Byte], length: Int) = ???

    /** Constructs a new SysexMessage and sets the data for the message. */
    @stub
    def this(status: Int, data: Array[Byte], length: Int) = ???

    /** Creates a new object of the same class and with the same contents
     *  as this object.
     */
    @stub
    def clone(): Any = ???

    /** Obtains a copy of the data for the system exclusive message. */
    @stub
    def getData(): Array[Byte] = ???

    /** Sets the data for the system exclusive message. */
    @stub
    def setMessage(data: Array[Byte], length: Int): Unit = ???

    /** Sets the data for the system exclusive message. */
    @stub
    def setMessage(status: Int, data: Array[Byte], length: Int): Unit = ???
}

object SysexMessage {
    /** Status byte for Special System Exclusive message (0xF7, or 247), which is used
     *  in MIDI files.
     */
    @stub
    val SPECIAL_SYSTEM_EXCLUSIVE: Int = ???

    /** Status byte for System Exclusive message (0xF0, or 240). */
    @stub
    val SYSTEM_EXCLUSIVE: Int = ???
}
