package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Generates a wrapper element around XML representation.
 * 
 *  This is primarily intended to be used to produce a wrapper
 *  XML element around collections. The annotation therefore supports
 *  two forms of serialization shown below.
 * 
 *  
 *     //Example: code fragment
 *       int[] names;
 * 
 *     // XML Serialization Form 1 (Unwrapped collection)
 *     <names> ... </names>
 *     <names> ... </names>
 * 
 *     // XML Serialization Form 2 ( Wrapped collection )
 *     <wrapperElement>
 *        <names> value-of-item </names>
 *        <names> value-of-item </names>
 *        ....
 *     </wrapperElement>
 *  
 * 
 *   The two serialized XML forms allow a null collection to be
 *  represented either by absence or presence of an element with a
 *  nillable attribute.
 * 
 *   Usage 
 *  
 *  The @XmlElementWrapper annotation can be used with the
 *  following program elements:
 *  
 *     JavaBean property 
 *     non static, non transient field 
 *  
 * 
 *  The usage is subject to the following constraints:
 *  
 *     The property must be a collection property 
 *     This annotation can be used with the following annotations:
 *             XmlElement,
 *             XmlElements,
 *             XmlElementRef,
 *             XmlElementRefs,
 *             XmlJavaTypeAdapter.
 *  
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 */
@Retention(value=RUNTIME)
@Target(value={FIELD,METHOD})
final class XmlElementWrapper extends StaticAnnotation {

    /** Name of the XML wrapper element. */
    @stub
    val name: String = ???

    /** XML target namespace of the XML wrapper element. */
    @stub
    val namespace: String = ???

    /** If true, the absence of the collection is represented by
     *  using xsi:nil='true'.
     */
    @stub
    val nillable: Boolean = ???

    /** Customize the wrapper element declaration to be required. */
    @stub
    val required: Boolean = ???
}
