package java.util.prefs

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** An event emitted by a Preferences node to indicate that
 *  a preference has been added, removed or has had its value changed.
 * 
 *  Note, that although PreferenceChangeEvent inherits Serializable interface
 *  from EventObject, it is not intended to be Serializable. Appropriate
 *  serialization methods are implemented to throw NotSerializableException.
 */
class PreferenceChangeEvent extends EventObject {

    /** Constructs a new PreferenceChangeEvent instance. */
    @stub
    def this(node: Preferences, key: String, newValue: String) = ???

    /** Returns the key of the preference that was changed. */
    @stub
    def getKey(): String = ???

    /** Returns the new value for the preference. */
    @stub
    def getNewValue(): String = ???

    /** Returns the preference node that emitted the event. */
    @stub
    def getNode(): Preferences = ???
}
