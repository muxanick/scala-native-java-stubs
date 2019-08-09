package java.text

import java.lang.{Enum, Object, String}

/** This enum provides constants of the four Unicode normalization forms
 *  that are described in
 *  
 *  Unicode Standard Annex #15 — Unicode Normalization Forms
 *  and two methods to access them.
 */
class Normalizer.Form private (name: String, ordinal: Int) extends Enum[Normalizer.Form](name, ordinal) {
}

object Normalizer.Form {
    /** Canonical decomposition, followed by canonical composition. */
    final val NFC = new Normalizer.Form(NFC, 0)

    /** Canonical decomposition. */
    final val NFD = new Normalizer.Form(NFD, 1)

    /** Compatibility decomposition, followed by canonical composition. */
    final val NFKC = new Normalizer.Form(NFKC, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Normalizer.Form = ???
}
