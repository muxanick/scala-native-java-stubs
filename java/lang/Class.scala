package java.lang

import java.io.{InputStream, Serializable}
import java.lang.annotation.Annotation
import java.lang.reflect.{AnnotatedElement, AnnotatedType, Constructor, Field, GenericDeclaration, Method, Type, TypeVariable}
import java.net.URL
import java.security.ProtectionDomain

// Instances of the class Class represent classes and
// interfaces in a running Java application.  An enum is a kind of
// class and an annotation is a kind of interface.  Every array also
// belongs to a class that is reflected as a Class object
// that is shared by all arrays with the same element type and number
// of dimensions.  The primitive Java types (boolean,
// byte, char, short,
// int, long, float, and
// double), and the keyword void are also
// represented as Class objects.
//
//  Class has no public constructor. Instead Class
// objects are constructed automatically by the Java Virtual Machine as classes
// are loaded and by calls to the defineClass method in the class
// loader.
//
//  The following example uses a Class object to print the
// class name of an object:
//
// 
//     void printClassName(Object obj) {
//         System.out.println("The class of " + obj +
//                            " is " + obj.getClass().getName());
//     }
// 
//
//  It is also possible to get the Class object for a named
// type (or for void) using a class literal.  See Section 15.8.2 of
// The Java™ Language Specification.
// For example:
//
// 
//     System.out.println("The name of class Foo is: "+Foo.class.getName());
// 
final class Class[T] extends Object with Serializable, with GenericDeclaration, with Type, with AnnotatedElement {

    @stub
    // Casts this Class object to represent a subclass of the class
    // represented by the specified class object.
    def Class[_ <: U]: [U] = ???

    @stub
    // Casts an object to the class or interface represented
    // by this Class object.
    def cast(obj: Object): T = ???

    @stub
    // Returns the assertion status that would be assigned to this
    // class if it were to be initialized at the time this method is invoked.
    def desiredAssertionStatus(): Boolean = ???

    @stub
    // Returns an array of AnnotatedType objects that represent the use
    // of types to specify superinterfaces of the entity represented by this
    // Class object.
    def getAnnotatedInterfaces(): Array[AnnotatedType] = ???

    @stub
    // Returns an AnnotatedType object that represents the use of a
    // type to specify the superclass of the entity represented by this Class object.
    def getAnnotatedSuperclass(): AnnotatedType = ???

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
    // Returns the canonical name of the underlying class as
    // defined by the Java Language Specification.
    def getCanonicalName(): String = ???

    @stub
    // Returns an array containing Class objects representing all
    // the public classes and interfaces that are members of the class
    // represented by this Class object.
    def getClasses(): Array[Class[_]] = ???

    @stub
    // Returns the class loader for the class.
    def getClassLoader(): ClassLoader = ???

    @stub
    // Returns the Class representing the component type of an
    // array.
    def getComponentType(): Class[_] = ???

    @stub
    // Returns a Constructor object that reflects the specified
    // public constructor of the class represented by this Class
    // object.
    def getConstructor(parameterTypes: Class[_]*): Constructor[T] = ???

    @stub
    // Returns an array containing Constructor objects reflecting
    // all the public constructors of the class represented by this
    // Class object.
    def getConstructors(): Array[Constructor[_]] = ???

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
    // Returns an array of Class objects reflecting all the
    // classes and interfaces declared as members of the class represented by
    // this Class object.
    def getDeclaredClasses(): Array[Class[_]] = ???

    @stub
    // Returns a Constructor object that reflects the specified
    // constructor of the class or interface represented by this
    // Class object.
    def getDeclaredConstructor(parameterTypes: Class[_]*): Constructor[T] = ???

    @stub
    // Returns an array of Constructor objects reflecting all the
    // constructors declared by the class represented by this
    // Class object.
    def getDeclaredConstructors(): Array[Constructor[_]] = ???

    @stub
    // Returns a Field object that reflects the specified declared
    // field of the class or interface represented by this Class
    // object.
    def getDeclaredField(name: String): Field = ???

    @stub
    // Returns an array of Field objects reflecting all the fields
    // declared by the class or interface represented by this
    // Class object.
    def getDeclaredFields(): Array[Field] = ???

    @stub
    // Returns a Method object that reflects the specified
    // declared method of the class or interface represented by this
    // Class object.
    def getDeclaredMethod(name: String, parameterTypes: Class[_]*): Method = ???

    @stub
    // Returns an array containing Method objects reflecting all the
    // declared methods of the class or interface represented by this Class object, including public, protected, default (package)
    // access, and private methods, but excluding inherited methods.
    def getDeclaredMethods(): Array[Method] = ???

    @stub
    // If the class or interface represented by this Class object
    // is a member of another class, returns the Class object
    // representing the class in which it was declared.
    def getDeclaringClass(): Class[_] = ???

    @stub
    // Returns the immediately enclosing class of the underlying
    // class.
    def getEnclosingClass(): Class[_] = ???

    @stub
    // If this Class object represents a local or anonymous
    // class within a constructor, returns a Constructor object representing
    // the immediately enclosing constructor of the underlying
    // class.
    def getEnclosingConstructor(): Constructor[_] = ???

