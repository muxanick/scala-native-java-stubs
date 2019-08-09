package java.awt.event

import java.lang.Object

// An abstract adapter class for receiving component events.
// The methods in this class are empty. This class exists as
// convenience for creating listener objects.
// 
// Extend this class to create a ComponentEvent listener
// and override the methods for the events of interest. (If you implement the
// ComponentListener interface, you have to define all of
// the methods in it. This abstract class defines null methods for them
// all, so you can only have to define methods for events you care about.)
// 
// Create a listener object using your class and then register it with a
// component using the component's addComponentListener
// method. When the component's size, location, or visibility
// changes, the relevant method in the listener object is invoked,
// and the ComponentEvent is passed to it.
abstract class ComponentAdapter extends Object with ComponentListener {

    // Invoked when the component has been made invisible.
    def componentHidden(e: ComponentEvent): Unit

    // Invoked when the component's position changes.
    def componentMoved(e: ComponentEvent): Unit

    // Invoked when the component's size changes.
    def componentResized(e: ComponentEvent): Unit
}
