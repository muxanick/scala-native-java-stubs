package javax.sound.sampled

// A mixer is an audio device with one or more lines.  It need not be
// designed for mixing audio signals.  A mixer that actually mixes audio
// has multiple input (source) lines and at least one output (target) line.
// The former are often instances of classes that implement
// SourceDataLine,
// and the latter, TargetDataLine.  Port
// objects, too, are either source lines or target lines.
// A mixer can accept prerecorded, loopable sound as input, by having
// some of its source lines be instances of objects that implement the
// Clip interface.
// 
// Through methods of the Line interface, which Mixer extends,
// a mixer might provide a set of controls that are global to the mixer.  For example,
// the mixer can have a master gain control.  These global controls are distinct
// from the controls belonging to each of the mixer's individual lines.
// 
// Some mixers, especially
// those with internal digital mixing capabilities, may provide
// additional capabilities by implementing the DataLine interface.
// 
// A mixer can support synchronization of its lines.  When one line in
// a synchronized group is started or stopped, the other lines in the group
// automatically start or stop simultaneously with the explicitly affected one.
trait Mixer extends Line {

    @stub
    // Obtains a line that is available for use and that matches the description
    // in the specified Line.Info object.
    def getLine(info: Line.Info): Line = ???

    @stub
    // Obtains the approximate maximum number of lines of the requested type that can be open
    // simultaneously on the mixer.
    def getMaxLines(info: Line.Info): Int = ???

    @stub
    // Obtains information about this mixer, including the product's name,
    // version, vendor, etc.
    def getMixerInfo(): Mixer.Info = ???

    @stub
    // Obtains information about the set of source lines supported
    // by this mixer.
    def getSourceLineInfo(): Array[Line.Info] = ???

    @stub
    // Obtains information about source lines of a particular type supported
    // by the mixer.
    def getSourceLineInfo(info: Line.Info): Array[Line.Info] = ???

    @stub
    // Obtains the set of all source lines currently open to this mixer.
    def getSourceLines(): Array[Line] = ???

    @stub
    // Obtains information about the set of target lines supported
    // by this mixer.
    def getTargetLineInfo(): Array[Line.Info] = ???

    @stub
    // Obtains information about target lines of a particular type supported
    // by the mixer.
    def getTargetLineInfo(info: Line.Info): Array[Line.Info] = ???

    @stub
    // Obtains the set of all target lines currently open from this mixer.
    def getTargetLines(): Array[Line] = ???

    @stub
    // Indicates whether the mixer supports a line (or lines) that match
    // the specified Line.Info object.
    def isLineSupported(info: Line.Info): Boolean = ???

    @stub
    // Reports whether this mixer supports synchronization of the specified set of lines.
    def isSynchronizationSupported(lines: Array[Line], maintainSync: Boolean): Boolean = ???

    @stub
    // Synchronizes two or more lines.
    def synchronize(lines: Array[Line], maintainSync: Boolean): Unit = ???
}
