package javax.swing

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Manages all the ToolTips in the system.
 *  
 *  ToolTipManager contains numerous properties for configuring how long it
 *  will take for the tooltips to become visible, and how long till they
 *  hide. Consider a component that has a different tooltip based on where
 *  the mouse is, such as JTree. When the mouse moves into the JTree and
 *  over a region that has a valid tooltip, the tooltip will become
 *  visible after initialDelay milliseconds. After
 *  dismissDelay milliseconds the tooltip will be hidden. If
 *  the mouse is over a region that has a valid tooltip, and the tooltip
 *  is currently visible, when the mouse moves to a region that doesn't have
 *  a valid tooltip the tooltip will be hidden. If the mouse then moves back
 *  into a region that has a valid tooltip within reshowDelay
 *  milliseconds, the tooltip will immediately be shown, otherwise the
 *  tooltip will be shown again after initialDelay milliseconds.
 */
class ToolTipManager extends MouseAdapter with MouseMotionListener {

    /**  */
    @stub
    protected object insideTimerAction extends ToolTipManager.insideTimerAction

    /**  */
    @stub
    protected object outsideTimerAction extends ToolTipManager.outsideTimerAction

    /**  */
    @stub
    protected object stillInsideTimerAction extends ToolTipManager.stillInsideTimerAction

    /**  */
    @stub
    protected val heavyWeightPopupEnabled: Boolean = ???

    /**  */
    @stub
    protected val lightWeightPopupEnabled: Boolean = ???

    /** Returns the dismissal delay value. */
    @stub
    def getDismissDelay(): Int = ???

    /** Returns the initial delay value. */
    @stub
    def getInitialDelay(): Int = ???

    /** Returns the reshow delay property. */
    @stub
    def getReshowDelay(): Int = ???

    /** Returns true if this object is enabled. */
    @stub
    def isEnabled(): Boolean = ???

    /** Returns true if lightweight (all-Java) Tooltips
     *  are in use, or false if heavyweight (native peer)
     *  Tooltips are being used.
     */
    @stub
    def isLightWeightPopupEnabled(): Boolean = ???

    /** Called when the mouse is pressed and dragged. */
    @stub
    def mouseDragged(event: MouseEvent): Unit = ???

    /** Called when the mouse enters the region of a component. */
    @stub
    def mouseEntered(event: MouseEvent): Unit = ???

    /** Called when the mouse exits the region of a component. */
    @stub
    def mouseExited(event: MouseEvent): Unit = ???

    /** Called when the mouse is moved. */
    @stub
    def mouseMoved(event: MouseEvent): Unit = ???

    /** Called when the mouse is pressed. */
    @stub
    def mousePressed(event: MouseEvent): Unit = ???

    /** Registers a component for tooltip management. */
    @stub
    def registerComponent(component: JComponent): Unit = ???

    /** Specifies the dismissal delay value. */
    @stub
    def setDismissDelay(milliseconds: Int): Unit = ???

    /** Enables or disables the tooltip. */
    @stub
    def setEnabled(flag: Boolean): Unit = ???

    /** Specifies the initial delay value. */
    @stub
    def setInitialDelay(milliseconds: Int): Unit = ???

    /** When displaying the JToolTip, the
     *  ToolTipManager chooses to use a lightweight
     *  JPanel if it fits.
     */
    @stub
    def setLightWeightPopupEnabled(aFlag: Boolean): Unit = ???

    /** Used to specify the amount of time before the user has to wait
     *  initialDelay milliseconds before a tooltip will be
     *  shown.
     */
    @stub
    def setReshowDelay(milliseconds: Int): Unit = ???

    /** Removes a component from tooltip control. */
    @stub
    def unregisterComponent(component: JComponent): Unit = ???
}

object ToolTipManager {
    /** Returns a shared ToolTipManager instance. */
    @stub
    def sharedInstance(): ToolTipManager = ???
}
