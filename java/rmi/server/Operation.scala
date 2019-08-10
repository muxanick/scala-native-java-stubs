package java.rmi.server

import java.lang.{Deprecated, Object, String}
import scala.scalanative.annotation.stub

/** An Operation contains a description of a Java method.
 *  Operation objects were used in JDK1.1 version stubs and
 *  skeletons. The Operation class is not needed for 1.2 style
 *  stubs (stubs generated with rmic -v1.2); hence, this class
 *  is deprecated.
 */
@Deprecated
class Operation extends Object {

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def this(op: String) = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getOperation(): String = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def toString(): String = ???
}
