package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax}

// Class ReferenceUriSchemesSupported is a printing attribute class
// an enumeration, that indicates a "URI scheme," such as "http:" or "ftp:",
// that a printer can use to retrieve print data stored at a URI location.
// If a printer supports doc flavors with a print data representation class of
// "java.net.URL", the printer uses instances of class
// ReferenceUriSchemesSupported to advertise the URI schemes it can accept.
// The acceptable URI schemes are included as service attributes in the
// lookup service; this lets clients search the
// for printers that can get print data using a certain URI scheme. The
// acceptable URI schemes can also be queried using the capability methods in
// interface PrintService. However,
// ReferenceUriSchemesSupported attributes are used solely for determining
// acceptable URI schemes, they are never included in a doc's,
// print request's, print job's, or print service's attribute set.
// 
// The Internet Assigned Numbers Authority maintains the
// official
// list of URI schemes.
// 
// Class ReferenceUriSchemesSupported defines enumeration values for widely
// used URI schemes. A printer that supports additional URI schemes
// can define them in a subclass of class ReferenceUriSchemesSupported.
// 
// IPP Compatibility:  The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// 
class ReferenceUriSchemesSupported extends EnumSyntax with Attribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class
    // ReferenceUriSchemesSupported.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object ReferenceUriSchemesSupported {
    @stub
    // Host-specific file names.
    def FILE: ReferenceUriSchemesSupported = ???

    @stub
    // File Transfer Protocol (FTP).
    def FTP: ReferenceUriSchemesSupported = ???

    @stub
    // Gopher Protocol.
    def GOPHER: ReferenceUriSchemesSupported = ???

    @stub
    // HyperText Transfer Protocol (HTTP).
    def HTTP: ReferenceUriSchemesSupported = ???

    @stub
    // Secure HyperText Transfer Protocol (HTTPS).
    def HTTPS: ReferenceUriSchemesSupported = ???

    @stub
    // USENET news.
    def NEWS: ReferenceUriSchemesSupported = ???

    @stub
    // USENET news using Network News Transfer Protocol (NNTP).
    def NNTP: ReferenceUriSchemesSupported = ???
}
