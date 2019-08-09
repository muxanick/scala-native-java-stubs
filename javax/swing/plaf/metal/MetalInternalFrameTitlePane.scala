package javax.swing.plaf.metal

import java.awt.{Component, Container, Graphics, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{Icon, JComponent, JMenu}
import javax.swing.plaf.basic.BasicInternalFrameTitlePane

// Class that manages a JLF title bar
class MetalInternalFrameTitlePane extends BasicInternalFrameTitlePane {

    @stub
    // 
    protected def isPalette: Boolean = ???

    @stub
    // 
    protected def paletteCloseIcon: Icon = ???

    @stub
    // Notifies this component that it now has a parent component.
    def addNotify(): Unit = ???

    @stub
    // Override the parent's method avoid creating a menu bar.
    protected def addSubComponents(): Unit = ???

    @stub
    // Override the parent's method to do nothing.
    protected def addSystemMenuItems(systemMenu: JMenu): Unit = ???

    @stub
    // Override the parent's method to do nothing.
    protected def assembleSystemMenu(): Unit = ???

    @stub
    // 
    protected def createButtons(): Unit = ???

    @stub
    // 
    protected def createLayout(): LayoutManager = ???

    @stub
    // 
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // Calls the UI delegate's paint method, if the UI delegate
    // is non-null.
    def paintComponent(g: Graphics): Unit = ???

    @stub
    // 
    def paintPalette(g: Graphics): Unit = ???

    @stub
    // 
    def setPalette(b: Boolean): Unit = ???

    @stub
    // Override the parent's method to do nothing.
    protected def showSystemMenu(): Unit = ???
}
