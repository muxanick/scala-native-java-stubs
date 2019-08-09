package java.awt

import java.lang.{Enum, Object, String}

/** Modal dialogs block all input to some top-level windows.
 *  Whether a particular window is blocked depends on dialog's type
 *  of modality; this is called the "scope of blocking". The
 *  ModalityType enum specifies modal types and their
 *  associated scopes.
 */
class Dialog.ModalityType private (name: String, ordinal: Int) extends Enum[Dialog.ModalityType](name, ordinal) {
}

object Dialog.ModalityType {
    /** An APPLICATION_MODAL dialog blocks all top-level windows
     *  from the same Java application except those from its own child hierarchy.
     */
    final val APPLICATION_MODAL = new Dialog.ModalityType(APPLICATION_MODAL, 0)

    /** A DOCUMENT_MODAL dialog blocks input to all top-level windows
     *  from the same document except those from its own child hierarchy.
     */
    final val DOCUMENT_MODAL = new Dialog.ModalityType(DOCUMENT_MODAL, 1)

    /** MODELESS dialog doesn't block any top-level windows. */
    final val MODELESS = new Dialog.ModalityType(MODELESS, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Dialog.ModalityType = ???
}
