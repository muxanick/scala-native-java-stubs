package javax.management.openmbean

import java.lang.{Comparable, Object, String}
import java.util.Set
import javax.management.{Descriptor, MBeanFeatureInfo, MBeanParameterInfo}

// Describes a parameter used in one or more operations or
// constructors of an open MBean.
class OpenMBeanParameterInfoSupport extends MBeanParameterInfo with OpenMBeanParameterInfo {

    @stub
    // Constructs an OpenMBeanParameterInfoSupport instance,
    // which describes the parameter used in one or more operations or
    // constructors of a class of open MBeans, with the specified
    // name, openType and description.
    def this(name: String, description: String, openType: OpenType[_]) = ???

    @stub
    // Constructs an OpenMBeanParameterInfoSupport instance,
    // which describes the parameter used in one or more operations or
    // constructors of a class of open MBeans, with the specified
    // name, openType, description,
    // and descriptor.
    def this(name: String, description: String, openType: OpenType[_], descriptor: Descriptor) = ???

    @stub
    // Constructs an OpenMBeanParameterInfoSupport instance,
    // which describes the parameter used in one or more operations or
    // constructors of a class of open MBeans, with the specified
    // name, openType, description and defaultValue.
    def this(name: String, description: String, openType: OpenType[T], defaultValue: T) = ???

    @stub
    // Constructs an OpenMBeanParameterInfoSupport instance,
    // which describes the parameter used in one or more operations or
    // constructors of a class of open MBeans, with the specified
    // name, openType, description, defaultValue, minValue and maxValue.
    def this(name: String, description: String, openType: OpenType[T], defaultValue: T, minValue: Comparable[T], maxValue: Comparable[T]) = ???

    @stub
    // Compares the specified obj parameter with this OpenMBeanParameterInfoSupport instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the default value for the parameter described by this
    // OpenMBeanParameterInfoSupport instance, if specified,
    // or null otherwise.
    def getDefaultValue(): Object = ???

    @stub
    // Returns an unmodifiable Set of legal values for the parameter
    // described by this OpenMBeanParameterInfoSupport
    // instance, if specified, or null otherwise.
    def getLegalValues(): Set[_] = ???

    @stub
    // Returns the maximal value for the parameter described by this
    // OpenMBeanParameterInfoSupport instance, if specified,
    // or null otherwise.
    def getMaxValue(): Comparable[_] = ???

    @stub
    // Returns the minimal value for the parameter described by this
    // OpenMBeanParameterInfoSupport instance, if specified,
    // or null otherwise.
    def getMinValue(): Comparable[_] = ???

    @stub
    // Returns the open type for the values of the parameter described
    // by this OpenMBeanParameterInfoSupport instance.
    def getOpenType(): OpenType[_] = ???

    @stub
    // Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
    // default value for the described parameter, false
    // otherwise.
    def hasDefaultValue(): Boolean = ???

    @stub
    // Returns the hash code value for this OpenMBeanParameterInfoSupport instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
    // set of legal values for the described parameter, false
    // otherwise.
    def hasLegalValues(): Boolean = ???

    @stub
    // Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
    // maximal value for the described parameter, false
    // otherwise.
    def hasMaxValue(): Boolean = ???

    @stub
    // Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
    // minimal value for the described parameter, false
    // otherwise.
    def hasMinValue(): Boolean = ???

    @stub
    // Tests whether obj is a valid value for the parameter
    // described by this OpenMBeanParameterInfo instance.
    def isValue(obj: Object): Boolean = ???
}
