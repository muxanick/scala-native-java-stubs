package javax.xml.crypto

// The result returned by the KeySelector.select
// method.
// 
// At a minimum, a KeySelectorResult contains the Key
// selected by the KeySelector. Implementations of this interface
// may add methods to return implementation or algorithm specific information,
// such as a chain of certificates or debugging information.
trait KeySelectorResult {
}
