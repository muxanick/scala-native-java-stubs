package java.lang

import scala.scalanative.annotation.stub

/** The Void class is an uninstantiable placeholder class to hold a
 *  reference to the Class object representing the Java keyword
 *  void.
 */
final class Void extends Object {
}

object Void {
    /** The Class object representing the pseudo-type corresponding to
     *  the keyword void.
     */
    @stub
    val TYPE: Class[Void] = ???
}
