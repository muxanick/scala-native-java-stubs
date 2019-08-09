package javax.management.openmbean

import java.lang.{Comparable, Object, String}
import java.util.Set
import javax.management.{Descriptor, MBeanAttributeInfo, MBeanFeatureInfo}

// Describes an attribute of an open MBean.
class OpenMBeanAttributeInfoSupport extends MBeanAttributeInfo with OpenMBeanAttributeInfo {

    @stub
    // Constructs an OpenMBeanAttributeInfoSupport instance,
    // which describes the attribute of an open MBean with the
    // specified name, openType and description, and the specified read/write access properties.
    def this(name: String, description: String, openType: OpenType[_], isReadable: Boolean, isWritable: Boolean, isIs: Boolean) = ???

    @stub
    // Constructs an OpenMBeanAttributeInfoSupport instance,
    // which describes the attribute of an open MBean with the
    // specified name, openType, description, read/write access properties, and Descriptor.
    def this(name: String, description: String, openType: OpenType[_], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, descriptor: Descriptor) = ???

    @stub
    // Constructs an OpenMBeanAttributeInfoSupport instance,
    // which describes the attribute of an open MBean with the
    // specified name, openType, description
    // and defaultValue, and the specified read/write access
    // properties.
    def this(name: String, description: String, openType: OpenType[T], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, defaultValue: T) = ???

    @stub
    // Constructs an OpenMBeanAttributeInfoSupport instance,
    // which describes the attribute of an open MBean, with the
    // specified name, openType, description,
    // defaultValue, minValue and maxValue.
    def this(name: String, description: String, openType: OpenType[T], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, defaultValue: T, minValue: Comparable[T], maxValue: Comparable[T]) = ???

    @stub
    // Compares the specified obj parameter with this OpenMBeanAttributeInfoSupport instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the default value for the attribute described by this
    // OpenMBeanAttributeInfoSupport instance, if specified,
    // or null otherwise.
    def getDefaultValue(): Object = ???

    @stub
    // Returns an unmodifiable Set of legal values for the attribute
    // described by this OpenMBeanAttributeInfoSupport
    // instance, if specified, or null otherwise.
    def getLegalValues(): Set[_] = ???

    @stub
    // Returns the maximal value for the attribute described by this
    // OpenMBeanAttributeInfoSupport instance, if specified,
    // or null otherwise.
    def getMaxValue(): Comparable[_] = ???

    @stub
    // Returns the minimal value for the attribute described by this
    // OpenMBeanAttributeInfoSupport instance, if specified,
    // or null otherwise.
    def getMinValue(): Comparable[_] = ???

    @stub
    // Returns the open type for the values of the attribute described
    // by this OpenMBeanAttributeInfoSupport instance.
    def getOpenType(): OpenType[_] = ???

    @stub
    // Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
    // default value for the described attribute, false
    // otherwise.
    def hasDefaultValue(): Boolean = ???

    @stub
    // Returns the hash code value for this OpenMBeanAttributeInfoSupport instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
    // set of legal values for the described attribute, false
    // otherwise.
    def hasLegalValues(): Boolean = ???

    @stub
    // Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
    // maximal value for the described attribute, false
    // otherwise.
    def hasMaxValue(): Boolean = ???

    @stub
    // Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
    // minimal value for the described attribute, false
    // otherwise.
    def hasMinValue(): Boolean = ???

    @stub
    // Tests whether obj is a valid value for the attribute
    // described by this OpenMBeanAttributeInfoSupport
    // instance.
    def isValue(obj: Object): Boolean = ???
}
