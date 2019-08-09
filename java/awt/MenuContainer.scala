package java.awt

import scala.scalanative.annotation.stub

/** The super class of all menu related containers. */
trait MenuContainer {

    /**  */
    @stub
    def getFont(): Font = ???

    /** Deprecated. 
     * As of JDK version 1.1
     *  replaced by dispatchEvent(AWTEvent).
     * 
     */
    @stub
    def postEvent(evt: Event): Boolean = ???

    /**  */
    @stub
    def remove(comp: MenuComponent): Unit = ???
}
