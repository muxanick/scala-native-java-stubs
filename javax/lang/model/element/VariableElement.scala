package javax.lang.model.element

import java.lang.Object

/** Represents a field, enum constant, method or constructor
 *  parameter, local variable, resource variable, or exception
 *  parameter.
 */
trait VariableElement extends Element {

    /** Returns the value of this variable if this is a final
     *  field initialized to a compile-time constant.
     */
    @stub
    def getConstantValue(): Object = ???

    /** Returns the enclosing element of this variable. */
    @stub
    def getEnclosingElement(): Element = ???
}
