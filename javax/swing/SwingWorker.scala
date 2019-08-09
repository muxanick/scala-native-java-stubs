package javax.swing

import java.beans.{PropertyChangeListener, PropertyChangeSupport}
import java.lang.{Object, String}
import java.util.List
import java.util.concurrent.{RunnableFuture, TimeUnit}

// An abstract class to perform lengthy GUI-interaction tasks in a
// background thread. Several background threads can be used to execute such
// tasks. However, the exact strategy of choosing a thread for any particular
// SwingWorker is unspecified and should not be relied on.
// 
// When writing a multi-threaded application using Swing, there are
// two constraints to keep in mind:
// (refer to
// 
//   Concurrency in Swing
//  for more details):
// 
//    Time-consuming tasks should not be run on the Event
//        Dispatch Thread. Otherwise the application becomes unresponsive.
//   
//    Swing components should be accessed  on the Event
//        Dispatch Thread only.
//   
// 
//
//
// 
// These constraints mean that a GUI application with time intensive
// computing needs at least two threads:  1) a thread to perform the lengthy
// task and 2) the Event Dispatch Thread (EDT) for all GUI-related
// activities.  This involves inter-thread communication which can be
// tricky to implement.
//
// 
// SwingWorker is designed for situations where you need to have a long
// running task run in a background thread and provide updates to the UI
// either when done, or while processing.
// Subclasses of SwingWorker must implement
// the doInBackground() method to perform the background computation.
//
//
// 
// Workflow
// 
// There are three threads involved in the life cycle of a
// SwingWorker :
// 
// 
// 
// Current thread: The execute() method is
// called on this thread. It schedules SwingWorker for the execution on a
// worker
// thread and returns immediately. One can wait for the SwingWorker to
// complete using the get methods.
// 
// 
// Worker thread: The doInBackground()
// method is called on this thread.
// This is where all background activities should happen. To notify
// PropertyChangeListeners about bound properties changes use the
// firePropertyChange and
// getPropertyChangeSupport() methods. By default there are two bound
// properties available: state and progress.
// 
// 
// Event Dispatch Thread:  All Swing related activities occur
// on this thread. SwingWorker invokes the
// process and done() methods and notifies
// any PropertyChangeListeners on this thread.
// 
//
// 
// Often, the Current thread is the Event Dispatch
// Thread.
//
//
// 
// Before the doInBackground method is invoked on a worker thread,
// SwingWorker notifies any PropertyChangeListeners about the
// state property change to StateValue.STARTED.  After the
// doInBackground method is finished the done method is
// executed.  Then SwingWorker notifies any PropertyChangeListeners
// about the state property change to StateValue.DONE.
//
// 
// SwingWorker is only designed to be executed once.  Executing a
// SwingWorker more than once will not result in invoking the
// doInBackground method twice.
//
// 
// Sample Usage
// 
// The following example illustrates the simplest use case.  Some
// processing is done in the background and when done you update a Swing
// component.
//
// 
// Say we want to find the "Meaning of Life" and display the result in
// a JLabel.
//
// 
//   final JLabel label;
//   class MeaningOfLifeFinder extends SwingWorker<String, Object> {
//        @Override
//       public String doInBackground() {
//           return findTheMeaningOfLife();
//       }
//
//        @Override
//       protected void done() {
//           try {
//               label.setText(get());
//           } catch (Exception ignore) {
//           }
//       }
//   }
//
//   (new MeaningOfLifeFinder()).execute();
// 
//
// 
// The next example is useful in situations where you wish to process data
// as it is ready on the Event Dispatch Thread.
//
// 
// Now we want to find the first N prime numbers and display the results in a
// JTextArea.  While this is computing, we want to update our
// progress in a JProgressBar.  Finally, we also want to print
// the prime numbers to System.out.
// 
// class PrimeNumbersTask extends
//         SwingWorker<List<Integer>, Integer> {
//     PrimeNumbersTask(JTextArea textArea, int numbersToFind) {
//         //initialize
//     }
//
//      @Override
//     public List<Integer> doInBackground() {
//         while (! enough && ! isCancelled()) {
//                 number = nextPrimeNumber();
//                 publish(number);
//                 setProgress(100 * numbers.size() / numbersToFind);
//             }
//         }
//         return numbers;
//     }
//
//      @Override
//     protected void process(List<Integer> chunks) {
//         for (int number : chunks) {
//             textArea.append(number + "\n");
//         }
//     }
// }
//
// JTextArea textArea = new JTextArea();
// final JProgressBar progressBar = new JProgressBar(0, 100);
// PrimeNumbersTask task = new PrimeNumbersTask(textArea, N);
// task.addPropertyChangeListener(
//     new PropertyChangeListener() {
//         public  void propertyChange(PropertyChangeEvent evt) {
//             if ("progress".equals(evt.getPropertyName())) {
//                 progressBar.setValue((Integer)evt.getNewValue());
//             }
//         }
//     });
//
// task.execute();
// System.out.println(task.get()); //prints all prime numbers we have got
// 
//
// 
// Because SwingWorker implements Runnable, a
// SwingWorker can be submitted to an
// Executor for execution.
abstract class SwingWorker[T, V] extends Object with RunnableFuture[T] {

    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    // Attempts to cancel execution of this task.
    def cancel(mayInterruptIfRunning: Boolean): Boolean

    // Computes a result, or throws an exception if unable to do so.
    protected def doInBackground(): T

    // Executed on the Event Dispatch Thread after the doInBackground
    // method is finished.
    protected def done(): Unit

    // Schedules this SwingWorker for execution on a worker
    // thread.
    def execute(): Unit

    // Reports a bound property update to any registered listeners.
    def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit

    // Waits if necessary for the computation to complete, and then
    // retrieves its result.
    def get(): T

    // Waits if necessary for at most the given time for the computation
    // to complete, and then retrieves its result, if available.
    def get(timeout: Long, unit: TimeUnit): T

    // Returns the progress bound property.
    def getProgress(): Int

    // Returns the PropertyChangeSupport for this SwingWorker.
    def getPropertyChangeSupport(): PropertyChangeSupport

    // Returns the SwingWorker state bound property.
    def getState(): SwingWorker.StateValue

    // Returns true if this task was cancelled before it completed
    // normally.
    def isCancelled(): Boolean

    // Returns true if this task completed.
    def isDone(): Boolean

    // Receives data chunks from the publish method asynchronously on the
    // Event Dispatch Thread.
    protected def process(chunks: List[V]): Unit

    // Sends data chunks to the process(java.util.List<V>) method.
    protected def publish(chunks: V*): Unit

    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit

    // Sets this Future to the result of computation unless
    // it has been cancelled.
    def run(): Unit
}
