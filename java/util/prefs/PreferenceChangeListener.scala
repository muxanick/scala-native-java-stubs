package java.util.prefs

import java.lang.FunctionalInterface
import java.util.EventListener
import scala.scalanative.annotation.stub

/** A listener for receiving preference change events. */
@FunctionalInterface trait PreferenceChangeListener extends EventListener {

    /** This method gets called when a preference is added, removed or when
     *  its value is changed.
     */
    @stub
    def preferenceChange(evt: PreferenceChangeEvent): Unit = ???
}
