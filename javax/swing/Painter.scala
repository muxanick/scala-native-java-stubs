package javax.swing

/** A painting delegate. The Painter interface defines exactly one method,
 *  paint. It is used in situations where the developer can change
 *  the painting routine of a component without having to resort to subclassing
 *  the component. It is also generically useful when doing any form of painting
 *  delegation.
 * 
 *  Painters are simply encapsulations of Java2D code and make
 *  it fairly trivial to reuse existing Painters or to combine
 *  them together. Implementations of this interface are also trivial to write,
 *  such that if you can't find a Painter that does what you need,
 *  you can write one with minimal effort. Writing a Painter requires
 *  knowledge of Java2D.
 * 
 *  A Painter may be created with a type parameter. This type will be
 *  expected in the paint method. For example, you may wish to write a
 *  Painter that only works with subclasses of Component.
 *  In that case, when the Painter is declared, you may declare that
 *  it requires a Component, allowing the paint method to be type safe. Ex:
 *  
 *  
 *  Painter<Component> p = new Painter<Component>() {
 *      public void paint(Graphics2D g, Component c, int width, int height) {
 *          g.setColor(c.getBackground());
 *          //and so forth
 *      }
 *  }
 *  
 *  
 * 
 *  This interface makes no guarantees of threadsafety.
 */
trait Painter[T] {
}
