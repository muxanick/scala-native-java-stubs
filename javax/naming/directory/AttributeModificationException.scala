package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

// This exception is thrown when an attempt is
// made to add, or remove, or modify an attribute, its identifier,
// or its values that conflicts with the attribute's (schema) definition
// or the attribute's state.
// It is thrown in response to DirContext.modifyAttributes().
// It contains a list of modifications that have not been performed, in the
// order that they were supplied to modifyAttributes().
// If the list is null, none of the modifications were performed successfully.
//
// An AttributeModificationException instance is not synchronized
// against concurrent multithreaded access. Multiple threads trying
// to access and modify a single AttributeModification instance
// should lock the object.
class AttributeModificationException extends NamingException {

    @stub
    // Constructs a new instance of AttributeModificationException.
    def this() = ???

    @stub
    // Retrieves the unexecuted modification list.
    def getUnexecutedModifications(): Array[ModificationItem] = ???

    @stub
    // Sets the unexecuted modification list to be e.
    def setUnexecutedModifications(e: Array[ModificationItem]): Unit = ???
}
