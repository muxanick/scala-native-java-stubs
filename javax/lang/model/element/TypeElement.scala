package javax.lang.model.element

import java.util.List
import javax.lang.model.type.TypeMirror
import scala.scalanative.annotation.stub

/** Represents a class or interface program element.  Provides access
 *  to information about the type and its members.  Note that an enum
 *  type is a kind of class and an annotation type is a kind of
 *  interface.
 * 
 *   
 *  While a TypeElement represents a class or interface
 *  element, a DeclaredType represents a class
 *  or interface type, the latter being a use
 *  (or invocation) of the former.
 *  The distinction is most apparent with generic types,
 *  for which a single element can define a whole
 *  family of types.  For example, the element
 *  java.util.Set corresponds to the parameterized types
 *  java.util.Set<String> and java.util.Set<Number>
 *  (and many others), and to the raw type java.util.Set.
 * 
 *   Each method of this interface that returns a list of elements
 *  will return them in the order that is natural for the underlying
 *  source of program information.  For example, if the underlying
 *  source of information is Java source code, then the elements will be
 *  returned in source code order.
 */
trait TypeElement extends Element with Parameterizable with QualifiedNameable {

    /** Returns the fields, methods, constructors, and member types
     *  that are directly declared in this class or interface.
     */
    @stub
    def getEnclosedElements(): List[_ <: Element] = ???

    /** Returns the package of a top-level type and returns the
     *  immediately lexically enclosing element for a nested type.
     */
    @stub
    def getEnclosingElement(): Element = ???

    /** Returns the interface types directly implemented by this class
     *  or extended by this interface.
     */
    @stub
    def getInterfaces(): List[_ <: TypeMirror] = ???

    /** Returns the nesting kind of this type element. */
    @stub
    def getNestingKind(): NestingKind = ???

    /** Returns the fully qualified name of this type element. */
    @stub
    def getQualifiedName(): Name = ???

    /** Returns the simple name of this type element. */
    @stub
    def getSimpleName(): Name = ???

    /** Returns the direct superclass of this type element. */
    @stub
    def getSuperclass(): TypeMirror = ???

    /** Returns the formal type parameters of this type element
     *  in declaration order.
     */
    @stub
    def getTypeParameters(): List[_ <: TypeParameterElement] = ???
}
