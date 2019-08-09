package java.awt

import java.awt.event.KeyEvent
import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** A KeyEventPostProcessor cooperates with the current KeyboardFocusManager
 *  in the final resolution of all unconsumed KeyEvents. KeyEventPostProcessors
 *  registered with the current KeyboardFocusManager will receive KeyEvents
 *  after the KeyEvents have been dispatched to and handled by their targets.
 *  KeyEvents that would have been otherwise discarded because no Component in
 *  the application currently owns the focus will also be forwarded to
 *  registered KeyEventPostProcessors. This will allow applications to implement
 *  features that require global KeyEvent post-handling, such as menu shortcuts.
 *  
 *  Note that the KeyboardFocusManager itself implements KeyEventPostProcessor.
 *  By default, the current KeyboardFocusManager will be the final
 *  KeyEventPostProcessor in the chain. The current KeyboardFocusManager cannot
 *  be completely deregistered as a KeyEventPostProcessor. However, if a
 *  KeyEventPostProcessor reports that no further post-processing of the
 *  KeyEvent should take place, the AWT will consider the event fully handled
 *  and will take no additional action with regard to the event. (While it is
 *  possible for client code to register the current KeyboardFocusManager as
 *  a KeyEventPostProcessor one or more times, this is usually unnecessary and
 *  not recommended.)
 */
@FunctionalInterface trait KeyEventPostProcessor {

    /** This method is called by the current KeyboardFocusManager, requesting
     *  that this KeyEventPostProcessor perform any necessary post-processing
     *  which should be part of the KeyEvent's final resolution.
     */
    @stub
    def postProcessKeyEvent(e: KeyEvent): Boolean = ???
}
