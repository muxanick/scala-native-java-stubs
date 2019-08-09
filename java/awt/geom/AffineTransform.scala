package java.awt.geom

import java.awt.Shape
import java.io.Serializable
import java.lang.{Cloneable, Object, String}

// The AffineTransform class represents a 2D affine transform
// that performs a linear mapping from 2D coordinates to other 2D
// coordinates that preserves the "straightness" and
// "parallelness" of lines.  Affine transformations can be constructed
// using sequences of translations, scales, flips, rotations, and shears.
// 
// Such a coordinate transformation can be represented by a 3 row by
// 3 column matrix with an implied last row of [ 0 0 1 ].  This matrix
// transforms source coordinates (x,y) into
// destination coordinates (x',y') by considering
// them to be a column vector and multiplying the coordinate vector
// by the matrix according to the following process:
// 
//      [ x']   [  m00  m01  m02  ] [ x ]   [ m00x + m01y + m02 ]
//      [ y'] = [  m10  m11  m12  ] [ y ] = [ m10x + m11y + m12 ]
//      [ 1 ]   [   0    0    1   ] [ 1 ]   [         1         ]
// 
// Handling 90-Degree Rotations
// 
// In some variations of the rotate methods in the
// AffineTransform class, a double-precision argument
// specifies the angle of rotation in radians.
// These methods have special handling for rotations of approximately
// 90 degrees (including multiples such as 180, 270, and 360 degrees),
// so that the common case of quadrant rotation is handled more
// efficiently.
// This special handling can cause angles very close to multiples of
// 90 degrees to be treated as if they were exact multiples of
// 90 degrees.
// For small multiples of 90 degrees the range of angles treated
// as a quadrant rotation is approximately 0.00000121 degrees wide.
// This section explains why such special care is needed and how
// it is implemented.
// 
// Since 90 degrees is represented as PI/2 in radians,
// and since PI is a transcendental (and therefore irrational) number,
// it is not possible to exactly represent a multiple of 90 degrees as
// an exact double precision value measured in radians.
// As a result it is theoretically impossible to describe quadrant
// rotations (90, 180, 270 or 360 degrees) using these values.
// Double precision floating point values can get very close to
// non-zero multiples of PI/2 but never close enough
// for the sine or cosine to be exactly 0.0, 1.0 or -1.0.
// The implementations of Math.sin() and
// Math.cos() correspondingly never return 0.0
// for any case other than Math.sin(0.0).
// These same implementations do, however, return exactly 1.0 and
// -1.0 for some range of numbers around each multiple of 90
// degrees since the correct answer is so close to 1.0 or -1.0 that
// the double precision significand cannot represent the difference
// as accurately as it can for numbers that are near 0.0.
// 
// The net result of these issues is that if the
// Math.sin() and Math.cos() methods
// are used to directly generate the values for the matrix modifications
// during these radian-based rotation operations then the resulting
// transform is never strictly classifiable as a quadrant rotation
// even for a simple case like rotate(Math.PI/2.0),
// due to minor variations in the matrix caused by the non-0.0 values
// obtained for the sine and cosine.
// If these transforms are not classified as quadrant rotations then
// subsequent code which attempts to optimize further operations based
// upon the type of the transform will be relegated to its most general
// implementation.
// 
// Because quadrant rotations are fairly common,
// this class should handle these cases reasonably quickly, both in
// applying the rotations to the transform and in applying the resulting
// transform to the coordinates.
// To facilitate this optimal handling, the methods which take an angle
// of rotation measured in radians attempt to detect angles that are
// intended to be quadrant rotations and treat them as such.
// These methods therefore treat an angle theta as a quadrant
// rotation if either Math.sin(theta) or
// Math.cos(theta) returns exactly 1.0 or -1.0.
// As a rule of thumb, this property holds true for a range of
// approximately 0.0000000211 radians (or 0.00000121 degrees) around
// small multiples of Math.PI/2.0.
class AffineTransform extends Object with Cloneable, with Serializable {

