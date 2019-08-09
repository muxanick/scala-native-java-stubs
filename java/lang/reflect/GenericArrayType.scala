package java.lang.reflect

import scala.scalanative.annotation.stub

/** GenericArrayType represents an array type whose component
 *  type is either a parameterized type or a type variable.
 */
trait GenericArrayType extends Type {

    /** Returns a Type object representing the component type
     *  of this array.
     */
    @stub
    def getGenericComponentType(): Type = ???
}
