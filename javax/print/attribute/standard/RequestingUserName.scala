package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.Locale
import javax.print.attribute.{Attribute, PrintRequestAttribute, TextSyntax}
import scala.scalanative.annotation.stub

/** Class RequestingUserName is a printing attribute class, a text attribute,
 *  that specifies the name of the end user that submitted the print job. A
 *  requesting user name is an arbitrary string defined by the client. The
 *  printer does not put the client-specified RequestingUserName attribute into
 *  the Print Job's attribute set; rather, the printer puts in a JobOriginatingUserName attribute.
 *  This means that services which support specifying a username with this
 *  attribute should also report a JobOriginatingUserName in the job's
 *  attribute set. Note that many print services may have a way to independently
 *  authenticate the user name, and so may state support for a
 *  requesting user name, but in practice will then report the user name
 *  authenticated by the service rather than that specified via this
 *  attribute.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class RequestingUserName extends TextSyntax with PrintRequestAttribute {

    /** Constructs a new requesting user name attribute with the given user
     *  name and locale.
     */
    @stub
    def this(userName: String, locale: Locale) = ???

    /** Returns whether this requesting user name attribute is equivalent to
     *  the passed in object.
     */
    @stub
    def equals(object: Any): Boolean = ???

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
