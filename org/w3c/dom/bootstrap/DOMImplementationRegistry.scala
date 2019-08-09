package org.w3c.dom.bootstrap

import java.lang.{Object, String}
import org.w3c.dom.{DOMImplementation, DOMImplementationList, DOMImplementationSource}

// A factory that enables applications to obtain instances of
// DOMImplementation.
//
// 
// Example:
// 
//
// 
//  // get an instance of the DOMImplementation registry
//  DOMImplementationRegistry registry =
//       DOMImplementationRegistry.newInstance();
//  // get a DOM implementation the Level 3 XML module
//  DOMImplementation domImpl =
//       registry.getDOMImplementation("XML 3.0");
// 
//
// 
// This provides an application with an implementation-independent starting
// point. DOM implementations may modify this class to meet new security
// standards or to provide *additional* fallbacks for the list of
// DOMImplementationSources.
// 
final class DOMImplementationRegistry extends Object {

    @stub
    // Register an implementation.
    def addSource(s: DOMImplementationSource): Unit = ???

    @stub
    // Return the first implementation that has the desired
    // features, or null if none is found.
    def getDOMImplementation(features: String): DOMImplementation = ???

    @stub
    // Return a list of implementations that support the
    // desired features.
    def getDOMImplementationList(features: String): DOMImplementationList = ???
}
