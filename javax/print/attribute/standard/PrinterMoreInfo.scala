package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintServiceAttribute, URISyntax}

/** Class PrinterMoreInfo is a printing attribute class, a URI, that is used to
 *  obtain more information about this specific printer. For example, this
 *  could be an HTTP type URI referencing an HTML page accessible to a web
 *  browser. The information obtained from this URI is intended for end user
 *  consumption. Features outside the scope of the Print Service API can be
 *  accessed from this URI.
 *  The information is intended to be specific to this printer instance and
 *  site specific services (e.g. job pricing, services offered, end user
 *  assistance).
 *  
 *  In contrast, the PrinterMoreInfoManufacturer attribute is used to find out more information
 *  about this general kind of printer rather than this specific printer.
 *  
 *  IPP Compatibility: The string form returned by
 *  toString()  gives the IPP uri value.
 *  The category name returned by getName()
 *  gives the IPP attribute name.
 *  
 */
final class PrinterMoreInfo extends URISyntax with PrintServiceAttribute {

    /** Returns whether this printer more info attribute is equivalent to the
     *  passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
