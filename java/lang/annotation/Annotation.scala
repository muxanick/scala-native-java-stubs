package java.lang.annotation

import java.lang.{Class, Object}

// The common interface extended by all annotation types.  Note that an
// interface that manually extends this one does not define
// an annotation type.  Also note that this interface does not itself
// define an annotation type.
//
// More information about annotation types can be found in section 9.6 of
// The Java™ Language Specification.
//
// The AnnotatedElement interface discusses
// compatibility concerns when evolving an annotation type from being
// non-repeatable to being repeatable.
trait Annotation {

    @stub
    // Returns the annotation type of this annotation.
    def annotationType(): Class[_ <: Annotation] = ???

    @stub
    // Returns true if the specified object represents an annotation
    // that is logically equivalent to this one.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code of this annotation, as defined below:
    def hashCode(): Int = ???
}
