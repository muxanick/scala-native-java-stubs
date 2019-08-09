package javax.xml.crypto.dsig.spec

import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** A specification of algorithm parameters for a Transform
 *  algorithm. The purpose of this interface is to group (and provide type
 *  safety for) all transform parameter specifications. All transform parameter
 *  specifications must implement this interface.
 */
trait TransformParameterSpec extends AlgorithmParameterSpec {
}
