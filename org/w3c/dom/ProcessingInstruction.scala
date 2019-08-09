package org.w3c.dom

import java.lang.String

// The ProcessingInstruction interface represents a "processing
// instruction", used in XML as a way to keep processor-specific information
// in the text of the document.
//  No lexical check is done on the content of a processing instruction and
// it is therefore possible to have the character sequence
// "?>" in the content, which is illegal a processing
// instruction per section 2.6 of [XML 1.0]. The
// presence of this character sequence must generate a fatal error during
// serialization.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait ProcessingInstruction extends Node {

    @stub
    // The content of this processing instruction.
    def getData(): String = ???

    @stub
    // The target of this processing instruction.
    def getTarget(): String = ???
}
