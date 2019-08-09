package java.util.prefs

import java.lang.FunctionalInterface
import java.util.EventListener

// A listener for receiving preference change events.
@FunctionalInterface trait PreferenceChangeListener extends EventListener {
}
