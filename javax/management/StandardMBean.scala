package javax.management

import java.lang.{Boolean, Class, Object, String}
import scala.scalanative.annotation.stub

/** An MBean whose management interface is determined by reflection
 *  on a Java interface.
 * 
 *  This class brings more flexibility to the notion of Management
 *  Interface in the use of Standard MBeans.  Straightforward use of
 *  the patterns for Standard MBeans described in the JMX Specification
 *  means that there is a fixed relationship between the implementation
 *  class of an MBean and its management interface (i.e., if the
 *  implementation class is Thing, the management interface must be
 *  ThingMBean).  This class makes it possible to keep the convenience
 *  of specifying the management interface with a Java interface,
 *  without requiring that there be any naming relationship between the
 *  implementation and interface classes.
 * 
 *  By making a DynamicMBean out of an MBean, this class makes
 *  it possible to select any interface implemented by the MBean as its
 *  management interface, provided that it complies with JMX patterns
 *  (i.e., attributes defined by getter/setter etc...).
 * 
 *   This class also provides hooks that make it possible to supply
 *  custom descriptions and names for the MBeanInfo returned by
 *  the DynamicMBean interface.
 * 
 *  Using this class, an MBean can be created with any
 *  implementation class name Impl and with a management
 *  interface defined (as for current Standard MBeans) by any interface
 *  Intf, in one of two general ways:
 * 
 *  
 * 
 *  Using the public constructor
 *      StandardMBean(impl,interface):
 *      
 *      MBeanServer mbs;
 *      ...
 *      Impl impl = new Impl(...);
 *      StandardMBean mbean = new StandardMBean(impl, Intf.class, false);
 *      mbs.registerMBean(mbean, objectName);
 *      
 * 
 *  Subclassing StandardMBean:
 *      
 *      public class Impl extends StandardMBean implements Intf {
 *         public Impl() {
 *           super(Intf.class, false);
 *        }
 *        // implement methods of Intf
 *      }
 * 
 *      [...]
 * 
 *      MBeanServer mbs;
 *      ....
 *      Impl impl = new Impl();
 *      mbs.registerMBean(impl, objectName);
 *      
 * 
 *  
 * 
 *  In either case, the class Impl must implement the
 *  interface Intf.
 * 
 *  Standard MBeans based on the naming relationship between
 *  implementation and interface classes are of course still
 *  available.
 * 
 *  This class may also be used to construct MXBeans.  The usage
 *  is exactly the same as for Standard MBeans except that in the
 *  examples above, the false parameter to the constructor or
 *  super(...) invocation is instead true.
 */
class StandardMBean extends Object with DynamicMBean with MBeanRegistration {

    /** Make a DynamicMBean out of this, using the specified
     *  mbeanInterface class.
     */
    @stub
    protected def this(mbeanInterface: Class[_]) = ???

    /** Make a DynamicMBean out of this, using the specified
     *  mbeanInterface class, and choosing whether the resulting
     *  MBean is an MXBean.
     */
    @stub
    protected def this(mbeanInterface: Class[_], isMXBean: Boolean) = ???

    /** Make a DynamicMBean out of the object
     *  implementation, using the specified
     *  mbeanInterface class.
     */
    @stub
    def this(implementation: T, mbeanInterface: Class[T]) = ???

    /** Make a DynamicMBean out of the object
     *  implementation, using the specified
     *  mbeanInterface class, and choosing whether the
     *  resultant MBean is an MXBean.
     */
    @stub
    def this(implementation: T, mbeanInterface: Class[T], isMXBean: Boolean) = ???

    /** Customization hook:
     *  cache the MBeanInfo built for this object.
     */
    @stub
    protected def cacheMBeanInfo(info: MBeanInfo): Unit = ???

    /** Obtain the value of a specific attribute of the Dynamic MBean. */
    @stub
    def getAttribute(attribute: String): Object = ???

    /** Get the values of several attributes of the Dynamic MBean. */
    @stub
    def getAttributes(attributes: Array[String]): AttributeList = ???

    /** Customization hook:
     *  Return the MBeanInfo cached for this object.
     */
    @stub
    protected def getCachedMBeanInfo(): MBeanInfo = ???

    /** Customization hook:
     *  Get the className that will be used in the MBeanInfo returned by
     *  this MBean.
     */
    @stub
    protected def getClassName(info: MBeanInfo): String = ???

