package javax.lang.model.type

import java.util.List
import javax.lang.model.element.Element
import scala.scalanative.annotation.stub

/** Represents a declared type, either a class type or an interface type.
 *  This includes parameterized types such as java.util.Set<String>
 *  as well as raw types.
 * 
 *   While a TypeElement represents a class or interface
 *  element, a DeclaredType represents a class
 *  or interface type, the latter being a use
 *  (or invocation) of the former.
 *  See TypeElement for more on this distinction.
 * 
 *   The supertypes (both class and interface types) of a declared
 *  type may be found using the Types.directSupertypes(TypeMirror) method.  This returns the
 *  supertypes with any type arguments substituted in.
 */
trait DeclaredType extends ReferenceType {

    /** Returns the element corresponding to this type. */
    @stub
    def asElement(): Element = ???

    /** Returns the type of the innermost enclosing instance or a
     *  NoType of kind NONE if there is no enclosing
     *  instance.
     */
    @stub
    def getEnclosingType(): TypeMirror = ???

    /** Returns the actual type arguments of this type. */
    @stub
    def getTypeArguments(): List[_ <: TypeMirror] = ???
}
