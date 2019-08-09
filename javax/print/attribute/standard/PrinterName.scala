package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.Locale
import javax.print.attribute.{Attribute, PrintServiceAttribute, TextSyntax}
import scala.scalanative.annotation.stub

/** Class PrinterName is a printing attribute class, a text attribute, that
 *  specifies the name of a printer. It is a name that is more end-user friendly
 *  than a URI. An administrator determines a printer's name and sets this
 *  attribute to that name. This name may be the last part of the printer's URI
 *  or it may be unrelated. In non-US-English locales, a name may contain
 *  characters that are not allowed in a URI.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class PrinterName extends TextSyntax with PrintServiceAttribute {

    /** Constructs a new printer name attribute with the given name and locale. */
    @stub
    def this(printerName: String, locale: Locale) = ???

    /** Returns whether this printer name attribute is equivalent to the passed
     *  in object.
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
