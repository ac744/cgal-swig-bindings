/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Direction_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Direction_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Direction_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Direction_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Direction_2(double x, double y) {
    this(CGAL_KernelJNI.new_Direction_2__SWIG_0(x, y), true);
  }

  public Direction_2(Vector_2 v) {
    this(CGAL_KernelJNI.new_Direction_2__SWIG_1(Vector_2.getCPtr(v), v), true);
  }

  public Direction_2(Line_2 l) {
    this(CGAL_KernelJNI.new_Direction_2__SWIG_2(Line_2.getCPtr(l), l), true);
  }

  public Direction_2(Ray_2 r) {
    this(CGAL_KernelJNI.new_Direction_2__SWIG_3(Ray_2.getCPtr(r), r), true);
  }

  public Direction_2(Segment_2 s) {
    this(CGAL_KernelJNI.new_Direction_2__SWIG_4(Segment_2.getCPtr(s), s), true);
  }

  public double delta(int c) {
    return CGAL_KernelJNI.Direction_2_delta(swigCPtr, this, c);
  }

  public double dx() {
    return CGAL_KernelJNI.Direction_2_dx(swigCPtr, this);
  }

  public double dy() {
    return CGAL_KernelJNI.Direction_2_dy(swigCPtr, this);
  }

  public boolean counterclockwise_in_between(Direction_2 c1, Direction_2 c2) {
    return CGAL_KernelJNI.Direction_2_counterclockwise_in_between(swigCPtr, this, Direction_2.getCPtr(c1), c1, Direction_2.getCPtr(c2), c2);
  }

  public Vector_2 vector() {
    return new Vector_2(CGAL_KernelJNI.Direction_2_vector__SWIG_0(swigCPtr, this), true);
  }

  public void vector(Vector_2 ref) {
    CGAL_KernelJNI.Direction_2_vector__SWIG_1(swigCPtr, this, Vector_2.getCPtr(ref), ref);
  }

  public boolean lt(Direction_2 p) {
    return CGAL_KernelJNI.Direction_2_lt(swigCPtr, this, Direction_2.getCPtr(p), p);
  }

  public boolean gt(Direction_2 p) {
    return CGAL_KernelJNI.Direction_2_gt(swigCPtr, this, Direction_2.getCPtr(p), p);
  }

  public boolean le(Direction_2 p) {
    return CGAL_KernelJNI.Direction_2_le(swigCPtr, this, Direction_2.getCPtr(p), p);
  }

  public boolean ge(Direction_2 p) {
    return CGAL_KernelJNI.Direction_2_ge(swigCPtr, this, Direction_2.getCPtr(p), p);
  }

  public boolean equals(Direction_2 p) {
    return CGAL_KernelJNI.Direction_2_equals(swigCPtr, this, Direction_2.getCPtr(p), p);
  }

  public boolean not_equals(Direction_2 p) {
    return CGAL_KernelJNI.Direction_2_not_equals(swigCPtr, this, Direction_2.getCPtr(p), p);
  }

  public Direction_2 minus() {
    return new Direction_2(CGAL_KernelJNI.Direction_2_minus__SWIG_0(swigCPtr, this), true);
  }

  public void minus(Direction_2 ref) {
    CGAL_KernelJNI.Direction_2_minus__SWIG_1(swigCPtr, this, Direction_2.getCPtr(ref), ref);
  }

  public String toString() {
    return CGAL_KernelJNI.Direction_2_toString(swigCPtr, this);
  }

  public Direction_2 clone() {
    return new Direction_2(CGAL_KernelJNI.Direction_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Direction_2 other) {
    CGAL_KernelJNI.Direction_2_clone__SWIG_1(swigCPtr, this, Direction_2.getCPtr(other), other);
  }

}
