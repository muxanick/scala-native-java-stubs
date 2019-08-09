package javax.xml.crypto.dsig

import java.lang.{Object, String}
import java.security.Provider
import javax.xml.crypto.{XMLCryptoContext, XMLStructure}
import javax.xml.crypto.dsig.spec.TransformParameterSpec

/** A Service Provider Interface for transform and canonicalization algorithms.
 * 
 *  Each instance of TransformService supports a specific
 *  transform or canonicalization algorithm and XML mechanism type. To create a
 *  TransformService, call one of the static
 *  getInstance methods, passing in the algorithm URI and
 *  XML mechanism type desired, for example:
 * 
 *  
 *  TransformService ts = TransformService.getInstance(Transform.XPATH2, "DOM");
 *  
 * 
 *  TransformService implementations are registered and loaded
 *  using the Provider mechanism.  Each
 *  TransformService service provider implementation should include
 *  a MechanismType service attribute that identifies the XML
 *  mechanism type that it supports. If the attribute is not specified,
 *  "DOM" is assumed. For example, a service provider that supports the
 *  XPath Filter 2 Transform and DOM mechanism would be specified in the
 *  Provider subclass as:
 *  
 *      put("TransformService." + Transform.XPATH2,
 *          "org.example.XPath2TransformService");
 *      put("TransformService." + Transform.XPATH2 + " MechanismType", "DOM");
 *  
 *  TransformService implementations that support the DOM
 *  mechanism type must abide by the DOM interoperability requirements defined
 *  in the
 *  
 *  DOM Mechanism Requirements section of the API overview. See the
 *  
 *  Service Providers section of the API overview for a list of standard
 *  mechanism types.
 *  
 *  Once a TransformService has been created, it can be used
 *  to process Transform or CanonicalizationMethod
 *  objects. If the Transform or CanonicalizationMethod
 *  exists in XML form (for example, when validating an existing
 *  XMLSignature), the init(XMLStructure, XMLCryptoContext)
 *  method must be first called to initialize the transform and provide document
 *  context (even if there are no parameters). Alternatively, if the
 *  Transform or CanonicalizationMethod is being
 *  created from scratch, the init(TransformParameterSpec) method
 *  is called to initialize the transform with parameters and the
 *  marshalParams method is called to marshal the
 *  parameters to XML and provide the transform with document context. Finally,
 *  the transform method is called to perform the
 *  transformation.
 *  
 *  Concurrent Access
 *  The static methods of this class are guaranteed to be thread-safe.
 *  Multiple threads may concurrently invoke the static methods defined in this
 *  class with no ill effects.
 * 
 *  However, this is not true for the non-static methods defined by this
 *  class. Unless otherwise documented by a specific provider, threads that
 *  need to access a single TransformService instance
 *  concurrently should synchronize amongst themselves and provide the
 *  necessary locking. Multiple threads each manipulating a different
 *  TransformService instance need not synchronize.
 */
abstract class TransformService extends Object with Transform {

    /** Returns the URI of the algorithm supported by this
     *  TransformService.
     */
    def getAlgorithm(): String

    /** Returns the mechanism type supported by this TransformService. */
    def getMechanismType(): String

    /** Returns the provider of this TransformService. */
    def getProvider(): Provider

    /** Initializes this TransformService with the specified
     *  parameters.
     */
    def init(params: TransformParameterSpec): Unit

    /** Initializes this TransformService with the specified
     *  parameters and document context.
     */
    def init(parent: XMLStructure, context: XMLCryptoContext): Unit
}

object TransformService {
    /** Returns a TransformService that supports the specified
     *  algorithm URI (ex: Transform.XPATH2) and mechanism type
     *  (ex: DOM).
     */
    @stub
    def getInstance(algorithm: String, mechanismType: String): TransformService = ???

    /** Returns a TransformService that supports the specified
     *  algorithm URI (ex: Transform.XPATH2) and mechanism type
     *  (ex: DOM) as supplied by the specified provider.
     */
    @stub
    def getInstance(algorithm: String, mechanismType: String, provider: Provider): TransformService = ???

    /** Returns a TransformService that supports the specified
     *  algorithm URI (ex: Transform.XPATH2) and mechanism type
     *  (ex: DOM) as supplied by the specified provider.
     */
    @stub
    def getInstance(algorithm: String, mechanismType: String, provider: String): TransformService = ???
}
