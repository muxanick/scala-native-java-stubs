package java.util.prefs

import java.lang.{Object, String}
import java.util.EventObject

// An event emitted by a Preferences node to indicate that
// a preference has been added, removed or has had its value changed.
//
// Note, that although PreferenceChangeEvent inherits Serializable interface
// from EventObject, it is not intended to be Serializable. Appropriate
// serialization methods are implemented to throw NotSerializableException.
class PreferenceChangeEvent extends EventObject {

    @stub
    // Returns the key of the preference that was changed.
    def getKey(): String = ???

    @stub
    // Returns the new value for the preference.
    def getNewValue(): String = ???
}
