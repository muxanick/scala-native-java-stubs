package javax.sound.midi

import java.lang.{Exception, Object, Throwable}

/** A MidiUnavailableException is thrown when a requested MIDI
 *  component cannot be opened or created because it is unavailable.  This often
 *  occurs when a device is in use by another application.  More generally, it
 *  can occur when there is a finite number of a certain kind of resource that can
 *  be used for some purpose, and all of them are already in use (perhaps all by
 *  this application).  For an example of the latter case, see the
 *  setReceiver method of
 *  Transmitter.
 */
class MidiUnavailableException extends Exception {

    /** Constructs a MidiUnavailableException that has
     *  null as its error detail message.
     */
    @stub
    def this() = ???
}
