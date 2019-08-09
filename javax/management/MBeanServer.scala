package javax.management

import java.io.ObjectInputStream
import java.lang.{ClassLoader, Integer, Object, String}
import java.util.Set
import javax.management.loading.ClassLoaderRepository
import scala.scalanative.annotation.stub

/** This is the interface for MBean manipulation on the agent
 *  side. It contains the methods necessary for the creation,
 *  registration, and deletion of MBeans as well as the access methods
 *  for registered MBeans.  This is the core component of the JMX
 *  infrastructure.
 * 
 *  User code does not usually implement this interface.  Instead,
 *  an object that implements this interface is obtained with one of
 *  the methods in the MBeanServerFactory class.
 * 
 *  Every MBean which is added to the MBean server becomes
 *  manageable: its attributes and operations become remotely
 *  accessible through the connectors/adaptors connected to that MBean
 *  server.  A Java object cannot be registered in the MBean server
 *  unless it is a JMX compliant MBean.
 * 
 *  When an MBean is registered or unregistered in the
 *  MBean server a MBeanServerNotification Notification is emitted. To register an
 *  object as listener to MBeanServerNotifications you should call the
 *  MBean server method addNotificationListener with ObjectName the
 *  ObjectName of the MBeanServerDelegate.  This
 *  ObjectName is: 
 *  JMImplementation:type=MBeanServerDelegate.
 * 
 *  An object obtained from the createMBeanServer or
 *  newMBeanServer
 *  methods of the MBeanServerFactory class applies security
 *  checks to its methods, as follows.
 * 
 *  First, if there is no security manager (System.getSecurityManager() is null), then an implementation of
 *  this interface is free not to make any checks.
 * 
 *  Assuming that there is a security manager, or that the
 *  implementation chooses to make checks anyway, the checks are made
 *  as detailed below.  In what follows, and unless otherwise specified,
 *  className is the
 *  string returned by MBeanInfo.getClassName() for the target
 *  MBean.
 * 
 *  If a security check fails, the method throws SecurityException.
 * 
 *  For methods that can throw InstanceNotFoundException,
 *  this exception is thrown for a non-existent MBean, regardless of
 *  permissions.  This is because a non-existent MBean has no
 *  className.
 * 
 *  
 * 
 *  For the invoke method, the caller's
 *  permissions must imply MBeanPermission(className, operationName, name, "invoke").
 * 
 *  For the getAttribute method, the
 *  caller's permissions must imply MBeanPermission(className, attribute, name, "getAttribute").
 * 
 *  For the getAttributes method, the
 *  caller's permissions must imply MBeanPermission(className, null, name, "getAttribute").
 *  Additionally, for each attribute a in the AttributeList, if the caller's permissions do not imply MBeanPermission(className, a, name, "getAttribute"), the
 *  MBean server will behave as if that attribute had not been in the
 *  supplied list.
 * 
 *  For the setAttribute method, the
 *  caller's permissions must imply MBeanPermission(className, attrName, name, "setAttribute"), where
 *  attrName is attribute.getName().
 * 
 *  For the setAttributes method, the
 *  caller's permissions must imply MBeanPermission(className, null, name, "setAttribute").
 *  Additionally, for each attribute a in the AttributeList, if the caller's permissions do not imply MBeanPermission(className, a, name, "setAttribute"), the
 *  MBean server will behave as if that attribute had not been in the
 *  supplied list.
 * 
 *  For the addNotificationListener methods,
 *  the caller's permissions must imply MBeanPermission(className, null, name,
 *  "addNotificationListener").
 * 
 *  For the removeNotificationListener methods,
 *  the caller's permissions must imply MBeanPermission(className, null, name,
 *  "removeNotificationListener").
 * 
 *  For the getMBeanInfo method, the
 *  caller's permissions must imply MBeanPermission(className, null, name, "getMBeanInfo").
 * 
 *  For the getObjectInstance method,
 *  the caller's permissions must imply MBeanPermission(className, null, name, "getObjectInstance").
 * 
 *  For the isInstanceOf method, the
 *  caller's permissions must imply MBeanPermission(className, null, name, "isInstanceOf").
 * 
 *  For the queryMBeans method, the
 *  caller's permissions must imply MBeanPermission(null, null, null, "queryMBeans").
 *  Additionally, for each MBean n that matches name,
 *  if the caller's permissions do not imply MBeanPermission(className, null, n, "queryMBeans"), the
 *  MBean server will behave as if that MBean did not exist.
 * 
 *  Certain query elements perform operations on the MBean server.
 *  If the caller does not have the required permissions for a given
 *  MBean, that MBean will not be included in the result of the query.
 *  The standard query elements that are affected are Query.attr(String), Query.attr(String,String), and Query.classattr().
 * 
 *  For the queryNames method, the checks
 *  are the same as for queryMBeans except that
 *  "queryNames" is used instead of
 *  "queryMBeans" in the MBeanPermission
 *  objects.  Note that a "queryMBeans" permission implies
 *  the corresponding "queryNames" permission.
 * 
 *  For the getDomains method, the caller's
 *  permissions must imply MBeanPermission(null, null, null, "getDomains").  Additionally,
 *  for each domain d in the returned array, if the caller's
 *  permissions do not imply MBeanPermission(null, null, new ObjectName("d:x=x"),
 *  "getDomains"), the domain is eliminated from the array.  Here,
 *  x=x is any key=value pair, needed to
 *  satisfy ObjectName's constructor but not otherwise relevant.
 * 
 *  For the getClassLoader method, the
 *  caller's permissions must imply MBeanPermission(className, null, loaderName,
 *  "getClassLoader").
 * 
 *  For the getClassLoaderFor method,
 *  the caller's permissions must imply MBeanPermission(className, null, mbeanName,
 *  "getClassLoaderFor").
 * 
 *  For the getClassLoaderRepository method, the caller's permissions must
 *  imply MBeanPermission(null, null, null, "getClassLoaderRepository").
 * 
 *  For the deprecated deserialize methods, the
 *  required permissions are the same as for the methods that replace
 *  them.
 * 
 *  For the instantiate methods, the caller's
 *  permissions must imply MBeanPermission(className, null, null, "instantiate"),
 *  where className is the name of the class which is to
 *  be instantiated.
 * 
 *  For the registerMBean method, the
 *  caller's permissions must imply MBeanPermission(className, null, name, "registerMBean").
 * 
 *  If the MBeanPermission check succeeds, the MBean's
 *  class is validated by checking that its ProtectionDomain implies MBeanTrustPermission("register").
 * 
 *  Finally, if the name argument is null, another
 *  MBeanPermission check is made using the
 *  ObjectName returned by MBeanRegistration.preRegister.
 * 
 *  For the createMBean methods, the caller's
 *  permissions must imply the permissions needed by the equivalent
 *  instantiate followed by
 *  registerMBean.
 * 
 *  For the unregisterMBean method,
 *  the caller's permissions must imply MBeanPermission(className, null, name, "unregisterMBean").
 * 
 *  
 */
