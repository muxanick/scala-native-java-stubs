package javax.sound.midi

// A Synthesizer generates sound.  This usually happens when one of
// the Synthesizer's MidiChannel objects receives a
// noteOn message, either
// directly or via the Synthesizer object.
// Many Synthesizers support Receivers, through which
// MIDI events can be delivered to the Synthesizer.
// In such cases, the Synthesizer typically responds by sending
// a corresponding message to the appropriate MidiChannel, or by
// processing the event itself if the event isn't one of the MIDI channel
// messages.
// 
// The Synthesizer interface includes methods for loading and
// unloading instruments from soundbanks.  An instrument is a specification for synthesizing a
// certain type of sound, whether that sound emulates a traditional instrument or is
// some kind of sound effect or other imaginary sound. A soundbank is a collection of instruments, organized
// by bank and program number (via the instrument's Patch object).
// Different Synthesizer classes might implement different sound-synthesis
// techniques, meaning that some instruments and not others might be compatible with a
// given synthesizer.
// Also, synthesizers may have a limited amount of memory for instruments, meaning
// that not every soundbank and instrument can be used by every synthesizer, even if
// the synthesis technique is compatible.
// To see whether the instruments from
// a certain soundbank can be played by a given synthesizer, invoke the
// isSoundbankSupported method of
// Synthesizer.
// 
// "Loading" an instrument means that that instrument becomes available for
// synthesizing notes.  The instrument is loaded into the bank and
// program location specified by its Patch object.  Loading does
// not necessarily mean that subsequently played notes will immediately have
// the sound of this newly loaded instrument.  For the instrument to play notes,
// one of the synthesizer's MidiChannel objects must receive (or have received)
// a program-change message that causes that particular instrument's
// bank and program number to be selected.
trait Synthesizer extends MidiDevice {

    @stub
    // Obtains a list of instruments that come with the synthesizer.
    def getAvailableInstruments(): Array[Instrument] = ???

    @stub
    // Obtains the set of MIDI channels controlled by this synthesizer.
    def getChannels(): Array[MidiChannel] = ???

    @stub
    // Obtains the default soundbank for the synthesizer, if one exists.
    def getDefaultSoundbank(): Soundbank = ???

    @stub
    // Obtains the processing latency incurred by this synthesizer, expressed in
    // microseconds.
    def getLatency(): Long = ???

    @stub
    // Obtains a list of the instruments that are currently loaded onto this
    // Synthesizer.
    def getLoadedInstruments(): Array[Instrument] = ???

    @stub
    // Obtains the maximum number of notes that this synthesizer can sound simultaneously.
    def getMaxPolyphony(): Int = ???

    @stub
    // Obtains the current status of the voices produced by this synthesizer.
    def getVoiceStatus(): Array[VoiceStatus] = ???

    @stub
    // Informs the caller whether this synthesizer is capable of loading
    // instruments from the specified soundbank.
    def isSoundbankSupported(soundbank: Soundbank): Boolean = ???

    @stub
    // Loads onto the Synthesizer all instruments contained
    // in the specified Soundbank.
    def loadAllInstruments(soundbank: Soundbank): Boolean = ???

    @stub
    // Makes a particular instrument available for synthesis.
    def loadInstrument(instrument: Instrument): Boolean = ???

    @stub
    // Loads the instruments referenced by the specified patches, from the
    // specified Soundbank.
    def loadInstruments(soundbank: Soundbank, patchList: Array[Patch]): Boolean = ???

    @stub
    // Remaps an instrument.
    def remapInstrument(from: Instrument, to: Instrument): Boolean = ???

    @stub
    // Unloads all instruments contained in the specified Soundbank.
    def unloadAllInstruments(soundbank: Soundbank): Unit = ???

    @stub
    // Unloads a particular instrument.
    def unloadInstrument(instrument: Instrument): Unit = ???
}
