package java.awt

import java.lang.Object
import scala.scalanative.annotation.stub

/** Defines the base type of all keys used along with the
 *  RenderingHints class to control various
 *  algorithm choices in the rendering and imaging pipelines.
 *  Instances of this class are immutable and unique which
 *  means that tests for matches can be made using the
 *  == operator instead of the more expensive
 *  equals() method.
 */
object abstract RenderingHints.Key extends Object {

    /** Construct a key using the indicated private key. */
    @stub
    protected def Key(privatekey: Int) = ???

    /** The equals method for all Key objects will return the same
     *  result as the equality operator '=='.
     */
    @stub
    def equals(o: Object): Boolean = ???

    /** The hash code for all Key objects will be the same as the
     *  system identity code of the object as defined by the
     *  System.identityHashCode() method.
     */
    @stub
    def hashCode(): Int = ???

    /** Returns the private integer key that the subclass
     *  instantiated this Key with.
     */
    @stub
    protected def intKey(): Int = ???

    /** Returns true if the specified object is a valid value
     *  for this Key.
     */
    @stub
    def isCompatibleValue(val: Object): Boolean
}
