package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute}

// Class NumberOfDocuments is an integer valued printing attribute that
// indicates the number of individual docs the printer has accepted for this
// job, regardless of whether the docs' print data has reached the printer or
// not.
// 
// IPP Compatibility: The integer value gives the IPP integer value. The
// category name returned by getName() gives the IPP attribute
// name.
// 
final class NumberOfDocuments extends IntegerSyntax with PrintJobAttribute {

    @stub
    // Returns whether this number of documents attribute is equivalent to the
    // passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
