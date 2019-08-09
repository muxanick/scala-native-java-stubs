package java.awt

import java.lang.Object

/** A type-safe enumeration of possible dialogs to display to the user. */
final object JobAttributes.DialogType extends Object {

    /** The DialogType instance to use for
     *  specifying the cross-platform, pure Java print dialog.
     */
    @stub
    val COMMON: JobAttributes.DialogType = ???

    /** The DialogType instance to use for
     *  specifying the platform's native print dialog.
     */
    @stub
    val NATIVE: JobAttributes.DialogType = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???
}
