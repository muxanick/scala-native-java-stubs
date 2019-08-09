package javax.swing.plaf.synth

import java.awt.Graphics
import javax.swing.JComponent
import scala.scalanative.annotation.stub

/** SynthUI is used to fetch the SynthContext for a particular Component. */
trait SynthUI extends SynthConstants {

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}
