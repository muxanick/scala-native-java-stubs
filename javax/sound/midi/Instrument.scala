package javax.sound.midi

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** An instrument is a sound-synthesis algorithm with certain parameter
 *  settings, usually designed to emulate a specific real-world
 *  musical instrument or to achieve a specific sort of sound effect.
 *  Instruments are typically stored in collections called soundbanks.
 *  Before the instrument can be used to play notes, it must first be loaded
 *  onto a synthesizer, and then it must be selected for use on
 *  one or more channels, via a program-change command.  MIDI notes
 *  that are subsequently received on those channels will be played using
 *  the sound of the selected instrument.
 */
abstract class Instrument extends SoundbankResource {

    /** Constructs a new MIDI instrument from the specified Patch. */
    @stub
    protected def this(soundbank: Soundbank, patch: Patch, name: String, dataClass: Class[_]) = ???

    /** Obtains the Patch object that indicates the bank and program
     *  numbers where this instrument is to be stored in the synthesizer.
     */
    def getPatch(): Patch
}
