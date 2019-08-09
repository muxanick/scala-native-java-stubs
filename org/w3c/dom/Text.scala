package org.w3c.dom

import java.lang.String

// The Text interface inherits from CharacterData
// and represents the textual content (termed character data in XML) of an Element or Attr. If there is no
// markup inside an element's content, the text is contained in a single
// object implementing the Text interface that is the only
// child of the element. If there is markup, it is parsed into the
// information items (elements, comments, etc.) and Text nodes
// that form the list of children of the element.
// When a document is first made available via the DOM, there is only one
// Text node for each block of text. Users may create adjacent
// Text nodes that represent the contents of a given element
// without any intervening markup, but should be aware that there is no way
// to represent the separations between these nodes in XML or HTML, so they
// will not (in general) persist between DOM editing sessions. The
// Node.normalize() method merges any such adjacent
// Text objects into a single node for each block of text.
//  No lexical check is done on the content of a Text node
// and, depending on its position in the document, some characters must be
// escaped during serialization using character references; e.g. the
// characters "<&" if the textual content is part of an element or of
// an attribute, the character sequence "]]>" when part of an element,
// the quotation mark character " or the apostrophe character ' when part of
// an attribute.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait Text extends CharacterData {

    @stub
    // Returns all text of Text nodes logically-adjacent text
    // nodes to this node, concatenated in document order.
    def getWholeText(): String = ???

    @stub
    // Returns whether this text node contains 
    // element content whitespace, often abusively called "ignorable whitespace".
    def isElementContentWhitespace(): Boolean = ???

    @stub
    // Replaces the text of the current node and all logically-adjacent text
    // nodes with the specified text.
    def replaceWholeText(content: String): Text = ???
}