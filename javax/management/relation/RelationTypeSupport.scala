package javax.management.relation

import java.lang.{Object, String}

// A RelationTypeSupport object implements the RelationType interface.
// It represents a relation type, providing role information for each role
// expected to be supported in every relation of that type.
//
// A relation type includes a relation type name and a list of
// role infos (represented by RoleInfo objects).
//
// A relation type has to be declared in the Relation Service:
// - either using the createRelationType() method, where a RelationTypeSupport
// object will be created and kept in the Relation Service
// - either using the addRelationType() method where the user has to create
// an object implementing the RelationType interface, and this object will be
// used as representing a relation type in the Relation Service.
//
// The serialVersionUID of this class is 4611072955724144607L.
class RelationTypeSupport extends Object with RelationType {

    @stub
    // Constructor to be used for subclasses.
    protected def this(relationTypeName: String) = ???

    @stub
    // Add a role info.
    protected def addRoleInfo(roleInfo: RoleInfo): Unit = ???

    @stub
    // Returns the relation type name.
    def getRelationTypeName(): String = ???

    @stub
    // Returns the role info (RoleInfo object) for the given role info name
    // (null if not found).
    def getRoleInfo(roleInfoName: String): RoleInfo = ???
}
