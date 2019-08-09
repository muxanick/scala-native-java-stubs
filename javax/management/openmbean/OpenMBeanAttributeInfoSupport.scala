package javax.management.openmbean

import java.lang.{Comparable, Object, String}
import java.util.Set
import javax.management.{Descriptor, MBeanAttributeInfo, MBeanFeatureInfo}
import scala.scalanative.annotation.stub

/** Describes an attribute of an open MBean. */
class OpenMBeanAttributeInfoSupport extends MBeanAttributeInfo with OpenMBeanAttributeInfo {

    /** Constructs an OpenMBeanAttributeInfoSupport instance,
     *  which describes the attribute of an open MBean with the
     *  specified name, openType and description, and the specified read/write access properties.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[_], isReadable: Boolean, isWritable: Boolean, isIs: Boolean) = ???

    /** Constructs an OpenMBeanAttributeInfoSupport instance,
     *  which describes the attribute of an open MBean with the
     *  specified name, openType, description, read/write access properties, and Descriptor.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[_], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, descriptor: Descriptor) = ???

    /** Constructs an OpenMBeanAttributeInfoSupport instance,
     *  which describes the attribute of an open MBean with the
     *  specified name, openType, description
     *  and defaultValue, and the specified read/write access
     *  properties.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[T], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, defaultValue: T) = ???

    /** Constructs an OpenMBeanAttributeInfoSupport instance,
     *  which describes the attribute of an open MBean, with the
     *  specified name, openType, description,
     *  defaultValue, minValue and maxValue.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[T], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, defaultValue: T, minValue: Comparable[T], maxValue: Comparable[T]) = ???

    /** Constructs an OpenMBeanAttributeInfoSupport instance,
     *  which describes the attribute of an open MBean with the
     *  specified name, openType, description,
     *  defaultValue and legalValues, and the specified
     *  read/write access properties.
     */
    @stub
    def this(name: String, description: String, openType: OpenType[T], isReadable: Boolean, isWritable: Boolean, isIs: Boolean, defaultValue: T, legalValues: Array[T]) = ???

    /** Compares the specified obj parameter with this OpenMBeanAttributeInfoSupport instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the default value for the attribute described by this
     *  OpenMBeanAttributeInfoSupport instance, if specified,
     *  or null otherwise.
     */
    @stub
    def getDefaultValue(): Object = ???

    /** Returns an unmodifiable Set of legal values for the attribute
     *  described by this OpenMBeanAttributeInfoSupport
     *  instance, if specified, or null otherwise.
     */
    @stub
    def getLegalValues(): Set[_] = ???

    /** Returns the maximal value for the attribute described by this
     *  OpenMBeanAttributeInfoSupport instance, if specified,
     *  or null otherwise.
     */
    @stub
    def getMaxValue(): Comparable[_] = ???

    /** Returns the minimal value for the attribute described by this
     *  OpenMBeanAttributeInfoSupport instance, if specified,
     *  or null otherwise.
     */
    @stub
    def getMinValue(): Comparable[_] = ???

    /** Returns the open type for the values of the attribute described
     *  by this OpenMBeanAttributeInfoSupport instance.
     */
    @stub
    def getOpenType(): OpenType[_] = ???

    /** Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
     *  default value for the described attribute, false
     *  otherwise.
     */
    @stub
    def hasDefaultValue(): Boolean = ???

    /** Returns the hash code value for this OpenMBeanAttributeInfoSupport instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
     *  set of legal values for the described attribute, false
     *  otherwise.
     */
    @stub
    def hasLegalValues(): Boolean = ???

    /** Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
     *  maximal value for the described attribute, false
     *  otherwise.
     */
    @stub
    def hasMaxValue(): Boolean = ???

    /** Returns true if this OpenMBeanAttributeInfoSupport instance specifies a non-null
     *  minimal value for the described attribute, false
     *  otherwise.
     */
    @stub
    def hasMinValue(): Boolean = ???

    /** Tests whether obj is a valid value for the attribute
     *  described by this OpenMBeanAttributeInfoSupport
     *  instance.
     */
    @stub
    def isValue(obj: Object): Boolean = ???

    /** Returns a string representation of this
     *  OpenMBeanAttributeInfoSupport instance.
     */
    @stub
    def toString(): String = ???
}
