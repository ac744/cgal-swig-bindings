/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Segment_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Segment_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Segment_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Segment_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Segment_3() {
    this(CGAL_KernelJNI.new_Segment_3__SWIG_0(), true);
  }

  public Segment_3(Point_3 p1, Point_3 p2) {
    this(CGAL_KernelJNI.new_Segment_3__SWIG_1(Point_3.getCPtr(p1), p1, Point_3.getCPtr(p2), p2), true);
  }

  public Point_3 source() {
    return new Point_3(CGAL_KernelJNI.Segment_3_source__SWIG_0(swigCPtr, this), true);
  }

  public void source(Point_3 ref) {
    CGAL_KernelJNI.Segment_3_source__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public Point_3 target() {
    return new Point_3(CGAL_KernelJNI.Segment_3_target__SWIG_0(swigCPtr, this), true);
  }

  public void target(Point_3 ref) {
    CGAL_KernelJNI.Segment_3_target__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public Point_3 min() {
    return new Point_3(CGAL_KernelJNI.Segment_3_min__SWIG_0(swigCPtr, this), true);
  }

  public void min(Point_3 ref) {
    CGAL_KernelJNI.Segment_3_min__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public Point_3 max() {
    return new Point_3(CGAL_KernelJNI.Segment_3_max__SWIG_0(swigCPtr, this), true);
  }

  public void max(Point_3 ref) {
    CGAL_KernelJNI.Segment_3_max__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public Point_3 vertex(int c) {
    return new Point_3(CGAL_KernelJNI.Segment_3_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Point_3 ret) {
    CGAL_KernelJNI.Segment_3_vertex__SWIG_1(swigCPtr, this, c, Point_3.getCPtr(ret), ret);
  }

  public Point_3 point(int c) {
    return new Point_3(CGAL_KernelJNI.Segment_3_point__SWIG_0(swigCPtr, this, c), true);
  }

  public void point(int c, Point_3 ret) {
    CGAL_KernelJNI.Segment_3_point__SWIG_1(swigCPtr, this, c, Point_3.getCPtr(ret), ret);
  }

  public double squared_length() {
    return CGAL_KernelJNI.Segment_3_squared_length(swigCPtr, this);
  }

  public Segment_3 opposite() {
    return new Segment_3(CGAL_KernelJNI.Segment_3_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Segment_3 ref) {
    CGAL_KernelJNI.Segment_3_opposite__SWIG_1(swigCPtr, this, Segment_3.getCPtr(ref), ref);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Segment_3_is_degenerate(swigCPtr, this);
  }

  public boolean has_on(Point_3 c) {
    return CGAL_KernelJNI.Segment_3_has_on(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public Vector_3 to_vector() {
    return new Vector_3(CGAL_KernelJNI.Segment_3_to_vector__SWIG_0(swigCPtr, this), true);
  }

  public void to_vector(Vector_3 ref) {
    CGAL_KernelJNI.Segment_3_to_vector__SWIG_1(swigCPtr, this, Vector_3.getCPtr(ref), ref);
  }

  public Direction_3 direction() {
    return new Direction_3(CGAL_KernelJNI.Segment_3_direction__SWIG_0(swigCPtr, this), true);
  }

  public void direction(Direction_3 ref) {
    CGAL_KernelJNI.Segment_3_direction__SWIG_1(swigCPtr, this, Direction_3.getCPtr(ref), ref);
  }

  public Line_3 supporting_line() {
    return new Line_3(CGAL_KernelJNI.Segment_3_supporting_line__SWIG_0(swigCPtr, this), true);
  }

  public void supporting_line(Line_3 ref) {
    CGAL_KernelJNI.Segment_3_supporting_line__SWIG_1(swigCPtr, this, Line_3.getCPtr(ref), ref);
  }

  public Bbox_3 bbox() {
    return new Bbox_3(CGAL_KernelJNI.Segment_3_bbox__SWIG_0(swigCPtr, this), true);
  }

  public void bbox(Bbox_3 ref) {
    CGAL_KernelJNI.Segment_3_bbox__SWIG_1(swigCPtr, this, Bbox_3.getCPtr(ref), ref);
  }

  public boolean equals(Segment_3 p) {
    return CGAL_KernelJNI.Segment_3_equals(swigCPtr, this, Segment_3.getCPtr(p), p);
  }

  public boolean not_equals(Segment_3 p) {
    return CGAL_KernelJNI.Segment_3_not_equals(swigCPtr, this, Segment_3.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Segment_3_toString(swigCPtr, this);
  }

  public Segment_3 clone() {
    return new Segment_3(CGAL_KernelJNI.Segment_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Segment_3 other) {
    CGAL_KernelJNI.Segment_3_clone__SWIG_1(swigCPtr, this, Segment_3.getCPtr(other), other);
  }

}
