package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Used to map a property to a list simple type.
 * 
 *  Usage 
 *  
 *  The @XmlList annotation can be used with the
 *  following program elements:
 *  
 *     JavaBean property 
 *     field 
 *  
 * 
 *  
 *  When a collection property is annotated just with @XmlElement,
 *  each item in the collection will be wrapped by an element.
 *  For example,
 * 
 *  
 *  @XmlRootElement
 *  class Foo {
 *      @XmlElement
 *      List<String> data;
 *  }
 *  
 * 
 *  would produce XML like this:
 * 
 *  
 *  <foo>
 *    <data>abc
 *    <data>def
 *  </foo>
 *  
 * 
 *  @XmlList annotation, on the other hand, allows multiple values to be
 *  represented as whitespace-separated tokens in a single element. For example,
 * 
 *  
 *  @XmlRootElement
 *  class Foo {
 *      @XmlElement
 *      @XmlList
 *      List<String> data;
 *  }
 *  
 * 
 *  the above code will produce XML like this:
 * 
 *  
 *  <foo>
 *    <data>abc def
 *  </foo>
 *  
 * 
 *  This annotation can be used with the following annotations:
 *         XmlElement,
 *         XmlAttribute,
 *         XmlValue,
 *         XmlIDREF.
 *   
 *      The use of @XmlList with XmlValue while
 *          allowed, is redundant since  XmlList maps a
 *          collection type to a simple schema type that derives by
 *          list just as XmlValue would. 
 * 
 *      The use of @XmlList with XmlAttribute while
 *          allowed, is redundant since  XmlList maps a
 *          collection type to a simple schema type that derives by
 *          list just as XmlAttribute would. 
 *   
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD , PARAMETER } ) 
 final class XmlList extends StaticAnnotation {
}
