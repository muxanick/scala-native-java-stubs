package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, DocAttribute, TextSyntax}

// Class DocumentName is a printing attribute class, a text attribute, that
// specifies the name of a document. DocumentName is an attribute of the print
// data (the doc), not of the Print Job. A document's name is an arbitrary
// string defined by the client.
// However if a JobName is not specified, the DocumentName should be used
// instead, which implies that supporting specification of DocumentName
// requires reporting of JobName and vice versa.
// See JobName for more information.
// 
// IPP Compatibility: The string value gives the IPP name value. The
// locale gives the IPP natural language. The category name returned by
// getName() gives the IPP attribute name.
// 
final class DocumentName extends TextSyntax with DocAttribute {

    @stub
    // Returns whether this document name attribute is equivalent to the
    // passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}