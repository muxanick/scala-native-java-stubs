package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

// Class Fidelity is a printing attribute class, an enumeration,
// that indicates whether total fidelity to client supplied print request
// attributes is required.
// If FIDELITY_TRUE is specified and a service cannot print the job exactly
// as specified it must reject the job.
// If FIDELITY_FALSE is specified a reasonable attempt to print the job is
// acceptable. If not supplied the default is FIDELITY_FALSE.
//
// 
// IPP Compatibility: The IPP boolean value is "true" for FIDELITY_TRUE
// and "false" for FIDELITY_FALSE. The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// See RFC 2911 Section 15.1 for
// a fuller description of the IPP fidelity attribute.
// 
final class Fidelity extends EnumSyntax with PrintJobAttribute, with PrintRequestAttribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class Fidelity.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object Fidelity {
    @stub
    // The printer should make reasonable attempts to print the job,
    // even if it cannot print it exactly as specified.
    def FIDELITY_FALSE: Fidelity = ???
}
