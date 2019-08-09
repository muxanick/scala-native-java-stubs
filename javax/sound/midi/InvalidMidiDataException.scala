package javax.sound.midi

import java.lang.{Exception, Object, Throwable}

// An InvalidMidiDataException indicates that inappropriate MIDI
// data was encountered. This often means that the data is invalid in and of
// itself, from the perspective of the MIDI specification.  An example would
// be an undefined status byte.  However, the exception might simply
// mean that the data was invalid in the context it was used, or that
// the object to which the data was given was unable to parse or use it.
// For example, a file reader might not be able to parse a Type 2 MIDI file, even
// though that format is defined in the MIDI specification.
class InvalidMidiDataException extends Exception {

    @stub
    // Constructs an InvalidMidiDataException with
    // null for its error detail message.
    def this() = ???
}