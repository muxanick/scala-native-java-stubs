package java.lang.reflect

import scala.scalanative.annotation.stub

/** WildcardType represents a wildcard type expression, such as
 *  ?, ? extends Number, or ? super Integer.
 */
trait WildcardType extends Type {

    /** Returns an array of Type objects representing the
     *  lower bound(s) of this type variable.
     */
    @stub
    def getLowerBounds(): Array[Type] = ???

    /** Returns an array of Type objects representing the  upper
     *  bound(s) of this type variable.
     */
    @stub
    def getUpperBounds(): Array[Type] = ???
}
