package java.rmi.server

import java.lang.{Class, ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** RMIClassLoaderSpi is the service provider interface for
 *  RMIClassLoader.
 * 
 *  In particular, an RMIClassLoaderSpi instance provides an
 *  implementation of the following static methods of
 *  RMIClassLoader:
 * 
 *  
 * 
 *  RMIClassLoader.loadClass(URL,String)
 *  RMIClassLoader.loadClass(String,String)
 *  RMIClassLoader.loadClass(String,String,ClassLoader)
 *  RMIClassLoader.loadProxyClass(String,String[],ClassLoader)
 *  RMIClassLoader.getClassLoader(String)
 *  RMIClassLoader.getClassAnnotation(Class)
 * 
 *  
 * 
 *  When one of those methods is invoked, its behavior is to delegate
 *  to a corresponding method on an instance of this class.
 *  The details of how each method delegates to the provider instance is
 *  described in the documentation for each particular method.
 *  See the documentation for RMIClassLoader for a description
 *  of how a provider instance is chosen.
 */
abstract class RMIClassLoaderSpi extends Object {

    /**  */
    @stub
    def this() = ???

    /** Provides the implementation for
     *  RMIClassLoader.getClassAnnotation(Class).
     */
    def getClassAnnotation(cl: Class[_]): String

    /** Provides the implementation for
     *  RMIClassLoader.getClassLoader(String).
     */
    def getClassLoader(codebase: String): ClassLoader

    /** Provides the implementation for
     *  RMIClassLoader.loadClass(URL,String),
     *  RMIClassLoader.loadClass(String,String), and
     *  RMIClassLoader.loadClass(String,String,ClassLoader).
     */
    def loadClass(codebase: String, name: String, defaultLoader: ClassLoader): Class[_]

    /** Provides the implementation for
     *  RMIClassLoader.loadProxyClass(String,String[],ClassLoader).
     */
    def loadProxyClass(codebase: String, interfaces: Array[String], defaultLoader: ClassLoader): Class[_]
}
