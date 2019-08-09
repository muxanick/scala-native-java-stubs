package javax.sound.midi

import java.lang.Object

// MIDI events contain a MIDI message and a corresponding time-stamp
// expressed in ticks, and can represent the MIDI event information
// stored in a MIDI file or a Sequence object.  The
// duration of a tick is specified by the timing information contained
// in the MIDI file or Sequence object.
// 
// In Java Sound, MidiEvent objects are typically contained in a
// Track, and Tracks are likewise
// contained in a Sequence.
class MidiEvent extends Object {

    @stub
    // Obtains the MIDI message contained in the event.
    def getMessage(): MidiMessage = ???

    @stub
    // Obtains the time-stamp for the event, in MIDI ticks
    def getTick(): Long = ???
}
