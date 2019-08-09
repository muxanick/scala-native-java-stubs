package javax.sound.midi.spi

import java.io.{File, InputStream}
import java.lang.Object
import javax.sound.midi.Soundbank

// A SoundbankReader supplies soundbank file-reading services. Concrete
// subclasses of SoundbankReader parse a given soundbank file, producing
// a Soundbank object that can be loaded into a
// Synthesizer.
abstract class SoundbankReader extends Object {

    // Obtains a soundbank object from the File provided.
    def getSoundbank(file: File): Soundbank

    // Obtains a soundbank object from the InputStream provided.
    def getSoundbank(stream: InputStream): Soundbank
}
