package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.Locale
import javax.print.attribute.{Attribute, PrintServiceAttribute, TextSyntax}
import scala.scalanative.annotation.stub

/** Class PrinterMakeAndModel is a printing attribute class, a text attribute,
 *  that the make and model of the printer.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class PrinterMakeAndModel extends TextSyntax with PrintServiceAttribute {

    /** Constructs a new printer make and model attribute with the given make
     *  and model string and locale.
     */
    @stub
    def this(makeAndModel: String, locale: Locale) = ???

    /** Returns whether this printer make and model attribute is equivalent to
     *  the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}
