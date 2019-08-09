package javax.sound.midi

import scala.scalanative.annotation.stub

/** MidiDeviceReceiver is a Receiver which represents
 *  a MIDI input connector of a MidiDevice
 *  (see MidiDevice.getReceiver()).
 */
trait MidiDeviceReceiver extends Receiver {

    /** Obtains a MidiDevice object which is an owner of this Receiver. */
    @stub
    def getMidiDevice(): MidiDevice = ???
}
