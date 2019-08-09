package javax.swing.plaf.metal

import java.awt.{Component, Container, Dimension, Graphics}
import java.lang.Object
import javax.swing.{AbstractButton, CellRendererPane, Icon, JButton, JComboBox, JComponent, JList}

// JButton subclass to help out MetalComboBoxUI
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalComboBoxButton extends JButton {

    @stub
    // 
    def this(cb: JComboBox, i: Icon, onlyIcon: Boolean, pane: CellRendererPane, list: JList) = ???

    @stub
    // 
    protected def comboBox: JComboBox = ???

    @stub
    // 
    protected def comboIcon: Icon = ???

    @stub
    // 
    protected def iconOnly: Boolean = ???

    @stub
    // 
    protected def listBox: JList = ???

    @stub
    // 
    def getComboBox(): JComboBox = ???

    @stub
    // 
    def getComboIcon(): Icon = ???

    @stub
    // If the minimum size has been set to a non-null value
    // just returns it.
    def getMinimumSize(): Dimension = ???

    @stub
    // Returns whether this Component can become the focus
    // owner.
    def isFocusTraversable(): Boolean = ???

    @stub
    // 
    def isIconOnly(): Boolean = ???

    @stub
    // Calls the UI delegate's paint method, if the UI delegate
    // is non-null.
    def paintComponent(g: Graphics): Unit = ???

    @stub
    // 
    def setComboBox(cb: JComboBox): Unit = ???

    @stub
    // 
    def setComboIcon(i: Icon): Unit = ???

    @stub
    // Enables (or disables) the button.
    def setEnabled(enabled: Boolean): Unit = ???
}
