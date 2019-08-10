package javax.annotation

import java.lang.{Class, String}
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** The Resource annotation marks a resource that is needed
 *  by the application.  This annotation may be applied to an
 *  application component class, or to fields or methods of the
 *  component class.  When the annotation is applied to a
 *  field or method, the container will inject an instance
 *  of the requested resource into the application component
 *  when the component is initialized.  If the annotation is
 *  applied to the component class, the annotation declares a
 *  resource that the application will look up at runtime. 
 * 
 *  Even though this annotation is not marked Inherited, deployment
 *  tools are required to examine all superclasses of any component
 *  class to discover all uses of this annotation in all superclasses.
 *  All such annotation instances specify resources that are needed
 *  by the application component.  Note that this annotation may
 *  appear on private fields and methods of superclasses; the container
 *  is required to perform injection in these cases as well.
 */
@Target(value={TYPE,FIELD,METHOD})
@Retention(value=RUNTIME)
final class Resource extends StaticAnnotation {

    /** The authentication type to use for this resource. */
    @stub
    val authenticationType: Resource.AuthenticationType = ???

    /** Description of this resource. */
    @stub
    val description: String = ???

    /** The name of the resource that the reference points to. */
    @stub
    val lookup: String = ???

    /** A product specific name that this resource should be mapped to. */
    @stub
    val mappedName: String = ???

    /** The JNDI name of the resource. */
    @stub
    val name: String = ???

    /** Indicates whether this resource can be shared between
     *  this component and other components.
     */
    @stub
    val shareable: Boolean = ???

    /** The Java type of the resource. */
    @stub
    val type: Class[_] = ???
}
