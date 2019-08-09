package javax.xml.transform

import java.lang.{Object, String}

/** Provides string constants that can be used to set
 *  output properties for a Transformer, or to retrieve
 *  output properties from a Transformer or Templates object.
 *  All the fields in this class are read-only.
 */
class OutputKeys extends Object {
}

object OutputKeys {
    /** cdata-section-elements = expanded names. */
    @stub
    val CDATA_SECTION_ELEMENTS: String = ???

    /** doctype-public = string. */
    @stub
    val DOCTYPE_PUBLIC: String = ???

    /** doctype-system = string. */
    @stub
    val DOCTYPE_SYSTEM: String = ???

    /** encoding = string. */
    @stub
    val ENCODING: String = ???

    /** indent = "yes" | "no". */
    @stub
    val INDENT: String = ???

    /** media-type = string. */
    @stub
    val MEDIA_TYPE: String = ???

    /** method = "xml" | "html" | "text" | expanded name. */
    @stub
    val METHOD: String = ???

    /** omit-xml-declaration = "yes" | "no". */
    @stub
    val OMIT_XML_DECLARATION: String = ???

    /** standalone = "yes" | "no". */
    @stub
    val STANDALONE: String = ???
}
