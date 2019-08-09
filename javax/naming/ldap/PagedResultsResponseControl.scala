package javax.naming.ldap

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Indicates the end of a batch of search results.
 *  Contains an estimate of the total number of entries in the result set
 *  and an opaque cookie. The cookie must be supplied to the next search
 *  operation in order to get the next batch of results.
 *  
 *  The code sample in PagedResultsControl shows how this class may
 *  be used.
 *  
 *  This class implements the LDAPv3 Response Control for
 *  paged-results as defined in
 *  RFC 2696.
 * 
 *  The control's value has the following ASN.1 definition:
 *  
 * 
 *      realSearchControlValue ::= SEQUENCE {
 *          size      INTEGER (0..maxInt),
 *                            -- requested page size from client
 *                            -- result set size estimate from server
 *          cookie    OCTET STRING
 *      }
 * 
 *  
 */
final class PagedResultsResponseControl extends BasicControl {

    /** Constructs a paged-results response control. */
    @stub
    def this(id: String, criticality: Boolean, value: Array[Byte]) = ???

    /** Retrieves the server-generated cookie. */
    @stub
    def getCookie(): Array[Byte] = ???

    /** Retrieves (an estimate of) the number of entries in the search result. */
    @stub
    def getResultSize(): Int = ???
}

object PagedResultsResponseControl {
    /** The paged-results response control's assigned object identifier
     *  is 1.2.840.113556.1.4.319.
     */
    @stub
    val OID: String = ???
}
