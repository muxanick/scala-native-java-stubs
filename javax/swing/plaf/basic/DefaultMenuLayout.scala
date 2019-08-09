package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.BoxLayout
import javax.swing.plaf.UIResource

/** The default layout manager for Popup menus and menubars.  This
 *  class is an extension of BoxLayout which adds the UIResource tag
 *  so that pluggable L&Fs can distinguish it from user-installed
 *  layout managers on menus.
 */
class DefaultMenuLayout extends BoxLayout with UIResource {
}
