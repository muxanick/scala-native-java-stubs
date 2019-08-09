package javax.xml.crypto.dsig.spec

import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** A specification of algorithm parameters for an XML SignatureMethod
 *  algorithm. The purpose of this interface is to group (and provide type
 *  safety for) all signature method parameter specifications. All signature
 *  method parameter specifications must implement this interface.
 */
trait SignatureMethodParameterSpec extends AlgorithmParameterSpec {
}
