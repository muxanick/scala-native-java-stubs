package java.awt

import java.lang.{Enum, Object, String}

// Any top-level window can be marked not to be blocked by modal
// dialogs. This is called "modal exclusion". This enum specifies
// the possible modal exclusion types.
class Dialog.ModalExclusionType private (name: String, ordinal: Int) extends Enum[Dialog.ModalExclusionType](name, ordinal) {
}

object Dialog.ModalExclusionType {
    // APPLICATION_EXCLUDE indicates that a top-level window
    // won't be blocked by any application-modal dialogs.
    final val APPLICATION_EXCLUDE = new Dialog.ModalExclusionType(APPLICATION_EXCLUDE, 0)

    // No modal exclusion.
    final val NO_EXCLUDE = new Dialog.ModalExclusionType(NO_EXCLUDE, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Dialog.ModalExclusionType = ???
}
