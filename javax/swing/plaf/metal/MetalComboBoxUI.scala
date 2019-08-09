package javax.swing.plaf.metal

import java.awt.{Container, Dimension, Graphics, LayoutManager, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JButton, JComponent}
import javax.swing.plaf.{ComboBoxUI, ComponentUI}
import javax.swing.plaf.basic.{BasicComboBoxUI, ComboPopup}

// Metal UI for JComboBox
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalComboBoxUI extends BasicComboBoxUI {

    @stub
    // This class should be treated as a "protected" inner class.
    def MetalComboBoxUI.MetalComboBoxLayoutManager: class = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.4.
    //
    def MetalComboBoxUI.MetalComboPopup: class = ???

    @stub
    // This protected method is implementation specific and should be private.
    def configureEditor(): Unit = ???

    @stub
    // Creates a button which will be used as the control to show or hide
    // the popup portion of the combo box.
    protected def createArrowButton(): JButton = ???

    @stub
    // Creates the default editor that will be used in editable combo boxes.
    protected def createEditor(): ComboBoxEditor = ???

    @stub
    // Creates a layout manager for managing the components which make up the
    // combo box.
    protected def createLayoutManager(): LayoutManager = ???

    @stub
    // Creates the popup portion of the combo box.
    protected def createPopup(): ComboPopup = ???

    @stub
    // Creates a PropertyChangeListener which will be added to
    // the combo box.
    def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.4.
    //
    protected def editablePropertyChanged(e: PropertyChangeEvent): Unit = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // The minimum size is the size of the display area plus insets plus the button.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    def layoutComboBox(parent: Container, manager: MetalComboBoxUI.MetalComboBoxLayoutManager): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // If necessary paints the currently selected item.
    def paintCurrentValue(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    @stub
    // If necessary paints the background of the currently selected item.
    def paintCurrentValueBackground(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    @stub
    // Deprecated. 
    //As of Java 2 platform v1.4.
    //
    protected def removeListeners(): Unit = ???
}

object MetalComboBoxUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
