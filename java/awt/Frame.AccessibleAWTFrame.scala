package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  Frame class.  It provides an implementation of the
 *  Java Accessibility API appropriate to frame user-interface elements.
 */
protected class Frame.AccessibleAWTFrame extends Window.AccessibleAWTWindow {

    /**  */
    @stub
    protected def AccessibleAWTFrame() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???
}
