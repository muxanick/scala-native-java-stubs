package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JButton, JComponent, ListCellRenderer}
import javax.swing.plaf.{ComboBoxUI, ComponentUI}
import javax.swing.plaf.basic.{BasicComboBoxUI, ComboPopup}

/** Provides the Synth L&F UI delegate for
 *  JComboBox.
 */
class SynthComboBoxUI extends BasicComboBoxUI with PropertyChangeListener with SynthUI {

    /** Creates a button which will be used as the control to show or hide
     *  the popup portion of the combo box.
     */
    @stub
    protected def createArrowButton(): JButton = ???

    /** Creates the default editor that will be used in editable combo boxes. */
    @stub
    protected def createEditor(): ComboBoxEditor = ???

    /** Creates the popup portion of the combo box. */
    @stub
    protected def createPopup(): ComboPopup = ???

    /** Creates the default renderer that will be used in a non-editiable combo
     *  box.
     */
    @stub
    protected def createRenderer(): ListCellRenderer = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Returns the default size of an empty display area of the combo box using
     *  the current renderer and font.
     */
    @stub
    protected def getDefaultSize(): Dimension = ???

    /** Installs the default colors, default font, default renderer, and default
     *  editor into the JComboBox.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Creates and installs listeners for the combo box and its model. */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints the currently selected item. */
    @stub
    def paintCurrentValue(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Uninstalls the default colors, default font, default renderer,
     *  and default editor from the combo box.
     */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Removes the installed listeners from the combo box and its model. */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object SynthComboBoxUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
