package java.rmi.server

import java.lang.{Class, ClassLoader, Deprecated, Object, String}

// LoaderHandler is an interface used internally by the RMI
// runtime in previous implementation versions.  It should never be accessed
// by application code.
@Deprecated trait LoaderHandler {

    @stub
    // Deprecated. 
    //no replacement
    //
    def getSecurityContext(loader: ClassLoader): Object = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def loadClass(name: String): Class[_] = ???
}
