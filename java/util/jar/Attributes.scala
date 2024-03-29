package java.util.jar

import java.lang.{Cloneable, Object, String}
import java.util.{Collection, Map, Map.Entry, Set}
import scala.scalanative.annotation.stub

/** The Attributes class maps Manifest attribute names to associated string
 *  values. Valid attribute names are case-insensitive, are restricted to
 *  the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed 70
 *  characters in length. Attribute values can contain any characters and
 *  will be UTF8-encoded when written to the output stream.  See the
 *  JAR File Specification
 *  for more information about valid attribute names and values.
 */
class Attributes extends Object with Map[Object, Object] with Cloneable {

    /** Constructs a new, empty Attributes object with default size. */
    @stub
    def this() = ???

    /** Constructs a new Attributes object with the same attribute name-value
     *  mappings as in the specified Attributes.
     */
    @stub
    def this(attr: Attributes) = ???

    /** Constructs a new, empty Attributes object with the specified
     *  initial size.
     */
    @stub
    def this(size: Int) = ???

    /** The attribute name-value mappings. */
    @stub
    protected val map: Map[Object, Object] = ???

    /** Removes all attributes from this Map. */
    @stub
    def clear(): Unit = ???

    /** Returns a copy of the Attributes, implemented as follows: */
    @stub
    def clone(): Any = ???

    /** Returns true if this Map contains the specified attribute name (key). */
    @stub
    def containsKey(name: Any): Boolean = ???

    /** Returns true if this Map maps one or more attribute names (keys)
     *  to the specified value.
     */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Returns a Collection view of the attribute name-value mappings
     *  contained in this Map.
     */
    @stub
    def entrySet(): Set[Map.Entry[Object, Object]] = ???

    /** Compares the specified Attributes object with this Map for equality. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the value of the specified attribute name, or null if the
     *  attribute name was not found.
     */
    @stub
    def get(name: Any): Any = ???

    /** Returns the value of the specified Attributes.Name, or null if the
     *  attribute was not found.
     */
    @stub
    def getValue(name: Attributes.Name): String = ???

    /** Returns the value of the specified attribute name, specified as
     *  a string, or null if the attribute was not found.
     */
    @stub
    def getValue(name: String): String = ???

    /** Returns the hash code value for this Map. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this Map contains no attributes. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a Set view of the attribute names (keys) contained in this Map. */
    @stub
    def keySet(): Set[Object] = ???

    /** Associates the specified value with the specified attribute name
     *  (key) in this Map.
     */
    @stub
    def put(name: Any, value: Any): Any = ???

    /** Copies all of the attribute name-value mappings from the specified
     *  Attributes to this Map.
     */
    @stub
    def putAll(attr: Map[_, _]): Unit = ???

    /** Associates the specified value with the specified attribute name,
     *  specified as a String.
     */
    @stub
    def putValue(name: String, value: String): String = ???

    /** Removes the attribute with the specified name (key) from this Map. */
    @stub
    def remove(name: Any): Any = ???

    /** Returns the number of attributes in this Map. */
    @stub
    def size(): Int = ???

    /** Returns a Collection view of the attribute values contained in this Map. */
    @stub
    def values(): Collection[Object] = ???
}

object Attributes {
    /** The Attributes.Name class represents an attribute name stored in
     *  this Map. Valid attribute names are case-insensitive, are restricted
     *  to the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed
     *  70 characters in length. Attribute values can contain any characters
     *  and will be UTF8-encoded when written to the output stream.  See the
     *  JAR File Specification
     *  for more information about valid attribute names and values.
     */
    object Name extends Object {

        /** Constructs a new attribute name using the given string name. */
        @stub
        def apply(name: String) = ???

        /** Name object for Class-Path
         *  manifest attribute.
         */
        @stub
        val CLASS_PATH: Name = ???

        /** Name object for Content-Type
         *  manifest attribute.
         */
        @stub
        val CONTENT_TYPE: Name = ???

        /** Deprecated. 
         * Extension mechanism will be removed in a future release.
         *              Use class path instead.
         * 
         */
        @stub
        val EXTENSION_INSTALLATION: Name = ???

        /** Name object for Extension-List manifest attribute
         *  used for declaring dependencies on installed extensions.
         */
        @stub
        val EXTENSION_LIST: Name = ???

        /** Name object for Extension-Name manifest attribute
         *  used for declaring dependencies on installed extensions.
         */
        @stub
        val EXTENSION_NAME: Name = ???

        /** Name object for Implementation-Title
         *  manifest attribute used for package versioning.
         */
        @stub
        val IMPLEMENTATION_TITLE: Name = ???

        /** Deprecated. 
         * Extension mechanism will be removed in a future release.
         *              Use class path instead.
         * 
         */
        @stub
        val IMPLEMENTATION_URL: Name = ???

        /** Name object for Implementation-Vendor
         *  manifest attribute used for package versioning.
         */
        @stub
        val IMPLEMENTATION_VENDOR: Name = ???

        /** Deprecated. 
         * Extension mechanism will be removed in a future release.
         *              Use class path instead.
         * 
         */
        @stub
        val IMPLEMENTATION_VENDOR_ID: Name = ???

        /** Name object for Implementation-Version
         *  manifest attribute used for package versioning.
         */
        @stub
        val IMPLEMENTATION_VERSION: Name = ???

        /** Name object for Main-Class manifest
         *  attribute used for launching applications packaged in JAR files.
         */
        @stub
        val MAIN_CLASS: Name = ???

        /** Name object for Manifest-Version
         *  manifest attribute.
         */
        @stub
        val MANIFEST_VERSION: Name = ???

        /** Name object for Sealed manifest attribute
         *  used for sealing.
         */
        @stub
        val SEALED: Name = ???

        /** Name object for Signature-Version
         *  manifest attribute used when signing JAR files.
         */
        @stub
        val SIGNATURE_VERSION: Name = ???

        /** Name object for Specification-Title
         *  manifest attribute used for package versioning.
         */
        @stub
        val SPECIFICATION_TITLE: Name = ???

        /** Name object for Specification-Vendor
         *  manifest attribute used for package versioning.
         */
        @stub
        val SPECIFICATION_VENDOR: Name = ???

        /** Name object for Specification-Version
         *  manifest attribute used for package versioning.
         */
        @stub
        val SPECIFICATION_VERSION: Name = ???

        /** Compares this attribute name to another for equality. */
        @stub
        def equals(o: Any): Boolean = ???

        /** Computes the hash value for this attribute name. */
        @stub
        def hashCode(): Int = ???

        /** Returns the attribute name as a String. */
        @stub
        def toString(): String = ???
    }

}
