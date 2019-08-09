package javax.swing.text

import java.io.{InputStream, OutputStream, Reader, Serializable, Writer}
import java.lang.{Cloneable, Object, String}
import javax.swing.{Action, JEditorPane}
import scala.scalanative.annotation.stub

/** Establishes the set of things needed by a text component
 *  to be a reasonably functioning editor for some type
 *  of text content.  The EditorKit acts as a factory for some
 *  kind of policy.  For example, an implementation
 *  of html and rtf can be provided that is replaceable
 *  with other implementations.
 *  
 *  A kit can safely store editing state as an instance
 *  of the kit will be dedicated to a text component.
 *  New kits will normally be created by cloning a
 *  prototype kit.  The kit will have it's
 *  setComponent method called to establish
 *  it's relationship with a JTextComponent.
 */
abstract class EditorKit extends Object with Cloneable with Serializable {

    /** Construct an EditorKit. */
    @stub
    def this() = ???

    /** Creates a copy of the editor kit. */
    def clone(): Object

    /** Fetches a caret that can navigate through views
     *  produced by the associated ViewFactory.
     */
    def createCaret(): Caret

    /** Creates an uninitialized text storage model
     *  that is appropriate for this type of editor.
     */
    def createDefaultDocument(): Document

    /** Called when the kit is being removed from the
     *  JEditorPane.
     */
    def deinstall(c: JEditorPane): Unit

    /** Fetches the set of commands that can be used
     *  on a text component that is using a model and
     *  view produced by this kit.
     */
    def getActions(): Array[Action]

    /** Gets the MIME type of the data that this
     *  kit represents support for.
     */
    def getContentType(): String

    /** Fetches a factory that is suitable for producing
     *  views of any models that are produced by this
     *  kit.
     */
    def getViewFactory(): ViewFactory

    /** Called when the kit is being installed into the
     *  a JEditorPane.
     */
    def install(c: JEditorPane): Unit

    /** Inserts content from the given stream which is expected
     *  to be in a format appropriate for this kind of content
     *  handler.
     */
    def read(in: InputStream, doc: Document, pos: Int): Unit

    /** Inserts content from the given stream which is expected
     *  to be in a format appropriate for this kind of content
     *  handler.
     */
    def read(in: Reader, doc: Document, pos: Int): Unit

    /** Writes content from a document to the given stream
     *  in a format appropriate for this kind of content handler.
     */
    def write(out: OutputStream, doc: Document, pos: Int, len: Int): Unit

    /** Writes content from a document to the given stream
     *  in a format appropriate for this kind of content handler.
     */
    def write(out: Writer, doc: Document, pos: Int, len: Int): Unit
}
