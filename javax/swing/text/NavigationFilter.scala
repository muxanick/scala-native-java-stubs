package javax.swing.text

import java.lang.Object
import scala.scalanative.annotation.stub

/** NavigationFilter can be used to restrict where the cursor can
 *  be positioned. When the default cursor positioning actions attempt to
 *  reposition the cursor they will call into the
 *  NavigationFilter, assuming
 *  the JTextComponent has a non-null
 *  NavigationFilter set. In this manner
 *  the NavigationFilter can effectively restrict where the
 *  cursor can be positioned. Similarly DefaultCaret will call
 *  into the NavigationFilter when the user is changing the
 *  selection to further restrict where the cursor can be positioned.
 *  
 *  Subclasses can conditionally call into supers implementation to restrict
 *  where the cursor can be placed, or call directly into the
 *  FilterBypass.
 */
class NavigationFilter extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns the next visual position to place the caret at from an
     *  existing position.
     */
    @stub
    def getNextVisualPositionFrom(text: JTextComponent, pos: Int, bias: Position.Bias, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    /** Invoked prior to the Caret moving the dot. */
    @stub
    def moveDot(fb: NavigationFilter.FilterBypass, dot: Int, bias: Position.Bias): Unit = ???

    /** Invoked prior to the Caret setting the dot. */
    @stub
    def setDot(fb: NavigationFilter.FilterBypass, dot: Int, bias: Position.Bias): Unit = ???
}

object NavigationFilter {
    /** Used as a way to circumvent calling back into the caret to
     *  position the cursor.
     */
    type FilterBypass = NavigationFilter_FilterBypass
}
