package javax.management

import java.io.Serializable
import java.lang.{Object, String}

// Provides general information for an MBean descriptor object.
// The feature described can be an attribute, an operation, a
// parameter, or a notification.  Instances of this class are
// immutable.  Subclasses may be mutable but this is not
// recommended.
class MBeanFeatureInfo extends Object with Serializable, with DescriptorRead {

    @stub
    // Constructs an MBeanFeatureInfo object.
    def this(name: String, description: String) = ???

    @stub
    // The human-readable description of the feature.
    protected def description: String = ???

    @stub
    // Compare this MBeanFeatureInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the human-readable description of the feature.
    def getDescription(): String = ???

    @stub
    // Returns the descriptor for the feature.
    def getDescriptor(): Descriptor = ???

    @stub
    // Returns the name of the feature.
    def getName(): String = ???
}
