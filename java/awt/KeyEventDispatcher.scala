package java.awt

import java.awt.event.KeyEvent
import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** A KeyEventDispatcher cooperates with the current KeyboardFocusManager in the
 *  targeting and dispatching of all KeyEvents. KeyEventDispatchers registered
 *  with the current KeyboardFocusManager will receive KeyEvents before they are
 *  dispatched to their targets, allowing each KeyEventDispatcher to retarget
 *  the event, consume it, dispatch the event itself, or make other changes.
 *  
 *  Note that KeyboardFocusManager itself implements KeyEventDispatcher. By
 *  default, the current KeyboardFocusManager will be the sink for all KeyEvents
 *  not dispatched by the registered KeyEventDispatchers. The current
 *  KeyboardFocusManager cannot be completely deregistered as a
 *  KeyEventDispatcher. However, if a KeyEventDispatcher reports that it
 *  dispatched the KeyEvent, regardless of whether it actually did so, the
 *  KeyboardFocusManager will take no further action with regard to the
 *  KeyEvent. (While it is possible for client code to register the current
 *  KeyboardFocusManager as a KeyEventDispatcher one or more times, this is
 *  usually unnecessary and not recommended.)
 */
@FunctionalInterface
trait KeyEventDispatcher {

    /** This method is called by the current KeyboardFocusManager requesting
     *  that this KeyEventDispatcher dispatch the specified event on its behalf.
     */
    @stub
    def dispatchKeyEvent(e: KeyEvent): Boolean = ???
}
