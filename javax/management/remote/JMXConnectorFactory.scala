package javax.management.remote

import java.lang.{Object, String}
import java.util.Map

/** Factory to create JMX API connector clients.  There
 *  are no instances of this class.
 * 
 *  Connections are usually made using the connect method of this class.  More
 *  advanced applications can separate the creation of the connector
 *  client, using newJMXConnector and the establishment of the connection itself, using
 *  JMXConnector.connect(Map).
 * 
 *  Each client is created by an instance of JMXConnectorProvider.  This instance is found as follows.  Suppose
 *  the given JMXServiceURL looks like
 *  "service:jmx:protocol:remainder".
 *  Then the factory will attempt to find the appropriate JMXConnectorProvider for protocol.  Each
 *  occurrence of the character + or - in
 *  protocol is replaced by . or
 *  _, respectively.
 * 
 *  A provider package list is searched for as follows:
 * 
 *  
 * 
 *  If the environment parameter to newJMXConnector contains the
 *  key jmx.remote.protocol.provider.pkgs then the
 *  associated value is the provider package list.
 * 
 *  Otherwise, if the system property
 *  jmx.remote.protocol.provider.pkgs exists, then its value
 *  is the provider package list.
 * 
 *  Otherwise, there is no provider package list.
 * 
 *  
 * 
 *  The provider package list is a string that is interpreted as a
 *  list of non-empty Java package names separated by vertical bars
 *  (|).  If the string is empty, then so is the provider
 *  package list.  If the provider package list is not a String, or if
 *  it contains an element that is an empty string, a JMXProviderException is thrown.
 * 
 *  If the provider package list exists and is not empty, then for
 *  each element pkg of the list, the factory
 *  will attempt to load the class
 * 
 *  
 *  pkg.protocol.ClientProvider
 *  
 * 
 *  If the environment parameter to newJMXConnector contains the
 *  key jmx.remote.protocol.provider.class.loader then the
 *  associated value is the class loader to use to load the provider.
 *  If the associated value is not an instance of ClassLoader, an IllegalArgumentException is thrown.
 * 
 *  If the jmx.remote.protocol.provider.class.loader
 *  key is not present in the environment parameter, the
 *  calling thread's context class loader is used.
 * 
 *  If the attempt to load this class produces a ClassNotFoundException, the search for a handler continues with
 *  the next element of the list.
 * 
 *  Otherwise, a problem with the provider found is signalled by a
 *  JMXProviderException whose cause indicates the underlying
 *  exception, as follows:
 * 
 *  
 * 
 *  if the attempt to load the class produces an exception other
 *  than ClassNotFoundException, that is the
 *  cause;
 * 
 *  if Class.newInstance() for the class produces an
 *  exception, that is the cause.
 * 
 *  
 * 
 *  If no provider is found by the above steps, including the
 *  default case where there is no provider package list, then the
 *  implementation will use its own provider for
 *  protocol, or it will throw a
 *  MalformedURLException if there is none.  An
 *  implementation may choose to find providers by other means.  For
 *  example, it may support the 
 *  JAR conventions for service providers, where the service
 *  interface is JMXConnectorProvider.
 * 
 *  Every implementation must support the RMI connector protocol with
 *  the default RMI transport, specified with string rmi.
 *  An implementation may optionally support the RMI connector protocol
 *  with the RMI/IIOP transport, specified with the string
 *  iiop.
 * 
 *  Once a provider is found, the result of the
 *  newJMXConnector method is the result of calling newJMXConnector
 *  on the provider.
 * 
 *  The Map parameter passed to the
 *  JMXConnectorProvider is a new read-only
 *  Map that contains all the entries that were in the
 *  environment parameter to JMXConnectorFactory.newJMXConnector, if there was one.
 *  Additionally, if the
 *  jmx.remote.protocol.provider.class.loader key is not
 *  present in the environment parameter, it is added to
 *  the new read-only Map.  The associated value is the
 *  calling thread's context class loader.
 */
class JMXConnectorFactory extends Object {
}

object JMXConnectorFactory {
    /** Name of the attribute that specifies the default class
     *  loader.
     */
    @stub
    val DEFAULT_CLASS_LOADER: String = ???

    /** Name of the attribute that specifies the class
     *  loader for loading protocol providers.
     */
    @stub
    val PROTOCOL_PROVIDER_CLASS_LOADER: String = ???

    /** Creates a connection to the connector server at the given
     *  address.
     */
    @stub
    def connect(serviceURL: JMXServiceURL): JMXConnector = ???

    /** Creates a connection to the connector server at the given
     *  address.
     */
    @stub
    def connect(serviceURL: JMXServiceURL, environment: Map[String, _]): JMXConnector = ???
}
