package org.xml.sax.helpers

import java.lang.{Object, String}
import java.util.Enumeration

// Encapsulate Namespace logic for use by applications using SAX,
// or internally by SAX drivers.
//
// 
// This module, both source code and documentation, is in the
// Public Domain, and comes with NO WARRANTY.
// See http://www.saxproject.org
// for further information.
// 
//
// This class encapsulates the logic of Namespace processing: it
// tracks the declarations currently in force for each context and
// automatically processes qualified XML names into their Namespace
// parts; it can also be used in reverse for generating XML qnames
// from Namespaces.
//
// Namespace support objects are reusable, but the reset method
// must be invoked between each session.
//
// Here is a simple session:
//
// 
// String parts[] = new String[3];
// NamespaceSupport support = new NamespaceSupport();
//
// support.pushContext();
// support.declarePrefix("", "http://www.w3.org/1999/xhtml");
// support.declarePrefix("dc", "http://www.purl.org/dc#");
//
// parts = support.processName("p", parts, false);
// System.out.println("Namespace URI: " + parts[0]);
// System.out.println("Local name: " + parts[1]);
// System.out.println("Raw name: " + parts[2]);
//
// parts = support.processName("dc:title", parts, false);
// System.out.println("Namespace URI: " + parts[0]);
// System.out.println("Local name: " + parts[1]);
// System.out.println("Raw name: " + parts[2]);
//
// support.popContext();
// 
//
// Note that this class is optimized for the use case where most
// elements do not contain Namespace declarations: if the same
// prefix/URI mapping is repeated for each context (for example), this
// class will be somewhat less efficient.
//
// Although SAX drivers (parsers) may choose to use this class to
// implement namespace handling, they are not required to do so.
// Applications must track namespace information themselves if they
// want to use namespace information.
class NamespaceSupport extends Object {

    @stub
    // Declare a Namespace prefix.
    def declarePrefix(prefix: String, uri: String): Boolean = ???

    @stub
    // Return an enumeration of all prefixes declared in this context.
    def getDeclaredPrefixes(): Enumeration = ???

    @stub
    // Return one of the prefixes mapped to a Namespace URI.
    def getPrefix(uri: String): String = ???

    @stub
    // Return an enumeration of all prefixes whose declarations are
    // active in the current context.
    def getPrefixes(): Enumeration = ???

    @stub
    // Return an enumeration of all prefixes for a given URI whose
    // declarations are active in the current context.
    def getPrefixes(uri: String): Enumeration = ???

    @stub
    // Look up a prefix and get the currently-mapped Namespace URI.
    def getURI(prefix: String): String = ???

    @stub
    // Returns true if namespace declaration attributes are placed into
    // a namespace.
    def isNamespaceDeclUris(): Boolean = ???

    @stub
    // Revert to the previous Namespace context.
    def popContext(): Unit = ???

    @stub
    // Process a raw XML qualified name, after all declarations in the
    // current context have been handled by declarePrefix().
    def processName(qName: String, parts: Array[String], isAttribute: Boolean): Array[String] = ???

    @stub
    // Start a new Namespace context.
    def pushContext(): Unit = ???

    @stub
    // Reset this Namespace support object for reuse.
    def reset(): Unit = ???
}

object NamespaceSupport {
    @stub
    // The namespace declaration URI as a constant.
    def NSDECL: String = ???
}
