package java.awt.im

import java.awt.font.TextAttribute
import java.lang.Object
import java.util.Map
import scala.scalanative.annotation.stub

/** An InputMethodHighlight is used to describe the highlight
 *  attributes of text being composed.
 *  The description can be at two levels:
 *  at the abstract level it specifies the conversion state and whether the
 *  text is selected; at the concrete level it specifies style attributes used
 *  to render the highlight.
 *  An InputMethodHighlight must provide the description at the
 *  abstract level; it may or may not provide the description at the concrete
 *  level.
 *  If no concrete style is provided, a renderer should use
 *  Toolkit.mapInputMethodHighlight(java.awt.im.InputMethodHighlight) to map to a concrete style.
 *  
 *  The abstract description consists of three fields: selected,
 *  state, and variation.
 *  selected indicates whether the text range is the one that the
 *  input method is currently working on, for example, the segment for which
 *  conversion candidates are currently shown in a menu.
 *  state represents the conversion state. State values are defined
 *  by the input method framework and should be distinguished in all
 *  mappings from abstract to concrete styles. Currently defined state values
 *  are raw (unconverted) and converted.
 *  These state values are recommended for use before and after the
 *  main conversion step of text composition, say, before and after kana->kanji
 *  or pinyin->hanzi conversion.
 *  The variation field allows input methods to express additional
 *  information about the conversion results.
 *  
 * 
 *  InputMethodHighlight instances are typically used as attribute values
 *  returned from AttributedCharacterIterator for the INPUT_METHOD_HIGHLIGHT
 *  attribute. They may be wrapped into Annotation
 *  instances to indicate separate text segments.
 */
class InputMethodHighlight extends Object {

    /** Constructs an input method highlight record. */
    @stub
    def this(selected: Boolean, state: Int) = ???

    /** Constructs an input method highlight record. */
    @stub
    def this(selected: Boolean, state: Int, variation: Int) = ???

    /** Constructs an input method highlight record. */
    @stub
    def this(selected: Boolean, state: Int, variation: Int, style: Map[TextAttribute, _]) = ???

    /** Returns the conversion state of the text range. */
    @stub
    def getState(): Int = ???

    /** Returns the rendering style attributes for the text range, or null. */
    @stub
    def getStyle(): Map[TextAttribute, _] = ???

    /** Returns the variation of the text range. */
    @stub
    def getVariation(): Int = ???

    /** Returns whether the text range is selected. */
    @stub
    def isSelected(): Boolean = ???
}

object InputMethodHighlight {
    /** Constant for the converted text state. */
    @stub
    val CONVERTED_TEXT: Int = ???

    /** Constant for the raw text state. */
    @stub
    val RAW_TEXT: Int = ???

    /** Constant for the default highlight for selected converted text. */
    @stub
    val SELECTED_CONVERTED_TEXT_HIGHLIGHT: InputMethodHighlight = ???

    /** Constant for the default highlight for selected raw text. */
    @stub
    val SELECTED_RAW_TEXT_HIGHLIGHT: InputMethodHighlight = ???

    /** Constant for the default highlight for unselected converted text. */
    @stub
    val UNSELECTED_CONVERTED_TEXT_HIGHLIGHT: InputMethodHighlight = ???

    /** Constant for the default highlight for unselected raw text. */
    @stub
    val UNSELECTED_RAW_TEXT_HIGHLIGHT: InputMethodHighlight = ???
}
