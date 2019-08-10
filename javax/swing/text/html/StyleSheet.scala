package javax.swing.text.html

import java.awt.{Color, Font}
import java.io.Reader
import java.lang.{Object, String}
import java.net.URL
import java.util.Enumeration
import javax.swing.text.{AttributeSet, Element, MutableAttributeSet, Style, StyleContext, StyleContext.SmallAttributeSet, View}
import scala.scalanative.annotation.stub

/** Support for defining the visual characteristics of
 *  HTML views being rendered.  The StyleSheet is used to
 *  translate the HTML model into visual characteristics.
 *  This enables views to be customized by a look-and-feel,
 *  multiple views over the same model can be rendered
 *  differently, etc.  This can be thought of as a CSS
 *  rule repository.  The key for CSS attributes is an
 *  object of type CSS.Attribute.  The type of the value
 *  is up to the StyleSheet implementation, but the
 *  toString method is required
 *  to return a string representation of CSS value.
 *  
 *  The primary entry point for HTML View implementations
 *  to get their attributes is the
 *  getViewAttributes
 *  method.  This should be implemented to establish the
 *  desired policy used to associate attributes with the view.
 *  Each HTMLEditorKit (i.e. and therefore each associated
 *  JEditorPane) can have its own StyleSheet, but by default one
 *  sheet will be shared by all of the HTMLEditorKit instances.
 *  HTMLDocument instance can also have a StyleSheet, which
 *  holds the document-specific CSS specifications.
 *  
 *  In order for Views to store less state and therefore be
 *  more lightweight, the StyleSheet can act as a factory for
 *  painters that handle some of the rendering tasks.  This allows
 *  implementations to determine what they want to cache
 *  and have the sharing potentially at the level that a
 *  selector is common to multiple views.  Since the StyleSheet
 *  may be used by views over multiple documents and typically
 *  the HTML attributes don't effect the selector being used,
 *  the potential for sharing is significant.
 *  
 *  The rules are stored as named styles, and other information
 *  is stored to translate the context of an element to a
 *  rule quickly.  The following code fragment will display
 *  the named styles, and therefore the CSS rules contained.
 *  
 *   
 *    import java.util.*;
 *    import javax.swing.text.*;
 *    import javax.swing.text.html.*;
 *   
 *    public class ShowStyles {
 *   
 *        public static void main(String[] args) {
 *          HTMLEditorKit kit = new HTMLEditorKit();
 *          HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
 *          StyleSheet styles = doc.getStyleSheet();
 *   
 *          Enumeration rules = styles.getStyleNames();
 *          while (rules.hasMoreElements()) {
 *              String name = (String) rules.nextElement();
 *              Style rule = styles.getStyle(name);
 *              System.out.println(rule.toString());
 *          }
 *          System.exit(0);
 *        }
 *    }
 *   
 *  
 *  
 *  The semantics for when a CSS style should overide visual attributes
 *  defined by an element are not well defined. For example, the html
 *  <body bgcolor=red> makes the body have a red
 *  background. But if the html file also contains the CSS rule
 *  body { background: blue } it becomes less clear as to
 *  what color the background of the body should be. The current
 *  implementation gives visual attributes defined in the element the
 *  highest precedence, that is they are always checked before any styles.
 *  Therefore, in the previous example the background would have a
 *  red color as the body element defines the background color to be red.
 *  
 *  As already mentioned this supports CSS. We don't support the full CSS
 *  spec. Refer to the javadoc of the CSS class to see what properties
 *  we support. The two major CSS parsing related
 *  concepts we do not currently
 *  support are pseudo selectors, such as A:link { color: red },
 *  and the important modifier.
 *  
 *  Note: This implementation is currently
 *  incomplete.  It can be replaced with alternative implementations
 *  that are complete.  Future versions of this class will provide
 *  better CSS support.
 */
class StyleSheet extends StyleContext {

    /** Construct a StyleSheet */
    @stub
    def this() = ???

    /** Adds an attribute to the given set, and returns
     *  the new representative set.
     */
    @stub
    def addAttribute(old: AttributeSet, key: Any, value: Any): AttributeSet = ???

    /** Adds a set of attributes to the element. */
    @stub
    def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

    /** Adds a CSS attribute to the given set. */
    @stub
    def addCSSAttribute(attr: MutableAttributeSet, key: CSS.Attribute, value: String): Unit = ???

    /** Adds a CSS attribute to the given set. */
    @stub
    def addCSSAttributeFromHTML(attr: MutableAttributeSet, key: CSS.Attribute, value: String): Boolean = ???

