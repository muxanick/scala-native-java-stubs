package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintServiceAttribute}
import scala.scalanative.annotation.stub

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

    /** Construct a new PDL override supported enumeration value with the given
     *  integer value.
     */
    @stub
    protected def this(value: Int) = ???

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

    /** Returns the string table for class PDLOverrideSupported. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object PDLOverrideSupported {
    /** The printer attempts to make the external job attribute values take
     *  precedence over embedded instructions in the documents' print data,
     *  however there is no guarantee.
     */
    @stub
    val ATTEMPTED: PDLOverrideSupported = ???

    /** The printer makes no attempt to make the external job attribute values
     *  take precedence over embedded instructions in the documents' print
     *  data.
     */
    @stub
    val NOT_ATTEMPTED: PDLOverrideSupported = ???
}
