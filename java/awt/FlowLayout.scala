package java.awt

import java.io.Serializable
import java.lang.{Object, String}

// A flow layout arranges components in a directional flow, much
// like lines of text in a paragraph. The flow direction is
// determined by the container's componentOrientation
// property and may be one of two values:
// 
// ComponentOrientation.LEFT_TO_RIGHT
// ComponentOrientation.RIGHT_TO_LEFT
// 
// Flow layouts are typically used
// to arrange buttons in a panel. It arranges buttons
// horizontally until no more buttons fit on the same line.
// The line alignment is determined by the align
// property. The possible values are:
// 
// LEFT
// RIGHT
// CENTER
// LEADING
// TRAILING
// 
// 
// For example, the following picture shows an applet using the flow
// layout manager (its default layout manager) to position three buttons:
// 
// 
// 
// Here is the code for this applet:
//
// 
// import java.awt.*;
// import java.applet.Applet;
//
// public class myButtons extends Applet {
//     Button button1, button2, button3;
//     public void init() {
//         button1 = new Button("Ok");
//         button2 = new Button("Open");
//         button3 = new Button("Close");
//         add(button1);
//         add(button2);
//         add(button3);
//     }
// }
// 
// 
// A flow layout lets each component assume its natural (preferred) size.
class FlowLayout extends Object with LayoutManager, with Serializable {

    @stub
    // Constructs a new FlowLayout with a centered alignment and a
    // default 5-unit horizontal and vertical gap.
    def this() = ???

    @stub
    // Constructs a new FlowLayout with the specified
    // alignment and a default 5-unit horizontal and vertical gap.
    def this(align: Int) = ???

    @stub
    // Adds the specified component to the layout.
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Gets the alignment for this layout.
    def getAlignment(): Int = ???

    @stub
    // Returns true if components are to be vertically aligned along
    // their baseline.
    def getAlignOnBaseline(): Boolean = ???

    @stub
    // Gets the horizontal gap between components
    // and between the components and the borders
    // of the Container
    def getHgap(): Int = ???

    @stub
    // Gets the vertical gap between components and
    // between the components and the borders of the
    // Container.
    def getVgap(): Int = ???

    @stub
    // Lays out the container.
    def layoutContainer(target: Container): Unit = ???

    @stub
    // Returns the minimum dimensions needed to layout the visible
    // components contained in the specified target container.
    def minimumLayoutSize(target: Container): Dimension = ???

    @stub
    // Returns the preferred dimensions for this layout given the
    // visible components in the specified target container.
    def preferredLayoutSize(target: Container): Dimension = ???

    @stub
    // Removes the specified component from the layout.
    def removeLayoutComponent(comp: Component): Unit = ???

    @stub
    // Sets the alignment for this layout.
    def setAlignment(align: Int): Unit = ???

    @stub
    // Sets whether or not components should be vertically aligned along their
    // baseline.
    def setAlignOnBaseline(alignOnBaseline: Boolean): Unit = ???

    @stub
    // Sets the horizontal gap between components and
    // between the components and the borders of the
    // Container.
    def setHgap(hgap: Int): Unit = ???

    @stub
    // Sets the vertical gap between components and between
    // the components and the borders of the Container.
    def setVgap(vgap: Int): Unit = ???
}

object FlowLayout {
    @stub
    // This value indicates that each row of components
    // should be centered.
    def CENTER: Int = ???

    @stub
    // This value indicates that each row of components
    // should be justified to the leading edge of the container's
    // orientation, for example, to the left in left-to-right orientations.
    def LEADING: Int = ???

    @stub
    // This value indicates that each row of components
    // should be left-justified.
    def LEFT: Int = ???

    @stub
    // This value indicates that each row of components
    // should be right-justified.
    def RIGHT: Int = ???
}
