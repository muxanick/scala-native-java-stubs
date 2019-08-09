package javax.xml.bind.annotation.adapters

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** 
 *  A container for multiple @XmlJavaTypeAdapter annotations.
 * 
 *   Multiple annotations of the same type are not allowed on a program
 *  element. This annotation therefore serves as a container annotation
 *  for multiple @XmlJavaTypeAdapter as follows:
 * 
 *  
 *  @XmlJavaTypeAdapters ({ @XmlJavaTypeAdapter(...),@XmlJavaTypeAdapter(...) })
 *  
 * 
 *  The @XmlJavaTypeAdapters annnotation is useful for
 *  defining XmlJavaTypeAdapter annotations for different types
 *  at the package level.
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 */
@Retention ( value = RUNTIME ) 
@Target ( value = PACKAGE ) 
 final class XmlJavaTypeAdapters extends StaticAnnotation {

    /** Collection of @XmlJavaTypeAdapter annotations */
    @stub
    val value: Array[XmlJavaTypeAdapter] = ???
}
