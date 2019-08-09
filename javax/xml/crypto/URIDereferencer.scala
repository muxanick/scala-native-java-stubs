package javax.xml.crypto

import scala.scalanative.annotation.stub

/** A dereferencer of URIReferences.
 *  
 *  The result of dereferencing a URIReference is either an
 *  instance of OctetStreamData or NodeSetData. Unless the
 *  URIReference is a same-document reference as defined
 *  in section 4.2 of the W3C Recommendation for XML-Signature Syntax and
 *  Processing, the result of dereferencing the URIReference
 *  MUST be an OctetStreamData.
 */
trait URIDereferencer {

    /** Dereferences the specified URIReference and returns the
     *  dereferenced data.
     */
    @stub
    def dereference(uriReference: URIReference, context: XMLCryptoContext): Data = ???
}
