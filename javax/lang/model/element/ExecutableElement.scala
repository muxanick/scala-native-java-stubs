package javax.lang.model.element

import java.util.List
import javax.lang.model.type.TypeMirror
import scala.scalanative.annotation.stub

/** Represents a method, constructor, or initializer (static or
 *  instance) of a class or interface, including annotation type
 *  elements.
 */
trait ExecutableElement extends Element with Parameterizable {

    /** Returns the default value if this executable is an annotation
     *  type element.
     */
    @stub
    def getDefaultValue(): AnnotationValue = ???

    /** Returns the formal parameters of this executable. */
    @stub
    def getParameters(): List[_ <: VariableElement] = ???

    /** Returns the receiver type of this executable,
     *  or NoType with
     *  kind NONE
     *  if the executable has no receiver type.
     */
    @stub
    def getReceiverType(): TypeMirror = ???

    /** Returns the return type of this executable. */
    @stub
    def getReturnType(): TypeMirror = ???

    /** Returns the simple name of a constructor, method, or
     *  initializer.
     */
    @stub
    def getSimpleName(): Name = ???

    /** Returns the exceptions and other throwables listed in this
     *  method or constructor's throws clause in declaration
     *  order.
     */
    @stub
    def getThrownTypes(): List[_ <: TypeMirror] = ???

    /** Returns the formal type parameters of this executable
     *  in declaration order.
     */
    @stub
    def getTypeParameters(): List[_ <: TypeParameterElement] = ???

    /** Returns true if this method is a default method and
     *  returns false otherwise.
     */
    @stub
    def isDefault(): Boolean = ???

    /** Returns true if this method or constructor accepts a variable
     *  number of arguments and returns false otherwise.
     */
    @stub
    def isVarArgs(): Boolean = ???
}
