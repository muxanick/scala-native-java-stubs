package javax.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// The Resource annotation marks a resource that is needed
// by the application.  This annotation may be applied to an
// application component class, or to fields or methods of the
// component class.  When the annotation is applied to a
// field or method, the container will inject an instance
// of the requested resource into the application component
// when the component is initialized.  If the annotation is
// applied to the component class, the annotation declares a
// resource that the application will look up at runtime. 
//
// Even though this annotation is not marked Inherited, deployment
// tools are required to examine all superclasses of any component
// class to discover all uses of this annotation in all superclasses.
// All such annotation instances specify resources that are needed
// by the application component.  Note that this annotation may
// appear on private fields and methods of superclasses; the container
// is required to perform injection in these cases as well.
@Target ( value ={ TYPE , FIELD , METHOD } ) @Retention ( value = RUNTIME ) @interface Resource {

    @stub
    // The authentication type to use for this resource.
    def authenticationType: Resource.AuthenticationType = ???

    @stub
    // Description of this resource.
    def description: String = ???

    @stub
    // The name of the resource that the reference points to.
    def lookup: String = ???

    @stub
    // A product specific name that this resource should be mapped to.
    def mappedName: String = ???

    @stub
    // The JNDI name of the resource.
    def name: String = ???

    @stub
    // Indicates whether this resource can be shared between
    // this component and other components.
    def shareable: Boolean = ???
}
