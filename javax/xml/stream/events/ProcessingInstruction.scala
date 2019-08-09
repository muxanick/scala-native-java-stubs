package javax.xml.stream.events

import java.lang.String

/** An interface that describes the data found in processing instructions */
trait ProcessingInstruction extends XMLEvent {

    /** The data section of the processing instruction */
    @stub
    def getData(): String = ???
}
