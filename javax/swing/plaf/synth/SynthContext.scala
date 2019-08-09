package javax.swing.plaf.synth

import java.lang.Object
import javax.swing.JComponent
import scala.scalanative.annotation.stub

/** An immutable transient object containing contextual information about
 *  a Region. A SynthContext should only be
 *  considered valid for the duration
 *  of the method it is passed to. In other words you should not cache
 *  a SynthContext that is passed to you and expect it to
 *  remain valid.
 */
class SynthContext extends Object {

    /** Creates a SynthContext with the specified values. */
    @stub
    def this(component: JComponent, region: Region, style: SynthStyle, state: Int) = ???

    /** Returns the hosting component containing the region. */
    @stub
    def getComponent(): JComponent = ???

    /** Returns the state of the widget, which is a bitmask of the
     *  values defined in SynthConstants.
     */
    @stub
    def getComponentState(): Int = ???

    /** Returns the Region identifying this state. */
    @stub
    def getRegion(): Region = ???

    /** Returns the style associated with this Region. */
    @stub
    def getStyle(): SynthStyle = ???
}
