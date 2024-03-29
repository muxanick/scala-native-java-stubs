package javax.management.relation

import java.lang.Boolean
import scala.scalanative.annotation.stub

/** A RelationSupport object is used internally by the Relation Service to
 *  represent simple relations (only roles, no properties or methods), with an
 *  unlimited number of roles, of any relation type. As internal representation,
 *  it is not exposed to the user.
 *  RelationSupport class conforms to the design patterns of standard MBean. So
 *  the user can decide to instantiate a RelationSupport object himself as
 *  a MBean (as it follows the MBean design patterns), to register it in the
 *  MBean Server, and then to add it in the Relation Service.
 *  The user can also, when creating his own MBean relation class, have it
 *  extending RelationSupport, to retrieve the implementations of required
 *  interfaces (see below).
 *  It is also possible to have in a user relation MBean class a member
 *  being a RelationSupport object, and to implement the required interfaces by
 *  delegating all to this member.
 *   RelationSupport implements the Relation interface (to be handled by the
 *  Relation Service).
 */
trait RelationSupportMBean extends Relation {

    /** Returns an internal flag specifying if the object is still handled by
     *  the Relation Service.
     */
    @stub
    def isInRelationService(): Boolean = ???

    /** Specifies whether this relation is handled by the Relation
     *  Service.
     */
    @stub
    def setRelationServiceManagementFlag(flag: Boolean): Unit = ???
}
