package java.rmi.registry

import java.lang.{Deprecated, String}
import scala.scalanative.annotation.stub

/** RegistryHandler is an interface used internally by the RMI
 *  runtime in previous implementation versions.  It should never be accessed
 *  by application code.
 */
@Deprecated trait RegistryHandler {

    /** Deprecated. 
     * no replacement.  As of the Java 2 platform v1.2, RMI no
     *  longer uses the RegistryHandler to obtain the registry's
     *  implementation.
     * 
     */
    @stub
    def registryImpl(port: Int): Registry = ???

    /** Deprecated. 
     * no replacement.  As of the Java 2 platform v1.2, RMI no
     *  longer uses the RegistryHandler to obtain the registry's
     *  stub.
     * 
     */
    @stub
    def registryStub(host: String, port: Int): Registry = ???
}
