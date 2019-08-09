package java.lang

import java.io.{InputStream, Serializable}
import java.lang.annotation.Annotation
import java.lang.reflect.{AnnotatedElement, AnnotatedType, Constructor, Field, GenericDeclaration, Method, Type, TypeVariable}
import java.net.URL
import java.security.ProtectionDomain

/** Instances of the class Class represent classes and
 *  interfaces in a running Java application.  An enum is a kind of
 *  class and an annotation is a kind of interface.  Every array also
 *  belongs to a class that is reflected as a Class object
 *  that is shared by all arrays with the same element type and number
 *  of dimensions.  The primitive Java types (boolean,
 *  byte, char, short,
 *  int, long, float, and
 *  double), and the keyword void are also
 *  represented as Class objects.
 * 
 *   Class has no public constructor. Instead Class
 *  objects are constructed automatically by the Java Virtual Machine as classes
 *  are loaded and by calls to the defineClass method in the class
 *  loader.
 * 
 *   The following example uses a Class object to print the
 *  class name of an object:
 * 
 *  
 *      void printClassName(Object obj) {
 *          System.out.println("The class of " + obj +
 *                             " is " + obj.getClass().getName());
 *      }
 *  
 * 
 *   It is also possible to get the Class object for a named
 *  type (or for void) using a class literal.  See Section 15.8.2 of
 *  The Java™ Language Specification.
 *  For example:
 * 
 *  
 *      System.out.println("The name of class Foo is: "+Foo.class.getName());
 *  
 */
final class Class[T] extends Object with Serializable with GenericDeclaration with Type with AnnotatedElement {

    /** Casts this Class object to represent a subclass of the class
     *  represented by the specified class object.
     */
    @stub
    def asSubclass[U](clazz: Class[U]): Class[_ <: U] = ???

    /** Casts an object to the class or interface represented
     *  by this Class object.
     */
    @stub
    def cast(obj: Object): T = ???

    /** Returns the assertion status that would be assigned to this
     *  class if it were to be initialized at the time this method is invoked.
     */
    @stub
    def desiredAssertionStatus(): Boolean = ???

    /** Returns an array of AnnotatedType objects that represent the use
     *  of types to specify superinterfaces of the entity represented by this
     *  Class object.
     */
    @stub
    def getAnnotatedInterfaces(): Array[AnnotatedType] = ???

    /** Returns an AnnotatedType object that represents the use of a
     *  type to specify the superclass of the entity represented by this Class object.
     */
    @stub
    def getAnnotatedSuperclass(): AnnotatedType = ???

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

    /** Returns the canonical name of the underlying class as
     *  defined by the Java Language Specification.
     */
    @stub
    def getCanonicalName(): String = ???

    /** Returns an array containing Class objects representing all
     *  the public classes and interfaces that are members of the class
     *  represented by this Class object.
     */
    @stub
    def getClasses(): Array[Class[_]] = ???

    /** Returns the class loader for the class. */
    @stub
    def getClassLoader(): ClassLoader = ???

    /** Returns the Class representing the component type of an
     *  array.
     */
    @stub
    def getComponentType(): Class[_] = ???

    /** Returns a Constructor object that reflects the specified
     *  public constructor of the class represented by this Class
     *  object.
     */
    @stub
    def getConstructor(parameterTypes: Class[_]*): Constructor[T] = ???

    /** Returns an array containing Constructor objects reflecting
     *  all the public constructors of the class represented by this
     *  Class object.
     */
    @stub
    def getConstructors(): Array[Constructor[_]] = ???

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

    /** Returns an array of Class objects reflecting all the
     *  classes and interfaces declared as members of the class represented by
     *  this Class object.
     */
    @stub
    def getDeclaredClasses(): Array[Class[_]] = ???

    /** Returns a Constructor object that reflects the specified
     *  constructor of the class or interface represented by this
     *  Class object.
     */
    @stub
    def getDeclaredConstructor(parameterTypes: Class[_]*): Constructor[T] = ???

    /** Returns an array of Constructor objects reflecting all the
     *  constructors declared by the class represented by this
     *  Class object.
     */
    @stub
    def getDeclaredConstructors(): Array[Constructor[_]] = ???

    /** Returns a Field object that reflects the specified declared
     *  field of the class or interface represented by this Class
     *  object.
     */
    @stub
    def getDeclaredField(name: String): Field = ???

    /** Returns an array of Field objects reflecting all the fields
     *  declared by the class or interface represented by this
     *  Class object.
     */
    @stub
    def getDeclaredFields(): Array[Field] = ???

    /** Returns a Method object that reflects the specified
     *  declared method of the class or interface represented by this
     *  Class object.
     */
    @stub
    def getDeclaredMethod(name: String, parameterTypes: Class[_]*): Method = ???

    /** Returns an array containing Method objects reflecting all the
     *  declared methods of the class or interface represented by this Class object, including public, protected, default (package)
     *  access, and private methods, but excluding inherited methods.
     */
    @stub
    def getDeclaredMethods(): Array[Method] = ???

    /** If the class or interface represented by this Class object
     *  is a member of another class, returns the Class object
     *  representing the class in which it was declared.
     */
    @stub
    def getDeclaringClass(): Class[_] = ???

    /** Returns the immediately enclosing class of the underlying
     *  class.
     */
    @stub
    def getEnclosingClass(): Class[_] = ???

    /** If this Class object represents a local or anonymous
     *  class within a constructor, returns a Constructor object representing
     *  the immediately enclosing constructor of the underlying
     *  class.
     */
    @stub
    def getEnclosingConstructor(): Constructor[_] = ???

