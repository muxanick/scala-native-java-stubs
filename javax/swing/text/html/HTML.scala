package javax.swing.text.html

import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** Constants used in the HTMLDocument.  These
 *  are basically tag and attribute definitions.
 */
class HTML extends Object {

    /**  */
    @stub
    def this() = ???
}

object HTML {
    /** Typesafe enumeration representing an HTML
     *  attribute.
     */
    final object Attribute extends Object {

        /**  */
        @stub
        val ACTION: Attribute = ???

        /**  */
        @stub
        val ALIGN: Attribute = ???

        /**  */
        @stub
        val ALINK: Attribute = ???

        /**  */
        @stub
        val ALT: Attribute = ???

        /**  */
        @stub
        val ARCHIVE: Attribute = ???

        /**  */
        @stub
        val BACKGROUND: Attribute = ???

        /**  */
        @stub
        val BGCOLOR: Attribute = ???

        /**  */
        @stub
        val BORDER: Attribute = ???

        /**  */
        @stub
        val CELLPADDING: Attribute = ???

        /**  */
        @stub
        val CELLSPACING: Attribute = ???

        /**  */
        @stub
        val CHECKED: Attribute = ???

        /**  */
        @stub
        val CLASS: Attribute = ???

        /**  */
        @stub
        val CLASSID: Attribute = ???

        /**  */
        @stub
        val CLEAR: Attribute = ???

        /**  */
        @stub
        val CODE: Attribute = ???

        /**  */
        @stub
        val CODEBASE: Attribute = ???

        /**  */
        @stub
        val CODETYPE: Attribute = ???

        /**  */
        @stub
        val COLOR: Attribute = ???

        /**  */
        @stub
        val COLS: Attribute = ???

        /**  */
        @stub
        val COLSPAN: Attribute = ???

        /**  */
        @stub
        val COMMENT: Attribute = ???

        /**  */
        @stub
        val COMPACT: Attribute = ???

        /**  */
        @stub
        val CONTENT: Attribute = ???

        /**  */
        @stub
        val COORDS: Attribute = ???

        /**  */
        @stub
        val DATA: Attribute = ???

        /**  */
        @stub
        val DECLARE: Attribute = ???

        /**  */
        @stub
        val DIR: Attribute = ???

        /**  */
        @stub
        val DUMMY: Attribute = ???

        /**  */
        @stub
        val ENCTYPE: Attribute = ???

        /**  */
        @stub
        val ENDTAG: Attribute = ???

        /**  */
        @stub
        val FACE: Attribute = ???

        /**  */
        @stub
        val FRAMEBORDER: Attribute = ???

        /**  */
        @stub
        val HALIGN: Attribute = ???

        /**  */
        @stub
        val HEIGHT: Attribute = ???

        /**  */
        @stub
        val HREF: Attribute = ???

        /**  */
        @stub
        val HSPACE: Attribute = ???

        /**  */
        @stub
        val HTTPEQUIV: Attribute = ???

        /**  */
        @stub
        val ID: Attribute = ???

        /**  */
        @stub
        val ISMAP: Attribute = ???

        /**  */
        @stub
        val LANG: Attribute = ???

        /**  */
        @stub
        val LANGUAGE: Attribute = ???

        /**  */
        @stub
        val LINK: Attribute = ???

        /**  */
        @stub
        val LOWSRC: Attribute = ???

        /**  */
        @stub
        val MARGINHEIGHT: Attribute = ???

        /**  */
        @stub
        val MARGINWIDTH: Attribute = ???

        /**  */
        @stub
        val MAXLENGTH: Attribute = ???

        /**  */
        @stub
        val METHOD: Attribute = ???

        /**  */
        @stub
        val MULTIPLE: Attribute = ???

        /**  */
        @stub
        val N: Attribute = ???

        /**  */
        @stub
        val NAME: Attribute = ???

        /**  */
        @stub
        val NOHREF: Attribute = ???

        /**  */
        @stub
        val NORESIZE: Attribute = ???

        /**  */
        @stub
        val NOSHADE: Attribute = ???

        /**  */
        @stub
        val NOWRAP: Attribute = ???

        /**  */
        @stub
        val PROMPT: Attribute = ???

        /**  */
        @stub
        val REL: Attribute = ???

        /**  */
        @stub
        val REV: Attribute = ???

        /**  */
        @stub
        val ROWS: Attribute = ???

