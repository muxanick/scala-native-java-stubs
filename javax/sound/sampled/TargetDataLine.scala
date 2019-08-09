package javax.sound.sampled

// A target data line is a type of DataLine from which
// audio data can be read.  The most common example is a data line that gets
// its data from an audio capture device.  (The device is implemented as a
// mixer that writes to the target data line.)
// 
// Note that the naming convention for this interface reflects the relationship
// between the line and its mixer.  From the perspective of an application,
// a target data line may act as a source for audio data.
// 
// The target data line can be obtained from a mixer by invoking the
// getLine
// method of Mixer with an appropriate
// DataLine.Info object.
// 
// The TargetDataLine interface provides a method for reading the
// captured data from the target data line's buffer.Applications
// that record audio should read data from the target data line quickly enough
// to keep the buffer from overflowing, which could cause discontinuities in
// the captured data that are perceived as clicks.  Applications can use the
// available method defined in the
// DataLine interface to determine the amount of data currently
// queued in the data line's buffer.  If the buffer does overflow,
// the oldest queued data is discarded and replaced by new data.
trait TargetDataLine extends DataLine {

    @stub
    // Opens the line with the specified format, causing the line to acquire any
    // required system resources and become operational.
    def open(format: AudioFormat): Unit = ???

    @stub
    // Opens the line with the specified format and requested buffer size,
    // causing the line to acquire any required system resources and become
    // operational.
    def open(format: AudioFormat, bufferSize: Int): Unit = ???
}
