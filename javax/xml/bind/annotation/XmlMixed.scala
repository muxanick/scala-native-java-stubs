package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** 
 *  Annotate a JavaBean multi-valued property to support mixed content.
 * 
 *  
 *  The usage is subject to the following constraints:
 *  
 *     can be used with @XmlElementRef, @XmlElementRefs or @XmlAnyElement
 *  
 *  
 *  The following can be inserted into @XmlMixed annotated multi-valued property
 *  
 *  XML text information items are added as values of java.lang.String.
 *  Children element information items are added as instances of
 *  JAXBElement or instances with a class that is annotated with
 *  @XmlRootElement.
 *  Unknown content that is not be bound to a JAXB mapped class is inserted
 *  as Element. (Assumes property annotated with @XmlAnyElement)
 *  
 * 
 *  Below is an example of binding and creation of mixed content.
 *  
 *   <!-- schema fragment having  mixed content -->
 *   <xs:complexType name="letterBody" mixed="true">
 *     <xs:sequence>
 *       <xs:element name="name" type="xs:string"/>
 *       <xs:element name="quantity" type="xs:positiveInteger"/>
 *       <xs:element name="productName" type="xs:string"/>
 *       <!-- etc. -->
 *     </xs:sequence>
 *   </xs:complexType>
 *   <xs:element name="letterBody" type="letterBody"/>
 * 
 *  // Schema-derived Java code:
 *  // (Only annotations relevant to mixed content are shown below,
 *  //  others are ommitted.)
 *  import java.math.BigInteger;
 *  public class ObjectFactory {
 *       // element instance factories
 *       JAXBElement<LetterBody> createLetterBody(LetterBody value);
 *       JAXBElement<String>     createLetterBodyName(String value);
 *       JAXBElement<BigInteger> createLetterBodyQuantity(BigInteger value);
 *       JAXBElement<String>     createLetterBodyProductName(String value);
 *       // type instance factory
 *       LetterBody> createLetterBody();
 *  }
 *  
 *  
 *  public class LetterBody {
 *       // Mixed content can contain instances of Element classes
 *       // Name, Quantity and ProductName. Text data is represented as
 *       // java.util.String for text.
 *       @XmlMixed
 *       @XmlElementRefs({
 *               @XmlElementRef(name="productName", type=JAXBElement.class),
 *               @XmlElementRef(name="quantity", type=JAXBElement.class),
 *               @XmlElementRef(name="name", type=JAXBElement.class)})
 *       List getContent(){...}
 *  }
 *  
 *  The following is an XML instance document with mixed content
 *  
 *  <letterBody>
 *  Dear Mr.<name>Robert Smith</name>
 *  Your order of <quantity>1</quantity> <productName>Baby
 *  Monitor</productName> shipped from our warehouse. ....
 *  </letterBody>
 *  
 *  that can be constructed using following JAXB API calls.
 *  
 *  LetterBody lb = ObjectFactory.createLetterBody();
 *  JAXBElement<LetterBody> lbe = ObjectFactory.createLetterBody(lb);
 *  List gcl = lb.getContent();  //add mixed content to general content property.
 *  gcl.add("Dear Mr.");  // add text information item as a String.
 * 
 *  // add child element information item
 *  gcl.add(ObjectFactory.createLetterBodyName("Robert Smith"));
 *  gcl.add("Your order of "); // add text information item as a String
 * 
 *  // add children element information items
 *  gcl.add(ObjectFactory.
 *                       createLetterBodyQuantity(new BigInteger("1")));
 *  gcl.add(ObjectFactory.createLetterBodyProductName("Baby Monitor"));
 *  gcl.add("shipped from our warehouse");  // add text information item
 *  
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlMixed extends StaticAnnotation {
}
