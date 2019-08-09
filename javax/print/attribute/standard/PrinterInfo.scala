package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintServiceAttribute, TextSyntax}

/** Class PrinterInfo is a printing attribute class, a text attribute, that
 *  provides descriptive information about a printer. This could include things
 *  like: "This printer can be used for printing color transparencies for
 *  HR presentations", or "Out of courtesy for others, please
 *  print only small (1-5 page) jobs at this printer", or even \
 *  "This printer is going away on July 1, 1997, please find a new
 *  printer".
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class PrinterInfo extends TextSyntax with PrintServiceAttribute {

    /** Returns whether this printer info attribute is equivalent to the passed
     *  in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
