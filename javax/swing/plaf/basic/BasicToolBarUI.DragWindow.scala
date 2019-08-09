package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, Graphics, Insets, Point, Window}
import java.lang.Object

// 
protected class BasicToolBarUI.DragWindow extends Window {

    @stub
    // 
    def getBorderColor(): Color = ???

    @stub
    // Determines the insets of this container, which indicate the size
    // of the container's border.
    def getInsets(): Insets = ???

    @stub
    // 
    def getOffset(): Point = ???

    @stub
    // Returns the orientation of the toolbar window when the toolbar is
    // floating.
    def getOrientation(): Int = ???

    @stub
    // Paints the container.
    def paint(g: Graphics): Unit = ???

    @stub
    // 
    def setBorderColor(c: Color): Unit = ???

    @stub
    // 
    def setOffset(p: Point): Unit = ???
}
