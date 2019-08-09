package javax.sound.midi

// A MidiChannel object represents a single MIDI channel.
// Generally, each MidiChannel method processes a like-named MIDI
// "channel voice" or "channel mode" message as defined by the MIDI specification. However,
// MidiChannel adds some "get" methods  that retrieve the value
// most recently set by one of the standard MIDI channel messages.  Similarly,
// methods for per-channel solo and mute have been added.
// 
// A Synthesizer object has a collection
// of MidiChannels, usually one for each of the 16 channels
// prescribed by the MIDI 1.0 specification.  The Synthesizer
// generates sound when its MidiChannels receive
// noteOn messages.
// 
// See the MIDI 1.0 Specification for more information about the prescribed
// behavior of the MIDI channel messages, which are not exhaustively
// documented here.  The specification is titled MIDI Reference:
// The Complete MIDI 1.0 Detailed Specification, and is published by
// the MIDI Manufacturer's Association (
// http://www.midi.org).
// 
// MIDI was originally a protocol for reporting the gestures of a keyboard
// musician.  This genesis is visible in the MidiChannel API, which
// preserves such MIDI concepts as key number, key velocity, and key pressure.
// It should be understood that the MIDI data does not necessarily originate
// with a keyboard player (the source could be a different kind of musician, or
// software).  Some devices might generate constant values for velocity
// and pressure, regardless of how the note was performed.
// Also, the MIDI specification often leaves it up to the
// synthesizer to use the data in the way the implementor sees fit.  For
// example, velocity data need not always be mapped to volume and/or brightness.
trait MidiChannel {

    @stub
    // Turns off all notes that are currently sounding on this channel.
    def allNotesOff(): Unit = ???

    @stub
    // Immediately turns off all sounding notes on this channel, ignoring the
    // state of the Hold Pedal and the internal decay rate of the current
    // Instrument.
    def allSoundOff(): Unit = ???

    @stub
    // Reacts to a change in the specified controller's value.
    def controlChange(controller: Int, value: Int): Unit = ???

    @stub
    // Obtains the channel's keyboard pressure.
    def getChannelPressure(): Int = ???

    @stub
    // Obtains the current value of the specified controller.
    def getController(controller: Int): Int = ???

    @stub
    // Obtains the current mono/poly mode.
    def getMono(): Boolean = ???

    @stub
    // Obtains the current mute state for this channel.
    def getMute(): Boolean = ???

    @stub
    // Obtains the current omni mode.
    def getOmni(): Boolean = ???

    @stub
    // Obtains the upward or downward pitch offset for this channel.
    def getPitchBend(): Int = ???

    @stub
    // Obtains the pressure with which the specified key is being depressed.
    def getPolyPressure(noteNumber: Int): Int = ???

    @stub
    // Obtains the current program number for this channel.
    def getProgram(): Int = ???

    @stub
    // Obtains the current solo state for this channel.
    def getSolo(): Boolean = ???

    @stub
    // Turns local control on or off.
    def localControl(on: Boolean): Boolean = ???

    @stub
    // Turns the specified note off.
    def noteOff(noteNumber: Int): Unit = ???

    @stub
    // Turns the specified note off.
    def noteOff(noteNumber: Int, velocity: Int): Unit = ???

    @stub
    // Starts the specified note sounding.
    def noteOn(noteNumber: Int, velocity: Int): Unit = ???

    @stub
    // Changes a program (patch).
    def programChange(program: Int): Unit = ???

    @stub
    // Changes the program using bank and program (patch) numbers.
    def programChange(bank: Int, program: Int): Unit = ???

    @stub
    // Resets all the implemented controllers to their default values.
    def resetAllControllers(): Unit = ???

    @stub
    // Reacts to a change in the keyboard pressure.
    def setChannelPressure(pressure: Int): Unit = ???

    @stub
    // Turns mono mode on or off.
    def setMono(on: Boolean): Unit = ???

    @stub
    // Sets the mute state for this channel.
    def setMute(mute: Boolean): Unit = ???

    @stub
    // Turns omni mode on or off.
    def setOmni(on: Boolean): Unit = ???

    @stub
    // Changes the pitch offset for all notes on this channel.
    def setPitchBend(bend: Int): Unit = ???

    @stub
    // Reacts to a change in the specified note's key pressure.
    def setPolyPressure(noteNumber: Int, pressure: Int): Unit = ???
}
