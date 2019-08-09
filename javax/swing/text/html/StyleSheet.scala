package javax.swing.text.html

import java.awt.{Color, Font}
import java.io.Reader
import java.lang.{Object, String}
import java.net.URL
import java.util.Enumeration
import javax.swing.text.{AttributeSet, Element, MutableAttributeSet, Style, StyleContext, StyleContext.SmallAttributeSet, View}

// Support for defining the visual characteristics of
// HTML views being rendered.  The StyleSheet is used to
// translate the HTML model into visual characteristics.
// This enables views to be customized by a look-and-feel,
// multiple views over the same model can be rendered
// differently, etc.  This can be thought of as a CSS
// rule repository.  The key for CSS attributes is an
// object of type CSS.Attribute.  The type of the value
// is up to the StyleSheet implementation, but the
// toString method is required
// to return a string representation of CSS value.
// 
// The primary entry point for HTML View implementations
// to get their attributes is the
// getViewAttributes
// method.  This should be implemented to establish the
// desired policy used to associate attributes with the view.
// Each HTMLEditorKit (i.e. and therefore each associated
// JEditorPane) can have its own StyleSheet, but by default one
// sheet will be shared by all of the HTMLEditorKit instances.
// HTMLDocument instance can also have a StyleSheet, which
// holds the document-specific CSS specifications.
// 
// In order for Views to store less state and therefore be
// more lightweight, the StyleSheet can act as a factory for
// painters that handle some of the rendering tasks.  This allows
// implementations to determine what they want to cache
// and have the sharing potentially at the level that a
// selector is common to multiple views.  Since the StyleSheet
// may be used by views over multiple documents and typically
// the HTML attributes don't effect the selector being used,
// the potential for sharing is significant.
// 
// The rules are stored as named styles, and other information
// is stored to translate the context of an element to a
// rule quickly.  The following code fragment will display
// the named styles, and therefore the CSS rules contained.
// 
//  
//   import java.util.*;
//   import javax.swing.text.*;
//   import javax.swing.text.html.*;
//  
//   public class ShowStyles {
//  
//       public static void main(String[] args) {
//         HTMLEditorKit kit = new HTMLEditorKit();
//         HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
//         StyleSheet styles = doc.getStyleSheet();
//  
//         Enumeration rules = styles.getStyleNames();
//         while (rules.hasMoreElements()) {
//             String name = (String) rules.nextElement();
//             Style rule = styles.getStyle(name);
//             System.out.println(rule.toString());
//         }
//         System.exit(0);
//       }
//   }
//  
// 
// 
// The semantics for when a CSS style should overide visual attributes
// defined by an element are not well defined. For example, the html
// <body bgcolor=red> makes the body have a red
// background. But if the html file also contains the CSS rule
// body { background: blue } it becomes less clear as to
// what color the background of the body should be. The current
// implementation gives visual attributes defined in the element the
// highest precedence, that is they are always checked before any styles.
// Therefore, in the previous example the background would have a
// red color as the body element defines the background color to be red.
// 
// As already mentioned this supports CSS. We don't support the full CSS
// spec. Refer to the javadoc of the CSS class to see what properties
// we support. The two major CSS parsing related
// concepts we do not currently
// support are pseudo selectors, such as A:link { color: red },
// and the important modifier.
// 
// Note: This implementation is currently
// incomplete.  It can be replaced with alternative implementations
// that are complete.  Future versions of this class will provide
// better CSS support.
class StyleSheet extends StyleContext {

    @stub
    // Adds an attribute to the given set, and returns
    // the new representative set.
    def addAttribute(old: AttributeSet, key: Object, value: Object): AttributeSet = ???

    @stub
    // Adds a set of attributes to the element.
    def addAttributes(old: AttributeSet, attr: AttributeSet): AttributeSet = ???

    @stub
    // Adds a CSS attribute to the given set.
    def addCSSAttribute(attr: MutableAttributeSet, key: CSS.Attribute, value: String): Unit = ???

