package javax.management.loading

import java.lang.{ClassLoader, Object}
import java.net.{URL, URLClassLoader}
import java.security.SecureClassLoader

// An MLet that is not added to the ClassLoaderRepository.
// This class acts exactly like its parent class, MLet, with
// one exception.  When a PrivateMLet is registered in an MBean
// server, it is not added to that MBean server's ClassLoaderRepository.  This is true because this class implements
// the interface PrivateClassLoader.
class PrivateMLet extends MLet with PrivateClassLoader {

    @stub
    // Constructs a new PrivateMLet for the specified URLs using the
    // default delegation parent ClassLoader.
    def this(urls: Array[URL], delegateToCLR: Boolean) = ???

    @stub
    // Constructs a new PrivateMLet for the given URLs.
    def this(urls: Array[URL], parent: ClassLoader, delegateToCLR: Boolean) = ???
}
