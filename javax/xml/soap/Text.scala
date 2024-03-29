package javax.xml.soap

import scala.scalanative.annotation.stub

/** A representation of a node whose value is text.  A Text object
 *  may represent text that is content or text that is a comment.
 */
trait Text extends Node with Text {

    /** Retrieves whether this Text object represents a comment. */
    @stub
    def isComment(): Boolean = ???
}
