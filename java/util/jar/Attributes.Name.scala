package java.util.jar

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The Attributes.Name class represents an attribute name stored in
 *  this Map. Valid attribute names are case-insensitive, are restricted
 *  to the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed
 *  70 characters in length. Attribute values can contain any characters
 *  and will be UTF8-encoded when written to the output stream.  See the
 *  JAR File Specification
 *  for more information about valid attribute names and values.
 */
object Attributes.Name extends Object {

    /** Constructs a new attribute name using the given string name. */
    @stub
    def Name(name: String) = ???

    /** Name object for Class-Path
     *  manifest attribute.
     */
    @stub
    val CLASS_PATH: Attributes.Name = ???

    /** Name object for Content-Type
     *  manifest attribute.
     */
    @stub
    val CONTENT_TYPE: Attributes.Name = ???

    /** Deprecated. 
     * Extension mechanism will be removed in a future release.
     *              Use class path instead.
     * 
     */
    @stub
    val EXTENSION_INSTALLATION: Attributes.Name = ???

    /** Name object for Extension-List manifest attribute
     *  used for declaring dependencies on installed extensions.
     */
    @stub
    val EXTENSION_LIST: Attributes.Name = ???

    /** Name object for Extension-Name manifest attribute
     *  used for declaring dependencies on installed extensions.
     */
    @stub
    val EXTENSION_NAME: Attributes.Name = ???

    /** Name object for Implementation-Title
     *  manifest attribute used for package versioning.
     */
    @stub
    val IMPLEMENTATION_TITLE: Attributes.Name = ???

    /** Deprecated. 
     * Extension mechanism will be removed in a future release.
     *              Use class path instead.
     * 
     */
    @stub
    val IMPLEMENTATION_URL: Attributes.Name = ???

    /** Name object for Implementation-Vendor
     *  manifest attribute used for package versioning.
     */
    @stub
    val IMPLEMENTATION_VENDOR: Attributes.Name = ???

    /** Deprecated. 
     * Extension mechanism will be removed in a future release.
     *              Use class path instead.
     * 
     */
    @stub
    val IMPLEMENTATION_VENDOR_ID: Attributes.Name = ???

    /** Name object for Implementation-Version
     *  manifest attribute used for package versioning.
     */
    @stub
    val IMPLEMENTATION_VERSION: Attributes.Name = ???

    /** Name object for Main-Class manifest
     *  attribute used for launching applications packaged in JAR files.
     */
    @stub
    val MAIN_CLASS: Attributes.Name = ???

    /** Name object for Manifest-Version
     *  manifest attribute.
     */
    @stub
    val MANIFEST_VERSION: Attributes.Name = ???

    /** Name object for Sealed manifest attribute
     *  used for sealing.
     */
    @stub
    val SEALED: Attributes.Name = ???

    /** Name object for Signature-Version
     *  manifest attribute used when signing JAR files.
     */
    @stub
    val SIGNATURE_VERSION: Attributes.Name = ???

    /** Name object for Specification-Title
     *  manifest attribute used for package versioning.
     */
    @stub
    val SPECIFICATION_TITLE: Attributes.Name = ???

    /** Name object for Specification-Vendor
     *  manifest attribute used for package versioning.
     */
    @stub
    val SPECIFICATION_VENDOR: Attributes.Name = ???

    /** Name object for Specification-Version
     *  manifest attribute used for package versioning.
     */
    @stub
    val SPECIFICATION_VERSION: Attributes.Name = ???

    /** Compares this attribute name to another for equality. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Computes the hash value for this attribute name. */
    @stub
    def hashCode(): Int = ???

    /** Returns the attribute name as a String. */
    @stub
    def toString(): String = ???
}
