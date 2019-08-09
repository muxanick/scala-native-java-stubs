package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** Inner class of MenuBar used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by menu component developers.
 *  
 *  This class implements accessibility support for the
 *  MenuBar class.  It provides an implementation of the
 *  Java Accessibility API appropriate to menu bar user-interface elements.
 */
protected class MenuBar.AccessibleAWTMenuBar extends MenuComponent.AccessibleAWTMenuComponent {

    /**  */
    @stub
    protected def AccessibleAWTMenuBar() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