    @stub
    // Constructs a new AffineTransform representing the
    // Identity transformation.
    def this() = ???

    @stub
    // Constructs a new AffineTransform that is a copy of
    // the specified AffineTransform object.
    def this(Tx: AffineTransform) = ???

    @stub
    // Constructs a new AffineTransform from an array of
    // double precision values representing either the 4 non-translation
    // entries or the 6 specifiable entries of the 3x3 transformation
    // matrix.
    def this(flatmatrix: Array[double]) = ???

    @stub
    // Constructs a new AffineTransform from 6 double
    // precision values representing the 6 specifiable entries of the 3x3
    // transformation matrix.
    def this(m00: double, m10: double, m01: double, m11: double, m02: double, m12: double) = ???

    @stub
    // Constructs a new AffineTransform from an array of
    // floating point values representing either the 4 non-translation
    // entries or the 6 specifiable entries of the 3x3 transformation
    // matrix.
    def this(flatmatrix: Array[float]) = ???

    @stub
    // Returns a copy of this AffineTransform object.
    def clone(): Object = ???

    @stub
    // Concatenates an AffineTransform Tx to
    // this AffineTransform Cx in the most commonly useful
    // way to provide a new user space
    // that is mapped to the former user space by Tx.
    def concatenate(Tx: AffineTransform): Unit = ???

    @stub
    // Returns an AffineTransform object representing the
    // inverse transformation.
    def createInverse(): AffineTransform = ???

    @stub
    // Returns a new Shape object defined by the geometry of the
    // specified Shape after it has been transformed by
    // this transform.
    def createTransformedShape(pSrc: Shape): Shape = ???

