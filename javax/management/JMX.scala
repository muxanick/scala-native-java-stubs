package javax.management

import java.lang.{Class, Object, String}

// Static methods from the JMX API.  There are no instances of this class.
class JMX extends Object {
}

object JMX {
    @stub
    // The name of the defaultValue field.
    def DEFAULT_VALUE_FIELD: String = ???

    @stub
    // The name of the immutableInfo field.
    def IMMUTABLE_INFO_FIELD: String = ???

    @stub
    // The name of the interfaceClassName field.
    def INTERFACE_CLASS_NAME_FIELD: String = ???

    @stub
    // The name of the legalValues field.
    def LEGAL_VALUES_FIELD: String = ???

    @stub
    // The name of the maxValue field.
    def MAX_VALUE_FIELD: String = ???

    @stub
    // The name of the minValue field.
    def MIN_VALUE_FIELD: String = ???

    @stub
    // The name of the mxbean field.
    def MXBEAN_FIELD: String = ???

    @stub
    // The name of the openType field.
    def OPEN_TYPE_FIELD: String = ???

    @stub
    // Test whether an interface is an MXBean interface.
    def isMXBeanInterface(interfaceClass: Class[_]): Boolean = ???

    @stub
    // Make a proxy for a Standard MBean in a local or remote
    // MBean Server.
    def T: [T] = ???

    @stub
    // Make a proxy for a Standard MBean in a local or remote MBean
    // Server that may also support the methods of NotificationEmitter.
    def T: [T] = ???

    @stub
    // Make a proxy for an MXBean in a local or remote MBean Server.
    def T: [T] = ???
}
