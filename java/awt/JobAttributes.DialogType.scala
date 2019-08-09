package java.awt

import java.lang.Object

// A type-safe enumeration of possible dialogs to display to the user.
object final JobAttributes.DialogType extends Object {

    @stub
    // The DialogType instance to use for
    // specifying the cross-platform, pure Java print dialog.
    def COMMON: JobAttributes.DialogType = ???

    @stub
    // The DialogType instance to use for
    // specifying the platform's native print dialog.
    def NATIVE: JobAttributes.DialogType = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