    /** If this Class object represents a local or anonymous
     *  class within a method, returns a Method object representing the
     *  immediately enclosing method of the underlying class.
     */
    @stub
    def getEnclosingMethod(): Method = ???

    /** Returns the elements of this enum class or null if this
     *  Class object does not represent an enum type.
     */
    @stub
    def getEnumConstants(): Array[T] = ???

    /** Returns a Field object that reflects the specified public member
     *  field of the class or interface represented by this Class
     *  object.
     */
    @stub
    def getField(name: String): Field = ???

    /** Returns an array containing Field objects reflecting all
     *  the accessible public fields of the class or interface represented by
     *  this Class object.
     */
    @stub
    def getFields(): Array[Field] = ???

    /** Returns the Types representing the interfaces
     *  directly implemented by the class or interface represented by
     *  this object.
     */
    @stub
    def getGenericInterfaces(): Array[Type] = ???

    /** Returns the Type representing the direct superclass of
     *  the entity (class, interface, primitive type or void) represented by
     *  this Class.
     */
    @stub
    def getGenericSuperclass(): Type = ???

    /** Determines the interfaces implemented by the class or interface
     *  represented by this object.
     */
    @stub
    def getInterfaces(): Array[Class[_]] = ???

    /** Returns a Method object that reflects the specified public
     *  member method of the class or interface represented by this
     *  Class object.
     */
    @stub
    def getMethod(name: String, parameterTypes: Class[_]*): Method = ???

    /** Returns an array containing Method objects reflecting all the
     *  public methods of the class or interface represented by this Class object, including those declared by the class or interface and
     *  those inherited from superclasses and superinterfaces.
     */
    @stub
    def getMethods(): Array[Method] = ???

    /** Returns the Java language modifiers for this class or interface, encoded
     *  in an integer.
     */
    @stub
    def getModifiers(): Int = ???

    /** Returns the  name of the entity (class, interface, array class,
     *  primitive type, or void) represented by this Class object,
     *  as a String.
     */
    @stub
    def getName(): String = ???

    /** Gets the package for this class. */
    @stub
    def getPackage(): Package = ???

    /** Returns the ProtectionDomain of this class. */
    @stub
    def getProtectionDomain(): ProtectionDomain = ???

    /** Finds a resource with a given name. */
    @stub
    def getResource(name: String): URL = ???

    /** Finds a resource with a given name. */
    @stub
    def getResourceAsStream(name: String): InputStream = ???

    /** Gets the signers of this class. */
    @stub
    def getSigners(): Array[Object] = ???

    /** Returns the simple name of the underlying class as given in the
     *  source code.
     */
    @stub
    def getSimpleName(): String = ???

    /** Returns the Class representing the superclass of the entity
     *  (class, interface, primitive type or void) represented by this
     *  Class.
     */
    @stub
    def getSuperclass(): Class[_ >: T] = ???

    /** Return an informative string for the name of this type. */
    @stub
    def getTypeName(): String = ???

    /** Returns an array of TypeVariable objects that represent the
     *  type variables declared by the generic declaration represented by this
     *  GenericDeclaration object, in declaration order.
     */
    @stub
    def getTypeParameters(): Array[TypeVariable[Class[T]]] = ???

    /** Returns true if this Class object represents an annotation
     *  type.
     */
    @stub
    def isAnnotation(): Boolean = ???

    /** Returns true if an annotation for the specified type
     *  is present on this element, else false.
     */
    @stub
    def isAnnotationPresent(annotationClass: Class[_ <: Annotation]): Boolean = ???

    /** Returns true if and only if the underlying class
     *  is an anonymous class.
     */
    @stub
    def isAnonymousClass(): Boolean = ???

    /** Determines if this Class object represents an array class. */
    @stub
    def isArray(): Boolean = ???

    /** Determines if the class or interface represented by this
     *  Class object is either the same as, or is a superclass or
     *  superinterface of, the class or interface represented by the specified
     *  Class parameter.
     */
    @stub
    def isAssignableFrom(cls: Class[_]): Boolean = ???

    /** Returns true if and only if this class was declared as an enum in the
     *  source code.
     */
    @stub
    def isEnum(): Boolean = ???

    /** Determines if the specified Object is assignment-compatible
     *  with the object represented by this Class.
     */
    @stub
    def isInstance(obj: Object): Boolean = ???

    /** Determines if the specified Class object represents an
     *  interface type.
     */
    @stub
    def isInterface(): Boolean = ???

    /** Returns true if and only if the underlying class
     *  is a local class.
     */
    @stub
    def isLocalClass(): Boolean = ???

    /** Returns true if and only if the underlying class
     *  is a member class.
     */
    @stub
    def isMemberClass(): Boolean = ???

    /** Determines if the specified Class object represents a
     *  primitive type.
     */
    @stub
    def isPrimitive(): Boolean = ???

    /** Returns true if this class is a synthetic class;
     *  returns false otherwise.
     */
    @stub
    def isSynthetic(): Boolean = ???

    /** Creates a new instance of the class represented by this Class
     *  object.
     */
    @stub
    def newInstance(): T = ???

    /** Returns a string describing this Class, including
     *  information about modifiers and type parameters.
     */
    @stub
    def toGenericString(): String = ???
}

object Class {
    /** Returns the Class object associated with the class or
     *  interface with the given string name.
     */
    @stub
    def forName(className: String): Class[_] = ???

    /** Returns the Class object associated with the class or
     *  interface with the given string name, using the given class loader.
     */
    @stub
    def forName(name: String, initialize: Boolean, loader: ClassLoader): Class[_] = ???
}
