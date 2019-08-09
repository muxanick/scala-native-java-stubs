package javax.sound.midi

import java.lang.AutoCloseable

// A Receiver receives MidiEvent objects and
// typically does something useful in response, such as interpreting them to
// generate sound or raw MIDI output.  Common MIDI receivers include
// synthesizers and MIDI Out ports.
trait Receiver extends AutoCloseable {

    @stub
    // Indicates that the application has finished using the receiver, and
    // that limited resources it requires may be released or made available.
    def close(): Unit = ???
}
