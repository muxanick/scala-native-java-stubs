package java.awt

import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// A Label object is a component for placing text in a
// container. A label displays a single line of read-only text.
// The text can be changed by the application, but a user cannot edit it
// directly.
// 
// For example, the code . . .
//
// 
// setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
// add(new Label("Hi There!"));
// add(new Label("Another Label"));
// 
// 
// produces the following labels:
// 
// 
class Label extends Component with Accessible {

    @stub
    // Constructs an empty label.
    def this() = ???

    @stub
    // Constructs a new label with the specified string of text,
    // left justified.
    def this(text: String) = ???

    @stub
    // Creates the peer for this label.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Label.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the current alignment of this label.
    def getAlignment(): Int = ???

    @stub
    // Gets the text of this label.
    def getText(): String = ???

    @stub
    // Returns a string representing the state of this Label.
    protected def paramString(): String = ???

    @stub
    // Sets the alignment for this label to the specified alignment.
    def setAlignment(alignment: Int): Unit = ???
}

object Label {
    @stub
    // Indicates that the label should be centered.
    def CENTER: Int = ???

    @stub
    // Indicates that the label should be left justified.
    def LEFT: Int = ???
}
