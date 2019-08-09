package java.awt.dnd

import java.awt.{Component, Cursor, Image, Point}
import java.awt.datatransfer.Transferable
import java.awt.event.InputEvent
import java.lang.Object
import java.util.{EventObject, Iterator}

// A DragGestureEvent is passed
// to DragGestureListener's
// dragGestureRecognized() method
// when a particular DragGestureRecognizer detects that a
// platform dependent drag initiating gesture has occurred
// on the Component that it is tracking.
//
// The action field of any DragGestureEvent instance should take one of the following
// values:
// 
//  DnDConstants.ACTION_COPY
//  DnDConstants.ACTION_MOVE
//  DnDConstants.ACTION_LINK
// 
// Assigning the value different from listed above will cause an unspecified behavior.
class DragGestureEvent extends EventObject {

    @stub
    // Returns the Component associated
    // with this DragGestureEvent.
    def getComponent(): Component = ???

    @stub
    // Returns an int representing the
    // action selected by the user.
    def getDragAction(): Int = ???

    @stub
    // Returns a Point in the coordinates
    // of the Component over which the drag originated.
    def getDragOrigin(): Point = ???

    @stub
    // Returns the DragSource.
    def getDragSource(): DragSource = ???

    @stub
    // Returns the source as a DragGestureRecognizer.
    def getSourceAsDragGestureRecognizer(): DragGestureRecognizer = ???

    @stub
    // Returns the initial event that triggered the gesture.
    def getTriggerEvent(): InputEvent = ???

    @stub
    // Returns an Iterator for the events
    // comprising the gesture.
    def iterator(): Iterator[InputEvent] = ???

    @stub
    // Start the drag given the initial Cursor to display,
    // a drag Image, the offset of
    // the Image,
    // the Transferable object, and
    // the DragSourceListener to use.
    def startDrag(dragCursor: Cursor, dragImage: Image, imageOffset: Point, transferable: Transferable, dsl: DragSourceListener): Unit = ???

    @stub
    // Starts the drag operation given the Cursor for this drag
    // operation and the Transferable representing the source data
    // for this drag operation.
    def startDrag(dragCursor: Cursor, transferable: Transferable): Unit = ???

    @stub
    // Starts the drag given the initial Cursor to display,
    // the Transferable object,
    // and the DragSourceListener to use.
    def startDrag(dragCursor: Cursor, transferable: Transferable, dsl: DragSourceListener): Unit = ???

    @stub
    // Returns an Object array of the
    // events comprising the drag gesture.
    def toArray(): Array[Object] = ???
}
