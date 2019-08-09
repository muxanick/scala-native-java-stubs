package javax.management.openmbean

import java.lang.{Comparable, Object, String}
import java.util.Set

// Describes a parameter used in one or more operations or
// constructors of an open MBean.
//
// This interface declares the same methods as the class MBeanParameterInfo.  A class implementing this
// interface (typically OpenMBeanParameterInfoSupport) should
// extend MBeanParameterInfo.
trait OpenMBeanParameterInfo {

    @stub
    // Compares the specified obj parameter with this OpenMBeanParameterInfo instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the default value for this parameter, if it has one, or
    // null otherwise.
    def getDefaultValue(): Object = ???

    @stub
    // Returns a human readable description of the parameter
    // described by this OpenMBeanParameterInfo instance.
    def getDescription(): String = ???

    @stub
    // Returns the set of legal values for this parameter, if it has
    // one, or null otherwise.
    def getLegalValues(): Set[_] = ???

    @stub
    // Returns the maximal value for this parameter, if it has one, or
    // null otherwise.
    def getMaxValue(): Comparable[_] = ???

    @stub
    // Returns the minimal value for this parameter, if it has one, or
    // null otherwise.
    def getMinValue(): Comparable[_] = ???

    @stub
    // Returns the name of the parameter
    // described by this OpenMBeanParameterInfo instance.
    def getName(): String = ???

    @stub
    // Returns the open type of the values of the parameter
    // described by this OpenMBeanParameterInfo instance.
    def getOpenType(): OpenType[_] = ???

    @stub
    // Returns true if this parameter has a specified default
    // value, or false otherwise.
    def hasDefaultValue(): Boolean = ???

    @stub
    // Returns the hash code value for this OpenMBeanParameterInfo instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if this parameter has a specified set of
    // legal values, or false otherwise.
    def hasLegalValues(): Boolean = ???

    @stub
    // Returns true if this parameter has a specified maximal
    // value, or false otherwise.
    def hasMaxValue(): Boolean = ???

    @stub
    // Returns true if this parameter has a specified minimal
    // value, or false otherwise.
    def hasMinValue(): Boolean = ???

    @stub
    // Tests whether obj is a valid value for the parameter
    // described by this OpenMBeanParameterInfo instance.
    def isValue(obj: Object): Boolean = ???
}
