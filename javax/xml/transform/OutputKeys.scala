package javax.xml.transform

import java.lang.{Object, String}

// Provides string constants that can be used to set
// output properties for a Transformer, or to retrieve
// output properties from a Transformer or Templates object.
// All the fields in this class are read-only.
class OutputKeys extends Object {
}

object OutputKeys {
    @stub
    // cdata-section-elements = expanded names.
    def CDATA_SECTION_ELEMENTS: String = ???

    @stub
    // doctype-public = string.
    def DOCTYPE_PUBLIC: String = ???

    @stub
    // doctype-system = string.
    def DOCTYPE_SYSTEM: String = ???

    @stub
    // encoding = string.
    def ENCODING: String = ???

    @stub
    // indent = "yes" | "no".
    def INDENT: String = ???

    @stub
    // media-type = string.
    def MEDIA_TYPE: String = ???

    @stub
    // method = "xml" | "html" | "text" | expanded name.
    def METHOD: String = ???

    @stub
    // omit-xml-declaration = "yes" | "no".
    def OMIT_XML_DECLARATION: String = ???

    @stub
    // standalone = "yes" | "no".
    def STANDALONE: String = ???
}
