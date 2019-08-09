package javax.management.relation

import java.io.Serializable
import java.lang.String

// The RelationType interface has to be implemented by any class expected to
// represent a relation type.
trait RelationType extends Serializable {

    @stub
    // Returns the relation type name.
    def getRelationTypeName(): String = ???

    @stub
    // Returns the role info (RoleInfo object) for the given role info name
    // (null if not found).
    def getRoleInfo(roleInfoName: String): RoleInfo = ???
}
