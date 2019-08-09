package org.w3c.dom

import java.lang.String

// This interface represents a known entity, either parsed or unparsed, in an
// XML document. Note that this models the entity itself not the entity declaration.
// The nodeName attribute that is inherited from
// Node contains the name of the entity.
// An XML processor may choose to completely expand entities before the
// structure model is passed to the DOM; in this case there will be no
// EntityReference nodes in the document tree.
// XML does not mandate that a non-validating XML processor read and
// process entity declarations made in the external subset or declared in
// parameter entities. This means that parsed entities declared in the
// external subset need not be expanded by some classes of applications, and
// that the replacement text of the entity may not be available. When the 
// replacement text is available, the corresponding Entity node's child list
// represents the structure of that replacement value. Otherwise, the child
// list is empty.
// DOM Level 3 does not support editing Entity nodes; if a
// user wants to make changes to the contents of an Entity,
// every related EntityReference node has to be replaced in the
// structure model by a clone of the Entity's contents, and
// then the desired changes must be made to each of those clones instead.
// Entity nodes and all their descendants are readonly.
// An Entity node does not have any parent.
// Note: If the entity contains an unbound namespace prefix, the
// namespaceURI of the corresponding node in the
// Entity node subtree is null. The same is true
// for EntityReference nodes that refer to this entity, when
// they are created using the createEntityReference method of
// the Document interface.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait Entity extends Node {

    @stub
    // An attribute specifying the encoding used for this entity at the time
    // of parsing, when it is an external parsed entity.
    def getInputEncoding(): String = ???

    @stub
    // For unparsed entities, the name of the notation for the entity.
    def getNotationName(): String = ???

    @stub
    // The public identifier associated with the entity if specified, and
    // null otherwise.
    def getPublicId(): String = ???

    @stub
    // The system identifier associated with the entity if specified, and
    // null otherwise.
    def getSystemId(): String = ???

    @stub
    // An attribute specifying, as part of the text declaration, the encoding
    // of this entity, when it is an external parsed entity.
    def getXmlEncoding(): String = ???
}
