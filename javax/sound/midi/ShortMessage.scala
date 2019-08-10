package javax.sound.midi

import java.lang.Object
import scala.scalanative.annotation.stub

/** A ShortMessage contains a MIDI message that has at most
 *  two data bytes following its status byte.  The types of MIDI message
 *  that satisfy this criterion are channel voice, channel mode, system common,
 *  and system real-time--in other words, everything except system exclusive
 *  and meta-events.  The ShortMessage class provides methods
 *  for getting and setting the contents of the MIDI message.
 *  
 *  A number of ShortMessage methods have integer parameters by which
 *  you specify a MIDI status or data byte.  If you know the numeric value, you
 *  can express it directly.  For system common and system real-time messages,
 *  you can often use the corresponding fields of ShortMessage, such as
 *  SYSTEM_RESET.  For channel messages,
 *  the upper four bits of the status byte are specified by a command value and
 *  the lower four bits are specified by a MIDI channel number. To
 *  convert incoming MIDI data bytes that are in the form of Java's signed bytes,
 *  you can use the conversion code
 *  given in the MidiMessage class description.
 */
class ShortMessage extends MidiMessage {

    /** Constructs a new ShortMessage. */
    @stub
    def this() = ???

    /** Constructs a new ShortMessage. */
    @stub
    protected def this(data: Array[Byte]) = ???

    /** Constructs a new ShortMessage which represents a MIDI
     *  message that takes no data bytes.
     */
    @stub
    def this(status: Int) = ???

    /** Constructs a new ShortMessage which represents a MIDI message
     *  that takes up to two data bytes.
     */
    @stub
    def this(status: Int, data1: Int, data2: Int) = ???

    /** Constructs a new ShortMessage which represents a channel
     *  MIDI message that takes up to two data bytes.
     */
    @stub
    def this(command: Int, channel: Int, data1: Int, data2: Int) = ???

    /** Creates a new object of the same class and with the same contents
     *  as this object.
     */
    @stub
    def clone(): Any = ???

    /** Obtains the MIDI channel associated with this event. */
    @stub
    def getChannel(): Int = ???

    /** Obtains the MIDI command associated with this event. */
    @stub
    def getCommand(): Int = ???

    /** Obtains the first data byte in the message. */
    @stub
    def getData1(): Int = ???

    /** Obtains the second data byte in the message. */
    @stub
    def getData2(): Int = ???

    /** Retrieves the number of data bytes associated with a particular
     *  status byte value.
     */
    @stub
    protected def getDataLength(status: Int): Int = ???

    /** Sets the parameters for a MIDI message that takes no data bytes. */
    @stub
    def setMessage(status: Int): Unit = ???

    /** Sets the  parameters for a MIDI message that takes one or two data
     *  bytes.
     */
    @stub
    def setMessage(status: Int, data1: Int, data2: Int): Unit = ???

    /** Sets the short message parameters for a  channel message
     *  which takes up to two data bytes.
     */
    @stub
    def setMessage(command: Int, channel: Int, data1: Int, data2: Int): Unit = ???
}

object ShortMessage {
    /** Status byte for Active Sensing message (0xFE, or 254). */
    @stub
    val ACTIVE_SENSING: Int = ???

    /** Command value for Channel Pressure (Aftertouch) message (0xD0, or 208) */
    @stub
    val CHANNEL_PRESSURE: Int = ???

    /** Status byte for Continue message (0xFB, or 251). */
    @stub
    val CONTINUE: Int = ???

    /** Command value for Control Change message (0xB0, or 176) */
    @stub
    val CONTROL_CHANGE: Int = ???

    /** Status byte for End of System Exclusive message (0xF7, or 247). */
    @stub
    val END_OF_EXCLUSIVE: Int = ???

    /** Status byte for MIDI Time Code Quarter Frame message (0xF1, or 241). */
    @stub
    val MIDI_TIME_CODE: Int = ???

    /** Command value for Note Off message (0x80, or 128) */
    @stub
    val NOTE_OFF: Int = ???

    /** Command value for Note On message (0x90, or 144) */
    @stub
    val NOTE_ON: Int = ???

    /** Command value for Pitch Bend message (0xE0, or 224) */
    @stub
    val PITCH_BEND: Int = ???

    /** Command value for Polyphonic Key Pressure (Aftertouch) message (0xA0, or 160) */
    @stub
    val POLY_PRESSURE: Int = ???

    /** Command value for Program Change message (0xC0, or 192) */
    @stub
    val PROGRAM_CHANGE: Int = ???

    /** Status byte for Song Position Pointer message (0xF2, or 242). */
    @stub
    val SONG_POSITION_POINTER: Int = ???

    /** Status byte for MIDI Song Select message (0xF3, or 243). */
    @stub
    val SONG_SELECT: Int = ???

    /** Status byte for Start message (0xFA, or 250). */
    @stub
    val START: Int = ???

    /** Status byte for Stop message (0xFC, or 252). */
    @stub
    val STOP: Int = ???

    /** Status byte for System Reset message (0xFF, or 255). */
    @stub
    val SYSTEM_RESET: Int = ???

    /** Status byte for Timing Clock message (0xF8, or 248). */
    @stub
    val TIMING_CLOCK: Int = ???

    /** Status byte for Tune Request message (0xF6, or 246). */
    @stub
    val TUNE_REQUEST: Int = ???
}
