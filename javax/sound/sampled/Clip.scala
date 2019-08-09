package javax.sound.sampled

// The Clip interface represents a special kind of data line whose
// audio data can be loaded prior to playback, instead of being streamed in
// real time.
// 
// Because the data is pre-loaded and has a known length, you can set a clip
// to start playing at any position in its audio data.  You can also create a
// loop, so that when the clip is played it will cycle repeatedly.  Loops are
// specified with a starting and ending sample frame, along with the number of
// times that the loop should be played.
// 
// Clips may be obtained from a Mixer that supports lines
// of this type.  Data is loaded into a clip when it is opened.
// 
// Playback of an audio clip may be started and stopped using the start
// and stop methods.  These methods do not reset the media position;
// start causes playback to continue from the position where playback
// was last stopped.  To restart playback from the beginning of the clip's audio
// data, simply follow the invocation of stop
// with setFramePosition(0), which rewinds the media to the beginning
// of the clip.
trait Clip extends DataLine {

    @stub
    // Obtains the media length in sample frames.
    def getFrameLength(): Int = ???

    @stub
    // Obtains the media duration in microseconds
    def getMicrosecondLength(): Long = ???

    @stub
    // Starts looping playback from the current position.
    def loop(count: Int): Unit = ???

    @stub
    // Opens the clip, meaning that it should acquire any required
    // system resources and become operational.
    def open(format: AudioFormat, data: Array[Byte], offset: Int, bufferSize: Int): Unit = ???

    @stub
    // Opens the clip with the format and audio data present in the provided audio
    // input stream.
    def open(stream: AudioInputStream): Unit = ???

    @stub
    // Sets the media position in sample frames.
    def setFramePosition(frames: Int): Unit = ???

    @stub
    // Sets the first and last sample frames that will be played in
    // the loop.
    def setLoopPoints(start: Int, end: Int): Unit = ???
}
