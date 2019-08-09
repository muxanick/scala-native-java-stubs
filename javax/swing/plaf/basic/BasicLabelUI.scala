package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, FontMetrics, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JLabel}
import javax.swing.plaf.{ComponentUI, LabelUI}

// A Windows L&F implementation of LabelUI.  This implementation
// is completely static, i.e. there's only one UIView implementation
// that's shared by all JLabel objects.
class BasicLabelUI extends LabelUI with PropertyChangeListener {

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Registers components.
    protected def installComponents(c: JLabel): Unit = ???

    @stub
    // Installs default properties.
    protected def installDefaults(c: JLabel): Unit = ???

    @stub
    // Registers keyboard actions.
    protected def installKeyboardActions(l: JLabel): Unit = ???

    @stub
    // Registers listeners.
    protected def installListeners(c: JLabel): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Forwards the call to SwingUtilities.layoutCompoundLabel().
    protected def layoutCL(label: JLabel, fontMetrics: FontMetrics, text: String, icon: Icon, viewR: Rectangle, iconR: Rectangle, textR: Rectangle): String = ???

    @stub
    // Paints the label text with the foreground color, if the label is opaque
    // then paints the entire background with the background color.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paint clippedText at textX, textY with background.lighter() and then
    // shifted down and to the right by one pixel with background.darker().
    protected def paintDisabledText(l: JLabel, g: Graphics, s: String, textX: Int, textY: Int): Unit = ???

    @stub
    // Paint clippedText at textX, textY with the labels foreground color.
    protected def paintEnabledText(l: JLabel, g: Graphics, s: String, textX: Int, textY: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Unregisters components.
    protected def uninstallComponents(c: JLabel): Unit = ???

    @stub
    // Uninstalls default properties.
    protected def uninstallDefaults(c: JLabel): Unit = ???

    @stub
    // Unregisters keyboard actions.
    protected def uninstallKeyboardActions(c: JLabel): Unit = ???

    @stub
    // Unregisters listeners.
    protected def uninstallListeners(c: JLabel): Unit = ???
}

object BasicLabelUI {
    @stub
    // Returns an instance of BasicLabelUI.
    def createUI(c: JComponent): ComponentUI = ???
}
