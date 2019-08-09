package javax.xml.crypto.dsig.spec

import java.security.spec.AlgorithmParameterSpec

// A specification of algorithm parameters for a DigestMethod
// algorithm. The purpose of this interface is to group (and provide type
// safety for) all digest method parameter specifications. All digest method
// parameter specifications must implement this interface.
trait DigestMethodParameterSpec extends AlgorithmParameterSpec {
}
