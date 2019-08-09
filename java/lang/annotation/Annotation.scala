package java.lang.annotation

import java.lang.{Class, Object}

/** The common interface extended by all annotation types.  Note that an
 *  interface that manually extends this one does not define
 *  an annotation type.  Also note that this interface does not itself
 *  define an annotation type.
 * 
 *  More information about annotation types can be found in section 9.6 of
 *  The Java™ Language Specification.
 * 
 *  The AnnotatedElement interface discusses
 *  compatibility concerns when evolving an annotation type from being
 *  non-repeatable to being repeatable.
 */
trait Annotation {

    /** Returns the annotation type of this annotation. */
    @stub
    def annotationType(): Class[_ <: Annotation] = ???

    /** Returns true if the specified object represents an annotation
     *  that is logically equivalent to this one.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the hash code of this annotation, as defined below: */
    @stub
    def hashCode(): Int = ???
}
