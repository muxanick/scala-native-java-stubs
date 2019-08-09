package javax.sound.sampled

// DataLine adds media-related functionality to its
// superinterface, Line.  This functionality includes
// transport-control methods that start, stop, drain, and flush
// the audio data that passes through the line.  A data line can also
// report the current position, volume, and audio format of the media.
// Data lines are used for output of audio by means of the
// subinterfaces SourceDataLine or
// Clip, which allow an application program to write data.  Similarly,
// audio input is handled by the subinterface TargetDataLine,
// which allows data to be read.
// 
// A data line has an internal buffer in which
// the incoming or outgoing audio data is queued.  The
// drain() method blocks until this internal buffer
// becomes empty, usually because all queued data has been processed.  The
// flush() method discards any available queued data
// from the internal buffer.
// 
// A data line produces START and
// STOP events whenever
// it begins or ceases active presentation or capture of data.  These events
// can be generated in response to specific requests, or as a result of
// less direct state changes.  For example, if start() is called
// on an inactive data line, and data is available for capture or playback, a
// START event will be generated shortly, when data playback
// or capture actually begins.  Or, if the flow of data to an active data
// line is constricted so that a gap occurs in the presentation of data,
// a STOP event is generated.
// 
// Mixers often support synchronized control of multiple data lines.
// Synchronization can be established through the Mixer interface's
// synchronize method.
// See the description of the Mixer interface
// for a more complete description.
trait DataLine extends Line {

    @stub
    // Obtains the number of bytes of data currently available to the
    // application for processing in the data line's internal buffer.
    def available(): Int = ???

    @stub
    // Drains queued data from the line by continuing data I/O until the
    // data line's internal buffer has been emptied.
    def drain(): Unit = ???

    @stub
    // Flushes queued data from the line.
    def flush(): Unit = ???

    @stub
    // Obtains the maximum number of bytes of data that will fit in the data line's
    // internal buffer.
    def getBufferSize(): Int = ???

    @stub
    // Obtains the current format (encoding, sample rate, number of channels,
    // etc.) of the data line's audio data.
    def getFormat(): AudioFormat = ???

    @stub
    // Obtains the current position in the audio data, in sample frames.
    def getFramePosition(): Int = ???

    @stub
    // Obtains the current volume level for the line.
    def getLevel(): float = ???

    @stub
    // Obtains the current position in the audio data, in sample frames.
    def getLongFramePosition(): Long = ???

    @stub
    // Obtains the current position in the audio data, in microseconds.
    def getMicrosecondPosition(): Long = ???

    @stub
    // Indicates whether the line is engaging in active I/O (such as playback
    // or capture).
    def isActive(): Boolean = ???

    @stub
    // Indicates whether the line is running.
    def isRunning(): Boolean = ???

    @stub
    // Allows a line to engage in data I/O.
    def start(): Unit = ???
}
