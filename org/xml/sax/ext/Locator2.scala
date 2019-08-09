package org.xml.sax.ext

import java.lang.String
import org.xml.sax.Locator

// SAX2 extension to augment the entity information provided
// though a Locator.
// If an implementation supports this extension, the Locator
// provided in ContentHandler.setDocumentLocator()  will implement this
// interface, and the
// http://xml.org/sax/features/use-locator2 feature
// flag will have the value true.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// 
//
//  XMLReader implementations are not required to support this
// information, and it is not part of core-only SAX2 distributions.
trait Locator2 extends Locator {

    @stub
    // Returns the name of the character encoding for the entity.
    def getEncoding(): String = ???
}
