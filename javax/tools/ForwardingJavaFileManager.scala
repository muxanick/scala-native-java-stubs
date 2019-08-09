package javax.tools

import java.lang.{ClassLoader, Object, String}
import java.util.Iterator

// Forwards calls to a given file manager.  Subclasses of this class
// might override some of these methods and might also provide
// additional fields and methods.
class ForwardingJavaFileManager[M <: JavaFileManager] extends Object with JavaFileManager {

    @stub
    // Releases any resources opened by this file manager directly or
    // indirectly.
    def close(): Unit = ???

    @stub
    // Flushes any resources opened for output by this file manager
    // directly or indirectly.
    def flush(): Unit = ???

    @stub
    // Gets a class loader for loading plug-ins from the given
    // location.
    def getClassLoader(location: JavaFileManager.Location): ClassLoader = ???

    @stub
    // Gets a file object for input
    // representing the specified relative
    // name in the specified package in the given location.
    def getFileForInput(location: JavaFileManager.Location, packageName: String, relativeName: String): FileObject = ???

    @stub
    // Gets a file object for output
    // representing the specified relative
    // name in the specified package in the given location.
    def getFileForOutput(location: JavaFileManager.Location, packageName: String, relativeName: String, sibling: FileObject): FileObject = ???

    @stub
    // Gets a file object for input
    // representing the specified class of the specified kind in the
    // given location.
    def getJavaFileForInput(location: JavaFileManager.Location, className: String, kind: JavaFileObject.Kind): JavaFileObject = ???

    @stub
    // Gets a file object for output
    // representing the specified class of the specified kind in the
    // given location.
    def getJavaFileForOutput(location: JavaFileManager.Location, className: String, kind: JavaFileObject.Kind, sibling: FileObject): JavaFileObject = ???

    @stub
    // Handles one option.
    def handleOption(current: String, remaining: Iterator[String]): Boolean = ???

    @stub
    // Determines if a location is known to this file manager.
    def hasLocation(location: JavaFileManager.Location): Boolean = ???

    @stub
    // Infers a binary name of a file object based on a location.
    def inferBinaryName(location: JavaFileManager.Location, file: JavaFileObject): String = ???

    @stub
    // Compares two file objects and return true if they represent the
    // same underlying object.
    def isSameFile(a: FileObject, b: FileObject): Boolean = ???

    @stub
    // Determines if the given option is supported and if so, the
    // number of arguments the option takes.
    def isSupportedOption(option: String): Int = ???
}
