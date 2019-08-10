package java.awt

import java.awt.event.{ActionEvent, ActionListener}
import java.lang.{Class, Number, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleRole, AccessibleValue}
import scala.scalanative.annotation.stub

/** This class creates a labeled button. The application can cause
 *  some action to happen when the button is pushed. This image
 *  depicts three views of a "Quit" button as it appears
 *  under the Solaris operating system:
 *  
 *  
 *  
 *  The first view shows the button as it appears normally.
 *  The second view shows the button
 *  when it has input focus. Its outline is darkened to let the
 *  user know that it is an active object. The third view shows the
 *  button when the user clicks the mouse over the button, and thus
 *  requests that an action be performed.
 *  
 *  The gesture of clicking on a button with the mouse
 *  is associated with one instance of ActionEvent,
 *  which is sent out when the mouse is both pressed and released
 *  over the button. If an application is interested in knowing
 *  when the button has been pressed but not released, as a separate
 *  gesture, it can specialize processMouseEvent,
 *  or it can register itself as a listener for mouse events by
 *  calling addMouseListener. Both of these methods are
 *  defined by Component, the abstract superclass of
 *  all components.
 *  
 *  When a button is pressed and released, AWT sends an instance
 *  of ActionEvent to the button, by calling
 *  processEvent on the button. The button's
 *  processEvent method receives all events
 *  for the button; it passes an action event along by
 *  calling its own processActionEvent method.
 *  The latter method passes the action event on to any action
 *  listeners that have registered an interest in action
 *  events generated by this button.
 *  
 *  If an application wants to perform some action based on
 *  a button being pressed and released, it should implement
 *  ActionListener and register the new listener
 *  to receive events from this button, by calling the button's
 *  addActionListener method. The application can
 *  make use of the button's action command as a messaging protocol.
 */
class Button extends Component with Accessible {

    /** Constructs a button with an empty string for its label. */
    @stub
    def this() = ???

    /** Constructs a button with the specified label. */
    @stub
    def this(label: String) = ???

    /** This class implements accessibility support for the
     *  Button class.  It provides an implementation of the
     *  Java Accessibility API appropriate to button user-interface elements.
     */
    protected class AccessibleAWTButton extends Component.AccessibleAWTComponent with AccessibleAction with AccessibleValue {

        /**  */
        @stub
        protected def this() = ???

        /** Perform the specified Action on the object */
        @stub
        def doAccessibleAction(i: Int): Boolean = ???

        /** Get the AccessibleAction associated with this object. */
        @stub
        def getAccessibleAction(): AccessibleAction = ???

        /** Returns the number of Actions available in this object. */
        @stub
        def getAccessibleActionCount(): Int = ???

        /** Return a description of the specified action of the object. */
        @stub
        def getAccessibleActionDescription(i: Int): String = ???

        /** Get the accessible name of this object. */
        @stub
        def getAccessibleName(): String = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the AccessibleValue associated with this object. */
        @stub
        def getAccessibleValue(): AccessibleValue = ???

        /** Get the value of this object as a Number. */
        @stub
        def getCurrentAccessibleValue(): Number = ???

        /** Get the maximum value of this object as a Number. */
        @stub
        def getMaximumAccessibleValue(): Number = ???

        /** Get the minimum value of this object as a Number. */
        @stub
        def getMinimumAccessibleValue(): Number = ???

        /** Set the value of this object as a Number. */
        @stub
        def setCurrentAccessibleValue(n: Number): Boolean = ???
    }


    /** Adds the specified action listener to receive action events from
     *  this button.
     */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Creates the peer of the button. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with
     *  this Button.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the command name of the action event fired by this button. */
    @stub
    def getActionCommand(): String = ???

    /** Returns an array of all the action listeners
     *  registered on this button.
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Gets the label of this button. */
    @stub
    def getLabel(): String = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this Button.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns a string representing the state of this Button. */
    @stub
    protected def paramString(): String = ???

    /** Processes action events occurring on this button
     *  by dispatching them to any registered
     *  ActionListener objects.
     */
    @stub
    protected def processActionEvent(e: ActionEvent): Unit = ???

    /** Processes events on this button. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Removes the specified action listener so that it no longer
     *  receives action events from this button.
     */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Sets the command name for the action event fired
     *  by this button.
     */
    @stub
    def setActionCommand(command: String): Unit = ???

    /** Sets the button's label to be the specified string. */
    @stub
    def setLabel(label: String): Unit = ???
}
