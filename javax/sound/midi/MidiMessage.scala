package javax.sound.midi

import java.lang.{Cloneable, Object}

// MidiMessage is the base class for MIDI messages.  They include
// not only the standard MIDI messages that a synthesizer can respond to, but also
// "meta-events" that can be used by sequencer programs.  There are meta-events
// for such information as lyrics, copyrights, tempo indications, time and key
// signatures, markers, etc.  For more information, see the Standard MIDI Files 1.0
// specification, which is part of the Complete MIDI 1.0 Detailed Specification
// published by the MIDI Manufacturer's Association
// (http://www.midi.org).
// 
// The base MidiMessage class provides access to three types of
// information about a MIDI message:
// 
// The messages's status byte
// The total length of the message in bytes (the status byte plus any data bytes)
// A byte array containing the complete message
// 
//
// MidiMessage includes methods to get, but not set, these values.
// Setting them is a subclass responsibility.
// 
// 
// The MIDI standard expresses MIDI data in bytes.  However, because
// JavaTM uses signed bytes, the Java Sound API uses integers
// instead of bytes when expressing MIDI data.  For example, the
// getStatus() method of
// MidiMessage returns MIDI status bytes as integers.  If you are
// processing MIDI data that originated outside Java Sound and now
// is encoded as signed bytes, the bytes can
// can be converted to integers using this conversion:
// int i = (int)(byte & 0xFF)
// 
// If you simply need to pass a known MIDI byte value as a method parameter,
// it can be expressed directly as an integer, using (for example) decimal or
// hexadecimal notation.  For instance, to pass the "active sensing" status byte
// as the first argument to ShortMessage's
// setMessage(int)
// method, you can express it as 254 or 0xFE.
abstract class MidiMessage extends Object with Cloneable {

    // The MIDI message data.
    protected def data: Array[Byte]

    // Creates a new object of the same class and with the same contents
    // as this object.
    def clone(): Object

    // Obtains the total length of the MIDI message in bytes.
    def getLength(): Int

    // Obtains the MIDI message data.
    def getMessage(): Array[Byte]

    // Obtains the status byte for the MIDI message.
    def getStatus(): Int
}
