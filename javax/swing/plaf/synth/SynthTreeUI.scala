package javax.swing.plaf.synth

import java.awt.{Component, Graphics, Insets, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{Icon, JComponent}
import javax.swing.plaf.{ComponentUI, TreeUI}
import javax.swing.plaf.basic.BasicTreeUI
import javax.swing.tree.{TreeCellEditor, TreeCellRenderer, TreePath}

// Provides the Synth L&F UI delegate for
// JTree.
class SynthTreeUI extends BasicTreeUI with PropertyChangeListener, with SynthUI {

    @stub
    // Creates a default cell editor.
    protected def createDefaultCellEditor(): TreeCellEditor = ???

    @stub
    // Returns the default cell renderer that is used to do the
    // stamping of each node.
    protected def createDefaultCellRenderer(): TreeCellRenderer = ???

    @stub
    // 
    protected def drawCentered(c: Component, graphics: Graphics, icon: Icon, x: Int, y: Int): Unit = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    def getExpandedIcon(): Icon = ???

    @stub
    // Returns the location, along the x-axis, to render a particular row
    // at.
    protected def getRowX(row: Int, depth: Int): Int = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

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
    // Paints the drop line.
    protected def paintDropLine(g: Graphics): Unit = ???

    @stub
    // Paints the expand (toggle) part of a row.
    protected def paintExpandControl(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    @stub
    // Paints a horizontal line.
    protected def paintHorizontalLine(g: Graphics, c: JComponent, y: Int, left: Int, right: Int): Unit = ???

    @stub
    // Paints the horizontal part of the leg.
    protected def paintHorizontalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    @stub
    // Paints a vertical line.
    protected def paintVerticalLine(g: Graphics, c: JComponent, x: Int, top: Int, bottom: Int): Unit = ???

    @stub
    // Paints the vertical part of the leg.
    protected def paintVerticalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, path: TreePath): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(event: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object SynthTreeUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(x: JComponent): ComponentUI = ???
}
