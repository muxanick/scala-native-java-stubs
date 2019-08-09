package javax.sound.midi

import java.util.EventListener

// The ControllerEventListener interface should be implemented
// by classes whose instances need to be notified when a Sequencer
// has processed a requested type of MIDI control-change event.
// To register a ControllerEventListener object to receive such
// notifications, invoke the
// addControllerEventListener method of Sequencer,
// specifying the types of MIDI controllers about which you are interested in
// getting control-change notifications.
trait ControllerEventListener extends EventListener {
}
