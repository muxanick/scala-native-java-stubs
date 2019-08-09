package javax.tools

import java.lang.{ClassLoader, Object, String}
import java.util.Iterator

/** Forwards calls to a given file manager.  Subclasses of this class
 *  might override some of these methods and might also provide
 *  additional fields and methods.
 */
class ForwardingJavaFileManager[M <: JavaFileManager] extends Object with JavaFileManager {

    /** Releases any resources opened by this file manager directly or
     *  indirectly.
     */
    @stub
    def close(): Unit = ???

    /** Flushes any resources opened for output by this file manager
     *  directly or indirectly.
     */
    @stub
    def flush(): Unit = ???

    /** Gets a class loader for loading plug-ins from the given
     *  location.
     */
    @stub
    def getClassLoader(location: JavaFileManager.Location): ClassLoader = ???

    /** Gets a file object for input
     *  representing the specified relative
     *  name in the specified package in the given location.
     */
    @stub
    def getFileForInput(location: JavaFileManager.Location, packageName: String, relativeName: String): FileObject = ???

    /** Gets a file object for output
     *  representing the specified relative
     *  name in the specified package in the given location.
     */
    @stub
    def getFileForOutput(location: JavaFileManager.Location, packageName: String, relativeName: String, sibling: FileObject): FileObject = ???

    /** Gets a file object for input
     *  representing the specified class of the specified kind in the
     *  given location.
     */
    @stub
    def getJavaFileForInput(location: JavaFileManager.Location, className: String, kind: JavaFileObject.Kind): JavaFileObject = ???

    /** Gets a file object for output
     *  representing the specified class of the specified kind in the
     *  given location.
     */
    @stub
    def getJavaFileForOutput(location: JavaFileManager.Location, className: String, kind: JavaFileObject.Kind, sibling: FileObject): JavaFileObject = ???

    /** Handles one option. */
    @stub
    def handleOption(current: String, remaining: Iterator[String]): Boolean = ???

    /** Determines if a location is known to this file manager. */
    @stub
    def hasLocation(location: JavaFileManager.Location): Boolean = ???

    /** Infers a binary name of a file object based on a location. */
    @stub
    def inferBinaryName(location: JavaFileManager.Location, file: JavaFileObject): String = ???

    /** Compares two file objects and return true if they represent the
     *  same underlying object.
     */
    @stub
    def isSameFile(a: FileObject, b: FileObject): Boolean = ???

    /** Determines if the given option is supported and if so, the
     *  number of arguments the option takes.
     */
    @stub
    def isSupportedOption(option: String): Int = ???
}
