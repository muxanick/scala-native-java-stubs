package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.net.URI
import javax.print.attribute.{Attribute, PrintJobAttribute, PrintRequestAttribute, URISyntax}
import scala.scalanative.annotation.stub

/** Class Destination is a printing attribute class, a URI, that is used to
 *  indicate an alternate destination for the spooled printer formatted
 *  data. Many PrintServices will not support the notion of a destination
 *  other than the printer device, and so will not support this attribute.
 *  
 *  A common use for this attribute will be applications which want
 *  to redirect output to a local disk file : eg."file:out.prn".
 *  Note that proper construction of "file:" scheme URI instances should
 *  be performed using the toURI() method of class
 *  File.
 *  See the documentation on that class for more information.
 *  
 *  If a destination URI is specified in a PrintRequest and it is not
 *  accessible for output by the PrintService, a PrintException will be thrown.
 *  The PrintException may implement URIException to provide a more specific
 *  cause.
 *  
 *  IPP Compatibility: Destination is not an IPP attribute.
 *  
 */
final class Destination extends URISyntax with PrintJobAttribute with PrintRequestAttribute {

    /** Constructs a new destination attribute with the specified URI. */
    @stub
    def this(uri: URI) = ???

    /** Returns whether this destination attribute is equivalent to the
     *  passed in object.
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
