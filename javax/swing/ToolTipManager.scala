package javax.swing

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object

// Manages all the ToolTips in the system.
// 
// ToolTipManager contains numerous properties for configuring how long it
// will take for the tooltips to become visible, and how long till they
// hide. Consider a component that has a different tooltip based on where
// the mouse is, such as JTree. When the mouse moves into the JTree and
// over a region that has a valid tooltip, the tooltip will become
// visible after initialDelay milliseconds. After
// dismissDelay milliseconds the tooltip will be hidden. If
// the mouse is over a region that has a valid tooltip, and the tooltip
// is currently visible, when the mouse moves to a region that doesn't have
// a valid tooltip the tooltip will be hidden. If the mouse then moves back
// into a region that has a valid tooltip within reshowDelay
// milliseconds, the tooltip will immediately be shown, otherwise the
// tooltip will be shown again after initialDelay milliseconds.
class ToolTipManager extends MouseAdapter with MouseMotionListener {

    @stub
    // 
    protected def ToolTipManager.insideTimerAction: class = ???

    @stub
    // 
    protected def ToolTipManager.outsideTimerAction: class = ???

    @stub
    // 
    protected def heavyWeightPopupEnabled: Boolean = ???

    @stub
    // Returns the dismissal delay value.
    def getDismissDelay(): Int = ???

    @stub
    // Returns the initial delay value.
    def getInitialDelay(): Int = ???

    @stub
    // Returns the reshow delay property.
    def getReshowDelay(): Int = ???

    @stub
    // Returns true if this object is enabled.
    def isEnabled(): Boolean = ???

    @stub
    // Returns true if lightweight (all-Java) Tooltips
    // are in use, or false if heavyweight (native peer)
    // Tooltips are being used.
    def isLightWeightPopupEnabled(): Boolean = ???

    @stub
    // Called when the mouse is pressed and dragged.
    def mouseDragged(event: MouseEvent): Unit = ???

    @stub
    // Called when the mouse enters the region of a component.
    def mouseEntered(event: MouseEvent): Unit = ???

    @stub
    // Called when the mouse exits the region of a component.
    def mouseExited(event: MouseEvent): Unit = ???

    @stub
    // Called when the mouse is moved.
    def mouseMoved(event: MouseEvent): Unit = ???

    @stub
    // Called when the mouse is pressed.
    def mousePressed(event: MouseEvent): Unit = ???

    @stub
    // Registers a component for tooltip management.
    def registerComponent(component: JComponent): Unit = ???

    @stub
    // Specifies the dismissal delay value.
    def setDismissDelay(milliseconds: Int): Unit = ???

    @stub
    // Enables or disables the tooltip.
    def setEnabled(flag: Boolean): Unit = ???

    @stub
    // Specifies the initial delay value.
    def setInitialDelay(milliseconds: Int): Unit = ???

    @stub
    // When displaying the JToolTip, the
    // ToolTipManager chooses to use a lightweight
    // JPanel if it fits.
    def setLightWeightPopupEnabled(aFlag: Boolean): Unit = ???

    @stub
    // Used to specify the amount of time before the user has to wait
    // initialDelay milliseconds before a tooltip will be
    // shown.
    def setReshowDelay(milliseconds: Int): Unit = ???
}

object ToolTipManager {
    @stub
    // Returns a shared ToolTipManager instance.
    def sharedInstance(): ToolTipManager = ???
}
