package javax.management.openmbean

import java.lang.{Comparable, Object, String}
import java.util.Set

/** Describes a parameter used in one or more operations or
 *  constructors of an open MBean.
 * 
 *  This interface declares the same methods as the class MBeanParameterInfo.  A class implementing this
 *  interface (typically OpenMBeanParameterInfoSupport) should
 *  extend MBeanParameterInfo.
 */
trait OpenMBeanParameterInfo {

    /** Compares the specified obj parameter with this OpenMBeanParameterInfo instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the default value for this parameter, if it has one, or
     *  null otherwise.
     */
    @stub
    def getDefaultValue(): Object = ???

    /** Returns a human readable description of the parameter
     *  described by this OpenMBeanParameterInfo instance.
     */
    @stub
    def getDescription(): String = ???

    /** Returns the set of legal values for this parameter, if it has
     *  one, or null otherwise.
     */
    @stub
    def getLegalValues(): Set[_] = ???

    /** Returns the maximal value for this parameter, if it has one, or
     *  null otherwise.
     */
    @stub
    def getMaxValue(): Comparable[_] = ???

    /** Returns the minimal value for this parameter, if it has one, or
     *  null otherwise.
     */
    @stub
    def getMinValue(): Comparable[_] = ???

    /** Returns the name of the parameter
     *  described by this OpenMBeanParameterInfo instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the open type of the values of the parameter
     *  described by this OpenMBeanParameterInfo instance.
     */
    @stub
    def getOpenType(): OpenType[_] = ???

    /** Returns true if this parameter has a specified default
     *  value, or false otherwise.
     */
    @stub
    def hasDefaultValue(): Boolean = ???

    /** Returns the hash code value for this OpenMBeanParameterInfo instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this parameter has a specified set of
     *  legal values, or false otherwise.
     */
    @stub
    def hasLegalValues(): Boolean = ???

    /** Returns true if this parameter has a specified maximal
     *  value, or false otherwise.
     */
    @stub
    def hasMaxValue(): Boolean = ???

    /** Returns true if this parameter has a specified minimal
     *  value, or false otherwise.
     */
    @stub
    def hasMinValue(): Boolean = ???

    /** Tests whether obj is a valid value for the parameter
     *  described by this OpenMBeanParameterInfo instance.
     */
    @stub
    def isValue(obj: Object): Boolean = ???
}
