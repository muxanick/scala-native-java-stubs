package javax.naming.ldap

import java.lang.{Object, String}
import javax.naming.NamingException

/** Indicates whether the requested sort of search results was successful or not.
 *  When the result code indicates success then the results have been sorted as
 *  requested. Otherwise the sort was unsuccessful and additional details
 *  regarding the cause of the error may have been provided by the server.
 *  
 *  The code sample in SortControl shows how this class may be used.
 *  
 *  This class implements the LDAPv3 Response Control for server-side sorting
 *  as defined in
 *  RFC 2891.
 * 
 *  The control's value has the following ASN.1 definition:
 *  
 * 
 *      SortResult ::= SEQUENCE {
 *         sortResult  ENUMERATED {
 *             success                   (0), -- results are sorted
 *             operationsError           (1), -- server internal failure
 *             timeLimitExceeded         (3), -- timelimit reached before
 *                                            -- sorting was completed
 *             strongAuthRequired        (8), -- refused to return sorted
 *                                            -- results via insecure
 *                                            -- protocol
 *             adminLimitExceeded       (11), -- too many matching entries
 *                                            -- for the server to sort
 *             noSuchAttribute          (16), -- unrecognized attribute
 *                                            -- type in sort key
 *             inappropriateMatching    (18), -- unrecognized or inappro-
 *                                            -- priate matching rule in
 *                                            -- sort key
 *             insufficientAccessRights (50), -- refused to return sorted
 *                                            -- results to this client
 *             busy                     (51), -- too busy to process
 *             unwillingToPerform       (53), -- unable to sort
 *             other                    (80)
 *             },
 *       attributeType [0] AttributeType OPTIONAL }
 * 
 *  
 */
final class SortResponseControl extends BasicControl {

    /** Retrieves the ID of the attribute that caused the sort to fail. */
    @stub
    def getAttributeID(): String = ???

    /** Retrieves the NamingException appropriate for the result code. */
    @stub
    def getException(): NamingException = ???

    /** Retrieves the LDAP result code of the sort operation. */
    @stub
    def getResultCode(): Int = ???
}
