package javax.swing.text

import java.lang.{Deprecated, Object}
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.BasicTextUI
import scala.scalanative.annotation.stub

/** 
 *  This class has been deprecated and should no longer be used.
 *  The basis of the various TextUI implementations can be found
 *  in the javax.swing.plaf.basic package and the class
 *  BasicTextUI replaces this class.
 */
@Deprecated abstract class DefaultTextUI extends BasicTextUI {

    /** Deprecated.  */
    @stub
    def this() = ???
}
