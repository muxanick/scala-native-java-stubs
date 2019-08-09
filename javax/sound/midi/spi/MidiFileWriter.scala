package javax.sound.midi.spi

import java.io.File
import java.lang.Object
import javax.sound.midi.Sequence

/** A MidiFileWriter supplies MIDI file-writing services. Classes that
 *  implement this interface can write one or more types of MIDI file from a
 *  Sequence object.
 */
abstract class MidiFileWriter extends Object {

    /** Obtains the set of MIDI file types for which file writing support is
     *  provided by this file writer.
     */
    def getMidiFileTypes(): Array[Int]

    /** Obtains the file types that this file writer can write from the sequence
     *  specified.
     */
    def getMidiFileTypes(sequence: Sequence): Array[Int]

    /** Indicates whether file writing support for the specified MIDI file type
     *  is provided by this file writer.
     */
    def isFileTypeSupported(fileType: Int): Boolean

    /** Indicates whether a MIDI file of the file type specified can be written
     *  from the sequence indicated.
     */
    def isFileTypeSupported(fileType: Int, sequence: Sequence): Boolean

    /** Writes a stream of bytes representing a MIDI file of the file type
     *  indicated to the external file provided.
     */
    def write(in: Sequence, fileType: Int, out: File): Int
}
