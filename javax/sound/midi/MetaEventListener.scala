package javax.sound.midi

import java.util.EventListener

// The MetaEventListener interface should be implemented
// by classes whose instances need to be notified when a Sequencer
// has processed a MetaMessage.
// To register a MetaEventListener object to receive such
// notifications, pass it as the argument to the
// addMetaEventListener
// method of Sequencer.
trait MetaEventListener extends EventListener {
}
