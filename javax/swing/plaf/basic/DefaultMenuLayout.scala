package javax.swing.plaf.basic

import java.awt.{Container, Dimension}
import java.lang.Object
import javax.swing.BoxLayout
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** The default layout manager for Popup menus and menubars.  This
 *  class is an extension of BoxLayout which adds the UIResource tag
 *  so that pluggable L&Fs can distinguish it from user-installed
 *  layout managers on menus.
 */
class DefaultMenuLayout extends BoxLayout with UIResource {

    /**  */
    @stub
    def this(target: Container, axis: Int) = ???

    /** Returns the preferred dimensions for this layout, given the components
     *  in the specified target container.
     */
    @stub
    def preferredLayoutSize(target: Container): Dimension = ???
}
