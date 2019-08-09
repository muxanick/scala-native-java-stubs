package javax.management

import java.lang.Object
import java.lang.reflect.{InvocationHandler, Method}

/** InvocationHandler that forwards methods in an MBean's
 *  management interface through the MBean server to the MBean.
 * 
 *  Given an MBeanServerConnection, the ObjectName
 *  of an MBean within that MBean server, and a Java interface
 *  Intf that describes the management interface of the
 *  MBean using the patterns for a Standard MBean or an MXBean, this
 *  class can be used to construct a proxy for the MBean.  The proxy
 *  implements the interface Intf such that all of its
 *  methods are forwarded through the MBean server to the MBean.
 * 
 *  If the InvocationHandler is for an MXBean, then the parameters of
 *  a method are converted from the type declared in the MXBean
 *  interface into the corresponding mapped type, and the return value
 *  is converted from the mapped type into the declared type.  For
 *  example, with the method
 * 
 *  public List<String> reverse(List<String> list);
 * 
 *  and given that the mapped type for List<String> is String[], a call to proxy.reverse(someList) will convert
 *  someList from a List<String> to a String[],
 *  call the MBean operation reverse, then convert the returned
 *  String[] into a List<String>.
 * 
 *  The method Object.toString(), Object.hashCode(), or
 *  Object.equals(Object), when invoked on a proxy using this
 *  invocation handler, is forwarded to the MBean server as a method on
 *  the proxied MBean only if it appears in one of the proxy's
 *  interfaces.  For a proxy created with JMX.newMBeanProxy or JMX.newMXBeanProxy, this means that the method must appear in the
 *  Standard MBean or MXBean interface.  Otherwise these methods have
 *  the following behavior:
 *  
 *  toString() returns a string representation of the proxy
 *  hashCode() returns a hash code for the proxy such
 *  that two equal proxies have the same hash code
 *  equals(Object)
 *  returns true if and only if the Object argument is of the same
 *  proxy class as this proxy, with an MBeanServerInvocationHandler
 *  that has the same MBeanServerConnection and ObjectName; if one
 *  of the MBeanServerInvocationHandlers was constructed with
 *  a Class argument then the other must have been constructed
 *  with the same Class for equals to return true.
 *  
 */
class MBeanServerInvocationHandler extends Object with InvocationHandler {

    /** Invocation handler that forwards methods through an MBean
     *  server to a Standard MBean.
     */
    @stub
    def this(connection: MBeanServerConnection, objectName: ObjectName) = ???

    /** The MBean server connection through which the methods of
     *  a proxy using this handler are forwarded.
     */
    @stub
    def getMBeanServerConnection(): MBeanServerConnection = ???

    /** The name of the MBean within the MBean server to which methods
     *  are forwarded.
     */
    @stub
    def getObjectName(): ObjectName = ???

    /** Processes a method invocation on a proxy instance and returns
     *  the result.
     */
    @stub
    def invoke(proxy: Object, method: Method, args: Array[Object]): Object = ???

    /** If true, the proxy is for an MXBean, and appropriate mappings
     *  are applied to method parameters and return values.
     */
    @stub
    def isMXBean(): Boolean = ???
}
