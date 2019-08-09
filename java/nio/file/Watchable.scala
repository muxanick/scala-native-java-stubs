package java.nio.file

import scala.scalanative.annotation.stub

/** An object that may be registered with a watch service so that it can be
 *  watched for changes and events.
 * 
 *   This interface defines the register method to register
 *  the object with a WatchService returning a WatchKey to
 *  represent the registration. An object may be registered with more than one
 *  watch service. Registration with a watch service is cancelled by invoking the
 *  key's cancel method.
 */
trait Watchable {

    /** Registers an object with a watch service. */
    @stub
    def register(watcher: WatchService, events: WatchEvent.Kind[_]*): WatchKey = ???

    /** Registers an object with a watch service. */
    @stub
    def register(watcher: WatchService, events: Array[WatchEvent.Kind[_]], modifiers: WatchEvent.Modifier*): WatchKey = ???
}
