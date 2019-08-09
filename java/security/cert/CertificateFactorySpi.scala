package java.security.cert

import java.io.InputStream
import java.lang.{Object, String}
import java.util.{Collection, List}

/** This class defines the Service Provider Interface (SPI)
 *  for the CertificateFactory class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a certificate factory for a particular certificate type, e.g., X.509.
 * 
 *  Certificate factories are used to generate certificate, certification path
 *  (CertPath) and certificate revocation list (CRL) objects from
 *  their encodings.
 * 
 *  A certificate factory for X.509 must return certificates that are an
 *  instance of java.security.cert.X509Certificate, and CRLs
 *  that are an instance of java.security.cert.X509CRL.
 */
abstract class CertificateFactorySpi extends Object {

    /** Generates a certificate object and initializes it with
     *  the data read from the input stream inStream.
     */
    def engineGenerateCertificate(inStream: InputStream): Certificate

    /** Returns a (possibly empty) collection view of the certificates read
     *  from the given input stream inStream.
     */
    def engineGenerateCertificates(inStream: InputStream): Collection[_ <: Certificate]

    /** Generates a CertPath object and initializes it with
     *  the data read from the InputStream inStream.
     */
    def engineGenerateCertPath(inStream: InputStream): CertPath

    /** Generates a CertPath object and initializes it with
     *  the data read from the InputStream inStream.
     */
    def engineGenerateCertPath(inStream: InputStream, encoding: String): CertPath

    /** Generates a CertPath object and initializes it with
     *  a List of Certificates.
     */
    def engineGenerateCertPath(certificates: List[_ <: Certificate]): CertPath

    /** Generates a certificate revocation list (CRL) object and initializes it
     *  with the data read from the input stream inStream.
     */
    def engineGenerateCRL(inStream: InputStream): CRL

    /** Returns a (possibly empty) collection view of the CRLs read
     *  from the given input stream inStream.
     */
    def engineGenerateCRLs(inStream: InputStream): Collection[_ <: CRL]
}
