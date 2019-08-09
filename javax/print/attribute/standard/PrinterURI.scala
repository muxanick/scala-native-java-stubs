package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintServiceAttribute, URISyntax}

/** Class PrinterURI is a printing attribute class, a URI, that specifies the
 *  globally unique name of a printer.  If it has such a name, an administrator
 *  determines a printer's URI and sets this attribute to that name.
 *  
 *  IPP Compatibility:  This implements the
 *  IPP printer-uri attribute. The string form returned by
 *  toString()  gives the IPP printer-uri value.
 *  The category name returned by getName()
 *  gives the IPP attribute name.
 *  
 */
final class PrinterURI extends URISyntax with PrintServiceAttribute {

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
}
