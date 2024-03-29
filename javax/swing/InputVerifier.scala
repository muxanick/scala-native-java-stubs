package javax.swing

import java.lang.Object
import scala.scalanative.annotation.stub

/** The purpose of this class is to help clients support smooth focus
 *  navigation through GUIs with text fields. Such GUIs often need
 *  to ensure that the text entered by the user is valid (for example,
 *  that it's in
 *  the proper format) before allowing the user to navigate out of
 *  the text field. To do this, clients create a subclass of
 *  InputVerifier and, using JComponent's
 *  setInputVerifier method,
 *  attach an instance of their subclass to the JComponent whose input they
 *  want to validate. Before focus is transfered to another Swing component
 *  that requests it, the input verifier's shouldYieldFocus method is
 *  called.  Focus is transfered only if that method returns true.
 *  
 *  The following example has two text fields, with the first one expecting
 *  the string "pass" to be entered by the user. If that string is entered in
 *  the first text field, then the user can advance to the second text field
 *  either by clicking in it or by pressing TAB. However, if another string
 *  is entered in the first text field, then the user will be unable to
 *  transfer focus to the second text field.
 * 
 *  
 *  import java.awt.*;
 *  import java.util.*;
 *  import java.awt.event.*;
 *  import javax.swing.*;
 * 
 *  // This program demonstrates the use of the Swing InputVerifier class.
 *  // It creates two text fields; the first of the text fields expects the
 *  // string "pass" as input, and will allow focus to advance out of it
 *  // only after that string is typed in by the user.
 * 
 *  public class VerifierTest extends JFrame {
 *      public VerifierTest() {
 *          JTextField tf1 = new JTextField ("Type \"pass\" here");
 *          getContentPane().add (tf1, BorderLayout.NORTH);
 *          tf1.setInputVerifier(new PassVerifier());
 * 
 *          JTextField tf2 = new JTextField ("TextField2");
 *          getContentPane().add (tf2, BorderLayout.SOUTH);
 * 
 *          WindowListener l = new WindowAdapter() {
 *              public void windowClosing(WindowEvent e) {
 *                  System.exit(0);
 *              }
 *          };
 *          addWindowListener(l);
 *      }
 * 
 *      class PassVerifier extends InputVerifier {
 *          public boolean verify(JComponent input) {
 *              JTextField tf = (JTextField) input;
 *              return "pass".equals(tf.getText());
 *          }
 *      }
 * 
 *      public static void main(String[] args) {
 *          Frame f = new VerifierTest();
 *          f.pack();
 *          f.setVisible(true);
 *      }
 *  }
 *  
 */
abstract class InputVerifier extends Object {

    /**  */
    @stub
    def this() = ???

    /** Calls verify(input) to ensure that the input is valid. */
    def shouldYieldFocus(input: JComponent): Boolean

    /** Checks whether the JComponent's input is valid. */
    def verify(input: JComponent): Boolean
}
