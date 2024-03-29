package javax.annotation

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** The PostConstruct annotation is used on a method that needs to be executed
 *  after dependency injection is done to perform any initialization. This
 *  method MUST be invoked before the class is put into service. This
 *  annotation MUST be supported on all classes that support dependency
 *  injection. The method annotated with PostConstruct MUST be invoked even
 *  if the class does not request any resources to be injected. Only one
 *  method can be annotated with this annotation. The method on which the
 *  PostConstruct annotation is applied MUST fulfill all of the following
 *  criteria:
 *  
 *  
 *  The method MUST NOT have any parameters except in the case of
 *  interceptors in which case it takes an InvocationContext object as
 *  defined by the Interceptors specification.
 *  The method defined on an interceptor class MUST HAVE one of the
 *  following signatures:
 *  
 *  void <METHOD>(InvocationContext)
 *  
 *  Object <METHOD>(InvocationContext) throws Exception
 *  
 *  Note: A PostConstruct interceptor method must not throw application
 *  exceptions, but it may be declared to throw checked exceptions including
 *  the java.lang.Exception if the same interceptor method interposes on
 *  business or timeout methods in addition to lifecycle events. If a
 *  PostConstruct interceptor method returns a value, it is ignored by
 *  the container.
 *  
 *  The method defined on a non-interceptor class MUST HAVE the
 *  following signature:
 *  
 *  void <METHOD>()
 *  
 *  The method on which PostConstruct is applied MAY be public, protected,
 *  package private or private.
 *  The method MUST NOT be static except for the application client.
 *  The method MAY be final.
 *  If the method throws an unchecked exception the class MUST NOT be put into
 *  service except in the case of EJBs where the EJB can handle exceptions and
 *  even recover from them.
 */
@Documented
@Retention(value=RUNTIME)
@Target(value=METHOD)
final class PostConstruct extends StaticAnnotation {
}
