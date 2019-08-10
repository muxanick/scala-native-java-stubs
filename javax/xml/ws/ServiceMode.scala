package javax.xml.ws

import java.lang.annotation.{Documented, ElementType, Inherited, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Used to indicate whether a Provider implementation wishes to work
 *  with entire protocol messages or just with protocol message payloads.
 */
@Target(value=TYPE)
@Retention(value=RUNTIME)
@Inherited
@Documented
final class ServiceMode extends StaticAnnotation {

    /** Service mode. */
    @stub
    val value: Service.Mode = ???
}
