package javax.xml.crypto

import java.lang.Object
import javax.xml.crypto.dsig.keyinfo.KeyInfo

// A selector that finds and returns a key using the data contained in a
// KeyInfo object. An example of an implementation of
// this class is one that searches a KeyStore for
// trusted keys that match information contained in a KeyInfo.
//
// Whether or not the returned key is trusted and the mechanisms
// used to determine that is implementation-specific.
abstract class KeySelector extends Object {

    // Attempts to find a key that satisfies the specified constraints.
    def select(keyInfo: KeyInfo, purpose: KeySelector.Purpose, method: AlgorithmMethod, context: XMLCryptoContext): KeySelectorResult
}
