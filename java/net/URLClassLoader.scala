package java.net

import java.io.{Closeable, InputStream}
import java.lang.{Class, ClassLoader, Object, Package, String}
import java.security.{CodeSource, PermissionCollection, SecureClassLoader}
import java.util.Enumeration
import java.util.jar.Manifest

// This class loader is used to load classes and resources from a search
// path of URLs referring to both JAR files and directories. Any URL that
// ends with a '/' is assumed to refer to a directory. Otherwise, the URL
// is assumed to refer to a JAR file which will be opened as needed.
// 
// The AccessControlContext of the thread that created the instance of
// URLClassLoader will be used when subsequently loading classes and
// resources.
// 
// The classes that are loaded are by default granted permission only to
// access the URLs specified when the URLClassLoader was created.
class URLClassLoader extends SecureClassLoader with Closeable {

    @stub
    // Constructs a new URLClassLoader for the specified URLs using the
    // default delegation parent ClassLoader.
    def this(urls: Array[URL]) = ???

    @stub
    // Constructs a new URLClassLoader for the given URLs.
    def this(urls: Array[URL], parent: ClassLoader) = ???

    @stub
    // Appends the specified URL to the list of URLs to search for
    // classes and resources.
    protected def addURL(url: URL): Unit = ???

    @stub
    // Closes this URLClassLoader, so that it can no longer be used to load
    // new classes or resources that are defined by this loader.
    def close(): Unit = ???

    @stub
    // Defines a new package by name in this ClassLoader.
    protected def definePackage(name: String, man: Manifest, url: URL): Package = ???

    @stub
    // Finds and loads the class with the specified name from the URL search
    // path.
    protected def findClass(name: String): Class[_] = ???

    @stub
    // Finds the resource with the specified name on the URL search path.
    def findResource(name: String): URL = ???

    @stub
    // Returns an Enumeration of URLs representing all of the resources
    // on the URL search path having the specified name.
    def findResources(name: String): Enumeration[URL] = ???

    @stub
    // Returns the permissions for the given codesource object.
    protected def getPermissions(codesource: CodeSource): PermissionCollection = ???

    @stub
    // Returns an input stream for reading the specified resource.
    def getResourceAsStream(name: String): InputStream = ???

    @stub
    // Returns the search path of URLs for loading classes and resources.
    def getURLs(): Array[URL] = ???
}

object URLClassLoader {
    @stub
    // Creates a new instance of URLClassLoader for the specified
    // URLs and default parent class loader.
    def newInstance(urls: Array[URL]): URLClassLoader = ???
}
