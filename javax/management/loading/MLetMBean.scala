package javax.management.loading

import java.io.InputStream
import java.lang.{Object, String}
import java.net.URL
import java.util.{Enumeration, Set}

// Exposes the remote management interface of the MLet
// MBean.
trait MLetMBean {

    @stub
    // Appends the specified URL to the list of URLs to search for classes and
    // resources.
    def addURL(url: String): Unit = ???

    @stub
    // Appends the specified URL to the list of URLs to search for classes and
    // resources.
    def addURL(url: URL): Unit = ???

    @stub
    // Gets the current directory used by the library loader for
    // storing native libraries before they are loaded into memory.
    def getLibraryDirectory(): String = ???

    @stub
    // Loads a text file containing MLET tags that define the MBeans
    // to be added to the MBean server.
    def getMBeansFromURL(url: String): Set[Object] = ???

    @stub
    // Loads a text file containing MLET tags that define the MBeans
    // to be added to the MBean server.
    def getMBeansFromURL(url: URL): Set[Object] = ???

    @stub
    // Finds the resource with the given name.
    def getResource(name: String): URL = ???

    @stub
    // Returns an input stream for reading the specified resource.
    def getResourceAsStream(name: String): InputStream = ???

    @stub
    // Finds all the resources with the given name.
    def getResources(name: String): Enumeration[URL] = ???

    @stub
    // Returns the search path of URLs for loading classes and resources.
    def getURLs(): Array[URL] = ???
}
