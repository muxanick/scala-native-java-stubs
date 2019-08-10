package javax.xml.crypto

import java.lang.Object
import java.security.Key
import javax.xml.crypto.dsig.keyinfo.KeyInfo
import scala.scalanative.annotation.stub

/** A selector that finds and returns a key using the data contained in a
 *  KeyInfo object. An example of an implementation of
 *  this class is one that searches a KeyStore for
 *  trusted keys that match information contained in a KeyInfo.
 * 
 *  Whether or not the returned key is trusted and the mechanisms
 *  used to determine that is implementation-specific.
 */
abstract class KeySelector extends Object {

    /** Default no-args constructor; intended for invocation by subclasses only. */
    @stub
    protected def this() = ???

    /** Attempts to find a key that satisfies the specified constraints. */
    def select(keyInfo: KeyInfo, purpose: KeySelector.Purpose, method: AlgorithmMethod, context: XMLCryptoContext): KeySelectorResult
}

object KeySelector {
    /** The purpose of the key that is to be selected. */
    type Purpose = KeySelector_Purpose

    /** Returns a KeySelector that always selects the specified
     *  key, regardless of the KeyInfo passed to it.
     */
    @stub
    def singletonKeySelector(key: Key): KeySelector = ???
}
