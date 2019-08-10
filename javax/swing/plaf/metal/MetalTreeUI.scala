package javax.swing.plaf.metal

import java.awt.{Graphics, Insets, Rectangle}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TreeUI}
import javax.swing.plaf.basic.BasicTreeUI
import javax.swing.tree.TreePath
import scala.scalanative.annotation.stub

/** The metal look and feel implementation of TreeUI.
 *  
 *  MetalTreeUI allows for configuring how to
 *  visually render the spacing and delineation between nodes. The following
 *  hints are supported:
 * 
 *  
 *   
 *     Angled
 *     A line is drawn connecting the child to the parent. For handling
 *           of the root node refer to
 *           JTree.setRootVisible(boolean) and
 *           JTree.setShowsRootHandles(boolean).
 *     
 *   
 *   
 *      Horizontal
 *      A horizontal line is drawn dividing the children of the root node.
 *   
 *   
 *       None
 *       Do not draw any visual indication between nodes.
 *   
 *  
 * 
 *  
 *  As it is typically impractical to obtain the TreeUI from
 *  the JTree and cast to an instance of MetalTreeUI
 *  you enable this property via the client property
 *  JTree.lineStyle. For example, to switch to
 *  Horizontal style you would do:
 *  tree.putClientProperty("JTree.lineStyle", "Horizontal");
 *  
 *  The default is Angled.
 */
class MetalTreeUI extends BasicTreeUI {

    /**  */
    @stub
    def this() = ???

    /** this function converts between the string passed into the client property
     *  and the internal representation (currently and int)
     */
    @stub
    protected def decodeLineStyle(lineStyleFlag: Any): Unit = ???

    /** The horizontal element of legs between nodes starts at the
     *  right of the left-hand side of the child node by default.
     */
    @stub
    protected def getHorizontalLegBuffer(): Int = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def isLocationInExpandControl(row: Int, rowLevel: Int, mouseX: Int, mouseY: Int): Boolean = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the horizontal part of the leg. */
    @stub
    protected def paintHorizontalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    /**  */
    @stub
    protected def paintHorizontalSeparators(g: Graphics, c: JComponent): Unit = ???

    /** Paints the vertical part of the leg. */
    @stub
    protected def paintVerticalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, path: TreePath): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object MetalTreeUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