trait MBeanServer extends MBeanServerConnection {

    /** Adds a listener to a registered MBean. */
    @stub
    def addNotificationListener(name: ObjectName, listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Adds a listener to a registered MBean. */
    @stub
    def addNotificationListener(name: ObjectName, listener: ObjectName, filter: NotificationFilter, handback: Object): Unit = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName): ObjectInstance = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName, params: Array[Object], signature: Array[String]): ObjectInstance = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName): ObjectInstance = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, params: Array[Object], signature: Array[String]): ObjectInstance = ???

    /** Deprecated. 
     * Use getClassLoaderFor to
     *  obtain the appropriate class loader for deserialization.
     * 
     */
    @stub
    def deserialize(name: ObjectName, data: Array[Byte]): ObjectInputStream = ???

    /** Deprecated. 
     * Use getClassLoaderRepository() to obtain the
     *  class loader repository and use it to deserialize.
     * 
     */
    @stub
    def deserialize(className: String, data: Array[Byte]): ObjectInputStream = ???

    /** Deprecated. 
     * Use getClassLoader to obtain
     *  the class loader for deserialization.
     * 
     */
    @stub
    def deserialize(className: String, loaderName: ObjectName, data: Array[Byte]): ObjectInputStream = ???

    /** Gets the value of a specific attribute of a named MBean. */
    @stub
    def getAttribute(name: ObjectName, attribute: String): Object = ???

    /** Retrieves the values of several attributes of a named MBean. */
    @stub
    def getAttributes(name: ObjectName, attributes: Array[String]): AttributeList = ???

    /** Return the named ClassLoader. */
    @stub
    def getClassLoader(loaderName: ObjectName): ClassLoader = ???

    /** Return the ClassLoader that was used for
     *  loading the class of the named MBean.
     */
    @stub
    def getClassLoaderFor(mbeanName: ObjectName): ClassLoader = ???

    /** Return the ClassLoaderRepository for this MBeanServer. */
    @stub
    def getClassLoaderRepository(): ClassLoaderRepository = ???

    /** Returns the default domain used for naming the MBean. */
    @stub
    def getDefaultDomain(): String = ???

    /** Returns the list of domains in which any MBean is currently
     *  registered.
     */
    @stub
    def getDomains(): Array[String] = ???

    /** Returns the number of MBeans registered in the MBean server. */
    @stub
    def getMBeanCount(): Integer = ???

    /** This method discovers the attributes and operations that an
     *  MBean exposes for management.
     */
    @stub
    def getMBeanInfo(name: ObjectName): MBeanInfo = ???

    /** Gets the ObjectInstance for a given MBean
     *  registered with the MBean server.
     */
    @stub
    def getObjectInstance(name: ObjectName): ObjectInstance = ???

    /** Instantiates an object using the list of all class loaders
     *  registered in the MBean server's Class Loader
     *  Repository.
     */
    @stub
    def instantiate(className: String): Object = ???

    /** Instantiates an object using the list of all class loaders
     *  registered in the MBean server Class Loader
     *  Repository.
     */
    @stub
    def instantiate(className: String, params: Array[Object], signature: Array[String]): Object = ???

    /** Instantiates an object using the class Loader specified by its
     *  ObjectName.
     */
    @stub
    def instantiate(className: String, loaderName: ObjectName): Object = ???

    /** Instantiates an object. */
    @stub
    def instantiate(className: String, loaderName: ObjectName, params: Array[Object], signature: Array[String]): Object = ???

    /** Invokes an operation on an MBean. */
    @stub
    def invoke(name: ObjectName, operationName: String, params: Array[Object], signature: Array[String]): Object = ???

    /** Returns true if the MBean specified is an instance of the
     *  specified class, false otherwise.
     */
    @stub
    def isInstanceOf(name: ObjectName, className: String): Boolean = ???

    /** Checks whether an MBean, identified by its object name, is
     *  already registered with the MBean server.
     */
    @stub
    def isRegistered(name: ObjectName): Boolean = ???

    /** Gets MBeans controlled by the MBean server. */
    @stub
    def queryMBeans(name: ObjectName, query: QueryExp): Set[ObjectInstance] = ???

    /** Gets the names of MBeans controlled by the MBean server. */
    @stub
    def queryNames(name: ObjectName, query: QueryExp): Set[ObjectName] = ???

    /** Registers a pre-existing object as an MBean with the MBean
     *  server.
     */
    @stub
    def registerMBean(object: Object, name: ObjectName): ObjectInstance = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: NotificationListener): Unit = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: ObjectName): Unit = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: ObjectName, filter: NotificationFilter, handback: Object): Unit = ???

    /** Sets the value of a specific attribute of a named MBean. */
    @stub
    def setAttribute(name: ObjectName, attribute: Attribute): Unit = ???

    /** Sets the values of several attributes of a named MBean. */
    @stub
    def setAttributes(name: ObjectName, attributes: AttributeList): AttributeList = ???

    /** Unregisters an MBean from the MBean server. */
    @stub
    def unregisterMBean(name: ObjectName): Unit = ???
}
