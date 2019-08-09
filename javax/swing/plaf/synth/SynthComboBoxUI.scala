package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JButton, JComponent, ListCellRenderer}
import javax.swing.plaf.{ComboBoxUI, ComponentUI}
import javax.swing.plaf.basic.{BasicComboBoxUI, ComboPopup}

// Provides the Synth L&F UI delegate for
// JComboBox.
class SynthComboBoxUI extends BasicComboBoxUI with PropertyChangeListener, with SynthUI {

    @stub
    // Creates a button which will be used as the control to show or hide
    // the popup portion of the combo box.
    protected def createArrowButton(): JButton = ???

    @stub
    // Creates the default editor that will be used in editable combo boxes.
    protected def createEditor(): ComboBoxEditor = ???

    @stub
    // Creates the popup portion of the combo box.
    protected def createPopup(): ComboPopup = ???

    @stub
    // Creates the default renderer that will be used in a non-editiable combo
    // box.
    protected def createRenderer(): ListCellRenderer = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Returns the default size of an empty display area of the combo box using
    // the current renderer and font.
    protected def getDefaultSize(): Dimension = ???

    @stub
    // Installs the default colors, default font, default renderer, and default
    // editor into the JComboBox.
    protected def installDefaults(): Unit = ???

    @stub
    // Creates and installs listeners for the combo box and its model.
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the specified component according to the Look and Feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Paints the currently selected item.
    def paintCurrentValue(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Uninstalls the default colors, default font, default renderer,
    // and default editor from the combo box.
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Removes the installed listeners from the combo box and its model.
    protected def uninstallListeners(): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object SynthComboBoxUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
