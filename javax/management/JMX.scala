package javax.management

import java.lang.{Class, Object, String}

/** Static methods from the JMX API.  There are no instances of this class. */
class JMX extends Object {
}

object JMX {
    /** The name of the defaultValue field. */
    @stub
    val DEFAULT_VALUE_FIELD: String = ???

    /** The name of the immutableInfo field. */
    @stub
    val IMMUTABLE_INFO_FIELD: String = ???

    /** The name of the interfaceClassName field. */
    @stub
    val INTERFACE_CLASS_NAME_FIELD: String = ???

    /** The name of the legalValues field. */
    @stub
    val LEGAL_VALUES_FIELD: String = ???

    /** The name of the maxValue field. */
    @stub
    val MAX_VALUE_FIELD: String = ???

    /** The name of the minValue field. */
    @stub
    val MIN_VALUE_FIELD: String = ???

    /** The name of the mxbean field. */
    @stub
    val MXBEAN_FIELD: String = ???

    /** The name of the openType field. */
    @stub
    val OPEN_TYPE_FIELD: String = ???

    /** Test whether an interface is an MXBean interface. */
    @stub
    def isMXBeanInterface(interfaceClass: Class[_]): Boolean = ???

    /** Make a proxy for a Standard MBean in a local or remote
     *  MBean Server.
     */
    @stub
    def newMBeanProxy[T](connection: MBeanServerConnection, objectName: ObjectName, interfaceClass: Class[T]): T = ???

    /** Make a proxy for a Standard MBean in a local or remote MBean
     *  Server that may also support the methods of NotificationEmitter.
     */
    @stub
    def newMBeanProxy[T](connection: MBeanServerConnection, objectName: ObjectName, interfaceClass: Class[T], notificationEmitter: Boolean): T = ???

    /** Make a proxy for an MXBean in a local or remote MBean Server. */
    @stub
    def newMXBeanProxy[T](connection: MBeanServerConnection, objectName: ObjectName, interfaceClass: Class[T]): T = ???
}
