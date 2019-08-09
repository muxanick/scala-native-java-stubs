package javax.sound.sampled.spi

import java.lang.Object
import javax.sound.sampled.{Mixer, Mixer.Info}

// A provider or factory for a particular mixer type.
// This mechanism allows the implementation to determine
// how resources are managed in creation / management of
// a mixer.
abstract class MixerProvider extends Object {

    // Obtains an instance of the mixer represented by the info object.
    def getMixer(info: Mixer.Info): Mixer

    // Obtains the set of info objects representing the mixer
    // or mixers provided by this MixerProvider.
    def getMixerInfo(): Array[Mixer.Info]
}
