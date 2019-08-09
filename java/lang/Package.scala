package java.lang

import java.lang.annotation.Annotation
import java.lang.reflect.AnnotatedElement
import java.net.URL

/** Package objects contain version information
 *  about the implementation and specification of a Java package.
 *  This versioning information is retrieved and made available
 *  by the ClassLoader instance that
 *  loaded the class(es).  Typically, it is stored in the manifest that is
 *  distributed with the classes.
 * 
 *  The set of classes that make up the package may implement a
 *  particular specification and if so the specification title, version number,
 *  and vendor strings identify that specification.
 *  An application can ask if the package is
 *  compatible with a particular version, see the isCompatibleWith
 *  method for details.
 * 
 *  Specification version numbers use a syntax that consists of nonnegative
 *  decimal integers separated by periods ".", for example "2.0" or
 *  "1.2.3.4.5.6.7".  This allows an extensible number to be used to represent
 *  major, minor, micro, etc. versions.  The version specification is described
 *  by the following formal grammar:
 *  
 *  
 *  SpecificationVersion:
 *  Digits RefinedVersionopt
 * 
 *  RefinedVersion:
 *  . Digits
 *  . Digits RefinedVersion
 * 
 *  Digits:
 *  Digit
 *  Digits
 * 
 *  Digit:
 *  any character for which Character.isDigit(char) returns true,
 *  e.g. 0, 1, 2, ...
 *  
 *  
 * 
 *  The implementation title, version, and vendor strings identify an
 *  implementation and are made available conveniently to enable accurate
 *  reporting of the packages involved when a problem occurs. The contents
 *  all three implementation strings are vendor specific. The
 *  implementation version strings have no specified syntax and should
 *  only be compared for equality with desired version identifiers.
 * 
 *  Within each ClassLoader instance all classes from the same
 *  java package have the same Package object.  The static methods allow a package
 *  to be found by name or the set of all packages known to the current class
 *  loader to be found.
 */
class Package extends Object with AnnotatedElement {

    /** Returns this element's annotation for the specified type if
     *  such an annotation is present, else null.
     */
    @stub
    def getAnnotation[A <: Annotation](annotationClass: Class[A]): A = ???

    /** Returns annotations that are present on this element. */
    @stub
    def getAnnotations(): Array[Annotation] = ???

    /** Returns annotations that are associated with this element. */
    @stub
    def getAnnotationsByType[A <: Annotation](annotationClass: Class[A]): Array[A] = ???

    /** Returns this element's annotation for the specified type if
     *  such an annotation is directly present, else null.
     */
    @stub
    def getDeclaredAnnotation[A <: Annotation](annotationClass: Class[A]): A = ???

    /** Returns annotations that are directly present on this element. */
    @stub
    def getDeclaredAnnotations(): Array[Annotation] = ???

    /** Returns this element's annotation(s) for the specified type if
     *  such annotations are either directly present or
     *  indirectly present.
     */
    @stub
    def getDeclaredAnnotationsByType[A <: Annotation](annotationClass: Class[A]): Array[A] = ???

    /** Return the title of this package. */
    @stub
    def getImplementationTitle(): String = ???

    /** Returns the name of the organization,
     *  vendor or company that provided this implementation.
     */
    @stub
    def getImplementationVendor(): String = ???

    /** Return the version of this implementation. */
    @stub
    def getImplementationVersion(): String = ???

    /** Return the name of this package. */
    @stub
    def getName(): String = ???

    /** Return the title of the specification that this package implements. */
    @stub
    def getSpecificationTitle(): String = ???

    /** Return the name of the organization, vendor,
     *  or company that owns and maintains the specification
     *  of the classes that implement this package.
     */
    @stub
    def getSpecificationVendor(): String = ???

    /** Returns the version number of the specification
     *  that this package implements.
     */
    @stub
    def getSpecificationVersion(): String = ???

    /** Return the hash code computed from the package name. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if an annotation for the specified type
     *  is present on this element, else false.
     */
    @stub
    def isAnnotationPresent(annotationClass: Class[_ <: Annotation]): Boolean = ???

    /** Compare this package's specification version with a
     *  desired version.
     */
    @stub
    def isCompatibleWith(desired: String): Boolean = ???

    /** Returns true if this package is sealed. */
    @stub
    def isSealed(): Boolean = ???

    /** Returns true if this package is sealed with respect to the specified
     *  code source url.
     */
    @stub
    def isSealed(url: URL): Boolean = ???
}

object Package {
    /** Find a package by name in the callers ClassLoader instance. */
    @stub
    def getPackage(name: String): Package = ???

    /** Get all the packages currently known for the caller's ClassLoader
     *  instance.
     */
    @stub
    def getPackages(): Array[Package] = ???
}
