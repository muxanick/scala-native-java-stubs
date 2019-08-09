package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Marks a property that refers to classes with XmlElement
 *  or JAXBElement.
 * 
 *  
 *  Compared to an element property (property with XmlElement
 *  annotation), a reference property has a different substitution semantics.
 *  When a sub-class is assigned to a property, an element property produces
 *  the same tag name with @xsi:type, whereas a reference property produces
 *  a different tag name (the tag name that's on the the sub-class.)
 * 
 *   This annotation can be used with the following annotations:
 *  XmlJavaTypeAdapter, XmlElementWrapper.
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlElementRefs extends StaticAnnotation {

    /**  */
    @stub
    val value: Array[XmlElementRef] = ???
}
