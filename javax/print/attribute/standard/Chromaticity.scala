package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class Chromaticity is a printing attribute class, an enumeration, that
 *  specifies monochrome or color printing. This is used by a print client
 *  to specify how the print data should be generated or processed. It is not
 *  descriptive of the color capabilities of the device. Query the service's
 *  ColorSupported attribute to determine if the device
 *  can be verified to support color printing.
 *  
 *  The table below shows the effects of specifying a Chromaticity attribute of
 *  MONOCHROME or COLOR
 *  for a monochrome or color document.
 *  
 *  
 *  
 *  
 *  ChromaticityAttribute
 *  
 *  
 *  Effect onMonochrome Document
 *  
 *  
 *  Effect onColor Document
 *  
 *  
 *  
 *  
 *  MONOCHROME
 *  
 *  
 *  Printed as is, in monochrome
 *  
 *  
 *  Printed in monochrome, with colors converted to shades of gray
 *  
 *  
 *  
 *  
 *  COLOR
 *  
 *  
 *  Printed as is, in monochrome
 *  
 *  
 *  Printed as is, in color
 *  
 *  
 *  
 *  
 *  
 *  IPP Compatibility: Chromaticity is not an IPP attribute at present.
 *  
 */
final class Chromaticity extends EnumSyntax with DocAttribute with PrintRequestAttribute with PrintJobAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class Chromaticity. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object Chromaticity {
    /** Color printing. */
    @stub
    val COLOR: Chromaticity = ???
}
