package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class PrintQuality is a printing attribute class, an enumeration,
 *  that specifies the print quality that the printer uses for the job.
 *  
 *  IPP Compatibility: The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
class PrintQuality extends EnumSyntax with DocAttribute with PrintRequestAttribute with PrintJobAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class PrintQuality. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the lowest integer value used by class PrintQuality. */
    @stub
    protected def getOffset(): Int = ???
}

object PrintQuality {
    /** Lowest quality available on the printer. */
    @stub
    val DRAFT: PrintQuality = ???

    /** Highest quality available on the printer. */
    @stub
    val HIGH: PrintQuality = ???
}
