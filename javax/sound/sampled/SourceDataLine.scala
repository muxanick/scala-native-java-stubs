package javax.sound.sampled

// A source data line is a data line to which data may be written.  It acts as
// a source to its mixer. An application writes audio bytes to a source data line,
// which handles the buffering of the bytes and delivers them to the mixer.
// The mixer may mix the samples with those from other sources and then deliver
// the mix to a target such as an output port (which may represent an audio output
// device on a sound card).
// 
// Note that the naming convention for this interface reflects the relationship
// between the line and its mixer.  From the perspective of an application,
// a source data line may act as a target for audio data.
// 
// A source data line can be obtained from a mixer by invoking the
// getLine method of Mixer with
// an appropriate DataLine.Info object.
// 
// The SourceDataLine interface provides a method for writing
// audio data to the data line's buffer. Applications that play or mix
// audio should write data to the source data line quickly enough to keep the
// buffer from underflowing (emptying), which could cause discontinuities in
// the audio that are perceived as clicks.  Applications can use the
// available method defined in the
// DataLine interface to determine the amount of data currently
// queued in the data line's buffer.  The amount of data which can be written
// to the buffer without blocking is the difference between the buffer size
// and the amount of queued data.  If the delivery of audio output
// stops due to underflow, a STOP event is
// generated.  A START event is generated
// when the audio output resumes.
trait SourceDataLine extends DataLine {

    @stub
    // Opens the line with the specified format, causing the line to acquire any
    // required system resources and become operational.
    def open(format: AudioFormat): Unit = ???

    @stub
    // Opens the line with the specified format and suggested buffer size,
    // causing the line to acquire any required
    // system resources and become operational.
    def open(format: AudioFormat, bufferSize: Int): Unit = ???
}
