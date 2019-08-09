package java.lang.reflect

import java.lang.{Class, String}
import scala.scalanative.annotation.stub

/** Member is an interface that reflects identifying information about
 *  a single member (a field or a method) or a constructor.
 */
trait Member {

    /** Returns the Class object representing the class or interface
     *  that declares the member or constructor represented by this Member.
     */
    @stub
    def getDeclaringClass(): Class[_] = ???

    /** Returns the Java language modifiers for the member or
     *  constructor represented by this Member, as an integer.
     */
    @stub
    def getModifiers(): Int = ???

    /** Returns the simple name of the underlying member or constructor
     *  represented by this Member.
     */
    @stub
    def getName(): String = ???

    /** Returns true if this member was introduced by
     *  the compiler; returns false otherwise.
     */
    @stub
    def isSynthetic(): Boolean = ???
}

object Member {
    /** Identifies the set of declared members of a class or interface. */
    @stub
    val DECLARED: Int = ???

    /** Identifies the set of all public members of a class or interface,
     *  including inherited members.
     */
    @stub
    val PUBLIC: Int = ???
}
