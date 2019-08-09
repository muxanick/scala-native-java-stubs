package java.awt.datatransfer

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Defines an object which listens for FlavorEvents. */
trait FlavorListener extends EventListener {

    /** Invoked when the target Clipboard of the listener
     *  has changed its available DataFlavors.
     */
    @stub
    def flavorsChanged(e: FlavorEvent): Unit = ???
}
