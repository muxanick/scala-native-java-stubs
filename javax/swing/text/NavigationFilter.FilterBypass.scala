package javax.swing.text

import java.lang.Object
import scala.scalanative.annotation.stub

/** Used as a way to circumvent calling back into the caret to
 *  position the cursor. Caret implementations that wish to support
 *  a NavigationFilter must provide an implementation that will
 *  not callback into the NavigationFilter.
 */
object abstract NavigationFilter_FilterBypass extends Object {

    /**  */
    @stub
    def FilterBypass() = ???

    /** Returns the Caret that is changing. */
    def getCaret(): Caret

    /** Moves the caret location, bypassing the NavigationFilter. */
    def moveDot(dot: Int, bias: Position.Bias): Unit

    /** Sets the caret location, bypassing the NavigationFilter. */
    def setDot(dot: Int, bias: Position.Bias): Unit
}
