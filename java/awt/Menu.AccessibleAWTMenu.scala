package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** Inner class of Menu used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by menu component developers.
 *  
 *  This class implements accessibility support for the
 *  Menu class.  It provides an implementation of the
 *  Java Accessibility API appropriate to menu user-interface elements.
 */
protected class Menu.AccessibleAWTMenu extends MenuItem.AccessibleAWTMenuItem {

    /**  */
    @stub
    protected def AccessibleAWTMenu() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
