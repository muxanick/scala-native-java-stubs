package javax.accessibility

import java.lang.{Deprecated, Object}
import java.util.{ListResourceBundle, ResourceBundle}
import scala.scalanative.annotation.stub

/** A resource bundle containing the localized strings in the accessibility
 *  package.  This is meant only for internal use by Java Accessibility and
 *  is not meant to be used by assistive technologies or applications.
 */
@Deprecated
class AccessibleResourceBundle extends ListResourceBundle {

    /** Deprecated.  */
    @stub
    def this() = ???

    /** Deprecated.  */
    @stub
    def getContents(): Array[Array[Object]] = ???
}
