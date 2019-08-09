package javax.sound.midi

import java.lang.Object
import scala.scalanative.annotation.stub

/** A MetaMessage is a MidiMessage that is not meaningful to synthesizers, but
 *  that can be stored in a MIDI file and interpreted by a sequencer program.
 *  (See the discussion in the MidiMessage
 *  class description.)  The Standard MIDI Files specification defines
 *  various types of meta-events, such as sequence number, lyric, cue point,
 *  and set tempo.  There are also meta-events
 *  for such information as lyrics, copyrights, tempo indications, time and key
 *  signatures, markers, etc.  For more information, see the Standard MIDI Files 1.0
 *  specification, which is part of the Complete MIDI 1.0 Detailed Specification
 *  published by the MIDI Manufacturer's Association
 *  (http://www.midi.org).
 * 
 *  
 *  When data is being transported using MIDI wire protocol,
 *  a ShortMessage with the status value 0xFF represents
 *  a system reset message.  In MIDI files, this same status value denotes a MetaMessage.
 *  The types of meta-message are distinguished from each other by the first byte
 *  that follows the status byte 0xFF.  The subsequent bytes are data
 *  bytes.  As with system exclusive messages, there are an arbitrary number of
 *  data bytes, depending on the type of MetaMessage.
 */
class MetaMessage extends MidiMessage {

    /** Constructs a new MetaMessage. */
    @stub
    def this() = ???

    /** Constructs a new MetaMessage. */
    @stub
    protected def this(data: Array[Byte]) = ???

    /** Constructs a new MetaMessage and sets the message parameters. */
    @stub
    def this(type: Int, data: Array[Byte], length: Int) = ???

    /** Creates a new object of the same class and with the same contents
     *  as this object.
     */
    @stub
    def clone(): Object = ???

    /** Obtains a copy of the data for the meta message. */
    @stub
    def getData(): Array[Byte] = ???

    /** Obtains the type of the MetaMessage. */
    @stub
    def getType(): Int = ???

    /** Sets the message parameters for a MetaMessage. */
    @stub
    def setMessage(type: Int, data: Array[Byte], length: Int): Unit = ???
}

object MetaMessage {
    /** Status byte for MetaMessage (0xFF, or 255), which is used
     *  in MIDI files.
     */
    @stub
    val META: Int = ???
}
