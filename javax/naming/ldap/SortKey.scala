package javax.naming.ldap

import java.lang.{Object, String}

/** A sort key and its associated sort parameters.
 *  This class implements a sort key which is used by the LDAPv3
 *  Control for server-side sorting of search results as defined in
 *  RFC 2891.
 */
class SortKey extends Object {

    /** Creates the default sort key for an attribute. */
    @stub
    def this(attrID: String) = ???

    /** Retrieves the attribute ID of the sort key. */
    @stub
    def getAttributeID(): String = ???

    /** Retrieves the matching rule ID used to order the attribute values. */
    @stub
    def getMatchingRuleID(): String = ???
}
