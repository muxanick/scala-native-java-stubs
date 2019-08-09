package org.xml.sax.ext

import java.lang.String
import org.xml.sax.{EntityResolver, InputSource}

// Extended interface for mapping external entity references to input
// sources, or providing a missing external subset.  The
// XMLReader.setEntityResolver() method
// is used to provide implementations of this interface to parsers.
// When a parser uses the methods in this interface, the
// EntityResolver2.resolveEntity()
// method (in this interface) is used instead of the older (SAX 1.0)
// EntityResolver.resolveEntity() method.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// 
//
// If a SAX application requires the customized handling which this
// interface defines for external entities, it must ensure that it uses
// an XMLReader with the
// http://xml.org/sax/features/use-entity-resolver2 feature flag
// set to true (which is its default value when the feature is
// recognized).  If that flag is unrecognized, or its value is false,
// or the resolver does not implement this interface, then only the
// EntityResolver method will be used.
// 
//
// That supports three categories of application that modify entity
// resolution.  Old Style applications won't know about this interface;
// they will provide an EntityResolver.
// Transitional Mode provide an EntityResolver2 and automatically
// get the benefit of its methods in any systems (parsers or other tools)
// supporting it, due to polymorphism.
// Both Old Style and Transitional Mode applications will
// work with any SAX2 parser.
// New style applications will fail to run except on SAX2 parsers
// that support this particular feature.
// They will insist that feature flag have a value of "true", and the
// EntityResolver2 implementation they provide  might throw an exception
// if the original SAX 1.0 style entity resolution method is invoked.
// 
trait EntityResolver2 extends EntityResolver {

    @stub
    // Allows applications to provide an external subset for documents
    // that don't explicitly define one.
    def getExternalSubset(name: String, baseURI: String): InputSource = ???
}
