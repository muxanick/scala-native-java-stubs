package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

// Class PrintQuality is a printing attribute class, an enumeration,
// that specifies the print quality that the printer uses for the job.
// 
// IPP Compatibility: The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// 
class PrintQuality extends EnumSyntax with DocAttribute, with PrintRequestAttribute, with PrintJobAttribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class PrintQuality.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???

    @stub
    // Returns the lowest integer value used by class PrintQuality.
    protected def getOffset(): Int = ???
}

object PrintQuality {
    @stub
    // Lowest quality available on the printer.
    def DRAFT: PrintQuality = ???

    @stub
    // Highest quality available on the printer.
    def HIGH: PrintQuality = ???
}
