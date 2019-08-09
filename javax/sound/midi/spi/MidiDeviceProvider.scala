package javax.sound.midi.spi

import java.lang.Object
import javax.sound.midi.{MidiDevice, MidiDevice.Info}

// A MidiDeviceProvider is a factory or provider for a particular type
// of MIDI device. This mechanism allows the implementation to determine how
// resources are managed in the creation and management of a device.
abstract class MidiDeviceProvider extends Object {

    // Obtains an instance of the device represented by the info object.
    def getDevice(info: MidiDevice.Info): MidiDevice

    // Obtains the set of info objects representing the device or devices
    // provided by this MidiDeviceProvider.
    def getDeviceInfo(): Array[MidiDevice.Info]
}
