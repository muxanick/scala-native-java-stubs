package javax.swing.plaf.metal

import java.awt.{Component, Container, Graphics, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{Icon, JComponent, JInternalFrame, JMenu}
import javax.swing.plaf.basic.BasicInternalFrameTitlePane
import scala.scalanative.annotation.stub

/** Class that manages a JLF title bar */
class MetalInternalFrameTitlePane extends BasicInternalFrameTitlePane {

    /**  */
    @stub
    def this(f: JInternalFrame) = ???

    /**  */
    @stub
    protected val isPalette: Boolean = ???

    /**  */
    @stub
    protected val paletteCloseIcon: Icon = ???

    /**  */
    @stub
    protected val paletteTitleHeight: Int = ???

    /** Notifies this component that it now has a parent component. */
    @stub
    def addNotify(): Unit = ???

    /** Override the parent's method avoid creating a menu bar. */
    @stub
    protected def addSubComponents(): Unit = ???

    /** Override the parent's method to do nothing. */
    @stub
    protected def addSystemMenuItems(systemMenu: JMenu): Unit = ???

    /** Override the parent's method to do nothing. */
    @stub
    protected def assembleSystemMenu(): Unit = ???

    /**  */
    @stub
    protected def createButtons(): Unit = ???

    /**  */
    @stub
    protected def createLayout(): LayoutManager = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /** Calls the UI delegate's paint method, if the UI delegate
     *  is non-null.
     */
    @stub
    def paintComponent(g: Graphics): Unit = ???

    /**  */
    @stub
    def paintPalette(g: Graphics): Unit = ???

    /**  */
    @stub
    def setPalette(b: Boolean): Unit = ???

    /** Override the parent's method to do nothing. */
    @stub
    protected def showSystemMenu(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???
}
