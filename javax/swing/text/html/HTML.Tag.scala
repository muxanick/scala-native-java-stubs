package javax.swing.text.html

import java.lang.{Object, String}

// Typesafe enumeration for an HTML tag.  Although the
// set of HTML tags is a closed set, we have left the
// set open so that people can add their own tag types
// to their custom parser and still communicate to the
// reader.
object HTML.Tag extends Object {

    @stub
    // 
    def Tag() = ???

    @stub
    // Creates a new Tag with the specified id,
    // and with causesBreak and isBlock
    // set to false.
    protected def Tag(id: String) = ???

    @stub
    // 
    def A: HTML.Tag = ???

    @stub
    // 
    def ADDRESS: HTML.Tag = ???

    @stub
    // 
    def APPLET: HTML.Tag = ???

    @stub
    // 
    def AREA: HTML.Tag = ???

    @stub
    // 
    def B: HTML.Tag = ???

    @stub
    // 
    def BASE: HTML.Tag = ???

    @stub
    // 
    def BASEFONT: HTML.Tag = ???

    @stub
    // 
    def BIG: HTML.Tag = ???

    @stub
    // 
    def BLOCKQUOTE: HTML.Tag = ???

    @stub
    // 
    def BODY: HTML.Tag = ???

    @stub
    // 
    def BR: HTML.Tag = ???

    @stub
    // 
    def CAPTION: HTML.Tag = ???

    @stub
    // 
    def CENTER: HTML.Tag = ???

    @stub
    // 
    def CITE: HTML.Tag = ???

    @stub
    // 
    def CODE: HTML.Tag = ???

    @stub
    // All comments are labeled with this tag.
    def COMMENT: HTML.Tag = ???

    @stub
    // All text content is labeled with this tag.
    def CONTENT: HTML.Tag = ???

    @stub
    // 
    def DD: HTML.Tag = ???

    @stub
    // 
    def DFN: HTML.Tag = ???

    @stub
    // 
    def DIR: HTML.Tag = ???

    @stub
    // 
    def DIV: HTML.Tag = ???

    @stub
    // 
    def DL: HTML.Tag = ???

    @stub
    // 
    def DT: HTML.Tag = ???

    @stub
    // 
    def EM: HTML.Tag = ???

    @stub
    // 
    def FONT: HTML.Tag = ???

    @stub
    // 
    def FORM: HTML.Tag = ???

    @stub
    // 
    def FRAME: HTML.Tag = ???

    @stub
    // 
    def FRAMESET: HTML.Tag = ???

    @stub
    // 
    def H1: HTML.Tag = ???

    @stub
    // 
    def H2: HTML.Tag = ???

    @stub
    // 
    def H3: HTML.Tag = ???

    @stub
    // 
    def H4: HTML.Tag = ???

    @stub
    // 
    def H5: HTML.Tag = ???

    @stub
    // 
    def H6: HTML.Tag = ???

    @stub
    // 
    def HEAD: HTML.Tag = ???

    @stub
    // 
    def HR: HTML.Tag = ???

    @stub
    // 
    def HTML: HTML.Tag = ???

    @stub
    // 
    def I: HTML.Tag = ???

    @stub
    // 
    def IMG: HTML.Tag = ???

    @stub
    // All text content must be in a paragraph element.
    def IMPLIED: HTML.Tag = ???

    @stub
    // 
    def INPUT: HTML.Tag = ???

    @stub
    // 
    def ISINDEX: HTML.Tag = ???

    @stub
    // 
    def KBD: HTML.Tag = ???

    @stub
    // 
    def LI: HTML.Tag = ???

    @stub
    // 
    def LINK: HTML.Tag = ???

    @stub
    // 
    def MAP: HTML.Tag = ???

    @stub
    // 
    def MENU: HTML.Tag = ???

    @stub
    // 
    def META: HTML.Tag = ???

    @stub
    // 
    def NOFRAMES: HTML.Tag = ???

    @stub
    // 
    def OBJECT: HTML.Tag = ???

    @stub
    // 
    def OL: HTML.Tag = ???

    @stub
    // 
    def OPTION: HTML.Tag = ???

    @stub
    // 
    def P: HTML.Tag = ???

    @stub
    // 
    def PARAM: HTML.Tag = ???

    @stub
    // 
    def PRE: HTML.Tag = ???

    @stub
    // 
    def S: HTML.Tag = ???

    @stub
    // 
    def SAMP: HTML.Tag = ???

    @stub
    // 
    def SCRIPT: HTML.Tag = ???

    @stub
    // 
    def SELECT: HTML.Tag = ???

    @stub
    // 
    def SMALL: HTML.Tag = ???

    @stub
    // 
    def SPAN: HTML.Tag = ???

    @stub
    // 
    def STRIKE: HTML.Tag = ???

    @stub
    // 
    def STRONG: HTML.Tag = ???

    @stub
    // 
    def STYLE: HTML.Tag = ???

    @stub
    // 
    def SUB: HTML.Tag = ???

    @stub
    // 
    def SUP: HTML.Tag = ???

    @stub
    // 
    def TABLE: HTML.Tag = ???

    @stub
    // 
    def TD: HTML.Tag = ???

    @stub
    // 
    def TEXTAREA: HTML.Tag = ???

    @stub
    // 
    def TH: HTML.Tag = ???

    @stub
    // 
    def TITLE: HTML.Tag = ???

    @stub
    // 
    def TR: HTML.Tag = ???

    @stub
    // 
    def TT: HTML.Tag = ???

    @stub
    // 
    def U: HTML.Tag = ???

    @stub
    // 
    def UL: HTML.Tag = ???

    @stub
    // Returns true if this tag causes a
    // line break to the flow of data, otherwise returns
    // false.
    def breaksFlow(): Boolean = ???

    @stub
    // Returns true if this tag is a block
    // tag, which is a tag used to add structure to a
    // document.
    def isBlock(): Boolean = ???

    @stub
    // Returns true if this tag is pre-formatted,
    // which is true if the tag is either PRE or
    // TEXTAREA.
    def isPreformatted(): Boolean = ???
}
