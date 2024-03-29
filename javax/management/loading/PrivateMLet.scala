package javax.management.loading

import java.lang.{ClassLoader, Object}
import java.net.{URL, URLClassLoader, URLStreamHandlerFactory}
import java.security.SecureClassLoader
import scala.scalanative.annotation.stub

/** An MLet that is not added to the ClassLoaderRepository.
 *  This class acts exactly like its parent class, MLet, with
 *  one exception.  When a PrivateMLet is registered in an MBean
 *  server, it is not added to that MBean server's ClassLoaderRepository.  This is true because this class implements
 *  the interface PrivateClassLoader.
 */
class PrivateMLet extends MLet with PrivateClassLoader {

    /** Constructs a new PrivateMLet for the specified URLs using the
     *  default delegation parent ClassLoader.
     */
    @stub
    def this(urls: Array[URL], delegateToCLR: Boolean) = ???

    /** Constructs a new PrivateMLet for the given URLs. */
    @stub
    def this(urls: Array[URL], parent: ClassLoader, delegateToCLR: Boolean) = ???

    /** Constructs a new PrivateMLet for the specified URLs, parent
     *  class loader, and URLStreamHandlerFactory.
     */
    @stub
    def this(urls: Array[URL], parent: ClassLoader, factory: URLStreamHandlerFactory, delegateToCLR: Boolean) = ???
}
