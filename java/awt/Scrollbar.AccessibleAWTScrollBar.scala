package java.awt

import java.lang.{Number, Object}
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleValue}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  Scrollbar class.  It provides an implementation of
 *  the Java Accessibility API appropriate to scrollbar
 *  user-interface elements.
 */
protected class Scrollbar.AccessibleAWTScrollBar extends Component.AccessibleAWTComponent with AccessibleValue {

    /**  */
    @stub
    protected def AccessibleAWTScrollBar() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Get the AccessibleValue associated with this
     *  object.
     */
    @stub
    def getAccessibleValue(): AccessibleValue = ???

    /** Get the accessible value of this object. */
    @stub
    def getCurrentAccessibleValue(): Number = ???

    /** Get the maximum accessible value of this object. */
    @stub
    def getMaximumAccessibleValue(): Number = ???

    /** Get the minimum accessible value of this object. */
    @stub
    def getMinimumAccessibleValue(): Number = ???

    /** Set the value of this object as a Number. */
    @stub
    def setCurrentAccessibleValue(n: Number): Boolean = ???
}
