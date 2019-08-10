package javax.swing.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A typesafe enumeration to indicate bias to a position
 *  in the model.  A position indicates a location between
 *  two characters.  The bias can be used to indicate an
 *  interest toward one of the two sides of the position
 *  in boundary conditions where a simple offset is
 *  ambiguous.
 */
final object Position_Bias extends Object {

    /** Indicates a bias toward the previous character
     *  in the model.
     */
    @stub
    val Backward: Position.Bias = ???

    /** Indicates to bias toward the next character
     *  in the model.
     */
    @stub
    val Forward: Position.Bias = ???

    /** string representation */
    @stub
    def toString(): String = ???
}
