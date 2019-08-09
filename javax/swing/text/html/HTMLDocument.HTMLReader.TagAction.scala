package javax.swing.text.html

import java.lang.Object

// An action to be performed in response
// to parsing a tag.  This allows customization
// of how each tag is handled and avoids a large
// switch statement.
class HTMLDocument.HTMLReader.TagAction extends Object {

    @stub
    // Called when an end tag is seen for the
    // type of tag this action was registered
    // to.
    def end(t: HTML.Tag): Unit = ???
}
