package java.rmi.server

import java.lang.{Class, ClassLoader, Deprecated, Object, String}
import java.net.URL
import scala.scalanative.annotation.stub

/** LoaderHandler is an interface used internally by the RMI
 *  runtime in previous implementation versions.  It should never be accessed
 *  by application code.
 */
@Deprecated
trait LoaderHandler {

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getSecurityContext(loader: ClassLoader): Any = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def loadClass(name: String): Class[_] = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def loadClass(codebase: URL, name: String): Class[_] = ???
}

object LoaderHandler {
    /** Deprecated.  */
    @stub
    val packagePrefix: String = ???
}
