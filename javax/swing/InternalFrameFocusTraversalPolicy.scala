package javax.swing

import java.awt.{Component, FocusTraversalPolicy}
import java.lang.Object
import scala.scalanative.annotation.stub

/** A FocusTraversalPolicy which can optionally provide an algorithm for
 *  determining a JInternalFrame's initial Component. The initial Component is
 *  the first to receive focus when the JInternalFrame is first selected. By
 *  default, this is the same as the JInternalFrame's default Component to
 *  focus.
 */
abstract class InternalFrameFocusTraversalPolicy extends FocusTraversalPolicy {

    /**  */
    @stub
    def this() = ???

    /** Returns the Component that should receive the focus when a
     *  JInternalFrame is selected for the first time.
     */
    def getInitialComponent(frame: JInternalFrame): Component
}
