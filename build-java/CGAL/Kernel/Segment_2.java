/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Segment_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Segment_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Segment_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Segment_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Segment_2() {
    this(CGAL_KernelJNI.new_Segment_2__SWIG_0(), true);
  }

  public Segment_2(Point_2 p, Point_2 q) {
    this(CGAL_KernelJNI.new_Segment_2__SWIG_1(Point_2.getCPtr(p), p, Point_2.getCPtr(q), q), true);
  }

  public Point_2 source() {
    return new Point_2(CGAL_KernelJNI.Segment_2_source__SWIG_0(swigCPtr, this), true);
  }

  public void source(Point_2 ref) {
    CGAL_KernelJNI.Segment_2_source__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public Point_2 target() {
    return new Point_2(CGAL_KernelJNI.Segment_2_target__SWIG_0(swigCPtr, this), true);
  }

  public void target(Point_2 ref) {
    CGAL_KernelJNI.Segment_2_target__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public Point_2 min() {
    return new Point_2(CGAL_KernelJNI.Segment_2_min__SWIG_0(swigCPtr, this), true);
  }

  public void min(Point_2 ref) {
    CGAL_KernelJNI.Segment_2_min__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public Point_2 max() {
    return new Point_2(CGAL_KernelJNI.Segment_2_max__SWIG_0(swigCPtr, this), true);
  }

  public void max(Point_2 ref) {
    CGAL_KernelJNI.Segment_2_max__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public Point_2 vertex(int c) {
    return new Point_2(CGAL_KernelJNI.Segment_2_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Point_2 ret) {
    CGAL_KernelJNI.Segment_2_vertex__SWIG_1(swigCPtr, this, c, Point_2.getCPtr(ret), ret);
  }

  public Point_2 point(int c) {
    return new Point_2(CGAL_KernelJNI.Segment_2_point__SWIG_0(swigCPtr, this, c), true);
  }

  public void point(int c, Point_2 ret) {
    CGAL_KernelJNI.Segment_2_point__SWIG_1(swigCPtr, this, c, Point_2.getCPtr(ret), ret);
  }

  public double squared_length() {
    return CGAL_KernelJNI.Segment_2_squared_length(swigCPtr, this);
  }

  public Segment_2 opposite() {
    return new Segment_2(CGAL_KernelJNI.Segment_2_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Segment_2 ref) {
    CGAL_KernelJNI.Segment_2_opposite__SWIG_1(swigCPtr, this, Segment_2.getCPtr(ref), ref);
  }

  public Direction_2 direction() {
    return new Direction_2(CGAL_KernelJNI.Segment_2_direction__SWIG_0(swigCPtr, this), true);
  }

  public void direction(Direction_2 ref) {
    CGAL_KernelJNI.Segment_2_direction__SWIG_1(swigCPtr, this, Direction_2.getCPtr(ref), ref);
  }

  public Vector_2 to_vector() {
    return new Vector_2(CGAL_KernelJNI.Segment_2_to_vector__SWIG_0(swigCPtr, this), true);
  }

  public void to_vector(Vector_2 ref) {
    CGAL_KernelJNI.Segment_2_to_vector__SWIG_1(swigCPtr, this, Vector_2.getCPtr(ref), ref);
  }

  public Line_2 supporting_line() {
    return new Line_2(CGAL_KernelJNI.Segment_2_supporting_line__SWIG_0(swigCPtr, this), true);
  }

  public void supporting_line(Line_2 ref) {
    CGAL_KernelJNI.Segment_2_supporting_line__SWIG_1(swigCPtr, this, Line_2.getCPtr(ref), ref);
  }

  public Bbox_2 bbox() {
    return new Bbox_2(CGAL_KernelJNI.Segment_2_bbox__SWIG_0(swigCPtr, this), true);
  }

  public void bbox(Bbox_2 ref) {
    CGAL_KernelJNI.Segment_2_bbox__SWIG_1(swigCPtr, this, Bbox_2.getCPtr(ref), ref);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Segment_2_is_degenerate(swigCPtr, this);
  }

  public boolean is_horizontal() {
    return CGAL_KernelJNI.Segment_2_is_horizontal(swigCPtr, this);
  }

  public boolean is_vertical() {
    return CGAL_KernelJNI.Segment_2_is_vertical(swigCPtr, this);
  }

  public boolean has_on(Point_2 c) {
    return CGAL_KernelJNI.Segment_2_has_on(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean collinear_has_on(Point_2 c) {
    return CGAL_KernelJNI.Segment_2_collinear_has_on(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean equals(Segment_2 p) {
    return CGAL_KernelJNI.Segment_2_equals(swigCPtr, this, Segment_2.getCPtr(p), p);
  }

  public boolean not_equals(Segment_2 p) {
    return CGAL_KernelJNI.Segment_2_not_equals(swigCPtr, this, Segment_2.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Segment_2_toString(swigCPtr, this);
  }

  public Segment_2 clone() {
    return new Segment_2(CGAL_KernelJNI.Segment_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Segment_2 other) {
    CGAL_KernelJNI.Segment_2_clone__SWIG_1(swigCPtr, this, Segment_2.getCPtr(other), other);
  }

}
