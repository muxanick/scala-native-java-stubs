package javax.sound.midi

import scala.scalanative.annotation.stub

/** A Synthesizer generates sound.  This usually happens when one of
 *  the Synthesizer's MidiChannel objects receives a
 *  noteOn message, either
 *  directly or via the Synthesizer object.
 *  Many Synthesizers support Receivers, through which
 *  MIDI events can be delivered to the Synthesizer.
 *  In such cases, the Synthesizer typically responds by sending
 *  a corresponding message to the appropriate MidiChannel, or by
 *  processing the event itself if the event isn't one of the MIDI channel
 *  messages.
 *  
 *  The Synthesizer interface includes methods for loading and
 *  unloading instruments from soundbanks.  An instrument is a specification for synthesizing a
 *  certain type of sound, whether that sound emulates a traditional instrument or is
 *  some kind of sound effect or other imaginary sound. A soundbank is a collection of instruments, organized
 *  by bank and program number (via the instrument's Patch object).
 *  Different Synthesizer classes might implement different sound-synthesis
 *  techniques, meaning that some instruments and not others might be compatible with a
 *  given synthesizer.
 *  Also, synthesizers may have a limited amount of memory for instruments, meaning
 *  that not every soundbank and instrument can be used by every synthesizer, even if
 *  the synthesis technique is compatible.
 *  To see whether the instruments from
 *  a certain soundbank can be played by a given synthesizer, invoke the
 *  isSoundbankSupported method of
 *  Synthesizer.
 *  
 *  "Loading" an instrument means that that instrument becomes available for
 *  synthesizing notes.  The instrument is loaded into the bank and
 *  program location specified by its Patch object.  Loading does
 *  not necessarily mean that subsequently played notes will immediately have
 *  the sound of this newly loaded instrument.  For the instrument to play notes,
 *  one of the synthesizer's MidiChannel objects must receive (or have received)
 *  a program-change message that causes that particular instrument's
 *  bank and program number to be selected.
 */
trait Synthesizer extends MidiDevice {

    /** Obtains a list of instruments that come with the synthesizer. */
    @stub
    def getAvailableInstruments(): Array[Instrument] = ???

    /** Obtains the set of MIDI channels controlled by this synthesizer. */
    @stub
    def getChannels(): Array[MidiChannel] = ???

    /** Obtains the default soundbank for the synthesizer, if one exists. */
    @stub
    def getDefaultSoundbank(): Soundbank = ???

    /** Obtains the processing latency incurred by this synthesizer, expressed in
     *  microseconds.
     */
    @stub
    def getLatency(): Long = ???

    /** Obtains a list of the instruments that are currently loaded onto this
     *  Synthesizer.
     */
    @stub
    def getLoadedInstruments(): Array[Instrument] = ???

    /** Obtains the maximum number of notes that this synthesizer can sound simultaneously. */
    @stub
    def getMaxPolyphony(): Int = ???

    /** Obtains the current status of the voices produced by this synthesizer. */
    @stub
    def getVoiceStatus(): Array[VoiceStatus] = ???

    /** Informs the caller whether this synthesizer is capable of loading
     *  instruments from the specified soundbank.
     */
    @stub
    def isSoundbankSupported(soundbank: Soundbank): Boolean = ???

    /** Loads onto the Synthesizer all instruments contained
     *  in the specified Soundbank.
     */
    @stub
    def loadAllInstruments(soundbank: Soundbank): Boolean = ???

    /** Makes a particular instrument available for synthesis. */
    @stub
    def loadInstrument(instrument: Instrument): Boolean = ???

    /** Loads the instruments referenced by the specified patches, from the
     *  specified Soundbank.
     */
    @stub
    def loadInstruments(soundbank: Soundbank, patchList: Array[Patch]): Boolean = ???

    /** Remaps an instrument. */
    @stub
    def remapInstrument(from: Instrument, to: Instrument): Boolean = ???

    /** Unloads all instruments contained in the specified Soundbank. */
    @stub
    def unloadAllInstruments(soundbank: Soundbank): Unit = ???

    /** Unloads a particular instrument. */
    @stub
    def unloadInstrument(instrument: Instrument): Unit = ???

    /** Unloads the instruments referenced by the specified patches, from the MIDI sound bank specified. */
    @stub
    def unloadInstruments(soundbank: Soundbank, patchList: Array[Patch]): Unit = ???
}
