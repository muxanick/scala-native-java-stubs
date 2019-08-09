package javax.management.loading

import java.io.InputStream
import java.lang.{Object, String}
import java.net.URL
import java.util.{Enumeration, Set}
import scala.scalanative.annotation.stub

/** Exposes the remote management interface of the MLet
 *  MBean.
 */
trait MLetMBean {

    /** Appends the specified URL to the list of URLs to search for classes and
     *  resources.
     */
    @stub
    def addURL(url: String): Unit = ???

    /** Appends the specified URL to the list of URLs to search for classes and
     *  resources.
     */
    @stub
    def addURL(url: URL): Unit = ???

    /** Gets the current directory used by the library loader for
     *  storing native libraries before they are loaded into memory.
     */
    @stub
    def getLibraryDirectory(): String = ???

    /** Loads a text file containing MLET tags that define the MBeans
     *  to be added to the MBean server.
     */
    @stub
    def getMBeansFromURL(url: String): Set[Object] = ???

    /** Loads a text file containing MLET tags that define the MBeans
     *  to be added to the MBean server.
     */
    @stub
    def getMBeansFromURL(url: URL): Set[Object] = ???

    /** Finds the resource with the given name. */
    @stub
    def getResource(name: String): URL = ???

    /** Returns an input stream for reading the specified resource. */
    @stub
    def getResourceAsStream(name: String): InputStream = ???

    /** Finds all the resources with the given name. */
    @stub
    def getResources(name: String): Enumeration[URL] = ???

    /** Returns the search path of URLs for loading classes and resources. */
    @stub
    def getURLs(): Array[URL] = ???

    /** Sets the directory used by the library loader for storing
     *  native libraries before they are loaded into memory.
     */
    @stub
    def setLibraryDirectory(libdir: String): Unit = ???
}
