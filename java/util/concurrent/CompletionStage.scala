package java.util.concurrent

import java.lang.{Runnable, Throwable, Void}
import java.util.function.{BiConsumer, BiFunction, Consumer, Function}

/** A stage of a possibly asynchronous computation, that performs an
 *  action or computes a value when another CompletionStage completes.
 *  A stage completes upon termination of its computation, but this may
 *  in turn trigger other dependent stages.  The functionality defined
 *  in this interface takes only a few basic forms, which expand out to
 *  a larger set of methods to capture a range of usage styles: 
 * 
 *  The computation performed by a stage may be expressed as a
 *  Function, Consumer, or Runnable (using methods with names including
 *  apply, accept, or run, respectively)
 *  depending on whether it requires arguments and/or produces results.
 *  For example, stage.thenApply(x -> square(x)).thenAccept(x ->
 *  System.out.print(x)).thenRun(() -> System.out.println()). An
 *  additional form (compose) applies functions of stages
 *  themselves, rather than their results. 
 * 
 *   One stage's execution may be triggered by completion of a
 *  single stage, or both of two stages, or either of two stages.
 *  Dependencies on a single stage are arranged using methods with
 *  prefix then. Those triggered by completion of
 *  both of two stages may combine their results or
 *  effects, using correspondingly named methods. Those triggered by
 *  either of two stages make no guarantees about which of the
 *  results or effects are used for the dependent stage's
 *  computation.
 * 
 *   Dependencies among stages control the triggering of
 *  computations, but do not otherwise guarantee any particular
 *  ordering. Additionally, execution of a new stage's computations may
 *  be arranged in any of three ways: default execution, default
 *  asynchronous execution (using methods with suffix async
 *  that employ the stage's default asynchronous execution facility),
 *  or custom (via a supplied Executor).  The execution
 *  properties of default and async modes are specified by
 *  CompletionStage implementations, not this interface. Methods with
 *  explicit Executor arguments may have arbitrary execution
 *  properties, and might not even support concurrent execution, but
 *  are arranged for processing in a way that accommodates asynchrony.
 * 
 *   Two method forms support processing whether the triggering
 *  stage completed normally or exceptionally: Method whenComplete allows injection of an action
 *  regardless of outcome, otherwise preserving the outcome in its
 *  completion. Method handle additionally allows the
 *  stage to compute a replacement result that may enable further
 *  processing by other dependent stages.  In all other cases, if a
 *  stage's computation terminates abruptly with an (unchecked)
 *  exception or error, then all dependent stages requiring its
 *  completion complete exceptionally as well, with a CompletionException holding the exception as its cause.  If a
 *  stage is dependent on both of two stages, and both
 *  complete exceptionally, then the CompletionException may correspond
 *  to either one of these exceptions.  If a stage is dependent on
 *  either of two others, and only one of them completes
 *  exceptionally, no guarantees are made about whether the dependent
 *  stage completes normally or exceptionally. In the case of method
 *  whenComplete, when the supplied action itself encounters an
 *  exception, then the stage exceptionally completes with this
 *  exception if not already completed exceptionally.
 * 
 *  
 * 
 *  All methods adhere to the above triggering, execution, and
 *  exceptional completion specifications (which are not repeated in
 *  individual method specifications). Additionally, while arguments
 *  used to pass a completion result (that is, for parameters of type
 *  T) for methods accepting them may be null, passing a null
 *  value for any other parameter will result in a NullPointerException being thrown.
 * 
 *  This interface does not define methods for initially creating,
 *  forcibly completing normally or exceptionally, probing completion
 *  status or results, or awaiting completion of a stage.
 *  Implementations of CompletionStage may provide means of achieving
 *  such effects, as appropriate.  Method toCompletableFuture()
 *  enables interoperability among different implementations of this
 *  interface by providing a common conversion type.
 */