    @stub
    // If this Class object represents a local or anonymous
    // class within a method, returns a Method object representing the
    // immediately enclosing method of the underlying class.
    def getEnclosingMethod(): Method = ???

    @stub
    // Returns the elements of this enum class or null if this
    // Class object does not represent an enum type.
    def getEnumConstants(): Array[T] = ???

    @stub
    // Returns a Field object that reflects the specified public member
    // field of the class or interface represented by this Class
    // object.
    def getField(name: String): Field = ???

    @stub
    // Returns an array containing Field objects reflecting all
    // the accessible public fields of the class or interface represented by
    // this Class object.
    def getFields(): Array[Field] = ???

    @stub
    // Returns the Types representing the interfaces
    // directly implemented by the class or interface represented by
    // this object.
    def getGenericInterfaces(): Array[Type] = ???

    @stub
    // Returns the Type representing the direct superclass of
    // the entity (class, interface, primitive type or void) represented by
    // this Class.
    def getGenericSuperclass(): Type = ???

    @stub
    // Determines the interfaces implemented by the class or interface
    // represented by this object.
    def getInterfaces(): Array[Class[_]] = ???

    @stub
    // Returns a Method object that reflects the specified public
    // member method of the class or interface represented by this
    // Class object.
    def getMethod(name: String, parameterTypes: Class[_]*): Method = ???

    @stub
    // Returns an array containing Method objects reflecting all the
    // public methods of the class or interface represented by this Class object, including those declared by the class or interface and
    // those inherited from superclasses and superinterfaces.
    def getMethods(): Array[Method] = ???

    @stub
    // Returns the Java language modifiers for this class or interface, encoded
    // in an integer.
    def getModifiers(): Int = ???

    @stub
    // Returns the  name of the entity (class, interface, array class,
    // primitive type, or void) represented by this Class object,
    // as a String.
    def getName(): String = ???

    @stub
    // Gets the package for this class.
    def getPackage(): Package = ???

    @stub
    // Returns the ProtectionDomain of this class.
    def getProtectionDomain(): ProtectionDomain = ???

    @stub
    // Finds a resource with a given name.
    def getResource(name: String): URL = ???

    @stub
    // Finds a resource with a given name.
    def getResourceAsStream(name: String): InputStream = ???

    @stub
    // Gets the signers of this class.
    def getSigners(): Array[Object] = ???

    @stub
    // Returns the simple name of the underlying class as given in the
    // source code.
    def getSimpleName(): String = ???

    @stub
    // Returns the Class representing the superclass of the entity
    // (class, interface, primitive type or void) represented by this
    // Class.
    def getSuperclass(): Class[_ >: T] = ???

    @stub
    // Return an informative string for the name of this type.
    def getTypeName(): String = ???

    @stub
    // Returns an array of TypeVariable objects that represent the
    // type variables declared by the generic declaration represented by this
    // GenericDeclaration object, in declaration order.
    def getTypeParameters(): Array[TypeVariable[Class[T]]] = ???

    @stub
    // Returns true if this Class object represents an annotation
    // type.
    def isAnnotation(): Boolean = ???

    @stub
    // Returns true if an annotation for the specified type
    // is present on this element, else false.
    def isAnnotationPresent(annotationClass: Class[_ <: Annotation]): Boolean = ???

    @stub
    // Returns true if and only if the underlying class
    // is an anonymous class.
    def isAnonymousClass(): Boolean = ???

    @stub
    // Determines if this Class object represents an array class.
    def isArray(): Boolean = ???

    @stub
    // Determines if the class or interface represented by this
    // Class object is either the same as, or is a superclass or
    // superinterface of, the class or interface represented by the specified
    // Class parameter.
    def isAssignableFrom(cls: Class[_]): Boolean = ???

    @stub
    // Returns true if and only if this class was declared as an enum in the
    // source code.
    def isEnum(): Boolean = ???

    @stub
    // Determines if the specified Object is assignment-compatible
    // with the object represented by this Class.
    def isInstance(obj: Object): Boolean = ???

    @stub
    // Determines if the specified Class object represents an
    // interface type.
    def isInterface(): Boolean = ???

    @stub
    // Returns true if and only if the underlying class
    // is a local class.
    def isLocalClass(): Boolean = ???

    @stub
    // Returns true if and only if the underlying class
    // is a member class.
    def isMemberClass(): Boolean = ???

    @stub
    // Determines if the specified Class object represents a
    // primitive type.
    def isPrimitive(): Boolean = ???

    @stub
    // Returns true if this class is a synthetic class;
    // returns false otherwise.
    def isSynthetic(): Boolean = ???

    @stub
    // Creates a new instance of the class represented by this Class
    // object.
    def newInstance(): T = ???

    @stub
    // Returns a string describing this Class, including
    // information about modifiers and type parameters.
    def toGenericString(): String = ???
}

object Class {
    @stub
    // Returns the Class object associated with the class or
    // interface with the given string name.
    def forName(className: String): Class[_] = ???

    @stub
    // Returns the Class object associated with the class or
    // interface with the given string name, using the given class loader.
    def forName(name: String, initialize: Boolean, loader: ClassLoader): Class[_] = ???
}
