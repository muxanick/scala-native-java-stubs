package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, SetOfIntegerSyntax, SupportedValuesAttribute}

// Class CopiesSupported is a printing attribute class, a set of integers, that
// gives the supported values for a Copies attribute. It is
// restricted to a single contiguous range of integers; multiple non-overlapping
// ranges are not allowed.
// 
// IPP Compatibility: The CopiesSupported attribute's canonical array
// form gives the lower and upper bound for the range of copies to be included
// in an IPP "copies-supported" attribute. See class SetOfIntegerSyntax for an
// explanation of canonical array form. The category name returned by
// getName() gives the IPP attribute name.
// 
final class CopiesSupported extends SetOfIntegerSyntax with SupportedValuesAttribute {

    @stub
    // Construct a new copies supported attribute containing a single integer.
    def this(member: Int) = ???

    @stub
    // Returns whether this copies supported attribute is equivalent to the
    // passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
