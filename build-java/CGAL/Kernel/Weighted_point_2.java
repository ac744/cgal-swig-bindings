/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Weighted_point_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Weighted_point_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Weighted_point_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Weighted_point_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Weighted_point_2() {
    this(CGAL_KernelJNI.new_Weighted_point_2__SWIG_0(), true);
  }

  public Weighted_point_2(double x, double y) {
    this(CGAL_KernelJNI.new_Weighted_point_2__SWIG_1(x, y), true);
  }

  public Weighted_point_2(Point_2 p, double w) {
    this(CGAL_KernelJNI.new_Weighted_point_2__SWIG_2(Point_2.getCPtr(p), p, w), true);
  }

  public double weight() {
    return CGAL_KernelJNI.Weighted_point_2_weight(swigCPtr, this);
  }

  public double x() {
    return CGAL_KernelJNI.Weighted_point_2_x(swigCPtr, this);
  }

  public double y() {
    return CGAL_KernelJNI.Weighted_point_2_y(swigCPtr, this);
  }

  public Point_2 point() {
    return new Point_2(CGAL_KernelJNI.Weighted_point_2_point(swigCPtr, this), true);
  }

  public boolean equals(Weighted_point_2 p) {
    return CGAL_KernelJNI.Weighted_point_2_equals(swigCPtr, this, Weighted_point_2.getCPtr(p), p);
  }

  public boolean not_equals(Weighted_point_2 p) {
    return CGAL_KernelJNI.Weighted_point_2_not_equals(swigCPtr, this, Weighted_point_2.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Weighted_point_2_toString(swigCPtr, this);
  }

  public Weighted_point_2 clone() {
    return new Weighted_point_2(CGAL_KernelJNI.Weighted_point_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Weighted_point_2 other) {
    CGAL_KernelJNI.Weighted_point_2_clone__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(other), other);
  }

}
