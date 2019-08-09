package javax.swing.plaf.synth

import java.awt.{Component, Graphics, Insets, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{Icon, JComponent}
import javax.swing.plaf.{ComponentUI, TreeUI}
import javax.swing.plaf.basic.BasicTreeUI
import javax.swing.tree.{TreeCellEditor, TreeCellRenderer, TreePath}
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JTree.
 */
class SynthTreeUI extends BasicTreeUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Creates a default cell editor. */
    @stub
    protected def createDefaultCellEditor(): TreeCellEditor = ???

    /** Returns the default cell renderer that is used to do the
     *  stamping of each node.
     */
    @stub
    protected def createDefaultCellRenderer(): TreeCellRenderer = ???

    /**  */
    @stub
    protected def drawCentered(c: Component, graphics: Graphics, icon: Icon, x: Int, y: Int): Unit = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    def getExpandedIcon(): Icon = ???

    /** Returns the location, along the x-axis, to render a particular row
     *  at.
     */
    @stub
    protected def getRowX(row: Int, depth: Int): Int = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints the drop line. */
    @stub
    protected def paintDropLine(g: Graphics): Unit = ???

    /** Paints the expand (toggle) part of a row. */
    @stub
    protected def paintExpandControl(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    /** Paints a horizontal line. */
    @stub
    protected def paintHorizontalLine(g: Graphics, c: JComponent, y: Int, left: Int, right: Int): Unit = ???

    /** Paints the horizontal part of the leg. */
    @stub
    protected def paintHorizontalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    /** Paints a vertical line. */
    @stub
    protected def paintVerticalLine(g: Graphics, c: JComponent, x: Int, top: Int, bottom: Int): Unit = ???

    /** Paints the vertical part of the leg. */
    @stub
    protected def paintVerticalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, path: TreePath): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(event: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthTreeUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
