package org.w3c.dom

import java.lang.String

// The Element interface represents an element in an HTML or XML
// document. Elements may have attributes associated with them; since the
// Element interface inherits from Node, the
// generic Node interface attribute attributes may
// be used to retrieve the set of all attributes for an element. There are
// methods on the Element interface to retrieve either an
// Attr object by name or an attribute value by name. In XML,
// where an attribute value may contain entity references, an
// Attr object should be retrieved to examine the possibly
// fairly complex sub-tree representing the attribute value. On the other
// hand, in HTML, where all attributes have simple string values, methods to
// directly access an attribute value can safely be used as a convenience.
// Note: In DOM Level 2, the method normalize is
// inherited from the Node interface where it was moved.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait Element extends Node {

    @stub
    // Retrieves an attribute value by name.
    def getAttribute(name: String): String = ???

    @stub
    // Retrieves an attribute node by name.
    def getAttributeNode(name: String): Attr = ???

    @stub
    // Retrieves an Attr node by local name and namespace URI.
    def getAttributeNodeNS(namespaceURI: String, localName: String): Attr = ???

    @stub
    // Retrieves an attribute value by local name and namespace URI.
    def getAttributeNS(namespaceURI: String, localName: String): String = ???

    @stub
    // Returns a NodeList of all descendant Elements
    // with a given tag name, in document order.
    def getElementsByTagName(name: String): NodeList = ???

    @stub
    // Returns a NodeList of all the descendant
    // Elements with a given local name and namespace URI in
    // document order.
    def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = ???

    @stub
    // The type information associated with this element.
    def getSchemaTypeInfo(): TypeInfo = ???

    @stub
    // The name of the element.
    def getTagName(): String = ???

    @stub
    // Returns true when an attribute with a given name is
    // specified on this element or has a default value, false
    // otherwise.
    def hasAttribute(name: String): Boolean = ???

    @stub
    // Returns true when an attribute with a given local name and
    // namespace URI is specified on this element or has a default value,
    // false otherwise.
    def hasAttributeNS(namespaceURI: String, localName: String): Boolean = ???

    @stub
    // Removes an attribute by name.
    def removeAttribute(name: String): Unit = ???

    @stub
    // Removes the specified attribute node.
    def removeAttributeNode(oldAttr: Attr): Attr = ???

    @stub
    // Removes an attribute by local name and namespace URI.
    def removeAttributeNS(namespaceURI: String, localName: String): Unit = ???

    @stub
    // Adds a new attribute.
    def setAttribute(name: String, value: String): Unit = ???

    @stub
    // Adds a new attribute node.
    def setAttributeNode(newAttr: Attr): Attr = ???

    @stub
    // Adds a new attribute.
    def setAttributeNodeNS(newAttr: Attr): Attr = ???

    @stub
    // Adds a new attribute.
    def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = ???

    @stub
    // If the parameter isId is true, this method
    // declares the specified attribute to be a user-determined ID attribute
    // .
    def setIdAttribute(name: String, isId: Boolean): Unit = ???

    @stub
    // If the parameter isId is true, this method
    // declares the specified attribute to be a user-determined ID attribute
    // .
    def setIdAttributeNode(idAttr: Attr, isId: Boolean): Unit = ???
}
