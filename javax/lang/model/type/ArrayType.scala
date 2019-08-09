package javax.lang.model.type

import scala.scalanative.annotation.stub

/** Represents an array type.
 *  A multidimensional array type is represented as an array type
 *  whose component type is also an array type.
 */
trait ArrayType extends ReferenceType {

    /** Returns the component type of this array type. */
    @stub
    def getComponentType(): TypeMirror = ???
}
