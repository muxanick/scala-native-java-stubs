package javax.naming.directory

import java.io.Serializable
import java.lang.Object

// This class represents a modification item.
// It consists of a modification code and an attribute on which to operate.
//
// A ModificationItem instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single ModificationItem instance should lock the object.
class ModificationItem extends Object with Serializable {

    @stub
    // Retrieves the attribute associated with this modification item.
    def getAttribute(): Attribute = ???

    @stub
    // Retrieves the modification code of this modification item.
    def getModificationOp(): Int = ???
}
