package java.awt.event

import java.lang.Object

// An abstract adapter class for receiving mouse motion events.
// The methods in this class are empty. This class exists as
// convenience for creating listener objects.
// 
// Mouse motion events occur when a mouse is moved or dragged.
// (Many such events will be generated in a normal program.
// To track clicks and other mouse events, use the MouseAdapter.)
// 
// Extend this class to create a MouseEvent listener
// and override the methods for the events of interest. (If you implement the
// MouseMotionListener interface, you have to define all of
// the methods in it. This abstract class defines null methods for them
// all, so you can only have to define methods for events you care about.)
// 
// Create a listener object using the extended class and then register it with
// a component using the component's addMouseMotionListener
// method. When the mouse is moved or dragged, the relevant method in the
// listener object is invoked and the MouseEvent is passed to it.
abstract class MouseMotionAdapter extends Object with MouseMotionListener {

    // Invoked when a mouse button is pressed on a component and then
    // dragged.
    def mouseDragged(e: MouseEvent): Unit
}