        /**  */
        @stub
        val ROWSPAN: Attribute = ???

        /**  */
        @stub
        val SCROLLING: Attribute = ???

        /**  */
        @stub
        val SELECTED: Attribute = ???

        /**  */
        @stub
        val SHAPE: Attribute = ???

        /**  */
        @stub
        val SHAPES: Attribute = ???

        /**  */
        @stub
        val SIZE: Attribute = ???

        /**  */
        @stub
        val SRC: Attribute = ???

        /**  */
        @stub
        val STANDBY: Attribute = ???

        /**  */
        @stub
        val START: Attribute = ???

        /**  */
        @stub
        val STYLE: Attribute = ???

        /**  */
        @stub
        val TARGET: Attribute = ???

        /**  */
        @stub
        val TEXT: Attribute = ???

        /**  */
        @stub
        val TITLE: Attribute = ???

        /**  */
        @stub
        val TYPE: Attribute = ???

        /**  */
        @stub
        val USEMAP: Attribute = ???

        /**  */
        @stub
        val VALIGN: Attribute = ???

        /**  */
        @stub
        val VALUE: Attribute = ???

        /**  */
        @stub
        val VALUETYPE: Attribute = ???

        /**  */
        @stub
        val VERSION: Attribute = ???

        /**  */
        @stub
        val VLINK: Attribute = ???

        /**  */
        @stub
        val VSPACE: Attribute = ???

        /**  */
        @stub
        val WIDTH: Attribute = ???

        /** Returns the string representation of this attribute. */
        @stub
        def toString(): String = ???
    }


    /** Typesafe enumeration for an HTML tag.  Although the
     *  set of HTML tags is a closed set, we have left the
     *  set open so that people can add their own tag types
     *  to their custom parser and still communicate to the
     *  reader.
     */
    object Tag extends Object {

        /**  */
        @stub
        def apply() = ???

        /** Creates a new Tag with the specified id,
         *  and with causesBreak and isBlock
         *  set to false.
         */
        @stub
        protected def apply(id: String) = ???

        /** Creates a new Tag with the specified id;
         *  causesBreak and isBlock are defined
         *  by the user.
         */
        @stub
        protected def apply(id: String, causesBreak: Boolean, isBlock: Boolean) = ???

        /**  */
        @stub
        val A: Tag = ???

        /**  */
        @stub
        val ADDRESS: Tag = ???

        /**  */
        @stub
        val APPLET: Tag = ???

        /**  */
        @stub
        val AREA: Tag = ???

        /**  */
        @stub
        val B: Tag = ???

        /**  */
        @stub
        val BASE: Tag = ???

        /**  */
        @stub
        val BASEFONT: Tag = ???

        /**  */
        @stub
        val BIG: Tag = ???

        /**  */
        @stub
        val BLOCKQUOTE: Tag = ???

        /**  */
        @stub
        val BODY: Tag = ???

        /**  */
        @stub
        val BR: Tag = ???

        /**  */
        @stub
        val CAPTION: Tag = ???

        /**  */
        @stub
        val CENTER: Tag = ???

        /**  */
        @stub
        val CITE: Tag = ???

        /**  */
        @stub
        val CODE: Tag = ???

        /** All comments are labeled with this tag. */
        @stub
        val COMMENT: Tag = ???

        /** All text content is labeled with this tag. */
        @stub
        val CONTENT: Tag = ???

        /**  */
        @stub
        val DD: Tag = ???

        /**  */
        @stub
        val DFN: Tag = ???

        /**  */
        @stub
        val DIR: Tag = ???

        /**  */
        @stub
        val DIV: Tag = ???

        /**  */
        @stub
        val DL: Tag = ???

        /**  */
        @stub
        val DT: Tag = ???

        /**  */
        @stub
        val EM: Tag = ???

        /**  */
        @stub
        val FONT: Tag = ???

        /**  */
        @stub
        val FORM: Tag = ???

        /**  */
        @stub
        val FRAME: Tag = ???

        /**  */
        @stub
        val FRAMESET: Tag = ???

        /**  */
        @stub
        val H1: Tag = ???

        /**  */
        @stub
        val H2: Tag = ???

        /**  */
        @stub
        val H3: Tag = ???

        /**  */
        @stub
        val H4: Tag = ???

        /**  */
        @stub
        val H5: Tag = ???

        /**  */
        @stub
        val H6: Tag = ???

        /**  */
        @stub
        val HEAD: Tag = ???

