package java.awt.dnd

import java.lang.Object

// An abstract adapter class for receiving drop target events. The methods in
// this class are empty. This class exists only as a convenience for creating
// listener objects.
// 
// Extend this class to create a DropTargetEvent listener
// and override the methods for the events of interest. (If you implement the
// DropTargetListener interface, you have to define all of
// the methods in it. This abstract class defines a null implementation for
// every method except drop(DropTargetDropEvent), so you only have
// to define methods for events you care about.) You must provide an
// implementation for at least drop(DropTargetDropEvent). This
// method cannot have a null implementation because its specification requires
// that you either accept or reject the drop, and, if accepted, indicate
// whether the drop was successful.
// 
// Create a listener object using the extended class and then register it with
// a DropTarget. When the drag enters, moves over, or exits
// the operable part of the drop site for that DropTarget, when
// the drop action changes, and when the drop occurs, the relevant method in
// the listener object is invoked, and the DropTargetEvent is
// passed to it.
// 
// The operable part of the drop site for the DropTarget is
// the part of the associated Component's geometry that is not
// obscured by an overlapping top-level window or by another
// Component higher in the Z-order that has an associated active
// DropTarget.
// 
// During the drag, the data associated with the current drag operation can be
// retrieved by calling getTransferable() on
// DropTargetDragEvent instances passed to the listener's
// methods.
// 
// Note that getTransferable() on the
// DropTargetDragEvent instance should only be called within the
// respective listener's method and all the necessary data should be retrieved
// from the returned Transferable before that method returns.
abstract class DropTargetAdapter extends Object with DropTargetListener {

    // Called while a drag operation is ongoing, when the mouse pointer enters
    // the operable part of the drop site for the DropTarget
    // registered with this listener.
    def dragEnter(dtde: DropTargetDragEvent): Unit

    // Called while a drag operation is ongoing, when the mouse pointer has
    // exited the operable part of the drop site for the
    // DropTarget registered with this listener.
    def dragExit(dte: DropTargetEvent): Unit

    // Called when a drag operation is ongoing, while the mouse pointer is still
    // over the operable part of the drop site for the DropTarget
    // registered with this listener.
    def dragOver(dtde: DropTargetDragEvent): Unit
}
