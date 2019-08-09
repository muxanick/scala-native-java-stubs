package javax.sound.midi

import java.lang.Object

// A MIDI track is an independent stream of MIDI events (time-stamped MIDI
// data) that can be stored along with other tracks in a standard MIDI file.
// The MIDI specification allows only 16 channels of MIDI data, but tracks
// are a way to get around this limitation.  A MIDI file can contain any number
// of tracks, each containing its own stream of up to 16 channels of MIDI data.
// 
// A Track occupies a middle level in the hierarchy of data played
// by a Sequencer: sequencers play sequences, which contain tracks,
// which contain MIDI events.  A sequencer may provide controls that mute
// or solo individual tracks.
// 
// The timing information and resolution for a track is controlled by and stored
// in the sequence containing the track. A given Track
// is considered to belong to the particular Sequence that
// maintains its timing. For this reason, a new (empty) track is created by calling the
// Sequence.createTrack() method, rather than by directly invoking a
// Track constructor.
// 
// The Track class provides methods to edit the track by adding
// or removing MidiEvent objects from it.  These operations keep
// the event list in the correct time order.  Methods are also
// included to obtain the track's size, in terms of either the number of events
// it contains or its duration in ticks.
class Track extends Object {

    @stub
    // Adds a new event to the track.
    def add(event: MidiEvent): Boolean = ???

    @stub
    // Obtains the event at the specified index.
    def get(index: Int): MidiEvent = ???

    @stub
    // Removes the specified event from the track.
    def remove(event: MidiEvent): Boolean = ???

    @stub
    // Obtains the number of events in this track.
    def size(): Int = ???
}
