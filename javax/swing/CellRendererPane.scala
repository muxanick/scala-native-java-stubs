package javax.swing

import java.awt.{Component, Container, Graphics, Rectangle}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

/** This class is inserted in between cell renderers and the components that
 *  use them.  It just exists to thwart the repaint() and invalidate() methods
 *  which would otherwise propagate up the tree when the renderer was configured.
 *  It's used by the implementations of JTable, JTree, and JList.  For example,
 *  here's how CellRendererPane is used in the code the paints each row
 *  in a JList:
 *  
 *    cellRendererPane = new CellRendererPane();
 *    ...
 *    Component rendererComponent = renderer.getListCellRendererComponent();
 *    renderer.configureListCellRenderer(dataModel.getElementAt(row), row);
 *    cellRendererPane.paintComponent(g, rendererComponent, this, x, y, w, h);
 *  
 *  
 *  A renderer component must override isShowing() and unconditionally return
 *  true to work correctly because the Swing paint does nothing for components
 *  with isShowing false.
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
class CellRendererPane extends Container with Accessible {

    /** If the specified component is already a child of this then we don't
     *  bother doing anything - stacking order doesn't matter for cell
     *  renderer components (CellRendererPane doesn't paint anyway).
     */
    @stub
    protected def addImpl(x: Component, constraints: Object, index: Int): Unit = ???

    /** Gets the AccessibleContext associated with this CellRendererPane. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Overridden to avoid propagating a invalidate up the tree when the
     *  cell renderer child is configured.
     */
    @stub
    def invalidate(): Unit = ???

    /** Shouldn't be called. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Calls this.paintComponent(g, c, p, x, y, w, h, false). */
    @stub
    def paintComponent(g: Graphics, c: Component, p: Container, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paint a cell renderer component c on graphics object g. */
    @stub
    def paintComponent(g: Graphics, c: Component, p: Container, x: Int, y: Int, w: Int, h: Int, shouldValidate: Boolean): Unit = ???

    /** Calls this.paintComponent() with the rectangles x,y,width,height fields. */
    @stub
    def paintComponent(g: Graphics, c: Component, p: Container, r: Rectangle): Unit = ???
}
