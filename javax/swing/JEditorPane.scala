package javax.swing

import java.awt.{Component, Container, Dimension}
import java.io.InputStream
import java.lang.{ClassLoader, Object, String}
import java.net.URL
import javax.accessibility.AccessibleContext
import javax.swing.event.{HyperlinkEvent, HyperlinkListener}
import javax.swing.text.{EditorKit, JTextComponent}

// A text component to edit various kinds of content.
// You can find how-to information and examples of using editor panes in
// Using Text Components,
// a section in The Java Tutorial.
//
// 
// This component uses implementations of the
// EditorKit to accomplish its behavior. It effectively
// morphs into the proper kind of text editor for the kind
// of content it is given.  The content type that editor is bound
// to at any given time is determined by the EditorKit currently
// installed.  If the content is set to a new URL, its type is used
// to determine the EditorKit that should be used to
// load the content.
// 
// By default, the following types of content are known:
// 
// text/plain
// Plain text, which is the default the type given isn't
// recognized.  The kit used in this case is an extension of
// DefaultEditorKit that produces a wrapped plain text view.
// text/html
// HTML text.  The kit used in this case is the class
// javax.swing.text.html.HTMLEditorKit
// which provides HTML 3.2 support.
// text/rtf
// RTF text.  The kit used in this case is the class
// javax.swing.text.rtf.RTFEditorKit
// which provides a limited support of the Rich Text Format.
// 
// 
// There are several ways to load content into this component.
// 
// 
// The setText method can be used to initialize
// the component from a string.  In this case the current
// EditorKit will be used, and the content type will be
// expected to be of this type.
// 
// The read method can be used to initialize the
// component from a Reader.  Note that if the content type is HTML,
// relative references (e.g. for things like images) can't be resolved
// unless the <base> tag is used or the Base property
// on HTMLDocument is set.
// In this case the current EditorKit will be used,
// and the content type will be expected to be of this type.
// 
// The setPage method can be used to initialize
// the component from a URL.  In this case, the content type will be
// determined from the URL, and the registered EditorKit
// for that content type will be set.
// 
// 
// Some kinds of content may provide hyperlink support by generating
// hyperlink events.  The HTML EditorKit will generate
// hyperlink events if the JEditorPane is not editable
// (JEditorPane.setEditable(false); has been called).
// If HTML frames are embedded in the document, the typical response would be
// to change a portion of the current document.  The following code
// fragment is a possible hyperlink listener implementation, that treats
// HTML frame events specially, and simply displays any other activated
// hyperlinks.
// 
//
//     class Hyperactive implements HyperlinkListener {
// 
//         public void hyperlinkUpdate(HyperlinkEvent e) {
//             if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
//                 JEditorPane pane = (JEditorPane) e.getSource();
//                 if (e instanceof HTMLFrameHyperlinkEvent) {
//                     HTMLFrameHyperlinkEvent  evt = (HTMLFrameHyperlinkEvent)e;
//                     HTMLDocument doc = (HTMLDocument)pane.getDocument();
//                     doc.processHTMLFrameHyperlinkEvent(evt);
//                 } else {
//                     try {
//                         pane.setPage(e.getURL());
//                     } catch (Throwable t) {
//                         t.printStackTrace();
//                     }
//                 }
//             }
//         }
//     }
//
// 
// 
// For information on customizing how text/html is rendered please see
// W3C_LENGTH_UNITS and HONOR_DISPLAY_PROPERTIES
// 
// Culturally dependent information in some documents is handled through
// a mechanism called character encoding.  Character encoding is an
// unambiguous mapping of the members of a character set (letters, ideographs,
// digits, symbols, or control functions) to specific numeric code values. It
// represents the way the file is stored. Example character encodings are
// ISO-8859-1, ISO-8859-5, Shift-jis, Euc-jp, and UTF-8. When the file is
// passed to an user agent (JEditorPane) it is converted to
// the document character set (ISO-10646 aka Unicode).
// 
// There are multiple ways to get a character set mapping to happen
// with JEditorPane.
// 
// 
// One way is to specify the character set as a parameter of the MIME
// type.  This will be established by a call to the
// setContentType method.  If the content
// is loaded by the setPage method the content
// type will have been set according to the specification of the URL.
// It the file is loaded directly, the content type would be expected to
// have been set prior to loading.
// 
// Another way the character set can be specified is in the document itself.
// This requires reading the document prior to determining the character set
// that is desired.  To handle this, it is expected that the
// EditorKit.read operation throw a
// ChangedCharSetException which will
// be caught.  The read is then restarted with a new Reader that uses
// the character set specified in the ChangedCharSetException
// (which is an IOException).
// 
// 
// 
// Newlines
// 
// For a discussion on how newlines are handled, see
// DefaultEditorKit.
// 
//
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JEditorPane extends JTextComponent {

    @stub
    // Creates a new JEditorPane.
    def this() = ???

    @stub
    // Creates a JEditorPane based on a string containing
    // a URL specification.
    def this(url: String) = ???

    @stub
    // Creates a JEditorPane that has been initialized
    // to the given text.
    def this(type: String, text: String) = ???

    @stub
    // This class implements accessibility support for the
    // JEditorPane class.
    protected def JEditorPane.AccessibleJEditorPane: class = ???

    @stub
    // This class provides support for AccessibleHypertext,
    // and is used in instances where the EditorKit
    // installed in this JEditorPane is an instance of
    // HTMLEditorKit.
    protected def JEditorPane.AccessibleJEditorPaneHTML: class = ???

    @stub
    // Adds a hyperlink listener for notification of any changes, for example
    // when a link is selected and entered.
    def addHyperlinkListener(listener: HyperlinkListener): Unit = ???

    @stub
    // Creates the default editor kit (PlainEditorKit) for when
    // the component is first created.
    protected def createDefaultEditorKit(): EditorKit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    def fireHyperlinkUpdate(e: HyperlinkEvent): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JEditorPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the type of content that this editor
    // is currently set to deal with.
    def getContentType(): String = ???

    @stub
    // Fetches the currently installed kit for handling content.
    def getEditorKit(): EditorKit = ???

    @stub
    // Fetches the editor kit to use for the given type
    // of content.
    def getEditorKitForContentType(type: String): EditorKit = ???

    @stub
    // Returns an array of all the HyperLinkListeners added
    // to this JEditorPane with addHyperlinkListener().
    def getHyperlinkListeners(): Array[HyperlinkListener] = ???

    @stub
    // Gets the current URL being displayed.
    def getPage(): URL = ???

    @stub
    // Returns the preferred size for the JEditorPane.
    def getPreferredSize(): Dimension = ???

    @stub
    // Returns true if a viewport should always force the height of this
    // Scrollable to match the height of the viewport.
    def getScrollableTracksViewportHeight(): Boolean = ???

    @stub
    // Returns true if a viewport should always force the width of this
    // Scrollable to match the width of the viewport.
    def getScrollableTracksViewportWidth(): Boolean = ???

    @stub
    // Fetches a stream for the given URL, which is about to
    // be loaded by the setPage method.
    protected def getStream(page: URL): InputStream = ???

    @stub
    // Returns the text contained in this TextComponent
    // in terms of the
    // content type of this editor.
    def getText(): String = ???

    @stub
    // Gets the class ID for the UI.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JEditorPane.
    protected def paramString(): String = ???

    @stub
    // This method initializes from a stream.
    def read(in: InputStream, desc: Object): Unit = ???

    @stub
    // Removes a hyperlink listener.
    def removeHyperlinkListener(listener: HyperlinkListener): Unit = ???

    @stub
    // Replaces the currently selected content with new content
    // represented by the given string.
    def replaceSelection(content: String): Unit = ???

    @stub
    // Scrolls the view to the given reference location
    // (that is, the value returned by the UL.getRef
    // method for the URL being displayed).
    def scrollToReference(reference: String): Unit = ???

    @stub
    // Sets the type of content that this editor
    // handles.
    def setContentType(type: String): Unit = ???

    @stub
    // Sets the currently installed kit for handling
    // content.
    def setEditorKit(kit: EditorKit): Unit = ???

    @stub
    // Directly sets the editor kit to use for the given type.
    def setEditorKitForContentType(type: String, k: EditorKit): Unit = ???

    @stub
    // Sets the current URL being displayed.
    def setPage(url: String): Unit = ???

    @stub
    // Sets the current URL being displayed.
    def setPage(page: URL): Unit = ???
}

object JEditorPane {
    @stub
    // Key for a client property used to indicate whether
    // the default font and foreground color from the component are
    // used if a font or foreground color is not specified in the styled
    // text.
    def HONOR_DISPLAY_PROPERTIES: String = ???

    @stub
    // Creates a handler for the given type from the default registry
    // of editor kits.
    def createEditorKitForContentType(type: String): EditorKit = ???

    @stub
    // Returns the currently registered EditorKit
    // class name for the type type.
    def getEditorKitClassNameForContentType(type: String): String = ???

    @stub
    // Establishes the default bindings of type to
    // classname.
    def registerEditorKitForContentType(type: String, classname: String): Unit = ???

    @stub
    // Establishes the default bindings of type to
    // classname.
    def registerEditorKitForContentType(type: String, classname: String, loader: ClassLoader): Unit = ???
}
