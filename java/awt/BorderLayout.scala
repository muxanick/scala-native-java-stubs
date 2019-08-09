package java.awt

import java.io.Serializable
import java.lang.{Object, String}

// A border layout lays out a container, arranging and resizing
// its components to fit in five regions:
// north, south, east, west, and center.
// Each region may contain no more than one component, and
// is identified by a corresponding constant:
// NORTH, SOUTH, EAST,
// WEST, and CENTER.  When adding a
// component to a container with a border layout, use one of these
// five constants, for example:
// 
//    Panel p = new Panel();
//    p.setLayout(new BorderLayout());
//    p.add(new Button("Okay"), BorderLayout.SOUTH);
// 
// As a convenience, BorderLayout interprets the
// absence of a string specification the same as the constant
// CENTER:
// 
//    Panel p2 = new Panel();
//    p2.setLayout(new BorderLayout());
//    p2.add(new TextArea());  // Same as p.add(new TextArea(), BorderLayout.CENTER);
// 
// 
// In addition, BorderLayout supports the relative
// positioning constants, PAGE_START, PAGE_END,
// LINE_START, and LINE_END.
// In a container whose ComponentOrientation is set to
// ComponentOrientation.LEFT_TO_RIGHT, these constants map to
// NORTH, SOUTH, WEST, and
// EAST, respectively.
// 
// For compatibility with previous releases, BorderLayout
// also includes the relative positioning constants BEFORE_FIRST_LINE,
// AFTER_LAST_LINE, BEFORE_LINE_BEGINS and
// AFTER_LINE_ENDS.  These are equivalent to
// PAGE_START, PAGE_END, LINE_START
// and LINE_END respectively.  For
// consistency with the relative positioning constants used by other
// components, the latter constants are preferred.
// 
// Mixing both absolute and relative positioning constants can lead to
// unpredictable results.  If
// you use both types, the relative constants will take precedence.
// For example, if you add components using both the NORTH
// and PAGE_START constants in a container whose
// orientation is LEFT_TO_RIGHT, only the
// PAGE_START will be layed out.
// 
// NOTE: Currently (in the Java 2 platform v1.2),
// BorderLayout does not support vertical
// orientations.  The isVertical setting on the container's
// ComponentOrientation is not respected.
// 
// The components are laid out according to their
// preferred sizes and the constraints of the container's size.
// The NORTH and SOUTH components may
// be stretched horizontally; the EAST and
// WEST components may be stretched vertically;
// the CENTER component may stretch both horizontally
// and vertically to fill any space left over.
// 
// Here is an example of five buttons in an applet laid out using
// the BorderLayout layout manager:
// 
// 
// 
// The code for this applet is as follows:
//
// 
// import java.awt.*;
// import java.applet.Applet;
//
// public class buttonDir extends Applet {
//   public void init() {
//     setLayout(new BorderLayout());
//     add(new Button("North"), BorderLayout.NORTH);
//     add(new Button("South"), BorderLayout.SOUTH);
//     add(new Button("East"), BorderLayout.EAST);
//     add(new Button("West"), BorderLayout.WEST);
//     add(new Button("Center"), BorderLayout.CENTER);
//   }
// }
// 
// 
class BorderLayout extends Object with LayoutManager2, with Serializable {

    @stub
    // Constructs a new border layout with
    // no gaps between components.
    def this() = ???

    @stub
    // Adds the specified component to the layout, using the specified
    // constraint object.
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    @stub
    // Deprecated. 
    //replaced by addLayoutComponent(Component, Object).
    //
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Gets the constraints for the specified component
    def getConstraints(comp: Component): Object = ???

    @stub
    // Returns the horizontal gap between components.
    def getHgap(): Int = ???

    @stub
    // Returns the alignment along the x axis.
    def getLayoutAlignmentX(parent: Container): float = ???

    @stub
    // Returns the alignment along the y axis.
    def getLayoutAlignmentY(parent: Container): float = ???

    @stub
    // Returns the component that corresponds to the given constraint location
    // based on the target Container's component orientation.
    def getLayoutComponent(target: Container, constraints: Object): Component = ???

    @stub
    // Gets the component that was added using the given constraint
    def getLayoutComponent(constraints: Object): Component = ???

    @stub
    // Returns the vertical gap between components.
    def getVgap(): Int = ???

    @stub
    // Invalidates the layout, indicating that if the layout manager
    // has cached information it should be discarded.
    def invalidateLayout(target: Container): Unit = ???

    @stub
    // Lays out the container argument using this border layout.
    def layoutContainer(target: Container): Unit = ???

    @stub
    // Returns the maximum dimensions for this layout given the components
    // in the specified target container.
    def maximumLayoutSize(target: Container): Dimension = ???

    @stub
    // Determines the minimum size of the target container
    // using this layout manager.
    def minimumLayoutSize(target: Container): Dimension = ???

    @stub
    // Determines the preferred size of the target
    // container using this layout manager, based on the components
    // in the container.
    def preferredLayoutSize(target: Container): Dimension = ???

    @stub
    // Removes the specified component from this border layout.
    def removeLayoutComponent(comp: Component): Unit = ???

    @stub
    // Sets the horizontal gap between components.
    def setHgap(hgap: Int): Unit = ???

    @stub
    // Sets the vertical gap between components.
    def setVgap(vgap: Int): Unit = ???
}

object BorderLayout {
    @stub
    // Synonym for PAGE_END.
    def AFTER_LAST_LINE: String = ???

    @stub
    // Synonym for LINE_END.
    def AFTER_LINE_ENDS: String = ???

    @stub
    // Synonym for PAGE_START.
    def BEFORE_FIRST_LINE: String = ???

    @stub
    // Synonym for LINE_START.
    def BEFORE_LINE_BEGINS: String = ???

    @stub
    // The center layout constraint (middle of container).
    def CENTER: String = ???

    @stub
    // The east layout constraint (right side of container).
    def EAST: String = ???

    @stub
    // The component goes at the end of the line direction for the
    // layout.
    def LINE_END: String = ???

    @stub
    // The component goes at the beginning of the line direction for the
    // layout.
    def LINE_START: String = ???

    @stub
    // The north layout constraint (top of container).
    def NORTH: String = ???

    @stub
    // The component comes after the last line of the layout's content.
    def PAGE_END: String = ???

    @stub
    // The component comes before the first line of the layout's content.
    def PAGE_START: String = ???

    @stub
    // The south layout constraint (bottom of container).
    def SOUTH: String = ???
}
