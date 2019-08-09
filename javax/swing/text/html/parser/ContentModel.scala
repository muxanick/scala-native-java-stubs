package javax.swing.text.html.parser

import java.io.Serializable
import java.lang.Object
import java.util.Vector

// A representation of a content model. A content model is
// basically a restricted BNF expression. It is restricted in
// the sense that it must be deterministic. This means that you
// don't have to represent it as a finite state automaton.
// See Annex H on page 556 of the SGML handbook for more information.
final class ContentModel extends Object with Serializable {

    @stub
    // 
    def this() = ???

    @stub
    // Create a content model for an element.
    def this(content: Element) = ???

    @stub
    // Create a content model of a particular type.
    def this(type: Int, content: ContentModel) = ???

    @stub
    // The content.
    def content: Object = ???

    @stub
    // The next content model (in a ',', '|' or '&' expression).
    def next: ContentModel = ???

    @stub
    // Return true if the content model could
    // match an empty input stream.
    def empty(): Boolean = ???

    @stub
    // Return the element that must be next.
    def first(): Element = ???

    @stub
    // Return true if the token could potentially be the
    // first token in the input stream.
    def first(token: Object): Boolean = ???

    @stub
    // Update elemVec with the list of elements that are
    // part of the this contentModel.
    def getElements(elemVec: Vector[Element]): Unit = ???
}
