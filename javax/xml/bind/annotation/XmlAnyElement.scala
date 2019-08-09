package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Maps a JavaBean property to XML infoset representation and/or JAXB element.
 * 
 *  
 *  This annotation serves as a "catch-all" property while unmarshalling
 *  xml content into a instance of a JAXB annotated class. It typically
 *  annotates a multi-valued JavaBean property, but it can occur on
 *  single value JavaBean property. During unmarshalling, each xml element
 *  that does not match a static @XmlElement or @XmlElementRef
 *  annotation for the other JavaBean properties on the class, is added to this
 *  "catch-all" property.
 * 
 *  
 *  Usages:
 *  
 *  @XmlAnyElement
 *  public Element[] others;
 * 
 *  // Collection of Element or JAXB elements.
 *  @XmlAnyElement(lax="true")
 *  public Object[] others;
 * 
 *  @XmlAnyElement
 *  private List<Element> nodes;
 * 
 *  @XmlAnyElement
 *  private Element node;
 *  
 * 
 *  Restriction usage constraints
 *  
 *  This annotation is mutually exclusive with
 *  XmlElement, XmlAttribute, XmlValue,
 *  XmlElements, XmlID, and XmlIDREF.
 * 
 *  
 *  There can be only one XmlAnyElement annotated JavaBean property
 *  in a class and its super classes.
 * 
 *  Relationship to other annotations
 *  
 *  This annotation can be used with XmlJavaTypeAdapter, so that users
 *  can map their own data structure to DOM, which in turn can be composed
 *  into XML.
 * 
 *  
 *  This annotation can be used with XmlMixed like this:
 *  
 *  // List of java.lang.String or DOM nodes.
 *  @XmlAnyElement @XmlMixed
 *  List<Object> others;
 *  
 * 
 * 
 *  Schema To Java example
 * 
 *  The following schema would produce the following Java class:
 *  
 *  <xs:complexType name="foo">
 *    <xs:sequence>
 *      <xs:element name="a" type="xs:int" />
 *      <xs:element name="b" type="xs:int" />
 *      <xs:any namespace="##other" processContents="lax" minOccurs="0" maxOccurs="unbounded" />
 *    </xs:sequence>
 *  </xs:complexType>
 *  
 * 
 *  
 *  class Foo {
 *    int a;
 *    int b;
 *    @XmlAnyElement
 *    List<Element> any;
 *  }
 *  
 * 
 *  It can unmarshal instances like
 * 
 *  
 *  <foo xmlns:e="extra">
 *    <a>1
 *    <e:other />  // this will be bound to DOM, because unmarshalling is orderless
 *    <b>3
 *    <e:other />
 *    <c>5     // this will be bound to DOM, because the annotation doesn't remember namespaces.
 *  </foo>
 *  
 * 
 * 
 * 
 *  The following schema would produce the following Java class:
 *  
 *  <xs:complexType name="bar">
 *    <xs:complexContent>
 *    <xs:extension base="foo">
 *      <xs:sequence>
 *        <xs:element name="c" type="xs:int" />
 *        <xs:any namespace="##other" processContents="lax" minOccurs="0" maxOccurs="unbounded" />
 *      </xs:sequence>
 *    </xs:extension>
 *  </xs:complexType>
 *  
 * 
 *  
 *  class Bar extends Foo {
 *    int c;
 *    // Foo.getAny() also represents wildcard content for type definition bar.
 *  }
 *  
 * 
 * 
 *  It can unmarshal instances like
 * 
 *  
 *  <bar xmlns:e="extra">
 *    <a>1
 *    <e:other />  // this will be bound to DOM, because unmarshalling is orderless
 *    <b>3
 *    <e:other />
 *    <c>5     // this now goes to Bar.c
 *    <e:other />  // this will go to Foo.any
 *  </bar>
 *  
 * 
 * 
 * 
 * 
 *  Using XmlAnyElement with XmlElementRef
 *  
 *  The XmlAnyElement annotation can be used with XmlElementRefs to
 *  designate additional elements that can participate in the content tree.
 * 
 *  
 *  The following schema would produce the following Java class:
 *  
 *  <xs:complexType name="foo">
 *    <xs:choice maxOccurs="unbounded" minOccurs="0">
 *      <xs:element name="a" type="xs:int" />
 *      <xs:element name="b" type="xs:int" />
 *      <xs:any namespace="##other" processContents="lax" />
 *    </xs:choice>
 *  </xs:complexType>
 *  
 * 
 *  
 *  class Foo {
 *    @XmlAnyElement(lax="true")
 *    @XmlElementRefs({
 *      @XmlElementRef(name="a", type="JAXBElement.class")
 *      @XmlElementRef(name="b", type="JAXBElement.class")
 *    })
 *    List<Object> others;
 *  }
 * 
 *  @XmlRegistry
 *  class ObjectFactory {
 *    ...
 *    @XmlElementDecl(name = "a", namespace = "", scope = Foo.class)
 *    JAXBElement<Integer> createFooA( Integer i ) { ... }
 * 
 *    @XmlElementDecl(name = "b", namespace = "", scope = Foo.class)
 *    JAXBElement<Integer> createFooB( Integer i ) { ... }
 *  
 * 
 *  It can unmarshal instances like
 * 
 *  
 *  <foo xmlns:e="extra">
 *    <a>1     // this will unmarshal to a JAXBElement instance whose value is 1.
 *    <e:other />  // this will unmarshal to a DOM Element.
 *    <b>3     // this will unmarshal to a JAXBElement instance whose value is 1.
 *  </foo>
 *  
 * 
 * 
 * 
 * 
 *  W3C XML Schema "lax" wildcard emulation
 *  The lax element of the annotation enables the emulation of the "lax" wildcard semantics.
 *  For example, when the Java source code is annotated like this:
 *  
 *  @XmlRootElement
 *  class Foo {
 *    @XmlAnyElement(lax=true)
 *    public Object[] others;
 *  }
 *  
 *  then the following document will unmarshal like this:
 *  
 *  <foo>
 *    <unknown />
 *    <foo />
 *  </foo>
 * 
 *  Foo foo = unmarshal();
 *  // 1 for 'unknown', another for 'foo'
 *  assert foo.others.length==2;
 *  // 'unknown' unmarshals to a DOM element
 *  assert foo.others[0] instanceof Element;
 *  // because of lax=true, the 'foo' element eagerly
 *  // unmarshals to a Foo object.
 *  assert foo.others[1] instanceof Foo;
 *  
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlAnyElement extends StaticAnnotation {

    /** Controls the unmarshaller behavior when it sees elements
     *  known to the current JAXBContext.
     */
    @stub
    val lax: Boolean = ???
}
