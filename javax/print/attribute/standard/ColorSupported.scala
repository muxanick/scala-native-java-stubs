package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintServiceAttribute}

/** Class ColorSupported is a printing attribute class, an enumeration, that
 *  identifies whether the device is capable of any type of color printing at
 *  all, including highlight color as well as full process color. All document
 *  instructions having to do with color are embedded within the print data (none
 *  are attributes attached to the job outside the print data).
 *  
 *  Note: End users are able to determine the nature and details of the color
 *  support by querying the PrinterMoreInfoManufacturer attribute.
 *  
 *  Don't confuse the ColorSupported attribute with the Chromaticity attribute. Chromaticity is an attribute
 *  the client can specify for a job to tell the printer whether to print a
 *  document in monochrome or color, possibly causing the printer to print a
 *  color document in monochrome. ColorSupported is a printer description
 *  attribute that tells whether the printer can print in color regardless of how
 *  the client specifies to print any particular document.
 *  
 *  IPP Compatibility: The IPP boolean value is "true" for SUPPORTED and
 *  "false" for NOT_SUPPORTED. The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
final class ColorSupported extends EnumSyntax with PrintServiceAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class ColorSupported. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object ColorSupported {
    /** The printer is not capable of any type of color printing. */
    @stub
    val NOT_SUPPORTED: ColorSupported = ???
}
