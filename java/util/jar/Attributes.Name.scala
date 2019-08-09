package java.util.jar

import java.lang.Object

// The Attributes.Name class represents an attribute name stored in
// this Map. Valid attribute names are case-insensitive, are restricted
// to the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed
// 70 characters in length. Attribute values can contain any characters
// and will be UTF8-encoded when written to the output stream.  See the
// JAR File Specification
// for more information about valid attribute names and values.
object Attributes.Name extends Object {

    @stub
    // Name object for Class-Path
    // manifest attribute.
    def CLASS_PATH: Attributes.Name = ???

    @stub
    // Name object for Content-Type
    // manifest attribute.
    def CONTENT_TYPE: Attributes.Name = ???

    @stub
    // Deprecated. 
    //Extension mechanism will be removed in a future release.
    //             Use class path instead.
    //
    def EXTENSION_INSTALLATION: Attributes.Name = ???

    @stub
    // Name object for Extension-List manifest attribute
    // used for declaring dependencies on installed extensions.
    def EXTENSION_LIST: Attributes.Name = ???

    @stub
    // Name object for Extension-Name manifest attribute
    // used for declaring dependencies on installed extensions.
    def EXTENSION_NAME: Attributes.Name = ???

    @stub
    // Name object for Implementation-Title
    // manifest attribute used for package versioning.
    def IMPLEMENTATION_TITLE: Attributes.Name = ???

    @stub
    // Deprecated. 
    //Extension mechanism will be removed in a future release.
    //             Use class path instead.
    //
    def IMPLEMENTATION_URL: Attributes.Name = ???

    @stub
    // Name object for Implementation-Vendor
    // manifest attribute used for package versioning.
    def IMPLEMENTATION_VENDOR: Attributes.Name = ???

    @stub
    // Deprecated. 
    //Extension mechanism will be removed in a future release.
    //             Use class path instead.
    //
    def IMPLEMENTATION_VENDOR_ID: Attributes.Name = ???

    @stub
    // Name object for Implementation-Version
    // manifest attribute used for package versioning.
    def IMPLEMENTATION_VERSION: Attributes.Name = ???

    @stub
    // Name object for Main-Class manifest
    // attribute used for launching applications packaged in JAR files.
    def MAIN_CLASS: Attributes.Name = ???

    @stub
    // Name object for Manifest-Version
    // manifest attribute.
    def MANIFEST_VERSION: Attributes.Name = ???

    @stub
    // Name object for Sealed manifest attribute
    // used for sealing.
    def SEALED: Attributes.Name = ???

    @stub
    // Name object for Signature-Version
    // manifest attribute used when signing JAR files.
    def SIGNATURE_VERSION: Attributes.Name = ???

    @stub
    // Name object for Specification-Title
    // manifest attribute used for package versioning.
    def SPECIFICATION_TITLE: Attributes.Name = ???

    @stub
    // Name object for Specification-Vendor
    // manifest attribute used for package versioning.
    def SPECIFICATION_VENDOR: Attributes.Name = ???

    @stub
    // Compares this attribute name to another for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Computes the hash value for this attribute name.
    def hashCode(): Int = ???
}
