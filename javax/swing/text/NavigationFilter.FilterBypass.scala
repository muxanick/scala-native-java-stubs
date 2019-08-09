package javax.swing.text

import java.lang.Object

/** Used as a way to circumvent calling back into the caret to
 *  position the cursor. Caret implementations that wish to support
 *  a NavigationFilter must provide an implementation that will
 *  not callback into the NavigationFilter.
 */
object abstract NavigationFilter.FilterBypass extends Object {

    /** Returns the Caret that is changing. */
    @stub
    def getCaret(): Caret

    /** Moves the caret location, bypassing the NavigationFilter. */
    @stub
    def moveDot(dot: Int, bias: Position.Bias): Unit
}
