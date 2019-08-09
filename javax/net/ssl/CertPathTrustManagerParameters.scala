package javax.net.ssl

import java.lang.Object

// A wrapper for CertPathParameters. This class is used to pass validation
// settings to CertPath based TrustManagers using the
// TrustManagerFactory.init() method.
//
// Instances of this class are immutable.
class CertPathTrustManagerParameters extends Object with ManagerFactoryParameters {
}
