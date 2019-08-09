package javax.management.relation

import java.lang.{Exception, Object, String, Throwable}
import javax.management.JMException
import scala.scalanative.annotation.stub

/** Invalid relation type.
 *  This exception is raised when, in a relation type, there is already a
 *  relation type with that name, or the same name has been used for two
 *  different role infos, or no role info provided, or one null role info
 *  provided.
 */
class InvalidRelationTypeException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???

    /** Constructor with given message put in exception. */
    @stub
    def this(message: String) = ???
}
