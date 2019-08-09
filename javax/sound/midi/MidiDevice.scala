package javax.sound.midi

import java.lang.AutoCloseable
import java.util.List

// MidiDevice is the base interface for all MIDI devices.
// Common devices include synthesizers, sequencers, MIDI input ports, and MIDI
// output ports.
//
// A MidiDevice can be a transmitter or a receiver of
// MIDI events, or both. Therefore, it can provide Transmitter
// or Receiver instances (or both). Typically, MIDI IN ports
// provide transmitters, MIDI OUT ports and synthesizers provide
// receivers. A Sequencer typically provides transmitters for playback
// and receivers for recording.
//
// A MidiDevice can be opened and closed explicitly as
// well as implicitly. Explicit opening is accomplished by calling
// open(), explicit closing is done by calling close() on the MidiDevice instance.
// If an application opens a MidiDevice
// explicitly, it has to close it explicitly to free system resources
// and enable the application to exit cleanly. Implicit opening is
// done by calling MidiSystem.getReceiver and MidiSystem.getTransmitter. The MidiDevice used by
// MidiSystem.getReceiver and
// MidiSystem.getTransmitter is implementation-dependant
// unless the properties javax.sound.midi.Receiver
// and javax.sound.midi.Transmitter are used (see the
// description of properties to select default providers in
// MidiSystem). A MidiDevice
// that was opened implicitly, is closed implicitly by closing the
// Receiver or Transmitter that resulted in
// opening it. If more than one implicitly opening
// Receiver or Transmitter were obtained by
// the application, the device is closed after the last
// Receiver or Transmitter has been
// closed. On the other hand, calling getReceiver or
// getTransmitter on the device instance directly does
// not open the device implicitly. Closing these
// Transmitters and Receivers does not close
// the device implicitly. To use a device with Receivers
// or Transmitters obtained this way, the device has to
// be opened and closed explicitly.
//
// If implicit and explicit opening and closing are mixed on the
// same MidiDevice instance, the following rules apply:
//
// 
// After an explicit open (either before or after implicit
// opens), the device will not be closed by implicit closing. The only
// way to close an explicitly opened device is an explicit close.
//
// An explicit close always closes the device, even if it also has
// been opened implicitly. A subsequent implicit close has no further
// effect.
// 
//
// To detect if a MidiDevice represents a hardware MIDI port, the
// following programming technique can be used:
//
// 
// MidiDevice device = ...;
// if ( ! (device instanceof Sequencer) && ! (device instanceof Synthesizer)) {
//   // we're now sure that device represents a MIDI port
//   // ...
// }
// 
//
// 
// A MidiDevice includes a MidiDevice.Info object
// to provide manufacturer information and so on.
trait MidiDevice extends AutoCloseable {

    @stub
    // Closes the device, indicating that the device should now release
    // any system resources it is using.
    def close(): Unit = ???

    @stub
    // Obtains information about the device, including its Java class and
    // Strings containing its name, vendor, and description.
    def getDeviceInfo(): MidiDevice.Info = ???

    @stub
    // Obtains the maximum number of MIDI IN connections available on this
    // MIDI device for receiving MIDI data.
    def getMaxReceivers(): Int = ???

    @stub
    // Obtains the maximum number of MIDI OUT connections available on this
    // MIDI device for transmitting MIDI data.
    def getMaxTransmitters(): Int = ???

    @stub
    // Obtains the current time-stamp of the device, in microseconds.
    def getMicrosecondPosition(): Long = ???

    @stub
    // Obtains a MIDI IN receiver through which the MIDI device may receive
    // MIDI data.
    def getReceiver(): Receiver = ???

    @stub
    // Returns all currently active, non-closed receivers
    // connected with this MidiDevice.
    def getReceivers(): List[Receiver] = ???

    @stub
    // Obtains a MIDI OUT connection from which the MIDI device will transmit
    // MIDI data  The returned transmitter must be closed when the application
    // has finished using it.
    def getTransmitter(): Transmitter = ???

    @stub
    // Returns all currently active, non-closed transmitters
    // connected with this MidiDevice.
    def getTransmitters(): List[Transmitter] = ???

    @stub
    // Reports whether the device is open.
    def isOpen(): Boolean = ???
}
