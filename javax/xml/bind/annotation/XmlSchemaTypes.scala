package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** 
 *  A container for multiple @XmlSchemaType annotations.
 * 
 *   Multiple annotations of the same type are not allowed on a program
 *  element. This annotation therefore serves as a container annotation
 *  for multiple @XmlSchemaType annotations as follows:
 * 
 *  
 *  @XmlSchemaTypes({ @XmlSchemaType(...), @XmlSchemaType(...) })
 *  
 *  The @XmlSchemaTypes annnotation can be used to
 *  define XmlSchemaType for different types at the
 *  package level.
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 */
@Retention(value=RUNTIME)
@Target(value=PACKAGE)
final class XmlSchemaTypes extends StaticAnnotation {

    /** Collection of @XmlSchemaType annotations */
    @stub
    val value: Array[XmlSchemaType] = ???
}
