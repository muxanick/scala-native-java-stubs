package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, SetOfIntegerSyntax, SupportedValuesAttribute}

// Class NumberUpSupported is a printing attribute class, a set of integers,
// that gives the supported values for a NumberUp attribute.
// 
// IPP Compatibility: The NumberUpSupported attribute's canonical array
// form gives the lower and upper bound for each range of number-up to be
// included in an IPP "number-up-supported" attribute. See class SetOfIntegerSyntax for an
// explanation of canonical array form. The category name returned by
// getName() gives the IPP attribute name.
// 
final class NumberUpSupported extends SetOfIntegerSyntax with SupportedValuesAttribute {

    @stub
    // Construct a new number up supported attribute containing a single
    // integer.
    def this(member: Int) = ???

    @stub
    // Construct a new number up supported attribute with the given members.
    def this(members: Array[Array[Int]]) = ???

    @stub
    // Returns whether this number up supported attribute is equivalent to the
    // passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