    @stub
    // Adds a CSS attribute to the given set.
    def addCSSAttributeFromHTML(attr: MutableAttributeSet, key: CSS.Attribute, value: String): Boolean = ???

    @stub
    // Adds a set of rules to the sheet.
    def addRule(rule: String): Unit = ???

    @stub
    // Adds the rules from the StyleSheet ss to those of
    // the receiver.
    def addStyleSheet(ss: StyleSheet): Unit = ???

    @stub
    // Creates a large set of attributes that should trade off
    // space for time.
    protected def createLargeAttributeSet(a: AttributeSet): MutableAttributeSet = ???

    @stub
    // Creates a compact set of attributes that might be shared.
    protected def createSmallAttributeSet(a: AttributeSet): StyleContext.SmallAttributeSet = ???

    @stub
    // Takes a set of attributes and turn it into a background color
    // specification.
    def getBackground(a: AttributeSet): Color = ???

    @stub
    // Returns the base.
    def getBase(): URL = ???

    @stub
    // Fetches the box formatter to use for the given set
    // of CSS attributes.
    def getBoxPainter(a: AttributeSet): StyleSheet.BoxPainter = ???

    @stub
    // Translates a CSS declaration to an AttributeSet that represents
    // the CSS declaration.
    def getDeclaration(decl: String): AttributeSet = ???

    @stub
    // Fetches the font to use for the given set of attributes.
    def getFont(a: AttributeSet): Font = ???

    @stub
    // Takes a set of attributes and turn it into a foreground color
    // specification.
    def getForeground(a: AttributeSet): Color = ???

    @stub
    // Fetches the list formatter to use for the given set
    // of CSS attributes.
    def getListPainter(a: AttributeSet): StyleSheet.ListPainter = ???

    @stub
    // Returns the point size, given a size index.
    def getPointSize(index: Int): float = ???

    @stub
    // Given a string such as "+2", "-2", or "2",
    //  returns a point size value.
    def getPointSize(size: String): float = ???

    @stub
    // Fetches the style to use to render the given type
    // of HTML tag.
    def getRule(t: HTML.Tag, e: Element): Style = ???

    @stub
    // Fetches the rule that best matches the selector given
    // in string form.
    def getRule(selector: String): Style = ???

    @stub
    // Returns an array of the linked StyleSheets.
    def getStyleSheets(): Array[StyleSheet] = ???

    @stub
    // Fetches a set of attributes to use in the view for
    // displaying.
    def getViewAttributes(v: View): AttributeSet = ???

    @stub
    // Imports a style sheet from url.
    def importStyleSheet(url: URL): Unit = ???

    @stub
    // Loads a set of rules that have been specified in terms of
    // CSS1 grammar.
    def loadRules(in: Reader, ref: URL): Unit = ???

    @stub
    // Removes an attribute from the set.
    def removeAttribute(old: AttributeSet, key: Object): AttributeSet = ???

    @stub
    // Removes a set of attributes.
    def removeAttributes(old: AttributeSet, attrs: AttributeSet): AttributeSet = ???

    @stub
    // Removes a set of attributes for the element.
    def removeAttributes(old: AttributeSet, names: Enumeration[_]): AttributeSet = ???

    @stub
    // Removes a named style previously added to the document.
    def removeStyle(nm: String): Unit = ???

    @stub
    // Removes the StyleSheet ss from those of the receiver.
    def removeStyleSheet(ss: StyleSheet): Unit = ???

    @stub
    // Sets the base.
    def setBase(base: URL): Unit = ???

    @stub
    // Sets the base font size, with valid values between 1 and 7.
    def setBaseFontSize(sz: Int): Unit = ???

    @stub
    // Sets the base font size from the passed in String.
    def setBaseFontSize(size: String): Unit = ???

    @stub
    // Converts a color string such as "RED" or "#NNNNNN" to a Color.
    def stringToColor(string: String): Color = ???
}

object StyleSheet {
    @stub
    // Class to carry out some of the duties of
    // CSS formatting.
    def StyleSheet.BoxPainter: class = ???

    @stub
    // 
    def getIndexOfSize(pt: float): Int = ???
}
