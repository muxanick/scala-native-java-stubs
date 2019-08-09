package javax.sound.midi.spi

import java.io.{File, InputStream}
import java.lang.Object
import java.net.URL
import javax.sound.midi.Soundbank
import scala.scalanative.annotation.stub

/** A SoundbankReader supplies soundbank file-reading services. Concrete
 *  subclasses of SoundbankReader parse a given soundbank file, producing
 *  a Soundbank object that can be loaded into a
 *  Synthesizer.
 */
abstract class SoundbankReader extends Object {

    /**  */
    @stub
    def this() = ???

    /** Obtains a soundbank object from the File provided. */
    def getSoundbank(file: File): Soundbank

    /** Obtains a soundbank object from the InputStream provided. */
    def getSoundbank(stream: InputStream): Soundbank

    /** Obtains a soundbank object from the URL provided. */
    def getSoundbank(url: URL): Soundbank
}
