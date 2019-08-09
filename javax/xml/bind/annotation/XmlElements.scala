package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** 
 *  A container for multiple @XmlElement annotations.
 * 
 *  Multiple annotations of the same type are not allowed on a program
 *  element. This annotation therefore serves as a container annotation
 *  for multiple @XmlElements as follows:
 * 
 *  
 *  @XmlElements({ @XmlElement(...),@XmlElement(...) })
 *  
 * 
 *  The @XmlElements annnotation can be used with the
 *  following program elements: 
 *  
 *     a JavaBean property 
 *     non static, non transient field 
 *  
 * 
 *  This annotation is intended for annotation a JavaBean collection
 *  property (e.g. List).
 * 
 *  Usage
 * 
 *  The usage is subject to the following constraints:
 *  
 *     This annotation can be used with the following
 *         annotations: @XmlIDREF, @XmlElementWrapper. 
 *     If @XmlIDREF is also specified on the JavaBean property,
 *         then each @XmlElement.type() must contain a JavaBean
 *         property annotated with @XmlID.
 *  
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  
 * 
 *  Example 1: Map to a list of elements
 *  
 * 
 *     // Mapped code fragment
 *     public class Foo {
 *         @XmlElements(
 *             @XmlElement(name="A", type=Integer.class),
 *             @XmlElement(name="B", type=Float.class)
 *          }
 *          public List items;
 *     }
 * 
 *     <!-- XML Representation for a List of {1,2.5}
 *             XML output is not wrapped using another element -->
 *     ...
 *     <A> 1 </A>
 *     <B> 2.5 </B>
 *     ...
 * 
 *     <!-- XML Schema fragment -->
 *     <xs:complexType name="Foo">
 *       <xs:sequence>
 *         <xs:choice minOccurs="0" maxOccurs="unbounded">
 *           <xs:element name="A" type="xs:int"/>
 *           <xs:element name="B" type="xs:float"/>
 *         <xs:choice>
 *       </xs:sequence>
 *     </xs:complexType>
 * 
 *  
 * 
 *  Example 2: Map to a list of elements wrapped with another element
 *  
 *  
 * 
 *     // Mapped code fragment
 *     public class Foo {
 *         @XmlElementWrapper(name="bar")
 *         @XmlElements(
 *             @XmlElement(name="A", type=Integer.class),
 *             @XmlElement(name="B", type=Float.class)
 *         }
 *         public List items;
 *     }
 * 
 *     <!-- XML Schema fragment -->
 *     <xs:complexType name="Foo">
 *       <xs:sequence>
 *         <xs:element name="bar">
 *           <xs:complexType>
 *             <xs:choice minOccurs="0" maxOccurs="unbounded">
 *               <xs:element name="A" type="xs:int"/>
 *               <xs:element name="B" type="xs:float"/>
 *             </xs:choice>
 *           </xs:complexType>
 *         </xs:element>
 *       </xs:sequence>
 *     </xs:complexType>
 *  
 * 
 *  Example 3: Change element name based on type using an adapter.
 *  
 *  
 *     class Foo {
 *        @XmlJavaTypeAdapter(QtoPAdapter.class)
 *        @XmlElements({
 *            @XmlElement(name="A",type=PX.class),
 *            @XmlElement(name="B",type=PY.class)
 *        })
 *        Q bar;
 *     }
 * 
 *     @XmlType abstract class P {...}
 *     @XmlType(name="PX") class PX extends P {...}
 *     @XmlType(name="PY") class PY extends P {...}
 * 
 *     <!-- XML Schema fragment -->
 *     <xs:complexType name="Foo">
 *       <xs:sequence>
 *         <xs:element name="bar">
 *           <xs:complexType>
 *             <xs:choice minOccurs="0" maxOccurs="unbounded">
 *               <xs:element name="A" type="PX"/>
 *               <xs:element name="B" type="PY"/>
 *             </xs:choice>
 *           </xs:complexType>
 *         </xs:element>
 *       </xs:sequence>
 *     </xs:complexType>
 *  
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlElements extends StaticAnnotation {
}
