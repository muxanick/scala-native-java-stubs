package javax.lang.model.element

import java.lang.Object

// Represents a value of an annotation type element.
// A value is of one of the following types:
//  a wrapper class (such as Integer) for a primitive type
//      String
//      TypeMirror
//      VariableElement (representing an enum constant)
//      AnnotationMirror
//      List<? extends AnnotationValue>
//              (representing the elements, in declared order, if the value is an array)
// 
trait AnnotationValue {

    @stub
    // Applies a visitor to this value.
    def R: [R, P] = ???

    @stub
    // Returns the value.
    def getValue(): Object = ???
}
