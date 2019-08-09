package java.awt

import java.io.Serializable
import java.lang.{Object, String}

/** A border layout lays out a container, arranging and resizing
 *  its components to fit in five regions:
 *  north, south, east, west, and center.
 *  Each region may contain no more than one component, and
 *  is identified by a corresponding constant:
 *  NORTH, SOUTH, EAST,
 *  WEST, and CENTER.  When adding a
 *  component to a container with a border layout, use one of these
 *  five constants, for example:
 *  
 *     Panel p = new Panel();
 *     p.setLayout(new BorderLayout());
 *     p.add(new Button("Okay"), BorderLayout.SOUTH);
 *  
 *  As a convenience, BorderLayout interprets the
 *  absence of a string specification the same as the constant
 *  CENTER:
 *  
 *     Panel p2 = new Panel();
 *     p2.setLayout(new BorderLayout());
 *     p2.add(new TextArea());  // Same as p.add(new TextArea(), BorderLayout.CENTER);
 *  
 *  
 *  In addition, BorderLayout supports the relative
 *  positioning constants, PAGE_START, PAGE_END,
 *  LINE_START, and LINE_END.
 *  In a container whose ComponentOrientation is set to
 *  ComponentOrientation.LEFT_TO_RIGHT, these constants map to
 *  NORTH, SOUTH, WEST, and
 *  EAST, respectively.
 *  
 *  For compatibility with previous releases, BorderLayout
 *  also includes the relative positioning constants BEFORE_FIRST_LINE,
 *  AFTER_LAST_LINE, BEFORE_LINE_BEGINS and
 *  AFTER_LINE_ENDS.  These are equivalent to
 *  PAGE_START, PAGE_END, LINE_START
 *  and LINE_END respectively.  For
 *  consistency with the relative positioning constants used by other
 *  components, the latter constants are preferred.
 *  
 *  Mixing both absolute and relative positioning constants can lead to
 *  unpredictable results.  If
 *  you use both types, the relative constants will take precedence.
 *  For example, if you add components using both the NORTH
 *  and PAGE_START constants in a container whose
 *  orientation is LEFT_TO_RIGHT, only the
 *  PAGE_START will be layed out.
 *  
 *  NOTE: Currently (in the Java 2 platform v1.2),
 *  BorderLayout does not support vertical
 *  orientations.  The isVertical setting on the container's
 *  ComponentOrientation is not respected.
 *  
 *  The components are laid out according to their
 *  preferred sizes and the constraints of the container's size.
 *  The NORTH and SOUTH components may
 *  be stretched horizontally; the EAST and
 *  WEST components may be stretched vertically;
 *  the CENTER component may stretch both horizontally
 *  and vertically to fill any space left over.
 *  
 *  Here is an example of five buttons in an applet laid out using
 *  the BorderLayout layout manager:
 *  
 *  
 *  
 *  The code for this applet is as follows:
 * 
 *  
 *  import java.awt.*;
 *  import java.applet.Applet;
 * 
 *  public class buttonDir extends Applet {
 *    public void init() {
 *      setLayout(new BorderLayout());
 *      add(new Button("North"), BorderLayout.NORTH);
 *      add(new Button("South"), BorderLayout.SOUTH);
 *      add(new Button("East"), BorderLayout.EAST);
 *      add(new Button("West"), BorderLayout.WEST);
 *      add(new Button("Center"), BorderLayout.CENTER);
 *    }
 *  }
 *  
 *  
 */
class BorderLayout extends Object with LayoutManager2 with Serializable {

    /** Constructs a new border layout with
     *  no gaps between components.
     */
    @stub
    def this() = ???

    /** Adds the specified component to the layout, using the specified
     *  constraint object.
     */
    @stub
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    /** Deprecated. 
     * replaced by addLayoutComponent(Component, Object).
     * 
     */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Gets the constraints for the specified component */
    @stub
    def getConstraints(comp: Component): Object = ???

    /** Returns the horizontal gap between components. */
    @stub
    def getHgap(): Int = ???

    /** Returns the alignment along the x axis. */
    @stub
    def getLayoutAlignmentX(parent: Container): Float = ???

    /** Returns the alignment along the y axis. */
    @stub
    def getLayoutAlignmentY(parent: Container): Float = ???

    /** Returns the component that corresponds to the given constraint location
     *  based on the target Container's component orientation.
     */
    @stub
    def getLayoutComponent(target: Container, constraints: Object): Component = ???

    /** Gets the component that was added using the given constraint */
    @stub
    def getLayoutComponent(constraints: Object): Component = ???

    /** Returns the vertical gap between components. */
    @stub
    def getVgap(): Int = ???

    /** Invalidates the layout, indicating that if the layout manager
     *  has cached information it should be discarded.
     */
    @stub
    def invalidateLayout(target: Container): Unit = ???

    /** Lays out the container argument using this border layout. */
    @stub
    def layoutContainer(target: Container): Unit = ???

    /** Returns the maximum dimensions for this layout given the components
     *  in the specified target container.
     */
    @stub
    def maximumLayoutSize(target: Container): Dimension = ???

    /** Determines the minimum size of the target container
     *  using this layout manager.
     */
    @stub
    def minimumLayoutSize(target: Container): Dimension = ???

    /** Determines the preferred size of the target
     *  container using this layout manager, based on the components
     *  in the container.
     */
    @stub
    def preferredLayoutSize(target: Container): Dimension = ???

    /** Removes the specified component from this border layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???

    /** Sets the horizontal gap between components. */
    @stub
    def setHgap(hgap: Int): Unit = ???

    /** Sets the vertical gap between components. */
    @stub
    def setVgap(vgap: Int): Unit = ???
}

object BorderLayout {
    /** Synonym for PAGE_END. */
    @stub
    val AFTER_LAST_LINE: String = ???

    /** Synonym for LINE_END. */
    @stub
    val AFTER_LINE_ENDS: String = ???

    /** Synonym for PAGE_START. */
    @stub
    val BEFORE_FIRST_LINE: String = ???

    /** Synonym for LINE_START. */
    @stub
    val BEFORE_LINE_BEGINS: String = ???

    /** The center layout constraint (middle of container). */
    @stub
    val CENTER: String = ???

    /** The east layout constraint (right side of container). */
    @stub
    val EAST: String = ???

    /** The component goes at the end of the line direction for the
     *  layout.
     */
    @stub
    val LINE_END: String = ???

    /** The component goes at the beginning of the line direction for the
     *  layout.
     */
    @stub
    val LINE_START: String = ???

    /** The north layout constraint (top of container). */
    @stub
    val NORTH: String = ???

    /** The component comes after the last line of the layout's content. */
    @stub
    val PAGE_END: String = ???

    /** The component comes before the first line of the layout's content. */
    @stub
    val PAGE_START: String = ???

    /** The south layout constraint (bottom of container). */
    @stub
    val SOUTH: String = ???
}
