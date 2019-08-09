package javax.accessibility

import java.lang.String
import scala.scalanative.annotation.stub

/** The AccessibleExtendedComponent interface should be supported by any object
 *  that is rendered on the screen.  This interface provides the standard
 *  mechanism for an assistive technology to determine the extended
 *  graphical representation of an object.  Applications can determine
 *  if an object supports the AccessibleExtendedComponent interface by first
 *  obtaining its AccessibleContext
 *  and then calling the
 *  AccessibleContext.getAccessibleComponent() method.
 *  If the return value is not null and the type of the return value is
 *  AccessibleExtendedComponent, the object supports this interface.
 */
trait AccessibleExtendedComponent extends AccessibleComponent {

    /** Returns key bindings associated with this object */
    @stub
    def getAccessibleKeyBinding(): AccessibleKeyBinding = ???

    /** Returns the titled border text */
    @stub
    def getTitledBorderText(): String = ???

    /** Returns the tool tip text */
    @stub
    def getToolTipText(): String = ???
}