    @stub
    // Transforms an array of relative distance vectors by this
    // transform.
    def deltaTransform(srcPts: Array[double], srcOff: Int, dstPts: Array[double], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Transforms the relative distance vector specified by
    // ptSrc and stores the result in ptDst.
    def deltaTransform(ptSrc: Point2D, ptDst: Point2D): Point2D = ???

    @stub
    // Returns true if this AffineTransform
    // represents the same affine coordinate transform as the specified
    // argument.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the determinant of the matrix representation of the transform.
    def getDeterminant(): double = ???

    @stub
    // Retrieves the 6 specifiable values in the 3x3 affine transformation
    // matrix and places them into an array of double precisions values.
    def getMatrix(flatmatrix: Array[double]): Unit = ???

    @stub
    // Returns the X coordinate scaling element (m00) of the 3x3
    // affine transformation matrix.
    def getScaleX(): double = ???

    @stub
    // Returns the Y coordinate scaling element (m11) of the 3x3
    // affine transformation matrix.
    def getScaleY(): double = ???

    @stub
    // Returns the X coordinate shearing element (m01) of the 3x3
    // affine transformation matrix.
    def getShearX(): double = ???

    @stub
    // Returns the Y coordinate shearing element (m10) of the 3x3
    // affine transformation matrix.
    def getShearY(): double = ???

    @stub
    // Returns the X coordinate of the translation element (m02) of the
    // 3x3 affine transformation matrix.
    def getTranslateX(): double = ???

    @stub
    // Returns the Y coordinate of the translation element (m12) of the
    // 3x3 affine transformation matrix.
    def getTranslateY(): double = ???

    @stub
    // Retrieves the flag bits describing the conversion properties of
    // this transform.
    def getType(): Int = ???

    @stub
    // Returns the hashcode for this transform.
    def hashCode(): Int = ???

    @stub
    // Inverse transforms an array of double precision coordinates by
    // this transform.
    def inverseTransform(srcPts: Array[double], srcOff: Int, dstPts: Array[double], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Inverse transforms the specified ptSrc and stores the
    // result in ptDst.
    def inverseTransform(ptSrc: Point2D, ptDst: Point2D): Point2D = ???

    @stub
    // Sets this transform to the inverse of itself.
    def invert(): Unit = ???

    @stub
    // Returns true if this AffineTransform is
    // an identity transform.
    def isIdentity(): Boolean = ???

    @stub
    // Concatenates an AffineTransform Tx to
    // this AffineTransform Cx
    // in a less commonly used way such that Tx modifies the
    // coordinate transformation relative to the absolute pixel
    // space rather than relative to the existing user space.
    def preConcatenate(Tx: AffineTransform): Unit = ???

    @stub
    // Concatenates this transform with a transform that rotates
    // coordinates by the specified number of quadrants.
    def quadrantRotate(numquadrants: Int): Unit = ???

    @stub
    // Concatenates this transform with a transform that rotates
    // coordinates by the specified number of quadrants around
    // the specified anchor point.
    def quadrantRotate(numquadrants: Int, anchorx: double, anchory: double): Unit = ???

    @stub
    // Concatenates this transform with a rotation transformation.
    def rotate(theta: double): Unit = ???

    @stub
    // Concatenates this transform with a transform that rotates
    // coordinates according to a rotation vector.
    def rotate(vecx: double, vecy: double): Unit = ???

    @stub
    // Concatenates this transform with a transform that rotates
    // coordinates around an anchor point.
    def rotate(theta: double, anchorx: double, anchory: double): Unit = ???

    @stub
    // Concatenates this transform with a transform that rotates
    // coordinates around an anchor point according to a rotation
    // vector.
    def rotate(vecx: double, vecy: double, anchorx: double, anchory: double): Unit = ???

    @stub
    // Concatenates this transform with a scaling transformation.
    def scale(sx: double, sy: double): Unit = ???

    @stub
    // Resets this transform to the Identity transform.
    def setToIdentity(): Unit = ???

    @stub
    // Sets this transform to a rotation transformation that rotates
    // coordinates by the specified number of quadrants.
    def setToQuadrantRotation(numquadrants: Int): Unit = ???

    @stub
    // Sets this transform to a translated rotation transformation
    // that rotates coordinates by the specified number of quadrants
    // around the specified anchor point.
    def setToQuadrantRotation(numquadrants: Int, anchorx: double, anchory: double): Unit = ???

    @stub
    // Sets this transform to a rotation transformation.
    def setToRotation(theta: double): Unit = ???

    @stub
    // Sets this transform to a rotation transformation that rotates
    // coordinates according to a rotation vector.
    def setToRotation(vecx: double, vecy: double): Unit = ???

    @stub
    // Sets this transform to a translated rotation transformation.
    def setToRotation(theta: double, anchorx: double, anchory: double): Unit = ???

    @stub
    // Sets this transform to a rotation transformation that rotates
    // coordinates around an anchor point according to a rotation
    // vector.
    def setToRotation(vecx: double, vecy: double, anchorx: double, anchory: double): Unit = ???

    @stub
    // Sets this transform to a scaling transformation.
    def setToScale(sx: double, sy: double): Unit = ???

    @stub
    // Sets this transform to a shearing transformation.
    def setToShear(shx: double, shy: double): Unit = ???

    @stub
    // Sets this transform to a translation transformation.
    def setToTranslation(tx: double, ty: double): Unit = ???

    @stub
    // Sets this transform to a copy of the transform in the specified
    // AffineTransform object.
    def setTransform(Tx: AffineTransform): Unit = ???

    @stub
    // Sets this transform to the matrix specified by the 6
    // double precision values.
    def setTransform(m00: double, m10: double, m01: double, m11: double, m02: double, m12: double): Unit = ???

    @stub
    // Concatenates this transform with a shearing transformation.
    def shear(shx: double, shy: double): Unit = ???

    @stub
    // Returns a String that represents the value of this
    // Object.
    def toString(): String = ???

    @stub
    // Transforms an array of double precision coordinates by this transform.
    def transform(srcPts: Array[double], srcOff: Int, dstPts: Array[double], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Transforms an array of double precision coordinates by this transform
    // and stores the results into an array of floats.
    def transform(srcPts: Array[double], srcOff: Int, dstPts: Array[float], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Transforms an array of floating point coordinates by this transform
    // and stores the results into an array of doubles.
    def transform(srcPts: Array[float], srcOff: Int, dstPts: Array[double], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Transforms an array of floating point coordinates by this transform.
    def transform(srcPts: Array[float], srcOff: Int, dstPts: Array[float], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Transforms an array of point objects by this transform.
    def transform(ptSrc: Array[Point2D], srcOff: Int, ptDst: Array[Point2D], dstOff: Int, numPts: Int): Unit = ???

    @stub
    // Transforms the specified ptSrc and stores the result
    // in ptDst.
    def transform(ptSrc: Point2D, ptDst: Point2D): Point2D = ???
}

object AffineTransform {
    @stub
    // This flag bit indicates that the transform defined by this object
    // performs a mirror image flip about some axis which changes the
    // normally right handed coordinate system into a left handed
    // system in addition to the conversions indicated by other flag bits.
    def TYPE_FLIP: Int = ???

    @stub
    // This flag bit indicates that the transform defined by this object
    // performs a rotation by an arbitrary angle in addition to the
    // conversions indicated by other flag bits.
    def TYPE_GENERAL_ROTATION: Int = ???

    @stub
    // This flag bit indicates that the transform defined by this object
    // performs a general scale in addition to the conversions indicated
    // by other flag bits.
    def TYPE_GENERAL_SCALE: Int = ???

    @stub
    // This constant indicates that the transform defined by this object
    // performs an arbitrary conversion of the input coordinates.
    def TYPE_GENERAL_TRANSFORM: Int = ???

    @stub
    // This constant indicates that the transform defined by this object
    // is an identity transform.
    def TYPE_IDENTITY: Int = ???

    @stub
    // This constant is a bit mask for any of the rotation flag bits.
    def TYPE_MASK_ROTATION: Int = ???

    @stub
    // This constant is a bit mask for any of the scale flag bits.
    def TYPE_MASK_SCALE: Int = ???

    @stub
    // This flag bit indicates that the transform defined by this object
    // performs a quadrant rotation by some multiple of 90 degrees in
    // addition to the conversions indicated by other flag bits.
    def TYPE_QUADRANT_ROTATION: Int = ???

    @stub
    // This flag bit indicates that the transform defined by this object
    // performs a translation in addition to the conversions indicated
    // by other flag bits.
    def TYPE_TRANSLATION: Int = ???

    @stub
    // Returns a transform that rotates coordinates by the specified
    // number of quadrants.
    def getQuadrantRotateInstance(numquadrants: Int): AffineTransform = ???

    @stub
    // Returns a transform that rotates coordinates by the specified
    // number of quadrants around the specified anchor point.
    def getQuadrantRotateInstance(numquadrants: Int, anchorx: double, anchory: double): AffineTransform = ???

    @stub
    // Returns a transform representing a rotation transformation.
    def getRotateInstance(theta: double): AffineTransform = ???

    @stub
    // Returns a transform that rotates coordinates according to
    // a rotation vector.
    def getRotateInstance(vecx: double, vecy: double): AffineTransform = ???

    @stub
    // Returns a transform that rotates coordinates around an anchor point.
    def getRotateInstance(theta: double, anchorx: double, anchory: double): AffineTransform = ???

    @stub
    // Returns a transform that rotates coordinates around an anchor
    // point according to a rotation vector.
    def getRotateInstance(vecx: double, vecy: double, anchorx: double, anchory: double): AffineTransform = ???

    @stub
    // Returns a transform representing a scaling transformation.
    def getScaleInstance(sx: double, sy: double): AffineTransform = ???

    @stub
    // Returns a transform representing a shearing transformation.
    def getShearInstance(shx: double, shy: double): AffineTransform = ???

    @stub
    // Returns a transform representing a translation transformation.
    def getTranslateInstance(tx: double, ty: double): AffineTransform = ???
}
