package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.net.URI
import javax.print.attribute.{Attribute, PrintServiceAttribute, URISyntax}
import scala.scalanative.annotation.stub

/** Class PrinterMoreInfoManufacturer is a printing attribute class, a URI,
 *  that is used to obtain more information about this type of device.
 *  The information obtained from this URI is intended for end user
 *  consumption. Features outside the scope of the Print Service API
 *  can be accessed from this URI (e.g.,
 *  latest firmware, upgrades, service proxies, optional features available,
 *  details on color support). The information is intended to be germane to
 *  this kind of printer without regard to site specific modifications or
 *  services.
 *  
 *  In contrast, the PrinterMoreInfo attribute is used
 *  to find out more information about this specific printer rather than this
 *  general kind of printer.
 *  
 *  
 *  IPP Compatibility: The string form returned by
 *  toString() gives the IPP uri value.
 *  The category name returned by getName()
 *  gives the IPP attribute name.
 *  
 */
final class PrinterMoreInfoManufacturer extends URISyntax with PrintServiceAttribute {

    /** Constructs a new printer more info manufacturer attribute with the
     *  specified URI.
     */
    @stub
    def this(uri: URI) = ???

    /** Returns whether this printer more info manufacturer attribute is
     *  equivalent to the passed in object.
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
