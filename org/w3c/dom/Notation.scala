package org.w3c.dom

import java.lang.String

// This interface represents a notation declared in the DTD. A notation either
// declares, by name, the format of an unparsed entity (see section 4.7 of the XML 1.0 specification [XML 1.0]), or is
// used for formal declaration of processing instruction targets (see section 2.6 of the XML 1.0 specification [XML 1.0]). The
// nodeName attribute inherited from Node is set
// to the declared name of the notation.
// The DOM Core does not support editing Notation nodes; they
// are therefore readonly.
// A Notation node does not have any parent.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait Notation extends Node {

    @stub
    // The public identifier of this notation.
    def getPublicId(): String = ???
}