    /** Customization hook:
     *  Get the MBeanConstructorInfo[] that will be used in the MBeanInfo
     *  returned by this MBean.
     */
    @stub
    protected def getConstructors(ctors: Array[MBeanConstructorInfo], impl: Object): Array[MBeanConstructorInfo] = ???

    /** Customization hook:
     *  Get the description that will be used in the MBeanAttributeInfo
     *  returned by this MBean.
     */
    @stub
    protected def getDescription(info: MBeanAttributeInfo): String = ???

    /** Customization hook:
     *  Get the description that will be used in the MBeanConstructorInfo
     *  returned by this MBean.
     */
    @stub
    protected def getDescription(info: MBeanConstructorInfo): String = ???

    /** Customization hook:
     *  Get the description that will be used for the  sequence
     *  MBeanParameterInfo of the MBeanConstructorInfo returned by this MBean.
     */
    @stub
    protected def getDescription(ctor: MBeanConstructorInfo, param: MBeanParameterInfo, sequence: Int): String = ???

    /** Customization hook:
     *  Get the description that will be used in the MBeanFeatureInfo
     *  returned by this MBean.
     */
    @stub
    protected def getDescription(info: MBeanFeatureInfo): String = ???

    /** Customization hook:
     *  Get the description that will be used in the MBeanInfo returned by
     *  this MBean.
     */
    @stub
    protected def getDescription(info: MBeanInfo): String = ???

    /** Customization hook:
     *  Get the description that will be used in the MBeanOperationInfo
     *  returned by this MBean.
     */
    @stub
    protected def getDescription(info: MBeanOperationInfo): String = ???

    /** Customization hook:
     *  Get the description that will be used for the  sequence
     *  MBeanParameterInfo of the MBeanOperationInfo returned by this MBean.
     */
    @stub
    protected def getDescription(op: MBeanOperationInfo, param: MBeanParameterInfo, sequence: Int): String = ???

    /** Customization hook:
     *  Get the impact flag of the operation that will be used in
     *  the MBeanOperationInfo returned by this MBean.
     */
    @stub
    protected def getImpact(info: MBeanOperationInfo): Int = ???

    /** Get the implementation of this Standard MBean (or MXBean). */
    @stub
    def getImplementation(): Object = ???

    /** Get the class of the implementation of this Standard MBean (or MXBean). */
    @stub
    def getImplementationClass(): Class[_] = ???

    /** Get the MBeanInfo for this MBean. */
    @stub
    def getMBeanInfo(): MBeanInfo = ???

    /** Get the Management Interface of this Standard MBean (or MXBean). */
    @stub
    def getMBeanInterface(): Class[_] = ???

    /** Customization hook:
     *  Get the name that will be used for the sequence
     *  MBeanParameterInfo of the MBeanConstructorInfo returned by this MBean.
     */
    @stub
    protected def getParameterName(ctor: MBeanConstructorInfo, param: MBeanParameterInfo, sequence: Int): String = ???

    /** Customization hook:
     *  Get the name that will be used for the sequence
     *  MBeanParameterInfo of the MBeanOperationInfo returned by this MBean.
     */
    @stub
    protected def getParameterName(op: MBeanOperationInfo, param: MBeanParameterInfo, sequence: Int): String = ???

    /** Allows an action to be invoked on the Dynamic MBean. */
    @stub
    def invoke(actionName: String, params: Array[Object], signature: Array[String]): Object = ???

    /** Allows the MBean to perform any operations needed after having been
     *  unregistered in the MBean server.
     */
    @stub
    def postDeregister(): Unit = ???

    /** Allows the MBean to perform any operations needed after having been
     *  registered in the MBean server or after the registration has failed.
     */
    @stub
    def postRegister(registrationDone: Boolean): Unit = ???

    /** Allows the MBean to perform any operations it needs before
     *  being unregistered by the MBean server.
     */
    @stub
    def preDeregister(): Unit = ???

    /** Allows the MBean to perform any operations it needs before
     *  being registered in the MBean server.
     */
    @stub
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName = ???

    /** Set the value of a specific attribute of the Dynamic MBean. */
    @stub
    def setAttribute(attribute: Attribute): Unit = ???

    /** Sets the values of several attributes of the Dynamic MBean. */
    @stub
    def setAttributes(attributes: AttributeList): AttributeList = ???

    /** Replace the implementation object wrapped in this object. */
    @stub
    def setImplementation(implementation: Object): Unit = ???
}
