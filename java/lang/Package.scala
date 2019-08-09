package java.lang

import java.lang.annotation.Annotation
import java.lang.reflect.AnnotatedElement
import java.net.URL

// Package objects contain version information
// about the implementation and specification of a Java package.
// This versioning information is retrieved and made available
// by the ClassLoader instance that
// loaded the class(es).  Typically, it is stored in the manifest that is
// distributed with the classes.
//
// The set of classes that make up the package may implement a
// particular specification and if so the specification title, version number,
// and vendor strings identify that specification.
// An application can ask if the package is
// compatible with a particular version, see the isCompatibleWith
// method for details.
//
// Specification version numbers use a syntax that consists of nonnegative
// decimal integers separated by periods ".", for example "2.0" or
// "1.2.3.4.5.6.7".  This allows an extensible number to be used to represent
// major, minor, micro, etc. versions.  The version specification is described
// by the following formal grammar:
// 
// 
// SpecificationVersion:
// Digits RefinedVersionopt
//
// RefinedVersion:
// . Digits
// . Digits RefinedVersion
//
// Digits:
// Digit
// Digits
//
// Digit:
// any character for which Character.isDigit(char) returns true,
// e.g. 0, 1, 2, ...
// 
// 
//
// The implementation title, version, and vendor strings identify an
// implementation and are made available conveniently to enable accurate
// reporting of the packages involved when a problem occurs. The contents
// all three implementation strings are vendor specific. The
// implementation version strings have no specified syntax and should
// only be compared for equality with desired version identifiers.
//
// Within each ClassLoader instance all classes from the same
// java package have the same Package object.  The static methods allow a package
// to be found by name or the set of all packages known to the current class
// loader to be found.
class Package extends Object with AnnotatedElement {

    @stub
    // Returns this element's annotation for the specified type if
    // such an annotation is present, else null.
    def A: [A <: Annotation] = ???

    @stub
    // Returns annotations that are present on this element.
    def getAnnotations(): Array[Annotation] = ???

    @stub
    // Returns annotations that are associated with this element.
    def Array[A]: [A <: Annotation] = ???

    @stub
    // Returns this element's annotation for the specified type if
    // such an annotation is directly present, else null.
    def A: [A <: Annotation] = ???

    @stub
    // Returns annotations that are directly present on this element.
    def getDeclaredAnnotations(): Array[Annotation] = ???

    @stub
    // Returns this element's annotation(s) for the specified type if
    // such annotations are either directly present or
    // indirectly present.
    def Array[A]: [A <: Annotation] = ???

    @stub
    // Return the title of this package.
    def getImplementationTitle(): String = ???

    @stub
    // Returns the name of the organization,
    // vendor or company that provided this implementation.
    def getImplementationVendor(): String = ???

    @stub
    // Return the version of this implementation.
    def getImplementationVersion(): String = ???

    @stub
    // Return the name of this package.
    def getName(): String = ???

    @stub
    // Return the title of the specification that this package implements.
    def getSpecificationTitle(): String = ???

    @stub
    // Return the name of the organization, vendor,
    // or company that owns and maintains the specification
    // of the classes that implement this package.
    def getSpecificationVendor(): String = ???

    @stub
    // Returns the version number of the specification
    // that this package implements.
    def getSpecificationVersion(): String = ???

    @stub
    // Return the hash code computed from the package name.
    def hashCode(): Int = ???

    @stub
    // Returns true if an annotation for the specified type
    // is present on this element, else false.
    def isAnnotationPresent(annotationClass: Class[_ <: Annotation]): Boolean = ???

    @stub
    // Compare this package's specification version with a
    // desired version.
    def isCompatibleWith(desired: String): Boolean = ???

    @stub
    // Returns true if this package is sealed.
    def isSealed(): Boolean = ???

    @stub
    // Returns true if this package is sealed with respect to the specified
    // code source url.
    def isSealed(url: URL): Boolean = ???
}

object Package {
    @stub
    // Find a package by name in the callers ClassLoader instance.
    def getPackage(name: String): Package = ???

    @stub
    // Get all the packages currently known for the caller's ClassLoader
    // instance.
    def getPackages(): Array[Package] = ???
}
