package javax.accessibility

import scala.scalanative.annotation.stub

/** Interface Accessible is the main interface for the accessibility package.
 *  All components that support
 *  the accessibility package must implement this interface.
 *  It contains a single method, getAccessibleContext(), which
 *  returns an instance of the class AccessibleContext.
 */
trait Accessible {

    /** Returns the AccessibleContext associated with this object. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???
}
