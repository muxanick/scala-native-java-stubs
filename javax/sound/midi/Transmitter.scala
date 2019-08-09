package javax.sound.midi

import java.lang.AutoCloseable

/** A Transmitter sends MidiEvent objects to one or more
 *  Receivers. Common MIDI transmitters include sequencers
 *  and MIDI input ports.
 */
trait Transmitter extends AutoCloseable {

    /** Indicates that the application has finished using the transmitter, and
     *  that limited resources it requires may be released or made available.
     */
    @stub
    def close(): Unit = ???

    /** Obtains the current receiver to which this transmitter will deliver MIDI messages. */
    @stub
    def getReceiver(): Receiver = ???
}
