package javax.sound.sampled

import java.lang.{Class, Object}

// Besides the class information inherited from its superclass,
// DataLine.Info provides additional information specific to data lines.
// This information includes:
// 
//  the audio formats supported by the data line
//  the minimum and maximum sizes of its internal buffer
// 
// Because a Line.Info knows the class of the line its describes, a
// DataLine.Info object can describe DataLine
// subinterfaces such as SourceDataLine,
// TargetDataLine, and Clip.
// You can query a mixer for lines of any of these types, passing an appropriate
// instance of DataLine.Info as the argument to a method such as
// Mixer.getLine(Line.Info).
object DataLine.Info extends Line.Info {

    @stub
    // Constructs a data line's info object from the specified information,
    // which includes a single audio format.
    def Info(lineClass: Class[_], format: AudioFormat) = ???

    @stub
    // Constructs a data line's info object from the specified information,
    // which includes a set of supported audio formats and a range for the buffer size.
    def Info(lineClass: Class[_], formats: Array[AudioFormat], minBufferSize: Int, maxBufferSize: Int) = ???

    @stub
    // Obtains a set of audio formats supported by the data line.
    def getFormats(): Array[AudioFormat] = ???

    @stub
    // Obtains the maximum buffer size supported by the data line.
    def getMaxBufferSize(): Int = ???

    @stub
    // Obtains the minimum buffer size supported by the data line.
    def getMinBufferSize(): Int = ???

    @stub
    // Indicates whether this data line supports a particular audio format.
    def isFormatSupported(format: AudioFormat): Boolean = ???

    @stub
    // Determines whether the specified info object matches this one.
    def matches(info: Line.Info): Boolean = ???
}
