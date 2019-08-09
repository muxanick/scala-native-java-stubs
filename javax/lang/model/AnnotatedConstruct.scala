package javax.lang.model

import java.lang.Class
import java.lang.annotation.Annotation
import java.util.List
import javax.lang.model.element.AnnotationMirror

// Represents a construct that can be annotated.
//
// A construct is either an element or a type.  Annotations on an element
// are on a declaration, whereas annotations on a type are on
// a specific use of a type name.
//
// The terms directly present, present,
// indirectly present, and associated  are used
// throughout this interface to describe precisely which annotations
// are returned by the methods defined herein.
//
// In the definitions below, an annotation A has an
// annotation type AT. If AT is a repeatable annotation
// type, the type of the containing annotation is ATC.
//
// Annotation A is directly present on a construct
// C if either:
//
// 
//
// A is explicitly or implicitly declared as applying to
// the source code representation of C.
//
// Typically, if exactly one annotation of type AT appears in
// the source code of representation of C, then A is
// explicitly declared as applying to C.
//
// If there are multiple annotations of type AT present on
// C, then if AT is repeatable annotation type, an
// annotation of type ATC is implicitly declared on C.
//
//  A representation of A appears in the executable output
// for C, such as the RuntimeVisibleAnnotations or
// RuntimeVisibleParameterAnnotations attributes of a class
// file.
//
// 
//
// An annotation A is present on a
// construct C if either:
// 
//
// A is directly present on C.
//
// No annotation of type AT is directly present on
// C, and C is a class and AT is inheritable
// and A is present on the superclass of C.
//
// 
//
// An annotation A is indirectly present on a construct
// C if both:
//
// 
//
// AT is a repeatable annotation type with a containing
// annotation type ATC.
//
// An annotation of type ATC is directly present on
// C and A is an annotation included in the result of
// calling the value method of the directly present annotation
// of type ATC.
//
// 
//
// An annotation A is associated with a construct
// C if either:
//
// 
//
//  A is directly or indirectly present on C.
//
//  No annotation of type AT is directly or indirectly
// present on C, and C is a class, and AT is
// inheritable, and A is associated with the superclass of
// C.
//
// 
trait AnnotatedConstruct {

    @stub
    // Returns this construct's annotation of the specified type if
    // such an annotation is present, else null.
    def A: [A <: Annotation] = ???

    @stub
    // Returns the annotations that are directly present on
    // this construct.
    def getAnnotationMirrors(): List[_ <: AnnotationMirror] = ???
}
