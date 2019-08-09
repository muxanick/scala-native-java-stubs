package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Number, Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleValue}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  Checkbox class.  It provides an implementation of the
 *  Java Accessibility API appropriate to checkbox user-interface elements.
 */
protected class Checkbox.AccessibleAWTCheckbox extends Component.AccessibleAWTComponent with ItemListener with AccessibleAction with AccessibleValue {

    /**  */
    @stub
    def AccessibleAWTCheckbox() = ???

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

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

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

    /** Fire accessible property change events when the state of the
     *  toggle button changes.
     */
    @stub
    def itemStateChanged(e: ItemEvent): Unit = ???

    /** Set the value of this object as a Number. */
    @stub
    def setCurrentAccessibleValue(n: Number): Boolean = ???
}
