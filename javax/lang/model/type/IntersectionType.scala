package javax.lang.model.type

import java.util.List
import scala.scalanative.annotation.stub

/** Represents an intersection type.
 * 
 *  An intersection type can be either implicitly or explicitly
 *  declared in a program. For example, the bound of the type parameter
 *  <T extends Number & Runnable> is an (implicit) intersection
 *  type.  As of RELEASE_8, this is represented by an IntersectionType with
 *  Number and Runnable as its bounds.
 */
trait IntersectionType extends TypeMirror {

    /** Return the bounds comprising this intersection type. */
    @stub
    def getBounds(): List[_ <: TypeMirror] = ???
}
