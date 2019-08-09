package javax.sound.midi

import java.lang.{Object, String}

// A MidiDevice.Info object contains assorted
// data about a MidiDevice, including its
// name, the company who created it, and descriptive text.
object MidiDevice.Info extends Object {

    @stub
    // Reports whether two objects are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Obtains the description of the device.
    def getDescription(): String = ???

    @stub
    // Obtains the name of the device.
    def getName(): String = ???

    @stub
    // Obtains the name of the company who supplies the device.
    def getVendor(): String = ???

    @stub
    // Obtains the version of the device.
    def getVersion(): String = ???

    @stub
    // Finalizes the hashcode method.
    def hashCode(): Int = ???
}
