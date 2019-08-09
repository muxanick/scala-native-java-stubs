package javax.swing.plaf.synth

import javax.swing.JComponent

// SynthUI is used to fetch the SynthContext for a particular Component.
trait SynthUI extends SynthConstants {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???
}
