package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintServiceAttribute, TextSyntax}

/** Class PrinterMessageFromOperator is a printing attribute class, a text
 *  attribute, that provides a message from an operator, system administrator,
 *  or "intelligent" process to indicate to the end user information about or
 *  status of the printer, such as why it is unavailable or when it is
 *  expected to be available.
 *  
 *  A Print Service's attribute set includes zero instances or one instance of
 *  a
 *  PrinterMessageFromOperator attribute, not more than one instance. A new
 *  PrinterMessageFromOperator attribute replaces an existing
 *  PrinterMessageFromOperator attribute, if any. In other words,
 *  PrinterMessageFromOperator is not intended to be a history log.
 *  If it wishes, the client can detect changes to a Print Service's
 *  PrinterMessageFromOperator
 *  attribute and maintain the client's own history log of the
 *  PrinterMessageFromOperator attribute values.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class PrinterMessageFromOperator extends TextSyntax with PrintServiceAttribute {

    /** Returns whether this printer message from operator attribute is
     *  equivalent to the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