    /** Adds a set of rules to the sheet. */
    @stub
    def addRule(rule: String): Unit = ???

    /** Adds the rules from the StyleSheet ss to those of
     *  the receiver.
     */
    @stub
    def addStyleSheet(ss: StyleSheet): Unit = ???

    /** Creates a large set of attributes that should trade off
     *  space for time.
     */
    @stub
    protected def createLargeAttributeSet(a: AttributeSet): MutableAttributeSet = ???

    /** Creates a compact set of attributes that might be shared. */
    @stub
    protected def createSmallAttributeSet(a: AttributeSet): StyleContext.SmallAttributeSet = ???

    /** Takes a set of attributes and turn it into a background color
     *  specification.
     */
    @stub
    def getBackground(a: AttributeSet): Color = ???

    /** Returns the base. */
    @stub
    def getBase(): URL = ???

    /** Fetches the box formatter to use for the given set
     *  of CSS attributes.
     */
    @stub
    def getBoxPainter(a: AttributeSet): StyleSheet.BoxPainter = ???

    /** Translates a CSS declaration to an AttributeSet that represents
     *  the CSS declaration.
     */
    @stub
    def getDeclaration(decl: String): AttributeSet = ???

    /** Fetches the font to use for the given set of attributes. */
    @stub
    def getFont(a: AttributeSet): Font = ???

    /** Takes a set of attributes and turn it into a foreground color
     *  specification.
     */
    @stub
    def getForeground(a: AttributeSet): Color = ???

    /** Fetches the list formatter to use for the given set
     *  of CSS attributes.
     */
    @stub
    def getListPainter(a: AttributeSet): StyleSheet.ListPainter = ???

    /** Returns the point size, given a size index. */
    @stub
    def getPointSize(index: Int): Float = ???

    /** Given a string such as "+2", "-2", or "2",
     *   returns a point size value.
     */
    @stub
    def getPointSize(size: String): Float = ???

    /** Fetches the style to use to render the given type
     *  of HTML tag.
     */
    @stub
    def getRule(t: HTML.Tag, e: Element): Style = ???

    /** Fetches the rule that best matches the selector given
     *  in string form.
     */
    @stub
    def getRule(selector: String): Style = ???

    /** Returns an array of the linked StyleSheets. */
    @stub
    def getStyleSheets(): Array[StyleSheet] = ???

    /** Fetches a set of attributes to use in the view for
     *  displaying.
     */
    @stub
    def getViewAttributes(v: View): AttributeSet = ???

    /** Imports a style sheet from url. */
    @stub
    def importStyleSheet(url: URL): Unit = ???

    /** Loads a set of rules that have been specified in terms of
     *  CSS1 grammar.
     */
    @stub
    def loadRules(in: Reader, ref: URL): Unit = ???

    /** Removes an attribute from the set. */
    @stub
    def removeAttribute(old: AttributeSet, key: Any): AttributeSet = ???

    /** Removes a set of attributes. */
    @stub
    def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???

    /** Removes a set of attributes for the element. */
    @stub
    def removeAttributes(old: AttributeSet, names: Enumeration[_]): AttributeSet = ???

    /** Removes a named style previously added to the document. */
    @stub
    def removeStyle(nm: String): Unit = ???

    /** Removes the StyleSheet ss from those of the receiver. */
    @stub
    def removeStyleSheet(ss: StyleSheet): Unit = ???

    /** Sets the base. */
    @stub
    def setBase(base: URL): Unit = ???

    /** Sets the base font size, with valid values between 1 and 7. */
    @stub
    def setBaseFontSize(sz: Int): Unit = ???

    /** Sets the base font size from the passed in String. */
    @stub
    def setBaseFontSize(size: String): Unit = ???

    /** Converts a color string such as "RED" or "#NNNNNN" to a Color. */
    @stub
    def stringToColor(string: String): Color = ???

    /** Converts a set of HTML attributes to an equivalent
     *  set of CSS attributes.
     */
    @stub
    def translateHTMLToCSS(htmlAttrSet: AttributeSet): AttributeSet = ???
}

object StyleSheet {
    /** Class to carry out some of the duties of
     *  CSS formatting.
     */
    type BoxPainter = StyleSheet_BoxPainter

    /** Class to carry out some of the duties of CSS list
     *  formatting.
     */
    type ListPainter = StyleSheet_ListPainter

    /**  */
    @stub
    def getIndexOfSize(pt: Float): Int = ???
}
