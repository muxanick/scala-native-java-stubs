package org.w3c.dom

// When associating an object to a key on a node using
// Node.setUserData() the application can provide a handler
// that gets called when the node the object is associated to is being
// cloned, imported, or renamed. This can be used by the application to
// implement various behaviors regarding the data it associates to the DOM
// nodes. This interface defines that handler.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait UserDataHandler {
}

object UserDataHandler {
    @stub
    // The node is adopted, using Document.adoptNode().
    def NODE_ADOPTED: Short = ???

    @stub
    // The node is cloned, using Node.cloneNode().
    def NODE_CLONED: Short = ???

    @stub
    // The node is deleted.
    def NODE_DELETED: Short = ???

    @stub
    // The node is imported, using Document.importNode().
    def NODE_IMPORTED: Short = ???
}
