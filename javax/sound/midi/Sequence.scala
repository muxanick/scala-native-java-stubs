package javax.sound.midi

import java.lang.Object

/** A Sequence is a data structure containing musical
 *  information (often an entire song or composition) that can be played
 *  back by a Sequencer object. Specifically, the
 *  Sequence contains timing
 *  information and one or more tracks.  Each track consists of a
 *  series of MIDI events (such as note-ons, note-offs, program changes, and meta-events).
 *  The sequence's timing information specifies the type of unit that is used
 *  to time-stamp the events in the sequence.
 *  
 *  A Sequence can be created from a MIDI file by reading the file
 *  into an input stream and invoking one of the getSequence methods of
 *  MidiSystem.  A sequence can also be built from scratch by adding new
 *  Tracks to an empty Sequence, and adding
 *  MidiEvent objects to these Tracks.
 */
class Sequence extends Object {

    /** Constructs a new MIDI sequence with the specified timing division
     *  type and timing resolution.
     */
    @stub
    def this(divisionType: Float, resolution: Int) = ???

    /** The timing division type of the sequence. */
    @stub
    protected val divisionType: Float = ???

    /** The timing resolution of the sequence. */
    @stub
    protected val resolution: Int = ???

    /** Creates a new, initially empty track as part of this sequence. */
    @stub
    def createTrack(): Track = ???

    /** Removes the specified track from the sequence. */
    @stub
    def deleteTrack(track: Track): Boolean = ???

    /** Obtains the timing division type for this sequence. */
    @stub
    def getDivisionType(): Float = ???

    /** Obtains the duration of this sequence, expressed in microseconds. */
    @stub
    def getMicrosecondLength(): Long = ???

    /** Obtains a list of patches referenced in this sequence. */
    @stub
    def getPatchList(): Array[Patch] = ???

    /** Obtains the timing resolution for this sequence. */
    @stub
    def getResolution(): Int = ???

    /** Obtains the duration of this sequence, expressed in MIDI ticks. */
    @stub
    def getTickLength(): Long = ???
}

object Sequence {
    /** The tempo-based timing type, for which the resolution is expressed in pulses (ticks) per quarter note. */
    @stub
    val PPQ: Float = ???

    /** The SMPTE-based timing type with 24 frames per second (resolution is expressed in ticks per frame). */
    @stub
    val SMPTE_24: Float = ???

    /** The SMPTE-based timing type with 25 frames per second (resolution is expressed in ticks per frame). */
    @stub
    val SMPTE_25: Float = ???

    /** The SMPTE-based timing type with 30 frames per second (resolution is expressed in ticks per frame). */
    @stub
    val SMPTE_30: Float = ???

    /** The SMPTE-based timing type with 29.97 frames per second (resolution is expressed in ticks per frame). */
    @stub
    val SMPTE_30DROP: Float = ???
}
