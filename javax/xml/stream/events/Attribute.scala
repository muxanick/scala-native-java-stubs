package javax.xml.stream.events

import java.lang.String
import javax.xml.namespace.QName

// An interface that contains information about an attribute.  Attributes are reported
// as a set of events accessible from a StartElement.  Other applications may report
// Attributes as first-order events, for example as the results of an XPath expression.
trait Attribute extends XMLEvent {

    @stub
    // Gets the type of this attribute, default is
    // the String "CDATA"
    def getDTDType(): String = ???

    @stub
    // Returns the QName for this attribute
    def getName(): QName = ???

    @stub
    // Gets the normalized value of this attribute
    def getValue(): String = ???
}
