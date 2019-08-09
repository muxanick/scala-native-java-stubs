package javax.sound.sampled

import scala.scalanative.annotation.stub

/** DataLine adds media-related functionality to its
 *  superinterface, Line.  This functionality includes
 *  transport-control methods that start, stop, drain, and flush
 *  the audio data that passes through the line.  A data line can also
 *  report the current position, volume, and audio format of the media.
 *  Data lines are used for output of audio by means of the
 *  subinterfaces SourceDataLine or
 *  Clip, which allow an application program to write data.  Similarly,
 *  audio input is handled by the subinterface TargetDataLine,
 *  which allows data to be read.
 *  
 *  A data line has an internal buffer in which
 *  the incoming or outgoing audio data is queued.  The
 *  drain() method blocks until this internal buffer
 *  becomes empty, usually because all queued data has been processed.  The
 *  flush() method discards any available queued data
 *  from the internal buffer.
 *  
 *  A data line produces START and
 *  STOP events whenever
 *  it begins or ceases active presentation or capture of data.  These events
 *  can be generated in response to specific requests, or as a result of
 *  less direct state changes.  For example, if start() is called
 *  on an inactive data line, and data is available for capture or playback, a
 *  START event will be generated shortly, when data playback
 *  or capture actually begins.  Or, if the flow of data to an active data
 *  line is constricted so that a gap occurs in the presentation of data,
 *  a STOP event is generated.
 *  
 *  Mixers often support synchronized control of multiple data lines.
 *  Synchronization can be established through the Mixer interface's
 *  synchronize method.
 *  See the description of the Mixer interface
 *  for a more complete description.
 */
trait DataLine extends Line {

    /** Obtains the number of bytes of data currently available to the
     *  application for processing in the data line's internal buffer.
     */
    @stub
    def available(): Int = ???

    /** Drains queued data from the line by continuing data I/O until the
     *  data line's internal buffer has been emptied.
     */
    @stub
    def drain(): Unit = ???

    /** Flushes queued data from the line. */
    @stub
    def flush(): Unit = ???

    /** Obtains the maximum number of bytes of data that will fit in the data line's
     *  internal buffer.
     */
    @stub
    def getBufferSize(): Int = ???

    /** Obtains the current format (encoding, sample rate, number of channels,
     *  etc.) of the data line's audio data.
     */
    @stub
    def getFormat(): AudioFormat = ???

    /** Obtains the current position in the audio data, in sample frames. */
    @stub
    def getFramePosition(): Int = ???

    /** Obtains the current volume level for the line. */
    @stub
    def getLevel(): Float = ???

    /** Obtains the current position in the audio data, in sample frames. */
    @stub
    def getLongFramePosition(): Long = ???

    /** Obtains the current position in the audio data, in microseconds. */
    @stub
    def getMicrosecondPosition(): Long = ???

    /** Indicates whether the line is engaging in active I/O (such as playback
     *  or capture).
     */
    @stub
    def isActive(): Boolean = ???

    /** Indicates whether the line is running. */
    @stub
    def isRunning(): Boolean = ???

    /** Allows a line to engage in data I/O. */
    @stub
    def start(): Unit = ???

    /** Stops the line. */
    @stub
    def stop(): Unit = ???
}

object DataLine {
    /** Besides the class information inherited from its superclass,
     *  DataLine.Info provides additional information specific to data lines.
     */
    @stub
    object Info extends DataLine.Info
}
