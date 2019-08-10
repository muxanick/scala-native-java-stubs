package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.Locale
import javax.print.attribute.{Attribute, DocAttribute, TextSyntax}
import scala.scalanative.annotation.stub

/** Class DocumentName is a printing attribute class, a text attribute, that
 *  specifies the name of a document. DocumentName is an attribute of the print
 *  data (the doc), not of the Print Job. A document's name is an arbitrary
 *  string defined by the client.
 *  However if a JobName is not specified, the DocumentName should be used
 *  instead, which implies that supporting specification of DocumentName
 *  requires reporting of JobName and vice versa.
 *  See JobName for more information.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class DocumentName extends TextSyntax with DocAttribute {

    /** Constructs a new document name attribute with the given document name
     *  and locale.
     */
    @stub
    def this(documentName: String, locale: Locale) = ???

    /** Returns whether this document name attribute is equivalent to the
     *  passed in object.
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
