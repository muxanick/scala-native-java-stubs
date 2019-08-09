package java.awt

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The GridLayout class is a layout manager that
 *  lays out a container's components in a rectangular grid.
 *  The container is divided into equal-sized rectangles,
 *  and one component is placed in each rectangle.
 *  For example, the following is an applet that lays out six buttons
 *  into three rows and two columns:
 * 
 *  
 *  
 *  import java.awt.*;
 *  import java.applet.Applet;
 *  public class ButtonGrid extends Applet {
 *      public void init() {
 *          setLayout(new GridLayout(3,2));
 *          add(new Button("1"));
 *          add(new Button("2"));
 *          add(new Button("3"));
 *          add(new Button("4"));
 *          add(new Button("5"));
 *          add(new Button("6"));
 *      }
 *  }
 *  
 *  
 *  If the container's ComponentOrientation property is horizontal
 *  and left-to-right, the above example produces the output shown in Figure 1.
 *  If the container's ComponentOrientation property is horizontal
 *  and right-to-left, the example produces the output shown in Figure 2.
 * 
 *  
 *  
 *  
 *  
 * 
 *  
 *  
 *  
 * 
 *  
 *  Figure 1: Horizontal, Left-to-Right
 * 
 *  Figure 2: Horizontal, Right-to-Left
 *  
 *  
 *  
 *  When both the number of rows and the number of columns have
 *  been set to non-zero values, either by a constructor or
 *  by the setRows and setColumns methods, the number of
 *  columns specified is ignored.  Instead, the number of
 *  columns is determined from the specified number of rows
 *  and the total number of components in the layout. So, for
 *  example, if three rows and two columns have been specified
 *  and nine components are added to the layout, they will
 *  be displayed as three rows of three columns.  Specifying
 *  the number of columns affects the layout only when the
 *  number of rows is set to zero.
 */
class GridLayout extends Object with LayoutManager with Serializable {

    /** Creates a grid layout with a default of one column per component,
     *  in a single row.
     */
    @stub
    def this() = ???

    /** Creates a grid layout with the specified number of rows and
     *  columns.
     */
    @stub
    def this(rows: Int, cols: Int) = ???

    /** Creates a grid layout with the specified number of rows and
     *  columns.
     */
    @stub
    def this(rows: Int, cols: Int, hgap: Int, vgap: Int) = ???

    /** Adds the specified component with the specified name to the layout. */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Gets the number of columns in this layout. */
    @stub
    def getColumns(): Int = ???

    /** Gets the horizontal gap between components. */
    @stub
    def getHgap(): Int = ???

    /** Gets the number of rows in this layout. */
    @stub
    def getRows(): Int = ???

    /** Gets the vertical gap between components. */
    @stub
    def getVgap(): Int = ???

    /** Lays out the specified container using this layout. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Determines the minimum size of the container argument using this
     *  grid layout.
     */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Determines the preferred size of the container argument using
     *  this grid layout.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???

    /** Sets the number of columns in this layout to the specified value. */
    @stub
    def setColumns(cols: Int): Unit = ???

    /** Sets the horizontal gap between components to the specified value. */
    @stub
    def setHgap(hgap: Int): Unit = ???

    /** Sets the number of rows in this layout to the specified value. */
    @stub
    def setRows(rows: Int): Unit = ???

    /** Sets the vertical gap between components to the specified value. */
    @stub
    def setVgap(vgap: Int): Unit = ???

    /** Returns the string representation of this grid layout's values. */
    @stub
    def toString(): String = ???
}
