package javax.lang.model.type

import java.util.List
import scala.scalanative.annotation.stub

/** Represents a union type.
 * 
 *  As of the RELEASE_7 source version, union types can appear as the type
 *  of a multi-catch exception parameter.
 */
trait UnionType extends TypeMirror {

    /** Return the alternatives comprising this union type. */
    @stub
    def getAlternatives(): List[_ <: TypeMirror] = ???
}
