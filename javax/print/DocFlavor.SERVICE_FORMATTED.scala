package javax.print

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Class DocFlavor.SERVICE_FORMATTED provides predefined static constant
 *  DocFlavor objects for example doc flavors for service formatted print
 *  data.
 *  
 */
object DocFlavor_SERVICE_FORMATTED extends DocFlavor {

    /** Constructs a new doc flavor with a MIME type of
     *  "application/x-java-jvm-local-objectref" indicating
     *  service formatted print data and the given print data
     *  representation class name.
     */
    @stub
    def SERVICE_FORMATTED(className: String) = ???

    /** Service formatted print data doc flavor with print data
     *  representation class name = "java.awt.print.Pageable"
     *  (pageable object).
     */
    @stub
    val PAGEABLE: DocFlavor.SERVICE_FORMATTED = ???

    /** Service formatted print data doc flavor with print data
     *  representation class name = "java.awt.print.Printable"
     *  (printable object).
     */
    @stub
    val PRINTABLE: DocFlavor.SERVICE_FORMATTED = ???

    /** Service formatted print data doc flavor with print data
     *  representation class name =
     *  "java.awt.image.renderable.RenderableImage"
     *  (renderable image object).
     */
    @stub
    val RENDERABLE_IMAGE: DocFlavor.SERVICE_FORMATTED = ???
}
