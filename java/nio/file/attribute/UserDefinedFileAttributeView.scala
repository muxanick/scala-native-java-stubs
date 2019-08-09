package java.nio.file.attribute

import java.lang.String
import java.nio.ByteBuffer
import java.util.List

/** A file attribute view that provides a view of a file's user-defined
 *  attributes, sometimes known as extended attributes. User-defined
 *  file attributes are used to store metadata with a file that is not meaningful
 *  to the file system. It is primarily intended for file system implementations
 *  that support such a capability directly but may be emulated. The details of
 *  such emulation are highly implementation specific and therefore not specified.
 * 
 *   This FileAttributeView provides a view of a file's user-defined
 *  attributes as a set of name/value pairs, where the attribute name is
 *  represented by a String. An implementation may require to encode and
 *  decode from the platform or file system representation when accessing the
 *  attribute. The value has opaque content. This attribute view defines the
 *  read and write methods to read the value into
 *  or write from a ByteBuffer. This FileAttributeView is not
 *  intended for use where the size of an attribute value is larger than Integer.MAX_VALUE.
 * 
 *   User-defined attributes may be used in some implementations to store
 *  security related attributes so consequently, in the case of the default
 *  provider at least, all methods that access user-defined attributes require the
 *  RuntimePermission("accessUserDefinedAttributes") permission when a
 *  security manager is installed.
 * 
 *   The supportsFileAttributeView method may be used to test if a specific FileStore supports the storage of user-defined
 *  attributes.
 * 
 *   Where dynamic access to file attributes is required, the getAttribute method may be used to read
 *  the attribute value. The attribute value is returned as a byte array (byte[]).
 *  The setAttribute method may be used
 *  to write the value of a user-defined attribute from a buffer (as if by
 *  invoking the write method), or byte array (byte[]).
 */
trait UserDefinedFileAttributeView extends FileAttributeView {

    /** Deletes a user-defined attribute. */
    @stub
    def delete(name: String): Unit = ???

    /** Returns a list containing the names of the user-defined attributes. */
    @stub
    def list(): List[String] = ???

    /** Returns the name of this attribute view. */
    @stub
    def name(): String = ???

    /** Read the value of a user-defined attribute into a buffer. */
    @stub
    def read(name: String, dst: ByteBuffer): Int = ???

    /** Returns the size of the value of a user-defined attribute. */
    @stub
    def size(name: String): Int = ???
}
