package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// This class is the superclass of any exception which can be raised during
// relation management.
class RelationException extends JMException {

    @stub
    // Default constructor, no message put in exception.
    def this() = ???
}
