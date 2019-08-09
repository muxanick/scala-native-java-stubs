package javax.management.openmbean

import java.lang.Object

/** Describes an attribute of an open MBean.
 * 
 *  This interface declares the same methods as the class MBeanAttributeInfo.  A class implementing this
 *  interface (typically OpenMBeanAttributeInfoSupport) should
 *  extend MBeanAttributeInfo.
 */
trait OpenMBeanAttributeInfo extends OpenMBeanParameterInfo {

    /** Compares the specified obj parameter with this OpenMBeanAttributeInfo instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the hash code value for this OpenMBeanAttributeInfo instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the attribute described by this OpenMBeanAttributeInfo instance
     *  is accessed through a isXXX getter (applies only to boolean and Boolean values),
     *  false otherwise.
     */
    @stub
    def isIs(): Boolean = ???

    /** Returns true if the attribute described by this OpenMBeanAttributeInfo instance is readable,
     *  false otherwise.
     */
    @stub
    def isReadable(): Boolean = ???

    /** Returns true if the attribute described by this OpenMBeanAttributeInfo instance is writable,
     *  false otherwise.
     */
    @stub
    def isWritable(): Boolean = ???
}
