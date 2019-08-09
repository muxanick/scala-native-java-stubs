package org.w3c.dom.ls

// LSResourceResolver provides a way for applications to
// redirect references to external resources.
//  Applications needing to implement custom handling for external
// resources can implement this interface and register their implementation
// by setting the "resource-resolver" parameter of
// DOMConfiguration objects attached to LSParser
// and LSSerializer. It can also be register on
// DOMConfiguration objects attached to Document
// if the "LS" feature is supported.
//  The LSParser will then allow the application to intercept
// any external entities, including the external DTD subset and external
// parameter entities, before including them. The top-level document entity
// is never passed to the resolveResource method.
//  Many DOM applications will not need to implement this interface, but it
// will be especially useful for applications that build XML documents from
// databases or other specialized input sources, or for applications that
// use URNs.
// Note:  LSResourceResolver is based on the SAX2 [SAX] EntityResolver
// interface.
// See also the Document Object Model (DOM) Level 3 Load
//and Save Specification.
trait LSResourceResolver {
}
