package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** 
 *  Associates a namespace prefix with a XML namespace URI.
 * 
 *  Usage
 *  @XmlNs annotation is intended for use from other
 *  program annotations.
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  Example:See XmlSchema annotation type for an example.
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={} ) 
 final class XmlNs extends StaticAnnotation {

    /** Namespace URI */
    @stub
    val namespaceURI: String = ???
}
