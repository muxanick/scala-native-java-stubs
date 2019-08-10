package javax.swing.plaf.metal

import java.awt.{Container, Dimension, Graphics, LayoutManager, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JButton, JComponent}
import javax.swing.plaf.{ComboBoxUI, ComponentUI}
import javax.swing.plaf.basic.{BasicComboBoxUI, ComboPopup}
import scala.scalanative.annotation.stub

/** Metal UI for JComboBox
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MetalComboBoxUI extends BasicComboBoxUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    type MetalComboBoxLayoutManager = MetalComboBoxUI_MetalComboBoxLayoutManager

    /** Deprecated. 
     * As of Java 2 platform v1.4.
     * 
     */
    type MetalComboPopup = MetalComboBoxUI_MetalComboPopup

    /** This class should be treated as a "protected" inner class. */
    type MetalPropertyChangeListener = MetalComboBoxUI_MetalPropertyChangeListener

    /** This protected method is implementation specific and should be private. */
    @stub
    def configureEditor(): Unit = ???

    /** Creates a button which will be used as the control to show or hide
     *  the popup portion of the combo box.
     */
    @stub
    protected def createArrowButton(): JButton = ???

    /** Creates the default editor that will be used in editable combo boxes. */
    @stub
    protected def createEditor(): ComboBoxEditor = ???

    /** Creates a layout manager for managing the components which make up the
     *  combo box.
     */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /** Creates the popup portion of the combo box. */
    @stub
    protected def createPopup(): ComboPopup = ???

    /** Creates a PropertyChangeListener which will be added to
     *  the combo box.
     */
    @stub
    def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Deprecated. 
     * As of Java 2 platform v1.4.
     * 
     */
    @stub
    protected def editablePropertyChanged(e: PropertyChangeEvent): Unit = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** The minimum size is the size of the display area plus insets plus the button. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    def layoutComboBox(parent: Container, manager: MetalComboBoxUI.MetalComboBoxLayoutManager): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** If necessary paints the currently selected item. */
    @stub
    def paintCurrentValue(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    /** If necessary paints the background of the currently selected item. */
    @stub
    def paintCurrentValueBackground(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    /** Deprecated. 
     * As of Java 2 platform v1.4.
     * 
     */
    @stub
    protected def removeListeners(): Unit = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    def unconfigureEditor(): Unit = ???
}

object MetalComboBoxUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
