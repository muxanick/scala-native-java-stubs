package javax.swing.text.html

import java.lang.{Object, String}

/** Typesafe enumeration for an HTML tag.  Although the
 *  set of HTML tags is a closed set, we have left the
 *  set open so that people can add their own tag types
 *  to their custom parser and still communicate to the
 *  reader.
 */
object HTML.Tag extends Object {

    /**  */
    @stub
    def Tag() = ???

    /** Creates a new Tag with the specified id,
     *  and with causesBreak and isBlock
     *  set to false.
     */
    @stub
    protected def Tag(id: String) = ???

    /**  */
    @stub
    val A: HTML.Tag = ???

    /**  */
    @stub
    val ADDRESS: HTML.Tag = ???

    /**  */
    @stub
    val APPLET: HTML.Tag = ???

    /**  */
    @stub
    val AREA: HTML.Tag = ???

    /**  */
    @stub
    val B: HTML.Tag = ???

    /**  */
    @stub
    val BASE: HTML.Tag = ???

    /**  */
    @stub
    val BASEFONT: HTML.Tag = ???

    /**  */
    @stub
    val BIG: HTML.Tag = ???

    /**  */
    @stub
    val BLOCKQUOTE: HTML.Tag = ???

    /**  */
    @stub
    val BODY: HTML.Tag = ???

    /**  */
    @stub
    val BR: HTML.Tag = ???

    /**  */
    @stub
    val CAPTION: HTML.Tag = ???

    /**  */
    @stub
    val CENTER: HTML.Tag = ???

    /**  */
    @stub
    val CITE: HTML.Tag = ???

    /**  */
    @stub
    val CODE: HTML.Tag = ???

    /** All comments are labeled with this tag. */
    @stub
    val COMMENT: HTML.Tag = ???

    /** All text content is labeled with this tag. */
    @stub
    val CONTENT: HTML.Tag = ???

    /**  */
    @stub
    val DD: HTML.Tag = ???

    /**  */
    @stub
    val DFN: HTML.Tag = ???

    /**  */
    @stub
    val DIR: HTML.Tag = ???

    /**  */
    @stub
    val DIV: HTML.Tag = ???

    /**  */
    @stub
    val DL: HTML.Tag = ???

    /**  */
    @stub
    val DT: HTML.Tag = ???

    /**  */
    @stub
    val EM: HTML.Tag = ???

    /**  */
    @stub
    val FONT: HTML.Tag = ???

    /**  */
    @stub
    val FORM: HTML.Tag = ???

    /**  */
    @stub
    val FRAME: HTML.Tag = ???

    /**  */
    @stub
    val FRAMESET: HTML.Tag = ???

    /**  */
    @stub
    val H1: HTML.Tag = ???

    /**  */
    @stub
    val H2: HTML.Tag = ???

    /**  */
    @stub
    val H3: HTML.Tag = ???

    /**  */
    @stub
    val H4: HTML.Tag = ???

    /**  */
    @stub
    val H5: HTML.Tag = ???

    /**  */
    @stub
    val H6: HTML.Tag = ???

    /**  */
    @stub
    val HEAD: HTML.Tag = ???

    /**  */
    @stub
    val HR: HTML.Tag = ???

    /**  */
    @stub
    val HTML: HTML.Tag = ???

    /**  */
    @stub
    val I: HTML.Tag = ???

    /**  */
    @stub
    val IMG: HTML.Tag = ???

    /** All text content must be in a paragraph element. */
    @stub
    val IMPLIED: HTML.Tag = ???

    /**  */
    @stub
    val INPUT: HTML.Tag = ???

    /**  */
    @stub
    val ISINDEX: HTML.Tag = ???

    /**  */
    @stub
    val KBD: HTML.Tag = ???

    /**  */
    @stub
    val LI: HTML.Tag = ???

    /**  */
    @stub
    val LINK: HTML.Tag = ???

    /**  */
    @stub
    val MAP: HTML.Tag = ???

    /**  */
    @stub
    val MENU: HTML.Tag = ???

    /**  */
    @stub
    val META: HTML.Tag = ???

    /**  */
    @stub
    val NOFRAMES: HTML.Tag = ???

    /**  */
    @stub
    val OBJECT: HTML.Tag = ???

    /**  */
    @stub
    val OL: HTML.Tag = ???

    /**  */
    @stub
    val OPTION: HTML.Tag = ???

    /**  */
    @stub
    val P: HTML.Tag = ???

    /**  */
    @stub
    val PARAM: HTML.Tag = ???

    /**  */
    @stub
    val PRE: HTML.Tag = ???

    /**  */
    @stub
    val S: HTML.Tag = ???

    /**  */
    @stub
    val SAMP: HTML.Tag = ???

    /**  */
    @stub
    val SCRIPT: HTML.Tag = ???

    /**  */
    @stub
    val SELECT: HTML.Tag = ???

    /**  */
    @stub
    val SMALL: HTML.Tag = ???

    /**  */
    @stub
    val SPAN: HTML.Tag = ???

    /**  */
    @stub
    val STRIKE: HTML.Tag = ???

    /**  */
    @stub
    val STRONG: HTML.Tag = ???

    /**  */
    @stub
    val STYLE: HTML.Tag = ???

    /**  */
    @stub
    val SUB: HTML.Tag = ???

    /**  */
    @stub
    val SUP: HTML.Tag = ???

    /**  */
    @stub
    val TABLE: HTML.Tag = ???

    /**  */
    @stub
    val TD: HTML.Tag = ???

    /**  */
    @stub
    val TEXTAREA: HTML.Tag = ???

    /**  */
    @stub
    val TH: HTML.Tag = ???

    /**  */
    @stub
    val TITLE: HTML.Tag = ???

    /**  */
    @stub
    val TR: HTML.Tag = ???

    /**  */
    @stub
    val TT: HTML.Tag = ???

    /**  */
    @stub
    val U: HTML.Tag = ???

    /**  */
    @stub
    val UL: HTML.Tag = ???

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
}
