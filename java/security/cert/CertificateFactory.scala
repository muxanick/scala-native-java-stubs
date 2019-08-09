package java.security.cert

import java.io.InputStream
import java.lang.{Object, String}
import java.security.Provider
import java.util.{Collection, Iterator, List}

/** This class defines the functionality of a certificate factory, which is
 *  used to generate certificate, certification path (CertPath)
 *  and certificate revocation list (CRL) objects from their encodings.
 * 
 *  For encodings consisting of multiple certificates, use
 *  generateCertificates when you want to
 *  parse a collection of possibly unrelated certificates. Otherwise,
 *  use generateCertPath when you want to generate
 *  a CertPath (a certificate chain) and subsequently
 *  validate it with a CertPathValidator.
 * 
 *  A certificate factory for X.509 must return certificates that are an
 *  instance of java.security.cert.X509Certificate, and CRLs
 *  that are an instance of java.security.cert.X509CRL.
 * 
 *  The following example reads a file with Base64 encoded certificates,
 *  which are each bounded at the beginning by -----BEGIN CERTIFICATE-----, and
 *  bounded at the end by -----END CERTIFICATE-----. We convert the
 *  FileInputStream (which does not support mark
 *  and reset) to a BufferedInputStream (which
 *  supports those methods), so that each call to
 *  generateCertificate consumes only one certificate, and the
 *  read position of the input stream is positioned to the next certificate in
 *  the file:
 * 
 *  
 *  FileInputStream fis = new FileInputStream(filename);
 *  BufferedInputStream bis = new BufferedInputStream(fis);
 * 
 *  CertificateFactory cf = CertificateFactory.getInstance("X.509");
 * 
 *  while (bis.available() > 0) {
 *     Certificate cert = cf.generateCertificate(bis);
 *     System.out.println(cert.toString());
 *  }
 *  
 * 
 *  The following example parses a PKCS#7-formatted certificate reply stored
 *  in a file and extracts all the certificates from it:
 * 
 *  
 *  FileInputStream fis = new FileInputStream(filename);
 *  CertificateFactory cf = CertificateFactory.getInstance("X.509");
 *  Collection c = cf.generateCertificates(fis);
 *  Iterator i = c.iterator();
 *  while (i.hasNext()) {
 *     Certificate cert = (Certificate)i.next();
 *     System.out.println(cert);
 *  }
 *  
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard CertificateFactory type:
 *  
 *  X.509
 *  
 *  and the following standard CertPath encodings:
 *  
 *  PKCS7
 *  PkiPath
 *  
 *  The type and encodings are described in the 
 *  CertificateFactory section and the 
 *  CertPath Encodings section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other types or encodings are supported.
 */
class CertificateFactory extends Object {

    /** Generates a certificate object and initializes it with
     *  the data read from the input stream inStream.
     */
    @stub
    def generateCertificate(inStream: InputStream): Certificate = ???

    /** Returns a (possibly empty) collection view of the certificates read
     *  from the given input stream inStream.
     */
    @stub
    def generateCertificates(inStream: InputStream): Collection[_ <: Certificate] = ???

    /** Generates a CertPath object and initializes it with
     *  the data read from the InputStream inStream.
     */
    @stub
    def generateCertPath(inStream: InputStream): CertPath = ???

    /** Generates a CertPath object and initializes it with
     *  the data read from the InputStream inStream.
     */
    @stub
    def generateCertPath(inStream: InputStream, encoding: String): CertPath = ???

    /** Generates a CertPath object and initializes it with
     *  a List of Certificates.
     */
    @stub
    def generateCertPath(certificates: List[_ <: Certificate]): CertPath = ???

    /** Generates a certificate revocation list (CRL) object and initializes it
     *  with the data read from the input stream inStream.
     */
    @stub
    def generateCRL(inStream: InputStream): CRL = ???

    /** Returns a (possibly empty) collection view of the CRLs read
     *  from the given input stream inStream.
     */
    @stub
    def generateCRLs(inStream: InputStream): Collection[_ <: CRL] = ???

    /** Returns an iteration of the CertPath encodings supported
     *  by this certificate factory, with the default encoding first.
     */
    @stub
    def getCertPathEncodings(): Iterator[String] = ???

    /** Returns the provider of this certificate factory. */
    @stub
    def getProvider(): Provider = ???
}

object CertificateFactory {
    /** Returns a certificate factory object that implements the
     *  specified certificate type.
     */
    @stub
    def getInstance(type: String): CertificateFactory = ???

    /** Returns a certificate factory object for the specified
     *  certificate type.
     */
    @stub
    def getInstance(type: String, provider: Provider): CertificateFactory = ???

    /** Returns a certificate factory object for the specified
     *  certificate type.
     */
    @stub
    def getInstance(type: String, provider: String): CertificateFactory = ???
}
