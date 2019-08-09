package javax.swing

import java.awt.{Component, Container, Dimension}
import java.io.InputStream
import java.lang.{ClassLoader, Object, String}
import java.net.URL
import javax.accessibility.AccessibleContext
import javax.swing.event.{HyperlinkEvent, HyperlinkListener}
import javax.swing.text.{EditorKit, JTextComponent}
import scala.scalanative.annotation.stub

/** A text component to edit various kinds of content.
 *  You can find how-to information and examples of using editor panes in
 *  Using Text Components,
 *  a section in The Java Tutorial.
 * 
 *  
 *  This component uses implementations of the
 *  EditorKit to accomplish its behavior. It effectively
 *  morphs into the proper kind of text editor for the kind
 *  of content it is given.  The content type that editor is bound
 *  to at any given time is determined by the EditorKit currently
 *  installed.  If the content is set to a new URL, its type is used
 *  to determine the EditorKit that should be used to
 *  load the content.
 *  
 *  By default, the following types of content are known:
 *  
 *  text/plain
 *  Plain text, which is the default the type given isn't
 *  recognized.  The kit used in this case is an extension of
 *  DefaultEditorKit that produces a wrapped plain text view.
 *  text/html
 *  HTML text.  The kit used in this case is the class
 *  javax.swing.text.html.HTMLEditorKit
 *  which provides HTML 3.2 support.
 *  text/rtf
 *  RTF text.  The kit used in this case is the class
 *  javax.swing.text.rtf.RTFEditorKit
 *  which provides a limited support of the Rich Text Format.
 *  
 *  
 *  There are several ways to load content into this component.
 *  
 *  
 *  The setText method can be used to initialize
 *  the component from a string.  In this case the current
 *  EditorKit will be used, and the content type will be
 *  expected to be of this type.
 *  
 *  The read method can be used to initialize the
 *  component from a Reader.  Note that if the content type is HTML,
 *  relative references (e.g. for things like images) can't be resolved
 *  unless the <base> tag is used or the Base property
 *  on HTMLDocument is set.
 *  In this case the current EditorKit will be used,
 *  and the content type will be expected to be of this type.
 *  
 *  The setPage method can be used to initialize
 *  the component from a URL.  In this case, the content type will be
 *  determined from the URL, and the registered EditorKit
 *  for that content type will be set.
 *  
 *  
 *  Some kinds of content may provide hyperlink support by generating
 *  hyperlink events.  The HTML EditorKit will generate
 *  hyperlink events if the JEditorPane is not editable
 *  (JEditorPane.setEditable(false); has been called).
 *  If HTML frames are embedded in the document, the typical response would be
 *  to change a portion of the current document.  The following code
 *  fragment is a possible hyperlink listener implementation, that treats
 *  HTML frame events specially, and simply displays any other activated
 *  hyperlinks.
 *  
 * 
 *      class Hyperactive implements HyperlinkListener {
 *  
 *          public void hyperlinkUpdate(HyperlinkEvent e) {
 *              if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
 *                  JEditorPane pane = (JEditorPane) e.getSource();
 *                  if (e instanceof HTMLFrameHyperlinkEvent) {
 *                      HTMLFrameHyperlinkEvent  evt = (HTMLFrameHyperlinkEvent)e;
 *                      HTMLDocument doc = (HTMLDocument)pane.getDocument();
 *                      doc.processHTMLFrameHyperlinkEvent(evt);
 *                  } else {
 *                      try {
 *                          pane.setPage(e.getURL());
 *                      } catch (Throwable t) {
 *                          t.printStackTrace();
 *                      }
 *                  }
 *              }
 *          }
 *      }
 * 
 *  
 *  
 *  For information on customizing how text/html is rendered please see
 *  W3C_LENGTH_UNITS and HONOR_DISPLAY_PROPERTIES
 *  
 *  Culturally dependent information in some documents is handled through
 *  a mechanism called character encoding.  Character encoding is an
 *  unambiguous mapping of the members of a character set (letters, ideographs,
 *  digits, symbols, or control functions) to specific numeric code values. It
 *  represents the way the file is stored. Example character encodings are
 *  ISO-8859-1, ISO-8859-5, Shift-jis, Euc-jp, and UTF-8. When the file is
 *  passed to an user agent (JEditorPane) it is converted to
 *  the document character set (ISO-10646 aka Unicode).
 *  
 *  There are multiple ways to get a character set mapping to happen
 *  with JEditorPane.
 *  
 *  
 *  One way is to specify the character set as a parameter of the MIME
 *  type.  This will be established by a call to the
 *  setContentType method.  If the content
 *  is loaded by the setPage method the content
 *  type will have been set according to the specification of the URL.
 *  It the file is loaded directly, the content type would be expected to
 *  have been set prior to loading.
 *  
 *  Another way the character set can be specified is in the document itself.
 *  This requires reading the document prior to determining the character set
 *  that is desired.  To handle this, it is expected that the
 *  EditorKit.read operation throw a
 *  ChangedCharSetException which will
 *  be caught.  The read is then restarted with a new Reader that uses
 *  the character set specified in the ChangedCharSetException
 *  (which is an IOException).
 *  
 *  
 *  
 *  Newlines
 *  
 *  For a discussion on how newlines are handled, see
 *  DefaultEditorKit.
 *  
 * 
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JEditorPane extends JTextComponent {

    /** Creates a new JEditorPane. */
    @stub
    def this() = ???

    /** Creates a JEditorPane based on a string containing
     *  a URL specification.
     */
    @stub
    def this(url: String) = ???

    /** Creates a JEditorPane that has been initialized
     *  to the given text.
     */
    @stub
    def this(type: String, text: String) = ???

    /** Creates a JEditorPane based on a specified URL for input. */
    @stub
    def this(initialPage: URL) = ???

    /** This class implements accessibility support for the
     *  JEditorPane class.
     */
    @stub
    protected object AccessibleJEditorPane extends JEditorPane.AccessibleJEditorPane

    /** This class provides support for AccessibleHypertext,
     *  and is used in instances where the EditorKit
     *  installed in this JEditorPane is an instance of
     *  HTMLEditorKit.
     */
    @stub
    protected object AccessibleJEditorPaneHTML extends JEditorPane.AccessibleJEditorPaneHTML

    /** What's returned by
     *  AccessibleJEditorPaneHTML.getAccessibleText.
     */
    @stub
    protected object JEditorPaneAccessibleHypertextSupport extends JEditorPane.JEditorPaneAccessibleHypertextSupport

    /** Adds a hyperlink listener for notification of any changes, for example
     *  when a link is selected and entered.
     */
    @stub
    def addHyperlinkListener(listener: HyperlinkListener): Unit = ???

    /** Creates the default editor kit (PlainEditorKit) for when
     *  the component is first created.
     */
    @stub
    protected def createDefaultEditorKit(): EditorKit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    def fireHyperlinkUpdate(e: HyperlinkEvent): Unit = ???

    /** Gets the AccessibleContext associated with this JEditorPane. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the type of content that this editor
     *  is currently set to deal with.
     */
    @stub
    def getContentType(): String = ???

    /** Fetches the currently installed kit for handling content. */
    @stub
    def getEditorKit(): EditorKit = ???

    /** Fetches the editor kit to use for the given type
     *  of content.
     */
    @stub
    def getEditorKitForContentType(type: String): EditorKit = ???

    /** Returns an array of all the HyperLinkListeners added
     *  to this JEditorPane with addHyperlinkListener().
     */
    @stub
    def getHyperlinkListeners(): Array[HyperlinkListener] = ???

    /** Gets the current URL being displayed. */
    @stub
    def getPage(): URL = ???

    /** Returns the preferred size for the JEditorPane. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Returns true if a viewport should always force the height of this
     *  Scrollable to match the height of the viewport.
     */
    @stub
    def getScrollableTracksViewportHeight(): Boolean = ???

    /** Returns true if a viewport should always force the width of this
     *  Scrollable to match the width of the viewport.
     */
    @stub
    def getScrollableTracksViewportWidth(): Boolean = ???

    /** Fetches a stream for the given URL, which is about to
     *  be loaded by the setPage method.
     */
    @stub
    protected def getStream(page: URL): InputStream = ???

    /** Returns the text contained in this TextComponent
     *  in terms of the
     *  content type of this editor.
     */
    @stub
    def getText(): String = ???

    /** Gets the class ID for the UI. */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JEditorPane. */
    @stub
    protected def paramString(): String = ???

    /** This method initializes from a stream. */
    @stub
    def read(in: InputStream, desc: Object): Unit = ???

    /** Removes a hyperlink listener. */
    @stub
    def removeHyperlinkListener(listener: HyperlinkListener): Unit = ???

    /** Replaces the currently selected content with new content
     *  represented by the given string.
     */
    @stub
    def replaceSelection(content: String): Unit = ???

    /** Scrolls the view to the given reference location
     *  (that is, the value returned by the UL.getRef
     *  method for the URL being displayed).
     */
    @stub
    def scrollToReference(reference: String): Unit = ???

    /** Sets the type of content that this editor
     *  handles.
     */
    @stub
    def setContentType(type: String): Unit = ???

    /** Sets the currently installed kit for handling
     *  content.
     */
    @stub
    def setEditorKit(kit: EditorKit): Unit = ???

    /** Directly sets the editor kit to use for the given type. */
    @stub
    def setEditorKitForContentType(type: String, k: EditorKit): Unit = ???

    /** Sets the current URL being displayed. */
    @stub
    def setPage(url: String): Unit = ???

    /** Sets the current URL being displayed. */
    @stub
    def setPage(page: URL): Unit = ???

    /** Sets the text of this TextComponent to the specified
     *  content,
     *  which is expected to be in the format of the content type of
     *  this editor.
     */
    @stub
    def setText(t: String): Unit = ???
}

object JEditorPane {
    /** Key for a client property used to indicate whether
     *  the default font and foreground color from the component are
     *  used if a font or foreground color is not specified in the styled
     *  text.
     */
    @stub
    val HONOR_DISPLAY_PROPERTIES: String = ???

    /** Key for a client property used to indicate whether
     *  
     *  w3c compliant length units are used for html rendering.
     */
    @stub
    val W3C_LENGTH_UNITS: String = ???

    /** Creates a handler for the given type from the default registry
     *  of editor kits.
     */
    @stub
    def createEditorKitForContentType(type: String): EditorKit = ???

    /** Returns the currently registered EditorKit
     *  class name for the type type.
     */
    @stub
    def getEditorKitClassNameForContentType(type: String): String = ???

    /** Establishes the default bindings of type to
     *  classname.
     */
    @stub
    def registerEditorKitForContentType(type: String, classname: String): Unit = ???

    /** Establishes the default bindings of type to
     *  classname.
     */
    @stub
    def registerEditorKitForContentType(type: String, classname: String, loader: ClassLoader): Unit = ???
}
