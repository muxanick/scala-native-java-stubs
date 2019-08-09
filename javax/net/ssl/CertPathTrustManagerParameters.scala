package javax.net.ssl

import java.lang.Object
import java.security.cert.CertPathParameters
import scala.scalanative.annotation.stub

/** A wrapper for CertPathParameters. This class is used to pass validation
 *  settings to CertPath based TrustManagers using the
 *  TrustManagerFactory.init() method.
 * 
 *  Instances of this class are immutable.
 */
class CertPathTrustManagerParameters extends Object with ManagerFactoryParameters {

    /** Construct new CertPathTrustManagerParameters from the specified
     *  parameters.
     */
    @stub
    def this(parameters: CertPathParameters) = ???

    /** Return a clone of the CertPathParameters encapsulated by this class. */
    @stub
    def getParameters(): CertPathParameters = ???
}
