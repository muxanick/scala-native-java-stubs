package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.{DynamicMBean, PersistentMBean}
import scala.scalanative.annotation.stub

/** This interface must be implemented by the ModelMBeans. An implementation of this interface
 *  must be shipped with every JMX Agent.
 *  
 *  Java resources wishing to be manageable instantiate the ModelMBean using the MBeanServer's
 *  createMBean method.  The resource then sets the ModelMBeanInfo (with Descriptors) for the ModelMBean
 *  instance. The attributes and operations exposed via the ModelMBeanInfo for the ModelMBean are accessible
 *  from MBeans, connectors/adaptors like other MBeans. Through the ModelMBeanInfo Descriptors, values and methods in
 *  the managed application can be defined and mapped to attributes and operations of the ModelMBean.
 *  This mapping can be defined during development in an XML formatted file or dynamically and
 *  programmatically at runtime.
 *  
 *  Every ModelMBean which is instantiated in the MBeanServer becomes manageable:
 *  its attributes and operations
 *  become remotely accessible through the connectors/adaptors connected to that MBeanServer.
 *  A Java object cannot be registered in the MBeanServer unless it is a JMX compliant MBean.
 *  By instantiating a ModelMBean, resources are guaranteed that the MBean is valid.
 *  
 *  MBeanException and RuntimeOperationsException must be thrown on every public method.  This allows
 *  for wrapping exceptions from distributed communications (RMI, EJB, etc.).  These exceptions do
 *  not have to be thrown by the implementation except in the scenarios described in the specification
 *  and javadoc.
 */
trait ModelMBean extends DynamicMBean with PersistentMBean with ModelMBeanNotificationBroadcaster {

    /** Sets the instance handle of the object against which to
     *  execute all methods in this ModelMBean management interface
     *  (MBeanInfo and Descriptors).
     */
    @stub
    def setManagedResource(mr: Any, mr_type: String): Unit = ???

    /** Initializes a ModelMBean object using ModelMBeanInfo passed in. */
    @stub
    def setModelMBeanInfo(inModelMBeanInfo: ModelMBeanInfo): Unit = ???
}
