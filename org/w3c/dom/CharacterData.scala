package org.w3c.dom

import java.lang.String

// The CharacterData interface extends Node with a set of
// attributes and methods for accessing character data in the DOM. For
// clarity this set is defined here rather than on each object that uses
// these attributes and methods. No DOM objects correspond directly to
// CharacterData, though Text and others do
// inherit the interface from it. All offsets in this interface
// start from 0.
// As explained in the DOMString interface, text strings in
// the DOM are represented in UTF-16, i.e. as a sequence of 16-bit units. In
// the following, the term 16-bit units is used whenever necessary to
// indicate that indexing on CharacterData is done in 16-bit units.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait CharacterData extends Node {

    @stub
    // Append the string to the end of the character data of the node.
    def appendData(arg: String): Unit = ???

    @stub
    // Remove a range of 16-bit units from the node.
    def deleteData(offset: Int, count: Int): Unit = ???

    @stub
    // The character data of the node that implements this interface.
    def getData(): String = ???

    @stub
    // The number of 16-bit units that are available through data
    // and the substringData method below.
    def getLength(): Int = ???

    @stub
    // Insert a string at the specified 16-bit unit offset.
    def insertData(offset: Int, arg: String): Unit = ???

    @stub
    // Replace the characters starting at the specified 16-bit unit offset
    // with the specified string.
    def replaceData(offset: Int, count: Int, arg: String): Unit = ???

    @stub
    // The character data of the node that implements this interface.
    def setData(data: String): Unit = ???
}
