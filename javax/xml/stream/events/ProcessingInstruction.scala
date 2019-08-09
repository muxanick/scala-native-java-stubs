package javax.xml.stream.events

import java.lang.String

// An interface that describes the data found in processing instructions
trait ProcessingInstruction extends XMLEvent {

    @stub
    // The data section of the processing instruction
    def getData(): String = ???
}
