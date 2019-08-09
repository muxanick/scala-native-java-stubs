package javax.sound.midi

import java.lang.Object

// A Sequence is a data structure containing musical
// information (often an entire song or composition) that can be played
// back by a Sequencer object. Specifically, the
// Sequence contains timing
// information and one or more tracks.  Each track consists of a
// series of MIDI events (such as note-ons, note-offs, program changes, and meta-events).
// The sequence's timing information specifies the type of unit that is used
// to time-stamp the events in the sequence.
// 
// A Sequence can be created from a MIDI file by reading the file
// into an input stream and invoking one of the getSequence methods of
// MidiSystem.  A sequence can also be built from scratch by adding new
// Tracks to an empty Sequence, and adding
// MidiEvent objects to these Tracks.
class Sequence extends Object {

    @stub
    // Constructs a new MIDI sequence with the specified timing division
    // type and timing resolution.
    def this(divisionType: float, resolution: Int) = ???

    @stub
    // The timing division type of the sequence.
    protected def divisionType: float = ???

    @stub
    // The timing resolution of the sequence.
    protected def resolution: Int = ???

    @stub
    // Creates a new, initially empty track as part of this sequence.
    def createTrack(): Track = ???

    @stub
    // Removes the specified track from the sequence.
    def deleteTrack(track: Track): Boolean = ???

    @stub
    // Obtains the timing division type for this sequence.
    def getDivisionType(): float = ???

    @stub
    // Obtains the duration of this sequence, expressed in microseconds.
    def getMicrosecondLength(): Long = ???

    @stub
    // Obtains a list of patches referenced in this sequence.
    def getPatchList(): Array[Patch] = ???

    @stub
    // Obtains the timing resolution for this sequence.
    def getResolution(): Int = ???

    @stub
    // Obtains the duration of this sequence, expressed in MIDI ticks.
    def getTickLength(): Long = ???
}

object Sequence {
    @stub
    // The tempo-based timing type, for which the resolution is expressed in pulses (ticks) per quarter note.
    def PPQ: float = ???

    @stub
    // The SMPTE-based timing type with 24 frames per second (resolution is expressed in ticks per frame).
    def SMPTE_24: float = ???

    @stub
    // The SMPTE-based timing type with 25 frames per second (resolution is expressed in ticks per frame).
    def SMPTE_25: float = ???

    @stub
    // The SMPTE-based timing type with 30 frames per second (resolution is expressed in ticks per frame).
    def SMPTE_30: float = ???

    @stub
    // The SMPTE-based timing type with 29.97 frames per second (resolution is expressed in ticks per frame).
    def SMPTE_30DROP: float = ???
}
