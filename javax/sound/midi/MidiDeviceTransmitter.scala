package javax.sound.midi

import scala.scalanative.annotation.stub

/** MidiDeviceTransmitter is a Transmitter which represents
 *  a MIDI input connector of a MidiDevice
 *  (see MidiDevice.getTransmitter()).
 */
trait MidiDeviceTransmitter extends Transmitter {

    /** Obtains a MidiDevice object which is an owner of this Transmitter. */
    @stub
    def getMidiDevice(): MidiDevice = ???
}
