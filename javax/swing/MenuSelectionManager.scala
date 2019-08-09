package javax.swing

import java.awt.{Component, Point}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.Object
import javax.swing.event.{ChangeEvent, ChangeListener}

/** A MenuSelectionManager owns the selection in menu hierarchy. */
class MenuSelectionManager extends Object {

    /** Only one ChangeEvent is needed per button model instance since the
     *  event's only state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Adds a ChangeListener to the button. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Tell the menu selection to close and unselect all the menu components. */
    @stub
    def clearSelectedPath(): Unit = ???

    /** Returns the component in the currently selected path
     *  which contains sourcePoint.
     */
    @stub
    def componentForPoint(source: Component, sourcePoint: Point): Component = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Returns an array of all the ChangeListeners added
     *  to this MenuSelectionManager with addChangeListener().
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the path to the currently selected menu item */
    @stub
    def getSelectedPath(): Array[MenuElement] = ???

    /** Return true if c is part of the currently used menu */
    @stub
    def isComponentPartOfCurrentMenu(c: Component): Boolean = ???

    /** When a MenuElement receives an event from a KeyListener, it should never process the event
     *  directly.
     */
    @stub
    def processKeyEvent(e: KeyEvent): Unit = ???

    /** When a MenuElement receives an event from a MouseListener, it should never process the event
     *  directly.
     */
    @stub
    def processMouseEvent(event: MouseEvent): Unit = ???

    /** Removes a ChangeListener from the button. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???
}

object MenuSelectionManager {
    /** Returns the default menu selection manager. */
    @stub
    def defaultManager(): MenuSelectionManager = ???
}
