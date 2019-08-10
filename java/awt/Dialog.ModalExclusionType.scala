package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Any top-level window can be marked not to be blocked by modal
 *  dialogs. This is called "modal exclusion". This enum specifies
 *  the possible modal exclusion types.
 */
class Dialog_ModalExclusionType private (name: String, ordinal: Int) extends Enum[Dialog.ModalExclusionType](name, ordinal) {
}

object Dialog_ModalExclusionType {
    /** APPLICATION_EXCLUDE indicates that a top-level window
     *  won't be blocked by any application-modal dialogs.
     */
    final val APPLICATION_EXCLUDE = new Dialog.ModalExclusionType(APPLICATION_EXCLUDE, 0)

    /** No modal exclusion. */
    final val NO_EXCLUDE = new Dialog.ModalExclusionType(NO_EXCLUDE, 1)

    /** TOOLKIT_EXCLUDE indicates that a top-level window
     *  won't be blocked by  application-modal or toolkit-modal dialogs.
     */
    final val TOOLKIT_EXCLUDE = new Dialog.ModalExclusionType(TOOLKIT_EXCLUDE, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Dialog.ModalExclusionType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Dialog.ModalExclusionType] = ???
}
