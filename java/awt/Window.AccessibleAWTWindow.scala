package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  Window class.  It provides an implementation of the
 *  Java Accessibility API appropriate to window user-interface elements.
 */
protected class Window.AccessibleAWTWindow extends Container.AccessibleAWTContainer {

    /**  */
    @stub
    protected def AccessibleAWTWindow() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???
}
