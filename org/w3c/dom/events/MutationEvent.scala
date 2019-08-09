package org.w3c.dom.events

import java.lang.String
import org.w3c.dom.Node

// The MutationEvent interface provides specific contextual
// information associated with Mutation events.
// See also the Document Object Model (DOM) Level 2 Events Specification.
trait MutationEvent extends Event {

    @stub
    // attrChange indicates the type of change which triggered
    // the DOMAttrModified event.
    def getAttrChange(): Short = ???

    @stub
    // attrName indicates the name of the changed
    // Attr node in a DOMAttrModified event.
    def getAttrName(): String = ???

    @stub
    // newValue indicates the new value of the Attr
    // node in DOMAttrModified events, and of the CharacterData
    // node in DOMCharacterDataModified events.
    def getNewValue(): String = ???

    @stub
    // prevValue indicates the previous value of the
    // Attr node in DOMAttrModified events, and of the
    // CharacterData node in DOMCharacterDataModified events.
    def getPrevValue(): String = ???

    @stub
    // relatedNode is used to identify a secondary node related
    // to a mutation event.
    def getRelatedNode(): Node = ???
}

object MutationEvent {
    @stub
    // The Attr was just added.
    def ADDITION: Short = ???

    @stub
    // The Attr was modified in place.
    def MODIFICATION: Short = ???
}
