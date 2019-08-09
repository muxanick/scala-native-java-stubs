package javax.naming.ldap

import java.lang.{Object, String}

// A sort key and its associated sort parameters.
// This class implements a sort key which is used by the LDAPv3
// Control for server-side sorting of search results as defined in
// RFC 2891.
class SortKey extends Object {

    @stub
    // Creates the default sort key for an attribute.
    def this(attrID: String) = ???

    @stub
    // Retrieves the attribute ID of the sort key.
    def getAttributeID(): String = ???

    @stub
    // Retrieves the matching rule ID used to order the attribute values.
    def getMatchingRuleID(): String = ???
}
