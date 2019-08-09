package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute, PrintRequestAttribute}

// Class Copies is an integer valued printing attribute class that specifies the
// number of copies to be printed.
// 
// On many devices the supported number of collated copies will be limited by
// the number of physical output bins on the device, and may be different from
// the number of uncollated copies which can be supported.
// 
// The effect of a Copies attribute with a value of n on a multidoc print
// job (a job with multiple documents) depends on the (perhaps defaulted) value
// of the MultipleDocumentHandling attribute:
// 
// 
// SINGLE_DOCUMENT -- The result will be n copies of a single output
// document comprising all the input docs.
// 
// 
// SINGLE_DOCUMENT_NEW_SHEET -- The result will be n copies of a single
// output document comprising all the input docs, and the first impression of
// each input doc will always start on a new media sheet.
// 
// 
// SEPARATE_DOCUMENTS_UNCOLLATED_COPIES -- The result will be n copies of
// the first input document, followed by n copies of the second input
// document, . . . followed by n copies of the last input document.
// 
// 
// SEPARATE_DOCUMENTS_COLLATED_COPIES -- The result will be the first input
// document, the second input document, . . . the last input document, the group
// of documents being repeated n times.
// 
// 
// IPP Compatibility: The integer value gives the IPP integer value. The
// category name returned by getName() gives the IPP attribute
// name.
// 
final class Copies extends IntegerSyntax with PrintRequestAttribute, with PrintJobAttribute {

    @stub
    // Returns whether this copies attribute is equivalent to the passed in
    // object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
