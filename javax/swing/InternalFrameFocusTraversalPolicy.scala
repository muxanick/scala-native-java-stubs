package javax.swing

import java.awt.FocusTraversalPolicy
import java.lang.Object

/** A FocusTraversalPolicy which can optionally provide an algorithm for
 *  determining a JInternalFrame's initial Component. The initial Component is
 *  the first to receive focus when the JInternalFrame is first selected. By
 *  default, this is the same as the JInternalFrame's default Component to
 *  focus.
 */
abstract class InternalFrameFocusTraversalPolicy extends FocusTraversalPolicy {
}
