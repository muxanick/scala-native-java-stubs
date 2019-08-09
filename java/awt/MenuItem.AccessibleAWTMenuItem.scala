package java.awt

import java.lang.{Number, Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleRole, AccessibleValue}
import scala.scalanative.annotation.stub

/** Inner class of MenuItem used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by menu component developers.
 *  
 *  This class implements accessibility support for the
 *  MenuItem class.  It provides an implementation of the
 *  Java Accessibility API appropriate to menu item user-interface elements.
 */
protected class MenuItem.AccessibleAWTMenuItem extends MenuComponent.AccessibleAWTMenuComponent with AccessibleAction with AccessibleValue {

    /**  */
    @stub
    protected def AccessibleAWTMenuItem() = ???

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
