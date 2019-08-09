package java.awt

import scala.scalanative.annotation.stub

/** A helper interface to run the nested event loop.
 *  
 *  Objects that implement this interface are created with the
 *  EventQueue.createSecondaryLoop() method. The interface
 *  provides two methods, enter() and exit(),
 *  which can be used to start and stop the event loop.
 *  
 *  When the enter() method is called, the current
 *  thread is blocked until the loop is terminated by the
 *  exit() method. Also, a new event loop is started
 *  on the event dispatch thread, which may or may not be
 *  the current thread. The loop can be terminated on any
 *  thread by calling its exit() method. After the
 *  loop is terminated, the SecondaryLoop object can
 *  be reused to run a new nested event loop.
 *  
 *  A typical use case of applying this interface is AWT
 *  and Swing modal dialogs. When a modal dialog is shown on
 *  the event dispatch thread, it enters a new secondary loop.
 *  Later, when the dialog is hidden or disposed, it exits
 *  the loop, and the thread continues its execution.
 *  
 *  The following example illustrates a simple use case of
 *  secondary loops:
 * 
 *  
 *    SecondaryLoop loop;
 * 
 *    JButton jButton = new JButton("Button");
 *    jButton.addActionListener(new ActionListener() {
 *         @Override
 *        public void actionPerformed(ActionEvent e) {
 *            Toolkit tk = Toolkit.getDefaultToolkit();
 *            EventQueue eq = tk.getSystemEventQueue();
 *            loop = eq.createSecondaryLoop();
 * 
 *            // Spawn a new thread to do the work
 *            Thread worker = new WorkerThread();
 *            worker.start();
 * 
 *            // Enter the loop to block the current event
 *            // handler, but leave UI responsive
 *            if (!loop.enter()) {
 *                // Report an error
 *            }
 *        }
 *    });
 * 
 *    class WorkerThread extends Thread {
 *         @Override
 *        public void run() {
 *            // Perform calculations
 *            doSomethingUseful();
 * 
 *            // Exit the loop
 *            loop.exit();
 *        }
 *    }
 *  
 */
trait SecondaryLoop {

    /** Blocks the execution of the current thread and enters a new
     *  secondary event loop on the event dispatch thread.
     */
    @stub
    def enter(): Boolean = ???

    /** Unblocks the execution of the thread blocked by the enter() method and exits the secondary loop. */
    @stub
    def exit(): Boolean = ???
}
