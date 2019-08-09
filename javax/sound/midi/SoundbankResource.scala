package javax.sound.midi

import java.lang.{Class, Object, String}

/** A SoundbankResource represents any audio resource stored
 *  in a Soundbank.  Common soundbank resources include:
 *  
 *  Instruments.  An instrument may be specified in a variety of
 *  ways.  However, all soundbanks have some mechanism for defining
 *  instruments.  In doing so, they may reference other resources
 *  stored in the soundbank.  Each instrument has a Patch
 *  which specifies the MIDI program and bank by which it may be
 *  referenced in MIDI messages.  Instrument information may be
 *  stored in Instrument objects.
 *  Audio samples.  A sample typically is a sampled audio waveform
 *  which contains a short sound recording whose duration is a fraction of
 *  a second, or at most a few seconds.  These audio samples may be
 *  used by a Synthesizer to synthesize sound in response to MIDI
 *  commands, or extracted for use by an application.
 *  (The terminology reflects musicians' use of the word "sample" to refer
 *  collectively to a series of contiguous audio samples or frames, rather than
 *  to a single, instantaneous sample.)
 *  The data class for an audio sample will be an object
 *  that encapsulates the audio sample data itself and information
 *  about how to interpret it (the format of the audio data), such
 *  as an AudioInputStream.     
 *  Embedded sequences.  A sound bank may contain built-in
 *  song data stored in a data object such as a Sequence.
 *  
 *  
 *  Synthesizers that use wavetable synthesis or related
 *  techniques play back the audio in a sample when
 *  synthesizing notes, often when emulating the real-world instrument that
 *  was originally recorded.  However, there is not necessarily a one-to-one
 *  correspondence between the Instruments and samples
 *  in a Soundbank.  A single Instrument can use
 *  multiple SoundbankResources (typically for notes of dissimilar pitch or
 *  brightness).  Also, more than one Instrument can use the same
 *  sample.
 */
abstract class SoundbankResource extends Object {

    /** Obtains the sampled audio that is stored in this SoundbankResource. */
    def getData(): Object

    /** Obtains the class used by this sample to represent its data. */
    def getDataClass(): Class[_]

    /** Obtains the name of the resource. */
    def getName(): String
}
