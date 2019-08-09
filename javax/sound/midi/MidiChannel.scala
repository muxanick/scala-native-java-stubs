package javax.sound.midi

import scala.scalanative.annotation.stub

/** A MidiChannel object represents a single MIDI channel.
 *  Generally, each MidiChannel method processes a like-named MIDI
 *  "channel voice" or "channel mode" message as defined by the MIDI specification. However,
 *  MidiChannel adds some "get" methods  that retrieve the value
 *  most recently set by one of the standard MIDI channel messages.  Similarly,
 *  methods for per-channel solo and mute have been added.
 *  
 *  A Synthesizer object has a collection
 *  of MidiChannels, usually one for each of the 16 channels
 *  prescribed by the MIDI 1.0 specification.  The Synthesizer
 *  generates sound when its MidiChannels receive
 *  noteOn messages.
 *  
 *  See the MIDI 1.0 Specification for more information about the prescribed
 *  behavior of the MIDI channel messages, which are not exhaustively
 *  documented here.  The specification is titled MIDI Reference:
 *  The Complete MIDI 1.0 Detailed Specification, and is published by
 *  the MIDI Manufacturer's Association (
 *  http://www.midi.org).
 *  
 *  MIDI was originally a protocol for reporting the gestures of a keyboard
 *  musician.  This genesis is visible in the MidiChannel API, which
 *  preserves such MIDI concepts as key number, key velocity, and key pressure.
 *  It should be understood that the MIDI data does not necessarily originate
 *  with a keyboard player (the source could be a different kind of musician, or
 *  software).  Some devices might generate constant values for velocity
 *  and pressure, regardless of how the note was performed.
 *  Also, the MIDI specification often leaves it up to the
 *  synthesizer to use the data in the way the implementor sees fit.  For
 *  example, velocity data need not always be mapped to volume and/or brightness.
 */
trait MidiChannel {

    /** Turns off all notes that are currently sounding on this channel. */
    @stub
    def allNotesOff(): Unit = ???

    /** Immediately turns off all sounding notes on this channel, ignoring the
     *  state of the Hold Pedal and the internal decay rate of the current
     *  Instrument.
     */
    @stub
    def allSoundOff(): Unit = ???

    /** Reacts to a change in the specified controller's value. */
    @stub
    def controlChange(controller: Int, value: Int): Unit = ???

    /** Obtains the channel's keyboard pressure. */
    @stub
    def getChannelPressure(): Int = ???

    /** Obtains the current value of the specified controller. */
    @stub
    def getController(controller: Int): Int = ???

    /** Obtains the current mono/poly mode. */
    @stub
    def getMono(): Boolean = ???

    /** Obtains the current mute state for this channel. */
    @stub
    def getMute(): Boolean = ???

    /** Obtains the current omni mode. */
    @stub
    def getOmni(): Boolean = ???

    /** Obtains the upward or downward pitch offset for this channel. */
    @stub
    def getPitchBend(): Int = ???

    /** Obtains the pressure with which the specified key is being depressed. */
    @stub
    def getPolyPressure(noteNumber: Int): Int = ???

    /** Obtains the current program number for this channel. */
    @stub
    def getProgram(): Int = ???

    /** Obtains the current solo state for this channel. */
    @stub
    def getSolo(): Boolean = ???

    /** Turns local control on or off. */
    @stub
    def localControl(on: Boolean): Boolean = ???

    /** Turns the specified note off. */
    @stub
    def noteOff(noteNumber: Int): Unit = ???

    /** Turns the specified note off. */
    @stub
    def noteOff(noteNumber: Int, velocity: Int): Unit = ???

    /** Starts the specified note sounding. */
    @stub
    def noteOn(noteNumber: Int, velocity: Int): Unit = ???

    /** Changes a program (patch). */
    @stub
    def programChange(program: Int): Unit = ???

    /** Changes the program using bank and program (patch) numbers. */
    @stub
    def programChange(bank: Int, program: Int): Unit = ???

    /** Resets all the implemented controllers to their default values. */
    @stub
    def resetAllControllers(): Unit = ???

    /** Reacts to a change in the keyboard pressure. */
    @stub
    def setChannelPressure(pressure: Int): Unit = ???

    /** Turns mono mode on or off. */
    @stub
    def setMono(on: Boolean): Unit = ???

    /** Sets the mute state for this channel. */
    @stub
    def setMute(mute: Boolean): Unit = ???

    /** Turns omni mode on or off. */
    @stub
    def setOmni(on: Boolean): Unit = ???

    /** Changes the pitch offset for all notes on this channel. */
    @stub
    def setPitchBend(bend: Int): Unit = ???

    /** Reacts to a change in the specified note's key pressure. */
    @stub
    def setPolyPressure(noteNumber: Int, pressure: Int): Unit = ???

    /** Sets the solo state for this channel. */
    @stub
    def setSolo(soloState: Boolean): Unit = ???
}