        /**  */
        @stub
        val HR: Tag = ???

        /**  */
        @stub
        val HTML: Tag = ???

        /**  */
        @stub
        val I: Tag = ???

        /**  */
        @stub
        val IMG: Tag = ???

        /** All text content must be in a paragraph element. */
        @stub
        val IMPLIED: Tag = ???

        /**  */
        @stub
        val INPUT: Tag = ???

        /**  */
        @stub
        val ISINDEX: Tag = ???

        /**  */
        @stub
        val KBD: Tag = ???

        /**  */
        @stub
        val LI: Tag = ???

        /**  */
        @stub
        val LINK: Tag = ???

        /**  */
        @stub
        val MAP: Tag = ???

        /**  */
        @stub
        val MENU: Tag = ???

        /**  */
        @stub
        val META: Tag = ???

        /**  */
        @stub
        val NOFRAMES: Tag = ???

        /**  */
        @stub
        val OBJECT: Tag = ???

        /**  */
        @stub
        val OL: Tag = ???

        /**  */
        @stub
        val OPTION: Tag = ???

        /**  */
        @stub
        val P: Tag = ???

        /**  */
        @stub
        val PARAM: Tag = ???

        /**  */
        @stub
        val PRE: Tag = ???

        /**  */
        @stub
        val S: Tag = ???

        /**  */
        @stub
        val SAMP: Tag = ???

        /**  */
        @stub
        val SCRIPT: Tag = ???

        /**  */
        @stub
        val SELECT: Tag = ???

        /**  */
        @stub
        val SMALL: Tag = ???

        /**  */
        @stub
        val SPAN: Tag = ???

        /**  */
        @stub
        val STRIKE: Tag = ???

        /**  */
        @stub
        val STRONG: Tag = ???

        /**  */
        @stub
        val STYLE: Tag = ???

        /**  */
        @stub
        val SUB: Tag = ???

        /**  */
        @stub
        val SUP: Tag = ???

        /**  */
        @stub
        val TABLE: Tag = ???

        /**  */
        @stub
        val TD: Tag = ???

        /**  */
        @stub
        val TEXTAREA: Tag = ???

        /**  */
        @stub
        val TH: Tag = ???

        /**  */
        @stub
        val TITLE: Tag = ???

        /**  */
        @stub
        val TR: Tag = ???

        /**  */
        @stub
        val TT: Tag = ???

        /**  */
        @stub
        val U: Tag = ???

        /**  */
        @stub
        val UL: Tag = ???

        /**  */
        @stub
        val VAR: Tag = ???

        /** Returns true if this tag causes a
         *  line break to the flow of data, otherwise returns
         *  false.
         */
        @stub
        def breaksFlow(): Boolean = ???

        /** Returns true if this tag is a block
         *  tag, which is a tag used to add structure to a
         *  document.
         */
        @stub
        def isBlock(): Boolean = ???

        /** Returns true if this tag is pre-formatted,
         *  which is true if the tag is either PRE or
         *  TEXTAREA.
         */
        @stub
        def isPreformatted(): Boolean = ???

        /** Returns the string representation of the
         *  tag.
         */
        @stub
        def toString(): String = ???
    }


    /**  */
    object UnknownTag extends HTML.Tag with Serializable {

        /** Creates a new UnknownTag with the specified
         *  id.
         */
        @stub
        def apply(id: String) = ???

        /** Compares this object to the specified object. */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Returns the hash code which corresponds to the string
         *  for this tag.
         */
        @stub
        def hashCode(): Int = ???
    }


    /**  */
    @stub
    val NULL_ATTRIBUTE_VALUE: String = ???

    /** Returns the set of HTML attributes recognized. */
    @stub
    def getAllAttributeKeys(): Array[HTML.Attribute] = ???

    /** Returns the set of actual HTML tags that
     *  are recognized by the default HTML reader.
     */
    @stub
    def getAllTags(): Array[HTML.Tag] = ???

    /** Fetches an attribute constant for a well-known attribute name
     *  (i.e.
     */
    @stub
    def getAttributeKey(attName: String): HTML.Attribute = ???

    /** Fetches an integer attribute value. */
    @stub
    def getIntegerAttributeValue(attr: AttributeSet, key: HTML.Attribute, def: Int): Int = ???

    /** Fetches a tag constant for a well-known tag name (i.e. */
    @stub
    def getTag(tagName: String): HTML.Tag = ???
}
