package javax.swing

import java.awt.{Component, Container, Graphics}
import java.lang.{Integer, Object, String}
import java.util.Hashtable
import javax.accessibility.{Accessible, AccessibleContext}

// JLayeredPane adds depth to a JFC/Swing container,
// allowing components to overlap each other when needed.
// An Integer object specifies each component's depth in the
// container, where higher-numbered components sit "on top" of other
// components.
// For task-oriented documentation and examples of using layered panes see
// How to Use a Layered Pane,
// a section in The Java Tutorial.
//
// 
// 
//   
//     
//   
// 
// 
// For convenience, JLayeredPane divides the depth-range
// into several different layers. Putting a component into one of those
// layers makes it easy to ensure that components overlap properly,
// without having to worry about specifying numbers for specific depths:
// 
//    DEFAULT_LAYER
//         The standard layer, where most components go. This the bottommost
//         layer.
//    PALETTE_LAYER
//         The palette layer sits over the default layer. Useful for floating
//         toolbars and palettes, so they can be positioned above other components.
//    MODAL_LAYER
//         The layer used for modal dialogs. They will appear on top of any
//         toolbars, palettes, or standard components in the container.
//    POPUP_LAYER
//         The popup layer displays above dialogs. That way, the popup windows
//         associated with combo boxes, tooltips, and other help text will appear
//         above the component, palette, or dialog that generated them.
//    DRAG_LAYER
//         When dragging a component, reassigning it to the drag layer ensures
//         that it is positioned over every other component in the container. When
//         finished dragging, it can be reassigned to its normal layer.
// 
// The JLayeredPane methods moveToFront(Component),
// moveToBack(Component) and setPosition can be used
// to reposition a component within its layer. The setLayer method
// can also be used to change the component's current layer.
//
// Details
// JLayeredPane manages its list of children like
// Container, but allows for the definition of a several
// layers within itself. Children in the same layer are managed exactly
// like the normal Container object,
// with the added feature that when children components overlap, children
// in higher layers display above the children in lower layers.
// 
// Each layer is a distinct integer number. The layer attribute can be set
// on a Component by passing an Integer
// object during the add call. For example:
// 
//     layeredPane.add(child, JLayeredPane.DEFAULT_LAYER);
// or
//     layeredPane.add(child, new Integer(10));
// 
// The layer attribute can also be set on a Component by calling
//     layeredPaneParent.setLayer(child, 10)
// on the JLayeredPane that is the parent of component. The layer
// should be set before adding the child to the parent.
// 
// Higher number layers display above lower number layers. So, using
// numbers for the layers and letters for individual components, a
// representative list order would look like this:
//       5a, 5b, 5c, 2a, 2b, 2c, 1a 
// where the leftmost components are closest to the top of the display.
// 
// A component can be moved to the top or bottom position within its
// layer by calling moveToFront or moveToBack.
// 
// The position of a component within a layer can also be specified directly.
// Valid positions range from 0 up to one less than the number of
// components in that layer. A value of -1 indicates the bottommost
// position. A value of 0 indicates the topmost position. Unlike layer
// numbers, higher position values are lower in the display.
// 
// Note: This sequence (defined by java.awt.Container) is the reverse
// of the layer numbering sequence. Usually though, you will use moveToFront,
// moveToBack, and setLayer.
// 
// Here are some examples using the method add(Component, layer, position):
// Calling add(5x, 5, -1) results in:
//       5a, 5b, 5c, 5x, 2a, 2b, 2c, 1a 
//
// Calling add(5z, 5, 2) results in:
//       5a, 5b, 5z, 5c, 5x, 2a, 2b, 2c, 1a 
//
// Calling add(3a, 3, 7) results in:
//       5a, 5b, 5z, 5c, 5x, 3a, 2a, 2b, 2c, 1a 
//
// Using normal paint/event mechanics results in 1a appearing at the bottom
// and 5a being above all other components.
// 
// Note: that these layers are simply a logical construct and LayoutManagers
// will affect all child components of this container without regard for
// layer settings.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JLayeredPane extends JComponent with Accessible {

    @stub
    // Adds the specified component to this container at the specified
    // index.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JLayeredPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the number of children currently in the specified layer.
    def getComponentCountInLayer(layer: Int): Int = ???

    @stub
    // Returns an array of the components in the specified layer.
    def getComponentsInLayer(layer: Int): Array[Component] = ???

    @stub
    // Returns the hashtable that maps components to layers.
    protected def getComponentToLayer(): Hashtable[Component, Integer] = ???

    @stub
    // Returns the index of the specified Component.
    def getIndexOf(c: Component): Int = ???

    @stub
    // Returns the layer attribute for the specified Component.
    def getLayer(c: Component): Int = ???

    @stub
    // Returns the Integer object associated with a specified layer.
    protected def getObjectForLayer(layer: Int): Integer = ???

    @stub
    // Get the relative position of the component within its layer.
    def getPosition(c: Component): Int = ???

    @stub
    // Returns the highest layer value from all current children.
    def highestLayer(): Int = ???

    @stub
    // Primitive method that determines the proper location to
    // insert a new child based on layer and position requests.
    protected def insertIndexForLayer(layer: Int, position: Int): Int = ???

    @stub
    // Returns false if components in the pane can overlap, which makes
    // optimized drawing impossible.
    def isOptimizedDrawingEnabled(): Boolean = ???

    @stub
    // Returns the lowest layer value from all current children.
    def lowestLayer(): Int = ???

    @stub
    // Moves the component to the bottom of the components in its current layer
    // (position -1).
    def moveToBack(c: Component): Unit = ???

    @stub
    // Moves the component to the top of the components in its current layer
    // (position 0).
    def moveToFront(c: Component): Unit = ???

    @stub
    // Paints this JLayeredPane within the specified graphics context.
    def paint(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JLayeredPane.
    protected def paramString(): String = ???

    @stub
    // Remove the indexed component from this pane.
    def remove(index: Int): Unit = ???

    @stub
    // Removes all the components from this container.
    def removeAll(): Unit = ???

    @stub
    // Sets the layer attribute on the specified component,
    // making it the bottommost component in that layer.
    def setLayer(c: Component, layer: Int): Unit = ???

    @stub
    // Sets the layer attribute for the specified component and
    // also sets its position within that layer.
    def setLayer(c: Component, layer: Int, position: Int): Unit = ???
}

object JLayeredPane {
    @stub
    // Convenience object defining the Default layer.
    def DEFAULT_LAYER: Integer = ???

    @stub
    // Convenience object defining the Drag layer.
    def DRAG_LAYER: Integer = ???

    @stub
    // Convenience object defining the Frame Content layer.
    def FRAME_CONTENT_LAYER: Integer = ???

    @stub
    // Bound property
    def LAYER_PROPERTY: String = ???

    @stub
    // Convenience object defining the Modal layer.
    def MODAL_LAYER: Integer = ???

    @stub
    // Convenience object defining the Palette layer.
    def PALETTE_LAYER: Integer = ???

    @stub
    // Gets the layer property for a JComponent, it
    // does not cause any side effects like setLayer().
    def getLayer(c: JComponent): Int = ???

    @stub
    // Convenience method that returns the first JLayeredPane which
    // contains the specified component.
    def getLayeredPaneAbove(c: Component): JLayeredPane = ???

    @stub
    // Sets the layer property on a JComponent.
    def putLayer(c: JComponent, layer: Int): Unit = ???
}
