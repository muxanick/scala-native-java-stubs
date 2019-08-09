package javax.swing.plaf

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics}
import java.lang.Object
import javax.accessibility.Accessible
import javax.swing.JComponent
import scala.scalanative.annotation.stub

/** The base class for all UI delegate objects in the Swing pluggable
 *  look and feel architecture.  The UI delegate object for a Swing
 *  component is responsible for implementing the aspects of the
 *  component that depend on the look and feel.
 *  The JComponent class
 *  invokes methods from this class in order to delegate operations
 *  (painting, layout calculations, etc.) that may vary depending on the
 *  look and feel installed.  Client programs should not invoke methods
 *  on this class directly.
 */
abstract class ComponentUI extends Object {

    /** Sole constructor. */
    @stub
    def this() = ???

    /** Returns true if the specified x,y location is
     *  contained within the look and feel's defined shape of the specified
     *  component.
     */
    def contains(c: JComponent, x: Int, y: Int): Boolean

    /** Returns the ith Accessible child of the object. */
    def getAccessibleChild(c: JComponent, i: Int): Accessible

    /** Returns the number of accessible children in the object. */
    def getAccessibleChildrenCount(c: JComponent): Int

    /** Returns the baseline. */
    def getBaseline(c: JComponent, width: Int, height: Int): Int

    /** Returns an enum indicating how the baseline of he component
     *  changes as the size changes.
     */
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    def getMaximumSize(c: JComponent): Dimension

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    def getMinimumSize(c: JComponent): Dimension

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    def getPreferredSize(c: JComponent): Dimension

    /** Configures the specified component appropriately for the look and feel. */
    def installUI(c: JComponent): Unit

    /** Paints the specified component appropriately for the look and feel. */
    def paint(g: Graphics, c: JComponent): Unit

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    def uninstallUI(c: JComponent): Unit

    /** Notifies this UI delegate that it is time to paint the specified
     *  component.
     */
    def update(g: Graphics, c: JComponent): Unit
}

object ComponentUI {
    /** Returns an instance of the UI delegate for the specified component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
