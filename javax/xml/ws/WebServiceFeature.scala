package javax.xml.ws

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A WebServiceFeature is used to represent a feature that can be
 *  enabled or disabled for a web service.
 *  
 *  The JAX-WS specification will define some standard features and
 *  JAX-WS implementors are free to define additional features if
 *  necessary.  Vendor specific features may not be portable so
 *  caution should be used when using them. Each Feature definition
 *  MUST define a public static final String ID
 *  that can be used in the Feature annotation to refer
 *  to the feature. This ID MUST be unique across all features
 *  of all vendors.  When defining a vendor specific feature ID,
 *  use a vendor specific namespace in the ID string.
 */
abstract class WebServiceFeature extends Object {

    /**  */
    @stub
    protected def this() = ???

    /** Specifies if the feature is enabled or disabled */
    protected val enabled: Boolean

    /** Get the unique identifier for this WebServiceFeature. */
    def getID(): String

    /** Returns true if this feature is enabled. */
    def isEnabled(): Boolean
}
