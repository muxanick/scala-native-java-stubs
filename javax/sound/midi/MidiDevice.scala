package javax.sound.midi

import java.lang.{AutoCloseable, Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** MidiDevice is the base interface for all MIDI devices.
 *  Common devices include synthesizers, sequencers, MIDI input ports, and MIDI
 *  output ports.
 * 
 *  A MidiDevice can be a transmitter or a receiver of
 *  MIDI events, or both. Therefore, it can provide Transmitter
 *  or Receiver instances (or both). Typically, MIDI IN ports
 *  provide transmitters, MIDI OUT ports and synthesizers provide
 *  receivers. A Sequencer typically provides transmitters for playback
 *  and receivers for recording.
 * 
 *  A MidiDevice can be opened and closed explicitly as
 *  well as implicitly. Explicit opening is accomplished by calling
 *  open(), explicit closing is done by calling close() on the MidiDevice instance.
 *  If an application opens a MidiDevice
 *  explicitly, it has to close it explicitly to free system resources
 *  and enable the application to exit cleanly. Implicit opening is
 *  done by calling MidiSystem.getReceiver and MidiSystem.getTransmitter. The MidiDevice used by
 *  MidiSystem.getReceiver and
 *  MidiSystem.getTransmitter is implementation-dependant
 *  unless the properties javax.sound.midi.Receiver
 *  and javax.sound.midi.Transmitter are used (see the
 *  description of properties to select default providers in
 *  MidiSystem). A MidiDevice
 *  that was opened implicitly, is closed implicitly by closing the
 *  Receiver or Transmitter that resulted in
 *  opening it. If more than one implicitly opening
 *  Receiver or Transmitter were obtained by
 *  the application, the device is closed after the last
 *  Receiver or Transmitter has been
 *  closed. On the other hand, calling getReceiver or
 *  getTransmitter on the device instance directly does
 *  not open the device implicitly. Closing these
 *  Transmitters and Receivers does not close
 *  the device implicitly. To use a device with Receivers
 *  or Transmitters obtained this way, the device has to
 *  be opened and closed explicitly.
 * 
 *  If implicit and explicit opening and closing are mixed on the
 *  same MidiDevice instance, the following rules apply:
 * 
 *  
 *  After an explicit open (either before or after implicit
 *  opens), the device will not be closed by implicit closing. The only
 *  way to close an explicitly opened device is an explicit close.
 * 
 *  An explicit close always closes the device, even if it also has
 *  been opened implicitly. A subsequent implicit close has no further
 *  effect.
 *  
 * 
 *  To detect if a MidiDevice represents a hardware MIDI port, the
 *  following programming technique can be used:
 * 
 *  
 *  MidiDevice device = ...;
 *  if ( ! (device instanceof Sequencer) && ! (device instanceof Synthesizer)) {
 *    // we're now sure that device represents a MIDI port
 *    // ...
 *  }
 *  
 * 
 *  
 *  A MidiDevice includes a MidiDevice.Info object
 *  to provide manufacturer information and so on.
 */
trait MidiDevice extends AutoCloseable {

    /** Closes the device, indicating that the device should now release
     *  any system resources it is using.
     */
    @stub
    def close(): Unit = ???

    /** Obtains information about the device, including its Java class and
     *  Strings containing its name, vendor, and description.
     */
    @stub
    def getDeviceInfo(): MidiDevice.Info = ???

    /** Obtains the maximum number of MIDI IN connections available on this
     *  MIDI device for receiving MIDI data.
     */
    @stub
    def getMaxReceivers(): Int = ???

    /** Obtains the maximum number of MIDI OUT connections available on this
     *  MIDI device for transmitting MIDI data.
     */
    @stub
    def getMaxTransmitters(): Int = ???

    /** Obtains the current time-stamp of the device, in microseconds. */
    @stub
    def getMicrosecondPosition(): Long = ???

    /** Obtains a MIDI IN receiver through which the MIDI device may receive
     *  MIDI data.
     */
    @stub
    def getReceiver(): Receiver = ???

    /** Returns all currently active, non-closed receivers
     *  connected with this MidiDevice.
     */
    @stub
    def getReceivers(): List[Receiver] = ???

    /** Obtains a MIDI OUT connection from which the MIDI device will transmit
     *  MIDI data  The returned transmitter must be closed when the application
     *  has finished using it.
     */
    @stub
    def getTransmitter(): Transmitter = ???

    /** Returns all currently active, non-closed transmitters
     *  connected with this MidiDevice.
     */
    @stub
    def getTransmitters(): List[Transmitter] = ???

    /** Reports whether the device is open. */
    @stub
    def isOpen(): Boolean = ???

    /** Opens the device, indicating that it should now acquire any
     *  system resources it requires and become operational.
     */
    @stub
    def open(): Unit = ???
}

object MidiDevice {
    /** A MidiDevice.Info object contains assorted
     *  data about a MidiDevice, including its
     *  name, the company who created it, and descriptive text.
     */
    object Info extends Object {

        /** Constructs a device info object. */
        @stub
        protected def apply(name: String, vendor: String, description: String, version: String) = ???

        /** Reports whether two objects are equal. */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Obtains the description of the device. */
        @stub
        def getDescription(): String = ???

        /** Obtains the name of the device. */
        @stub
        def getName(): String = ???

        /** Obtains the name of the company who supplies the device. */
        @stub
        def getVendor(): String = ???

        /** Obtains the version of the device. */
        @stub
        def getVersion(): String = ???

        /** Finalizes the hashcode method. */
        @stub
        def hashCode(): Int = ???

        /** Provides a string representation of the device information. */
        @stub
        def toString(): String = ???
    }

}
