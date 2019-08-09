package org.w3c.dom

import java.lang.String

// Objects implementing the NamedNodeMap interface are used to
// represent collections of nodes that can be accessed by name. Note that
// NamedNodeMap does not inherit from NodeList;
// NamedNodeMaps are not maintained in any particular order.
// Objects contained in an object implementing NamedNodeMap may
// also be accessed by an ordinal index, but this is simply to allow
// convenient enumeration of the contents of a NamedNodeMap,
// and does not imply that the DOM specifies an order to these Nodes.
// NamedNodeMap objects in the DOM are live.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait NamedNodeMap {

    @stub
    // The number of nodes in this map.
    def getLength(): Int = ???

    @stub
    // Retrieves a node specified by name.
    def getNamedItem(name: String): Node = ???

    @stub
    // Retrieves a node specified by local name and namespace URI.
    def getNamedItemNS(namespaceURI: String, localName: String): Node = ???

    @stub
    // Returns the indexth item in the map.
    def item(index: Int): Node = ???

    @stub
    // Removes a node specified by name.
    def removeNamedItem(name: String): Node = ???

    @stub
    // Removes a node specified by local name and namespace URI.
    def removeNamedItemNS(namespaceURI: String, localName: String): Node = ???

    @stub
    // Adds a node using its nodeName attribute.
    def setNamedItem(arg: Node): Node = ???
}
