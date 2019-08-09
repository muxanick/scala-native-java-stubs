package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax}

/** Class ReferenceUriSchemesSupported is a printing attribute class
 *  an enumeration, that indicates a "URI scheme," such as "http:" or "ftp:",
 *  that a printer can use to retrieve print data stored at a URI location.
 *  If a printer supports doc flavors with a print data representation class of
 *  "java.net.URL", the printer uses instances of class
 *  ReferenceUriSchemesSupported to advertise the URI schemes it can accept.
 *  The acceptable URI schemes are included as service attributes in the
 *  lookup service; this lets clients search the
 *  for printers that can get print data using a certain URI scheme. The
 *  acceptable URI schemes can also be queried using the capability methods in
 *  interface PrintService. However,
 *  ReferenceUriSchemesSupported attributes are used solely for determining
 *  acceptable URI schemes, they are never included in a doc's,
 *  print request's, print job's, or print service's attribute set.
 *  
 *  The Internet Assigned Numbers Authority maintains the
 *  official
 *  list of URI schemes.
 *  
 *  Class ReferenceUriSchemesSupported defines enumeration values for widely
 *  used URI schemes. A printer that supports additional URI schemes
 *  can define them in a subclass of class ReferenceUriSchemesSupported.
 *  
 *  IPP Compatibility:  The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
class ReferenceUriSchemesSupported extends EnumSyntax with Attribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class
     *  ReferenceUriSchemesSupported.
     */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object ReferenceUriSchemesSupported {
    /** Host-specific file names. */
    @stub
    val FILE: ReferenceUriSchemesSupported = ???

    /** File Transfer Protocol (FTP). */
    @stub
    val FTP: ReferenceUriSchemesSupported = ???

    /** Gopher Protocol. */
    @stub
    val GOPHER: ReferenceUriSchemesSupported = ???

    /** HyperText Transfer Protocol (HTTP). */
    @stub
    val HTTP: ReferenceUriSchemesSupported = ???

    /** Secure HyperText Transfer Protocol (HTTPS). */
    @stub
    val HTTPS: ReferenceUriSchemesSupported = ???

    /** USENET news. */
    @stub
    val NEWS: ReferenceUriSchemesSupported = ???

    /** USENET news using Network News Transfer Protocol (NNTP). */
    @stub
    val NNTP: ReferenceUriSchemesSupported = ???
}
