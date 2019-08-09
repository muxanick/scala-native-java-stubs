package javax.net.ssl

/** This class is the base interface for providing
 *  algorithm-specific information to a KeyManagerFactory or
 *  TrustManagerFactory.
 *  
 *  In some cases, initialization parameters other than keystores
 *  may be needed by a provider.  Users of that particular provider
 *  are expected to pass an implementation of the appropriate
 *  sub-interface of this class as defined by the
 *  provider.  The provider can then call the specified methods in
 *  the ManagerFactoryParameters implementation to obtain the
 *  needed information.
 */
trait ManagerFactoryParameters {
}
