package javax.management

import java.io.Serializable
import java.lang.{Object, String}

/** Provides general information for an MBean descriptor object.
 *  The feature described can be an attribute, an operation, a
 *  parameter, or a notification.  Instances of this class are
 *  immutable.  Subclasses may be mutable but this is not
 *  recommended.
 */
class MBeanFeatureInfo extends Object with Serializable with DescriptorRead {

    /** Constructs an MBeanFeatureInfo object. */
    @stub
    def this(name: String, description: String) = ???

    /** The human-readable description of the feature. */
    @stub
    protected val description: String = ???

    /** Compare this MBeanFeatureInfo to another. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the human-readable description of the feature. */
    @stub
    def getDescription(): String = ???

    /** Returns the descriptor for the feature. */
    @stub
    def getDescriptor(): Descriptor = ???

    /** Returns the name of the feature. */
    @stub
    def getName(): String = ???
}
