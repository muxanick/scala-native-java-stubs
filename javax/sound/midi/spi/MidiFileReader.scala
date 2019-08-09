package javax.sound.midi.spi

import java.io.{File, InputStream}
import java.lang.Object
import java.net.URL
import javax.sound.midi.{MidiFileFormat, Sequence}
import scala.scalanative.annotation.stub

/** A MidiFileReader supplies MIDI file-reading services. Classes
 *  implementing this interface can parse the format information from one or more
 *  types of MIDI file, and can produce a Sequence object from files of
 *  these types.
 */
abstract class MidiFileReader extends Object {

    /**  */
    @stub
    def this() = ???

    /** Obtains the MIDI file format of the File provided. */
    def getMidiFileFormat(file: File): MidiFileFormat

    /** Obtains the MIDI file format of the input stream provided. */
    def getMidiFileFormat(stream: InputStream): MidiFileFormat

    /** Obtains the MIDI file format of the URL provided. */
    def getMidiFileFormat(url: URL): MidiFileFormat

    /** Obtains a MIDI sequence from the File provided. */
    def getSequence(file: File): Sequence

    /** Obtains a MIDI sequence from the input stream provided. */
    def getSequence(stream: InputStream): Sequence

    /** Obtains a MIDI sequence from the URL provided. */
    def getSequence(url: URL): Sequence
}
