package javax.lang.model.type

import scala.scalanative.annotation.stub

/** Represents a wildcard type argument.
 *  Examples include:    
 *    ?
 *    ? extends Number
 *    ? super T
 *  
 * 
 *   A wildcard may have its upper bound explicitly set by an
 *  extends clause, its lower bound explicitly set by a
 *  super clause, or neither (but not both).
 */
trait WildcardType extends TypeMirror {

    /** Returns the upper bound of this wildcard. */
    @stub
    def getExtendsBound(): TypeMirror = ???

    /** Returns the lower bound of this wildcard. */
    @stub
    def getSuperBound(): TypeMirror = ???
}
