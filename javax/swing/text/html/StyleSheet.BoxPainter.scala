package javax.swing.text.html

import java.io.Serializable
import java.lang.Object
import javax.swing.text.View

/** Class to carry out some of the duties of
 *  CSS formatting.  Implementations of this
 *  class enable views to present the CSS formatting
 *  while not knowing anything about how the CSS values
 *  are being cached.
 *  
 *  As a delegate of Views, this object is responsible for
 *  the insets of a View and making sure the background
 *  is maintained according to the CSS attributes.
 */
object StyleSheet.BoxPainter extends Object with Serializable {

    /** Fetches the inset needed on a given side to
     *  account for the margin, border, and padding.
     */
    @stub
    def getInset(side: Int, v: View): Float = ???
}
