package java.nio.file

import java.lang.{Class, Object, String}
import java.nio.file.attribute.{FileAttributeView, FileStoreAttributeView}

/** Storage for files. A FileStore represents a storage pool, device,
 *  partition, volume, concrete file system or other implementation specific means
 *  of file storage. The FileStore for where a file is stored is obtained
 *  by invoking the getFileStore method, or all file
 *  stores can be enumerated by invoking the getFileStores method.
 * 
 *   In addition to the methods defined by this class, a file store may support
 *  one or more FileStoreAttributeView classes
 *  that provide a read-only or updatable view of a set of file store attributes.
 */
abstract class FileStore extends Object {

    /** Reads the value of a file store attribute. */
    def getAttribute(attribute: String): Object

    /** Returns a FileStoreAttributeView of the given type. */
    val V: abstract[V <: FileStoreAttributeView]

    /** Returns the size, in bytes, of the file store. */
    def getTotalSpace(): Long

    /** Returns the number of unallocated bytes in the file store. */
    def getUnallocatedSpace(): Long

    /** Returns the number of bytes available to this Java virtual machine on the
     *  file store.
     */
    def getUsableSpace(): Long

    /** Tells whether this file store is read-only. */
    def isReadOnly(): Boolean

    /** Returns the name of this file store. */
    def name(): String

    /** Tells whether or not this file store supports the file attributes
     *  identified by the given file attribute view.
     */
    def supportsFileAttributeView(type: Class[_ <: FileAttributeView]): Boolean

    /** Tells whether or not this file store supports the file attributes
     *  identified by the given file attribute view.
     */
    def supportsFileAttributeView(name: String): Boolean
}
