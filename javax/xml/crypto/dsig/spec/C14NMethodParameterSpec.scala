package javax.xml.crypto.dsig.spec

// A specification of algorithm parameters for a CanonicalizationMethod
// Algorithm. The purpose of this interface is to group (and provide type
// safety for) all canonicalization (C14N) parameter specifications. All
// canonicalization parameter specifications must implement this interface.
trait C14NMethodParameterSpec extends TransformParameterSpec {
}
