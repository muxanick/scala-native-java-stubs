package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{Retention, RetentionPolicy, Target}

// 
// Associates a namespace prefix with a XML namespace URI.
//
// Usage
// @XmlNs annotation is intended for use from other
// program annotations.
//
// See "Package Specification" in javax.xml.bind.package javadoc for
// additional common information.
//
// Example:See XmlSchema annotation type for an example.
@Retention ( value = RUNTIME ) @Target ( value ={} ) @interface XmlNs {

    @stub
    // Namespace URI
    def namespaceURI: String = ???
}
