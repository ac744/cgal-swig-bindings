/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Iso_cuboid_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Iso_cuboid_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Iso_cuboid_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Iso_cuboid_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Iso_cuboid_3(Point_3 p, Point_3 q) {
    this(CGAL_KernelJNI.new_Iso_cuboid_3__SWIG_0(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q), true);
  }

  public Iso_cuboid_3(Point_3 p, Point_3 q, int i) {
    this(CGAL_KernelJNI.new_Iso_cuboid_3__SWIG_1(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, i), true);
  }

  public Iso_cuboid_3(Point_3 left, Point_3 right, Point_3 bottom, Point_3 top, Point_3 far, Point_3 close) {
    this(CGAL_KernelJNI.new_Iso_cuboid_3__SWIG_2(Point_3.getCPtr(left), left, Point_3.getCPtr(right), right, Point_3.getCPtr(bottom), bottom, Point_3.getCPtr(top), top, Point_3.getCPtr(far), far, Point_3.getCPtr(close), close), true);
  }

  public Iso_cuboid_3(double min_hx, double min_hy, double min_hz, double max_hx, double max_hy, double max_hz, double hw) {
    this(CGAL_KernelJNI.new_Iso_cuboid_3__SWIG_3(min_hx, min_hy, min_hz, max_hx, max_hy, max_hz, hw), true);
  }

  public Iso_cuboid_3(double min_hx, double min_hy, double min_hz, double max_hx, double max_hy, double max_hz) {
    this(CGAL_KernelJNI.new_Iso_cuboid_3__SWIG_4(min_hx, min_hy, min_hz, max_hx, max_hy, max_hz), true);
  }

  public boolean equals(Iso_cuboid_3 p) {
    return CGAL_KernelJNI.Iso_cuboid_3_equals(swigCPtr, this, Iso_cuboid_3.getCPtr(p), p);
  }

  public boolean not_equals(Iso_cuboid_3 p) {
    return CGAL_KernelJNI.Iso_cuboid_3_not_equals(swigCPtr, this, Iso_cuboid_3.getCPtr(p), p);
  }

  public Point_3 vertex(int c) {
    return new Point_3(CGAL_KernelJNI.Iso_cuboid_3_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Point_3 ret) {
    CGAL_KernelJNI.Iso_cuboid_3_vertex__SWIG_1(swigCPtr, this, c, Point_3.getCPtr(ret), ret);
  }

  public Point_3 min() {
    return new Point_3(CGAL_KernelJNI.Iso_cuboid_3_min__SWIG_0(swigCPtr, this), true);
  }

  public void min(Point_3 ref) {
    CGAL_KernelJNI.Iso_cuboid_3_min__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public Point_3 max() {
    return new Point_3(CGAL_KernelJNI.Iso_cuboid_3_max__SWIG_0(swigCPtr, this), true);
  }

  public void max(Point_3 ref) {
    CGAL_KernelJNI.Iso_cuboid_3_max__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public double xmin() {
    return CGAL_KernelJNI.Iso_cuboid_3_xmin(swigCPtr, this);
  }

  public double ymin() {
    return CGAL_KernelJNI.Iso_cuboid_3_ymin(swigCPtr, this);
  }

  public double zmin() {
    return CGAL_KernelJNI.Iso_cuboid_3_zmin(swigCPtr, this);
  }

  public double xmax() {
    return CGAL_KernelJNI.Iso_cuboid_3_xmax(swigCPtr, this);
  }

  public double ymax() {
    return CGAL_KernelJNI.Iso_cuboid_3_ymax(swigCPtr, this);
  }

  public double zmax() {
    return CGAL_KernelJNI.Iso_cuboid_3_zmax(swigCPtr, this);
  }

  public double min_coord(int c) {
    return CGAL_KernelJNI.Iso_cuboid_3_min_coord(swigCPtr, this, c);
  }

  public double max_coord(int c) {
    return CGAL_KernelJNI.Iso_cuboid_3_max_coord(swigCPtr, this, c);
  }

  public Bbox_3 bbox() {
    return new Bbox_3(CGAL_KernelJNI.Iso_cuboid_3_bbox__SWIG_0(swigCPtr, this), true);
  }

  public void bbox(Bbox_3 ref) {
    CGAL_KernelJNI.Iso_cuboid_3_bbox__SWIG_1(swigCPtr, this, Bbox_3.getCPtr(ref), ref);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Iso_cuboid_3_is_degenerate(swigCPtr, this);
  }

  public Bounded_side bounded_side(Point_3 c) {
    return Bounded_side.swigToEnum(CGAL_KernelJNI.Iso_cuboid_3_bounded_side(swigCPtr, this, Point_3.getCPtr(c), c));
  }

  public boolean has_on_boundary(Point_3 c) {
    return CGAL_KernelJNI.Iso_cuboid_3_has_on_boundary(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_bounded_side(Point_3 c) {
    return CGAL_KernelJNI.Iso_cuboid_3_has_on_bounded_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_unbounded_side(Point_3 c) {
    return CGAL_KernelJNI.Iso_cuboid_3_has_on_unbounded_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public double volume() {
    return CGAL_KernelJNI.Iso_cuboid_3_volume(swigCPtr, this);
  }

}
