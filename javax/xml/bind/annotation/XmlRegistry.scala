package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Marks a class that has XmlElementDecls. */
@Retention ( value = RUNTIME ) 
@Target ( value = TYPE ) 
 final class XmlRegistry extends StaticAnnotation {
}
