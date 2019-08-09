package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintServiceAttribute}

/** Class PDLOverrideSupported is a printing attribute class, an enumeration,
 *  that expresses the printer's ability to attempt to override processing
 *  instructions embedded in documents' print data with processing instructions
 *  specified as attributes outside the print data.
 *  
 *  IPP Compatibility: The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
class PDLOverrideSupported extends EnumSyntax with PrintServiceAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class PDLOverrideSupported. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object PDLOverrideSupported {
    /** The printer attempts to make the external job attribute values take
     *  precedence over embedded instructions in the documents' print data,
     *  however there is no guarantee.
     */
    @stub
    val ATTEMPTED: PDLOverrideSupported = ???
}
