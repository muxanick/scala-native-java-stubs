package java.awt

import java.lang.Object
import scala.scalanative.annotation.stub

/** MouseInfo  provides methods for getting information about the mouse,
 *  such as mouse pointer location and the number of mouse buttons.
 */
class MouseInfo extends Object {
}

object MouseInfo {
    /** Returns the number of buttons on the mouse. */
    @stub
    def getNumberOfButtons(): Int = ???

    /** Returns a PointerInfo instance that represents the current
     *  location of the mouse pointer.
     */
    @stub
    def getPointerInfo(): PointerInfo = ???
}