trait CompletionStage[T] {

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed with the
     *  corresponding result as argument to the supplied action.
     */
    @stub
    def acceptEither(other: CompletionStage[_ <: T], action: Consumer[_ >: T]): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using this
     *  stage's default asynchronous execution facility, with the
     *  corresponding result as argument to the supplied action.
     */
    @stub
    def acceptEitherAsync(other: CompletionStage[_ <: T], action: Consumer[_ >: T]): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using the
     *  supplied executor, with the corresponding result as argument to
     *  the supplied function.
     */
    @stub
    def acceptEitherAsync(other: CompletionStage[_ <: T], action: Consumer[_ >: T], executor: Executor): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed with the
     *  corresponding result as argument to the supplied function.
     */
    @stub
    def applyToEither[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using this
     *  stage's default asynchronous execution facility, with the
     *  corresponding result as argument to the supplied function.
     */
    @stub
    def applyToEitherAsync[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using the
     *  supplied executor, with the corresponding result as argument to
     *  the supplied function.
     */
    @stub
    def applyToEitherAsync[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U], executor: Executor): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  exceptionally, is executed with this stage's exception as the
     *  argument to the supplied function.
     */
    @stub
    def exceptionally(fn: Function[Throwable, _ <: T]): CompletionStage[T] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  either normally or exceptionally, is executed with this stage's
     *  result and exception as arguments to the supplied function.
     */
    @stub
    def handle[U](fn: BiFunction[_ >: T, Throwable, _ <: U]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  either normally or exceptionally, is executed using this stage's
     *  default asynchronous execution facility, with this stage's
     *  result and exception as arguments to the supplied function.
     */
    @stub
    def handleAsync[U](fn: BiFunction[_ >: T, Throwable, _ <: U]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  either normally or exceptionally, is executed using the
     *  supplied executor, with this stage's result and exception as
     *  arguments to the supplied function.
     */
    @stub
    def handleAsync[U](fn: BiFunction[_ >: T, Throwable, _ <: U], executor: Executor): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage both complete normally, executes the given action.
     */
    @stub
    def runAfterBoth(other: CompletionStage[_], action: Runnable): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, executes the given action using
     *  this stage's default asynchronous execution facility.
     */
    @stub
    def runAfterBothAsync(other: CompletionStage[_], action: Runnable): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, executes the given action using
     *  the supplied executor.
     */
    @stub
    def runAfterBothAsync(other: CompletionStage[_], action: Runnable, executor: Executor): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, executes the given action.
     */
    @stub
    def runAfterEither(other: CompletionStage[_], action: Runnable): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, executes the given action
     *  using this stage's default asynchronous execution facility.
     */
    @stub
    def runAfterEitherAsync(other: CompletionStage[_], action: Runnable): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, executes the given action
     *  using the supplied executor.
     */
    @stub
    def runAfterEitherAsync(other: CompletionStage[_], action: Runnable, executor: Executor): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed with this stage's result as the argument
     *  to the supplied action.
     */
    @stub
    def thenAccept(action: Consumer[_ >: T]): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using this stage's default asynchronous
     *  execution facility, with this stage's result as the argument to
     *  the supplied action.
     */
    @stub
    def thenAcceptAsync(action: Consumer[_ >: T]): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using the supplied Executor, with this
     *  stage's result as the argument to the supplied action.
     */
    @stub
    def thenAcceptAsync(action: Consumer[_ >: T], executor: Executor): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage both complete normally, is executed with the two
     *  results as arguments to the supplied action.
     */
    @stub
    def thenAcceptBoth[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U]): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using this stage's
     *  default asynchronous execution facility, with the two results
     *  as arguments to the supplied action.
     */
    @stub
    def thenAcceptBothAsync[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U]): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using the supplied
     *  executor, with the two results as arguments to the supplied
     *  function.
     */
    @stub
    def thenAcceptBothAsync[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U], executor: Executor): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed with this stage's result as the argument
     *  to the supplied function.
     */
    @stub
    def thenApply[U](fn: Function[_ >: T, _ <: U]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using this stage's default asynchronous
     *  execution facility, with this stage's result as the argument to
     *  the supplied function.
     */
    @stub
    def thenApplyAsync[U](fn: Function[_ >: T, _ <: U]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using the supplied Executor, with this
     *  stage's result as the argument to the supplied function.
     */
    @stub
    def thenApplyAsync[U](fn: Function[_ >: T, _ <: U], executor: Executor): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage both complete normally, is executed with the two
     *  results as arguments to the supplied function.
     */
    @stub
    def thenCombine[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V]): CompletionStage[V] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using this stage's
     *  default asynchronous execution facility, with the two results
     *  as arguments to the supplied function.
     */
    @stub
    def thenCombineAsync[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V]): CompletionStage[V] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using the supplied
     *  executor, with the two results as arguments to the supplied
     *  function.
     */
    @stub
    def thenCombineAsync[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V], executor: Executor): CompletionStage[V] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed with this stage as the argument
     *  to the supplied function.
     */
    @stub
    def thenCompose[U](fn: Function[_ >: T, _ <: CompletionStage[U]]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using this stage's default asynchronous
     *  execution facility, with this stage as the argument to the
     *  supplied function.
     */
    @stub
    def thenComposeAsync[U](fn: Function[_ >: T, _ <: CompletionStage[U]]): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using the supplied Executor, with this
     *  stage's result as the argument to the supplied function.
     */
    @stub
    def thenComposeAsync[U](fn: Function[_ >: T, _ <: CompletionStage[U]], executor: Executor): CompletionStage[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, executes the given action.
     */
    @stub
    def thenRun(action: Runnable): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, executes the given action using this stage's default
     *  asynchronous execution facility.
     */
    @stub
    def thenRunAsync(action: Runnable): CompletionStage[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, executes the given action using the supplied Executor.
     */
    @stub
    def thenRunAsync(action: Runnable, executor: Executor): CompletionStage[Void] = ???

    /** Returns a CompletableFuture maintaining the same
     *  completion properties as this stage.
     */
    @stub
    def toCompletableFuture(): CompletableFuture[T] = ???

    /** Returns a new CompletionStage with the same result or exception as
     *  this stage, that executes the given action when this stage completes.
     */
    @stub
    def whenComplete(action: BiConsumer[_ >: T, _ >: Throwable]): CompletionStage[T] = ???

    /** Returns a new CompletionStage with the same result or exception as
     *  this stage, that executes the given action using this stage's
     *  default asynchronous execution facility when this stage completes.
     */
    @stub
    def whenCompleteAsync(action: BiConsumer[_ >: T, _ >: Throwable]): CompletionStage[T] = ???
}
