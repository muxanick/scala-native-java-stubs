package java.lang.reflect

import java.lang.String
import scala.scalanative.annotation.stub

/** Type is the common superinterface for all types in the Java
 *  programming language. These include raw types, parameterized types,
 *  array types, type variables and primitive types.
 */
trait Type {

    /** Returns a string describing this type, including information
     *  about any type parameters.
     */
    @stub
    def getTypeName(): String = ???
}
