package javax.swing.text.html.parser

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Vector
import scala.scalanative.annotation.stub

/** A representation of a content model. A content model is
 *  basically a restricted BNF expression. It is restricted in
 *  the sense that it must be deterministic. This means that you
 *  don't have to represent it as a finite state automaton.
 *  See Annex H on page 556 of the SGML handbook for more information.
 */
final class ContentModel extends Object with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Create a content model for an element. */
    @stub
    def this(content: Element) = ???

    /** Create a content model of a particular type. */
    @stub
    def this(type: Int, content: ContentModel) = ???

    /** Create a content model of a particular type. */
    @stub
    def this(type: Int, content: Object, next: ContentModel) = ???

    /** The content. */
    @stub
    val content: Object = ???

    /** The next content model (in a ',', '|' or '&' expression). */
    @stub
    val next: ContentModel = ???

    /** Type. */
    @stub
    val type: Int = ???

    /** Return true if the content model could
     *  match an empty input stream.
     */
    @stub
    def empty(): Boolean = ???

    /** Return the element that must be next. */
    @stub
    def first(): Element = ???

    /** Return true if the token could potentially be the
     *  first token in the input stream.
     */
    @stub
    def first(token: Object): Boolean = ???

    /** Update elemVec with the list of elements that are
     *  part of the this contentModel.
     */
    @stub
    def getElements(elemVec: Vector[Element]): Unit = ???

    /** Convert to a string. */
    @stub
    def toString(): String = ???
}
