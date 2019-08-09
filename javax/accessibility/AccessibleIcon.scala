package javax.accessibility

import java.lang.String
import scala.scalanative.annotation.stub

/** The AccessibleIcon interface should be supported by any object
 *  that has an associated icon (e.g., buttons). This interface
 *  provides the standard mechanism for an assistive technology
 *  to get descriptive information about icons.
 *  Applications can determine
 *  if an object supports the AccessibleIcon interface by first
 *  obtaining its AccessibleContext (see
 *  Accessible) and then calling the
 *  AccessibleContext.getAccessibleIcon() method.
 *  If the return value is not null, the object supports this interface.
 */
trait AccessibleIcon {

    /** Gets the description of the icon. */
    @stub
    def getAccessibleIconDescription(): String = ???

    /** Gets the height of the icon */
    @stub
    def getAccessibleIconHeight(): Int = ???

    /** Gets the width of the icon */
    @stub
    def getAccessibleIconWidth(): Int = ???

    /** Sets the description of the icon. */
    @stub
    def setAccessibleIconDescription(description: String): Unit = ???
}
