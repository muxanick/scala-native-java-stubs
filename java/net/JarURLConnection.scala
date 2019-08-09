package java.net

import java.lang.{Object, String}
import java.security.cert.Certificate
import java.util.jar.{Attributes, JarEntry, JarFile}

// A URL Connection to a Java ARchive (JAR) file or an entry in a JAR
// file.
//
// The syntax of a JAR URL is:
//
// 
// jar:<url>!/{entry}
// 
//
// for example:
//
// jar:http://www.foo.com/bar/baz.jar!/COM/foo/Quux.class
//
// Jar URLs should be used to refer to a JAR file or entries in
// a JAR file. The example above is a JAR URL which refers to a JAR
// entry. If the entry name is omitted, the URL refers to the whole
// JAR file:
//
// jar:http://www.foo.com/bar/baz.jar!/
//
// Users should cast the generic URLConnection to a
// JarURLConnection when they know that the URL they created is a JAR
// URL, and they need JAR-specific functionality. For example:
//
// 
// URL url = new URL("jar:file:/home/duke/duke.jar!/");
// JarURLConnection jarConnection = (JarURLConnection)url.openConnection();
// Manifest manifest = jarConnection.getManifest();
// 
//
// JarURLConnection instances can only be used to read from JAR files.
// It is not possible to get a OutputStream to modify or write
// to the underlying JAR file using this class.
// Examples:
//
// 
//
// A Jar entry
// jar:http://www.foo.com/bar/baz.jar!/COM/foo/Quux.class
//
// A Jar file
// jar:http://www.foo.com/bar/baz.jar!/
//
// A Jar directory
// jar:http://www.foo.com/bar/baz.jar!/COM/foo/
//
// 
//
// !/ is referred to as the separator.
//
// When constructing a JAR url via new URL(context, spec),
// the following rules apply:
//
// 
//
// if there is no context URL and the specification passed to the
// URL constructor doesn't contain a separator, the URL is considered
// to refer to a JarFile.
//
// if there is a context URL, the context URL is assumed to refer
// to a JAR file or a Jar directory.
//
// if the specification begins with a '/', the Jar directory is
// ignored, and the spec is considered to be at the root of the Jar
// file.
//
// Examples:
//
// 
//
// context: jar:http://www.foo.com/bar/jar.jar!/,
// spec:baz/entry.txt
//
// url:jar:http://www.foo.com/bar/jar.jar!/baz/entry.txt
//
// context: jar:http://www.foo.com/bar/jar.jar!/baz,
// spec:entry.txt
//
// url:jar:http://www.foo.com/bar/jar.jar!/baz/entry.txt
//
// context: jar:http://www.foo.com/bar/jar.jar!/baz,
// spec:/entry.txt
//
// url:jar:http://www.foo.com/bar/jar.jar!/entry.txt
//
// 
//
// 
abstract class JarURLConnection extends URLConnection {

    // Return the Attributes object for this connection if the URL
    // for it points to a JAR file entry, null otherwise.
    def getAttributes(): Attributes

    // Return the Certificate object for this connection if the URL
    // for it points to a JAR file entry, null otherwise.
    def getCertificates(): Array[Certificate]

    // Return the entry name for this connection.
    def getEntryName(): String

    // Return the JAR entry object for this connection, if any.
    def getJarEntry(): JarEntry

    // Return the JAR file for this connection.
    def getJarFile(): JarFile

    // Returns the URL for the Jar file for this connection.
    def getJarFileURL(): URL

    // Returns the main Attributes for the JAR file for this
    // connection.
    def getMainAttributes(): Attributes
}
