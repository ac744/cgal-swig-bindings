/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Tetrahedron_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Tetrahedron_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Tetrahedron_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Tetrahedron_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Tetrahedron_3() {
    this(CGAL_KernelJNI.new_Tetrahedron_3__SWIG_0(), true);
  }

  public Tetrahedron_3(Point_3 p, Point_3 q, Point_3 r, Point_3 s) {
    this(CGAL_KernelJNI.new_Tetrahedron_3__SWIG_1(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, Point_3.getCPtr(r), r, Point_3.getCPtr(s), s), true);
  }

  public Point_3 vertex(int c) {
    return new Point_3(CGAL_KernelJNI.Tetrahedron_3_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Point_3 ret) {
    CGAL_KernelJNI.Tetrahedron_3_vertex__SWIG_1(swigCPtr, this, c, Point_3.getCPtr(ret), ret);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Tetrahedron_3_is_degenerate(swigCPtr, this);
  }

  public boolean has_on_positive_side(Point_3 c) {
    return CGAL_KernelJNI.Tetrahedron_3_has_on_positive_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_negative_side(Point_3 c) {
    return CGAL_KernelJNI.Tetrahedron_3_has_on_negative_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_boundary(Point_3 c) {
    return CGAL_KernelJNI.Tetrahedron_3_has_on_boundary(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_bounded_side(Point_3 c) {
    return CGAL_KernelJNI.Tetrahedron_3_has_on_bounded_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_unbounded_side(Point_3 c) {
    return CGAL_KernelJNI.Tetrahedron_3_has_on_unbounded_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public Orientation orientation() {
    return Orientation.swigToEnum(CGAL_KernelJNI.Tetrahedron_3_orientation(swigCPtr, this));
  }

  public Oriented_side oriented_side(Point_3 c) {
    return Oriented_side.swigToEnum(CGAL_KernelJNI.Tetrahedron_3_oriented_side(swigCPtr, this, Point_3.getCPtr(c), c));
  }

  public Bounded_side bounded_side(Point_3 c) {
    return Bounded_side.swigToEnum(CGAL_KernelJNI.Tetrahedron_3_bounded_side(swigCPtr, this, Point_3.getCPtr(c), c));
  }

  public double volume() {
    return CGAL_KernelJNI.Tetrahedron_3_volume(swigCPtr, this);
  }

  public Bbox_3 bbox() {
    return new Bbox_3(CGAL_KernelJNI.Tetrahedron_3_bbox__SWIG_0(swigCPtr, this), true);
  }

  public void bbox(Bbox_3 ref) {
    CGAL_KernelJNI.Tetrahedron_3_bbox__SWIG_1(swigCPtr, this, Bbox_3.getCPtr(ref), ref);
  }

  public boolean equals(Tetrahedron_3 p) {
    return CGAL_KernelJNI.Tetrahedron_3_equals(swigCPtr, this, Tetrahedron_3.getCPtr(p), p);
  }

  public boolean not_equals(Tetrahedron_3 p) {
    return CGAL_KernelJNI.Tetrahedron_3_not_equals(swigCPtr, this, Tetrahedron_3.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Tetrahedron_3_toString(swigCPtr, this);
  }

  public Tetrahedron_3 clone() {
    return new Tetrahedron_3(CGAL_KernelJNI.Tetrahedron_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Tetrahedron_3 other) {
    CGAL_KernelJNI.Tetrahedron_3_clone__SWIG_1(swigCPtr, this, Tetrahedron_3.getCPtr(other), other);
  }

}
