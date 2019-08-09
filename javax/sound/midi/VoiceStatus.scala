package javax.sound.midi

import java.lang.Object

/** A VoiceStatus object contains information about the current
 *  status of one of the voices produced by a Synthesizer.
 *  
 *  MIDI synthesizers are generally capable of producing some maximum number of
 *  simultaneous notes, also referred to as voices.  A voice is a stream
 *  of successive single notes, and the process of assigning incoming MIDI notes to
 *  specific voices is known as voice allocation.
 *  However, the voice-allocation algorithm and the contents of each voice are
 *  normally internal to a MIDI synthesizer and hidden from outside view.  One can, of
 *  course, learn from MIDI messages which notes the synthesizer is playing, and
 *  one might be able deduce something about the assignment of notes to voices.
 *  But MIDI itself does not provide a means to report which notes a
 *  synthesizer has assigned to which voice, nor even to report how many voices
 *  the synthesizer is capable of synthesizing.
 *  
 *  In Java Sound, however, a
 *  Synthesizer class can expose the contents of its voices through its
 *  getVoiceStatus() method.
 *  This behavior is recommended but optional;
 *  synthesizers that don't expose their voice allocation simply return a
 *  zero-length array. A Synthesizer that does report its voice status
 *  should maintain this information at
 *  all times for all of its voices, whether they are currently sounding or
 *  not.  In other words, a given type of Synthesizer always has a fixed
 *  number of voices, equal to the maximum number of simultaneous notes it is
 *  capable of sounding.
 *  
 *  
 *  If the voice is not currently processing a MIDI note, it
 *  is considered inactive.  A voice is inactive when it has
 *  been given no note-on commands, or when every note-on command received has
 *  been terminated by a corresponding note-off (or by an "all notes off"
 *  message).  For example, this happens when a synthesizer capable of playing 16
 *  simultaneous notes is told to play a four-note chord; only
 *  four voices are active in this case (assuming no earlier notes are still playing).
 *  Usually, a voice whose status is reported as active is producing audible sound, but this
 *  is not always true; it depends on the details of the instrument (that
 *  is, the synthesis algorithm) and how long the note has been going on.
 *  For example, a voice may be synthesizing the sound of a single hand-clap.  Because
 *  this sound dies away so quickly, it may become inaudible before a note-off
 *  message is received.  In such a situation, the voice is still considered active
 *  even though no sound is currently being produced.
 *  
 *  Besides its active or inactive status, the VoiceStatus class
 *  provides fields that reveal the voice's current MIDI channel, bank and
 *  program number, MIDI note number, and MIDI volume.  All of these can
 *  change during the course of a voice.  While the voice is inactive, each
 *  of these fields has an unspecified value, so you should check the active
 *  field first.
 */
class VoiceStatus extends Object {

    /** Indicates whether the voice is currently processing a MIDI note. */
    @stub
    val active: Boolean = ???

    /** The bank number of the instrument that this voice is currently using. */
    @stub
    val bank: Int = ???

    /** The MIDI channel on which this voice is playing. */
    @stub
    val channel: Int = ???

    /** The MIDI note that this voice is playing. */
    @stub
    val note: Int = ???

    /** The program number of the instrument that this voice is currently using. */
    @stub
    val program: Int = ???
}
