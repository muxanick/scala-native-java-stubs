package javax.sound.midi

import java.lang.Object

// A ShortMessage contains a MIDI message that has at most
// two data bytes following its status byte.  The types of MIDI message
// that satisfy this criterion are channel voice, channel mode, system common,
// and system real-time--in other words, everything except system exclusive
// and meta-events.  The ShortMessage class provides methods
// for getting and setting the contents of the MIDI message.
// 
// A number of ShortMessage methods have integer parameters by which
// you specify a MIDI status or data byte.  If you know the numeric value, you
// can express it directly.  For system common and system real-time messages,
// you can often use the corresponding fields of ShortMessage, such as
// SYSTEM_RESET.  For channel messages,
// the upper four bits of the status byte are specified by a command value and
// the lower four bits are specified by a MIDI channel number. To
// convert incoming MIDI data bytes that are in the form of Java's signed bytes,
// you can use the conversion code
// given in the MidiMessage class description.
class ShortMessage extends MidiMessage {

    @stub
    // Constructs a new ShortMessage.
    def this() = ???

    @stub
    // Constructs a new ShortMessage.
    protected def this(data: Array[Byte]) = ???

    @stub
    // Constructs a new ShortMessage which represents a MIDI
    // message that takes no data bytes.
    def this(status: Int) = ???

    @stub
    // Constructs a new ShortMessage which represents a MIDI message
    // that takes up to two data bytes.
    def this(status: Int, data1: Int, data2: Int) = ???

    @stub
    // Creates a new object of the same class and with the same contents
    // as this object.
    def clone(): Object = ???

    @stub
    // Obtains the MIDI channel associated with this event.
    def getChannel(): Int = ???

    @stub
    // Obtains the MIDI command associated with this event.
    def getCommand(): Int = ???

    @stub
    // Obtains the first data byte in the message.
    def getData1(): Int = ???

    @stub
    // Obtains the second data byte in the message.
    def getData2(): Int = ???

    @stub
    // Retrieves the number of data bytes associated with a particular
    // status byte value.
    protected def getDataLength(status: Int): Int = ???

    @stub
    // Sets the parameters for a MIDI message that takes no data bytes.
    def setMessage(status: Int): Unit = ???

    @stub
    // Sets the  parameters for a MIDI message that takes one or two data
    // bytes.
    def setMessage(status: Int, data1: Int, data2: Int): Unit = ???
}

object ShortMessage {
    @stub
    // Status byte for Active Sensing message (0xFE, or 254).
    def ACTIVE_SENSING: Int = ???

    @stub
    // Command value for Channel Pressure (Aftertouch) message (0xD0, or 208)
    def CHANNEL_PRESSURE: Int = ???

    @stub
    // Status byte for Continue message (0xFB, or 251).
    def CONTINUE: Int = ???

    @stub
    // Command value for Control Change message (0xB0, or 176)
    def CONTROL_CHANGE: Int = ???

    @stub
    // Status byte for End of System Exclusive message (0xF7, or 247).
    def END_OF_EXCLUSIVE: Int = ???

    @stub
    // Status byte for MIDI Time Code Quarter Frame message (0xF1, or 241).
    def MIDI_TIME_CODE: Int = ???

    @stub
    // Command value for Note Off message (0x80, or 128)
    def NOTE_OFF: Int = ???

    @stub
    // Command value for Note On message (0x90, or 144)
    def NOTE_ON: Int = ???

    @stub
    // Command value for Pitch Bend message (0xE0, or 224)
    def PITCH_BEND: Int = ???

    @stub
    // Command value for Polyphonic Key Pressure (Aftertouch) message (0xA0, or 160)
    def POLY_PRESSURE: Int = ???

    @stub
    // Command value for Program Change message (0xC0, or 192)
    def PROGRAM_CHANGE: Int = ???

    @stub
    // Status byte for Song Position Pointer message (0xF2, or 242).
    def SONG_POSITION_POINTER: Int = ???

    @stub
    // Status byte for MIDI Song Select message (0xF3, or 243).
    def SONG_SELECT: Int = ???

    @stub
    // Status byte for Start message (0xFA, or 250).
    def START: Int = ???

    @stub
    // Status byte for Stop message (0xFC, or 252).
    def STOP: Int = ???

    @stub
    // Status byte for System Reset message (0xFF, or 255).
    def SYSTEM_RESET: Int = ???

    @stub
    // Status byte for Timing Clock message (0xF8, or 248).
    def TIMING_CLOCK: Int = ???
}
