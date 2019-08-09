package javax.swing.plaf.synth

import java.lang.Object
import javax.swing.JComponent

// An immutable transient object containing contextual information about
// a Region. A SynthContext should only be
// considered valid for the duration
// of the method it is passed to. In other words you should not cache
// a SynthContext that is passed to you and expect it to
// remain valid.
class SynthContext extends Object {

    @stub
    // Returns the hosting component containing the region.
    def getComponent(): JComponent = ???

    @stub
    // Returns the state of the widget, which is a bitmask of the
    // values defined in SynthConstants.
    def getComponentState(): Int = ???

    @stub
    // Returns the Region identifying this state.
    def getRegion(): Region = ???
}
