package javax.sound.midi

import java.lang.{Object, String}

/** A MidiDevice.Info object contains assorted
 *  data about a MidiDevice, including its
 *  name, the company who created it, and descriptive text.
 */
object MidiDevice.Info extends Object {

    /** Reports whether two objects are equal. */
    @stub
    def equals(obj: Object): Boolean = ???

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
}
