package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  Maps a package name to a XML namespace. 
 * 
 *  Usage
 *  
 *  The XmlSchema annotation can be used with the following program
 *  elements:
 *  
 *    package
 *  
 * 
 *  
 *  This is a package level annotation and follows the recommendations
 *  and restrictions contained in JSR 175, section III, "Annotations".
 *  Thus the usage is subject to the following constraints and
 *  recommendations.
 *  
 *     There can only be one package declaration as noted in JSR
 *         175, section III, "Annotations". 
 *     JSR 175 recommends package-info.java for package level
 *         annotations. JAXB Providers that follow this recommendation
 *         will allow the package level annotations to be defined in
 *         package-info.java.
 *  
 *  
 * 
 *  Example 1: Customize name of XML namespace to which
 *  package is mapped.
 * 
 *  
 *     @javax.xml.bind.annotation.XmlSchema (
 *       namespace = "http://www.example.com/MYPO1"
 *     )
 * 
 *     <!-- XML Schema fragment -->
 *     <schema
 *       xmlns=...
 *       xmlns:po=....
 *       targetNamespace="http://www.example.com/MYPO1"
 *     >
 *     <!-- prefixes generated by default are implementation
 *             depedenent -->
 *  
 * 
 *  Example 2: Customize namespace prefix, namespace URI
 *  mapping
 * 
 *  
 *     // Package level annotation
 *     @javax.xml.bind.annotation.XmlSchema (
 *       xmlns = {
 *         @javax.xml.bind.annotation.XmlNs(prefix = "po",
 *                    namespaceURI="http://www.example.com/myPO1"),
 * 
 *         @javax.xml.bind.annotation.XmlNs(prefix="xs",
 *                    namespaceURI="http://www.w3.org/2001/XMLSchema")
 *       )
 *     )
 * 
 *     <!-- XML Schema fragment -->
 *     <schema
 *         xmlns:xs="http://www.w3.org/2001/XMLSchema"
 *         xmlns:po="http://www.example.com/PO1"
 *         targetNamespace="http://www.example.com/PO1">
 * 
 *  
 * 
 *  Example 3: Customize elementFormDefault
 *  
 *     @javax.xml.bind.annotation.XmlSchema (
 *       elementFormDefault=XmlNsForm.UNQUALIFIED
 *       ...
 *     )
 * 
 *     <!-- XML Schema fragment -->
 *     <schema
 *         xmlns="http://www.w3.org/2001/XMLSchema"
 *         xmlns:po="http://www.example.com/PO1"
 *         elementFormDefault="unqualified">
 * 
 *  
 */
@Retention(value=RUNTIME)
@Target(value=PACKAGE)
final class XmlSchema extends StaticAnnotation {

    /** Namespace qualification for attributes. */
    @stub
    val attributeFormDefault: XmlNsForm = ???

    /** Namespace qualification for elements. */
    @stub
    val elementFormDefault: XmlNsForm = ???

    /** Indicates that this namespace (specified by namespace())
     *  has a schema already available exeternally, available at this location.
     */
    @stub
    val location: String = ???

    /** Name of the XML namespace. */
    @stub
    val namespace: String = ???

    /** Customize the namespace URI, prefix associations. */
    @stub
    val xmlns: Array[XmlNs] = ???
}

object XmlSchema {
    /** The default value of the location() attribute,
     *  which indicates that the schema generator will generate
     *  components in this namespace.
     */
    @stub
    val NO_LOCATION: String = ???
}
