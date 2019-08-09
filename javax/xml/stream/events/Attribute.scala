package javax.xml.stream.events

import java.lang.String
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** An interface that contains information about an attribute.  Attributes are reported
 *  as a set of events accessible from a StartElement.  Other applications may report
 *  Attributes as first-order events, for example as the results of an XPath expression.
 */
trait Attribute extends XMLEvent {

    /** Gets the type of this attribute, default is
     *  the String "CDATA"
     */
    @stub
    def getDTDType(): String = ???

    /** Returns the QName for this attribute */
    @stub
    def getName(): QName = ???

    /** Gets the normalized value of this attribute */
    @stub
    def getValue(): String = ???

    /** A flag indicating whether this attribute was actually
     *  specified in the start-tag of its element, or was defaulted from the schema.
     */
    @stub
    def isSpecified(): Boolean = ???
}
