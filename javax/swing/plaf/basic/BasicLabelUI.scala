package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, FontMetrics, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JLabel}
import javax.swing.plaf.{ComponentUI, LabelUI}

/** A Windows L&F implementation of LabelUI.  This implementation
 *  is completely static, i.e. there's only one UIView implementation
 *  that's shared by all JLabel objects.
 */
class BasicLabelUI extends LabelUI with PropertyChangeListener {

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Registers components. */
    @stub
    protected def installComponents(c: JLabel): Unit = ???

    /** Installs default properties. */
    @stub
    protected def installDefaults(c: JLabel): Unit = ???

    /** Registers keyboard actions. */
    @stub
    protected def installKeyboardActions(l: JLabel): Unit = ???

    /** Registers listeners. */
    @stub
    protected def installListeners(c: JLabel): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Forwards the call to SwingUtilities.layoutCompoundLabel(). */
    @stub
    protected def layoutCL(label: JLabel, fontMetrics: FontMetrics, text: String, icon: Icon, viewR: Rectangle, iconR: Rectangle, textR: Rectangle): String = ???

    /** Paints the label text with the foreground color, if the label is opaque
     *  then paints the entire background with the background color.
     */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paint clippedText at textX, textY with background.lighter() and then
     *  shifted down and to the right by one pixel with background.darker().
     */
    @stub
    protected def paintDisabledText(l: JLabel, g: Graphics, s: String, textX: Int, textY: Int): Unit = ???

    /** Paint clippedText at textX, textY with the labels foreground color. */
    @stub
    protected def paintEnabledText(l: JLabel, g: Graphics, s: String, textX: Int, textY: Int): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Unregisters components. */
    @stub
    protected def uninstallComponents(c: JLabel): Unit = ???

    /** Uninstalls default properties. */
    @stub
    protected def uninstallDefaults(c: JLabel): Unit = ???

    /** Unregisters keyboard actions. */
    @stub
    protected def uninstallKeyboardActions(c: JLabel): Unit = ???

    /** Unregisters listeners. */
    @stub
    protected def uninstallListeners(c: JLabel): Unit = ???
}

object BasicLabelUI {
    /** Returns an instance of BasicLabelUI. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
