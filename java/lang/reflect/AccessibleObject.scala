package java.lang.reflect

import java.lang.{Class, Object}
import java.lang.annotation.Annotation

/** The AccessibleObject class is the base class for Field, Method and
 *  Constructor objects.  It provides the ability to flag a reflected
 *  object as suppressing default Java language access control checks
 *  when it is used.  The access checks--for public, default (package)
 *  access, protected, and private members--are performed when Fields,
 *  Methods or Constructors are used to set or get fields, to invoke
 *  methods, or to create and initialize new instances of classes,
 *  respectively.
 * 
 *  Setting the accessible flag in a reflected object
 *  permits sophisticated applications with sufficient privilege, such
 *  as Java Object Serialization or other persistence mechanisms, to
 *  manipulate objects in a manner that would normally be prohibited.
 * 
 *  By default, a reflected object is not accessible.
 */
class AccessibleObject extends Object with AnnotatedElement {

    /** Returns this element's annotation for the specified type if
     *  such an annotation is present, else null.
     */
    @stub
    def getAnnotation[T <: Annotation](annotationClass: Class[T]): T = ???

    /** Returns annotations that are present on this element. */
    @stub
    def getAnnotations(): Array[Annotation] = ???

    /** Returns annotations that are associated with this element. */
    @stub
    def getAnnotationsByType[T <: Annotation](annotationClass: Class[T]): Array[T] = ???

    /** Returns this element's annotation for the specified type if
     *  such an annotation is directly present, else null.
     */
    @stub
    def getDeclaredAnnotation[T <: Annotation](annotationClass: Class[T]): T = ???

    /** Returns annotations that are directly present on this element. */
    @stub
    def getDeclaredAnnotations(): Array[Annotation] = ???

    /** Returns this element's annotation(s) for the specified type if
     *  such annotations are either directly present or
     *  indirectly present.
     */
    @stub
    def getDeclaredAnnotationsByType[T <: Annotation](annotationClass: Class[T]): Array[T] = ???

    /** Get the value of the accessible flag for this object. */
    @stub
    def isAccessible(): Boolean = ???

    /** Returns true if an annotation for the specified type
     *  is present on this element, else false.
     */
    @stub
    def isAnnotationPresent(annotationClass: Class[_ <: Annotation]): Boolean = ???
}

object AccessibleObject {
    /** Convenience method to set the accessible flag for an
     *  array of objects with a single security check (for efficiency).
     */
    @stub
    def setAccessible(array: Array[AccessibleObject], flag: Boolean): Unit = ???
}
