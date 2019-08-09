package javax.management.openmbean

import java.lang.{Comparable, Object, String}
import java.util.Set
import javax.management.{Descriptor, MBeanFeatureInfo, MBeanParameterInfo}

/** Describes a parameter used in one or more operations or
 *  constructors of an open MBean.
 */
class OpenMBeanParameterInfoSupport extends MBeanParameterInfo with OpenMBeanParameterInfo {

    /** Constructs an OpenMBeanParameterInfoSupport instance,
     *  which describes the parameter used in one or more operations or
     *  constructors of a class of open MBeans, with the specified
     *  name, openType and description.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[_]) = ???

    /** Constructs an OpenMBeanParameterInfoSupport instance,
     *  which describes the parameter used in one or more operations or
     *  constructors of a class of open MBeans, with the specified
     *  name, openType, description,
     *  and descriptor.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[_], descriptor: Descriptor) = ???

    /** Constructs an OpenMBeanParameterInfoSupport instance,
     *  which describes the parameter used in one or more operations or
     *  constructors of a class of open MBeans, with the specified
     *  name, openType, description and defaultValue.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[T], defaultValue: T) = ???

    /** Constructs an OpenMBeanParameterInfoSupport instance,
     *  which describes the parameter used in one or more operations or
     *  constructors of a class of open MBeans, with the specified
     *  name, openType, description, defaultValue, minValue and maxValue.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[T], defaultValue: T, minValue: Comparable[T], maxValue: Comparable[T]) = ???

    /** Compares the specified obj parameter with this OpenMBeanParameterInfoSupport instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the default value for the parameter described by this
     *  OpenMBeanParameterInfoSupport instance, if specified,
     *  or null otherwise.
     */
    @stub
    def getDefaultValue(): Object = ???

    /** Returns an unmodifiable Set of legal values for the parameter
     *  described by this OpenMBeanParameterInfoSupport
     *  instance, if specified, or null otherwise.
     */
    @stub
    def getLegalValues(): Set[_] = ???

    /** Returns the maximal value for the parameter described by this
     *  OpenMBeanParameterInfoSupport instance, if specified,
     *  or null otherwise.
     */
    @stub
    def getMaxValue(): Comparable[_] = ???

    /** Returns the minimal value for the parameter described by this
     *  OpenMBeanParameterInfoSupport instance, if specified,
     *  or null otherwise.
     */
    @stub
    def getMinValue(): Comparable[_] = ???

    /** Returns the open type for the values of the parameter described
     *  by this OpenMBeanParameterInfoSupport instance.
     */
    @stub
    def getOpenType(): OpenType[_] = ???

    /** Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
     *  default value for the described parameter, false
     *  otherwise.
     */
    @stub
    def hasDefaultValue(): Boolean = ???

    /** Returns the hash code value for this OpenMBeanParameterInfoSupport instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
     *  set of legal values for the described parameter, false
     *  otherwise.
     */
    @stub
    def hasLegalValues(): Boolean = ???

    /** Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
     *  maximal value for the described parameter, false
     *  otherwise.
     */
    @stub
    def hasMaxValue(): Boolean = ???

    /** Returns true if this OpenMBeanParameterInfoSupport instance specifies a non-null
     *  minimal value for the described parameter, false
     *  otherwise.
     */
    @stub
    def hasMinValue(): Boolean = ???

    /** Tests whether obj is a valid value for the parameter
     *  described by this OpenMBeanParameterInfo instance.
     */
    @stub
    def isValue(obj: Object): Boolean = ???
}
