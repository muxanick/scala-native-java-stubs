package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintJobAttribute, TextSyntax}

// Class JobOriginatingUserName is a printing attribute class, a text
// attribute, that contains the name of the end user that submitted the
// print job. If possible, the printer sets this attribute to the most
// authenticated printable user name that it can obtain from the
// authentication service that authenticated the submitted Print Request.
// If such is not available, the printer uses the value of the
// RequestingUserName
// attribute supplied by the client in the Print Request's attribute set.
// If no authentication service is available, and the client did not supply
// a RequestingUserName attribute,
// the printer sets the JobOriginatingUserName attribute to an empty
// (zero-length) string.
// 
// IPP Compatibility: The string value gives the IPP name value. The
// locale gives the IPP natural language. The category name returned by
// getName() gives the IPP attribute name.
// 
final class JobOriginatingUserName extends TextSyntax with PrintJobAttribute {

    @stub
    // Returns whether this job originating user name attribute is equivalent to
    // the passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
