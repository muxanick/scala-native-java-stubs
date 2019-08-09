package javax.xml.stream.events

import java.lang.String
import scala.scalanative.annotation.stub

/** An interface for comment events */
trait Comment extends XMLEvent {

    /** Return the string data of the comment, returns empty string if it
     *  does not exist
     */
    @stub
    def getText(): String = ???
}
