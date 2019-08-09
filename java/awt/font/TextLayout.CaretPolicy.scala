package java.awt.font

import java.lang.Object

// Defines a policy for determining the strong caret location.
// This class contains one method, getStrongCaret, which
// is used to specify the policy that determines the strong caret in
// dual-caret text.  The strong caret is used to move the caret to the
// left or right. Instances of this class can be passed to
// getCaretShapes, getNextLeftHit and
// getNextRightHit to customize strong caret
// selection.
// 
// To specify alternate caret policies, subclass CaretPolicy
// and override getStrongCaret.  getStrongCaret
// should inspect the two TextHitInfo arguments and choose
// one of them as the strong caret.
// 
// Most clients do not need to use this class.
object TextLayout.CaretPolicy extends Object {