package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.Locale
import javax.print.attribute.{Attribute, PrintJobAttribute, TextSyntax}
import scala.scalanative.annotation.stub

/** Class OutputDeviceAssigned is a printing attribute class, a text attribute,
 *  that identifies the output device to which the service has assigned this
 *  job. If an output device implements an embedded Print Service instance, the
 *  printer need not set this attribute. If a print server implements a
 *  Print Service instance, the value may be empty (zero- length string) or not
 *  returned until the service assigns an output device to the job. This
 *  attribute is particularly useful when a single service supports multiple
 *  devices (so called "fan-out").
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class OutputDeviceAssigned extends TextSyntax with PrintJobAttribute {

    /** Constructs a new output device assigned attribute with the given device
     *  name and locale.
     */
    @stub
    def this(deviceName: String, locale: Locale) = ???

    /** Returns whether this output device assigned attribute is equivalent to
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
