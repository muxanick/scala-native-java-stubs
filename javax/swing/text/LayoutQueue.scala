package javax.swing.text

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** A queue of text layout tasks. */
class LayoutQueue extends Object {

    /** Construct a layout queue. */
    @stub
    def this() = ???

    /** Add a task that is not needed immediately because
     *  the results are not believed to be visible.
     */
    @stub
    def addTask(task: Runnable): Unit = ???

    /** Used by the worker thread to get a new task to execute */
    @stub
    protected def waitForWork(): Runnable = ???
}

object LayoutQueue {
    /** Fetch the default layout queue. */
    @stub
    def getDefaultQueue(): LayoutQueue = ???

    /** Set the default layout queue. */
    @stub
    def setDefaultQueue(q: LayoutQueue): Unit = ???
}
