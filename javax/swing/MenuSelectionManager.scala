package javax.swing

import java.awt.{Component, Point}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.Object
import javax.swing.event.{ChangeEvent, ChangeListener}

// A MenuSelectionManager owns the selection in menu hierarchy.
class MenuSelectionManager extends Object {

    @stub
    // Only one ChangeEvent is needed per button model instance since the
    // event's only state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Adds a ChangeListener to the button.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Tell the menu selection to close and unselect all the menu components.
    def clearSelectedPath(): Unit = ???

    @stub
    // Returns the component in the currently selected path
    // which contains sourcePoint.
    def componentForPoint(source: Component, sourcePoint: Point): Component = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this MenuSelectionManager with addChangeListener().
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the path to the currently selected menu item
    def getSelectedPath(): Array[MenuElement] = ???

    @stub
    // Return true if c is part of the currently used menu
    def isComponentPartOfCurrentMenu(c: Component): Boolean = ???

    @stub
    // When a MenuElement receives an event from a KeyListener, it should never process the event
    // directly.
    def processKeyEvent(e: KeyEvent): Unit = ???

    @stub
    // When a MenuElement receives an event from a MouseListener, it should never process the event
    // directly.
    def processMouseEvent(event: MouseEvent): Unit = ???

    @stub
    // Removes a ChangeListener from the button.
    def removeChangeListener(l: ChangeListener): Unit = ???
}

object MenuSelectionManager {
    @stub
    // Returns the default menu selection manager.
    def defaultManager(): MenuSelectionManager = ???
}
