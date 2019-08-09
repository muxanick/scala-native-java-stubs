package javax.xml.stream.events

import java.lang.String
import scala.scalanative.annotation.stub

/** An interface that describes the data found in processing instructions */
trait ProcessingInstruction extends XMLEvent {

    /** The data section of the processing instruction */
    @stub
    def getData(): String = ???

    /** The target section of the processing instruction */
    @stub
    def getTarget(): String = ???
}
