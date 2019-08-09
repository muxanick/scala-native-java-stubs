package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** Inner class of PopupMenu used to provide default support for
 *  accessibility.  This class is not meant to be used directly by
 *  application developers, but is instead meant only to be
 *  subclassed by menu component developers.
 *  
 *  The class used to obtain the accessible role for this object.
 */
protected class PopupMenu.AccessibleAWTPopupMenu extends Menu.AccessibleAWTMenu {

    /**  */
    @stub
    protected def AccessibleAWTPopupMenu() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
