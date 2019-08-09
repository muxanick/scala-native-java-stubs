package javax.swing.text.html

import java.awt.Graphics
import java.io.Serializable
import java.lang.Object
import javax.swing.text.View
import scala.scalanative.annotation.stub

/** Class to carry out some of the duties of CSS list
 *  formatting.  Implementations of this
 *  class enable views to present the CSS formatting
 *  while not knowing anything about how the CSS values
 *  are being cached.
 */
object StyleSheet.ListPainter extends Object with Serializable {

    /** Paints the CSS list decoration according to the
     *  attributes given.
     */
    @stub
    def paint(g: Graphics, x: Float, y: Float, w: Float, h: Float, v: View, item: Int): Unit = ???
}
