/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;
import java.util.Iterator;
public class Polygon_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Polygon_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polygon_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Polygon_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Polygon_2() {
    this(CGAL_KernelJNI.new_Polygon_2__SWIG_0(), true);
  }

  public void set(int pos, Point_2 x) {
    CGAL_KernelJNI.Polygon_2_set(swigCPtr, this, pos, Point_2.getCPtr(x), x);
  }

  public int insert(int i, Point_2 q) {
    return CGAL_KernelJNI.Polygon_2_insert__SWIG_0(swigCPtr, this, i, Point_2.getCPtr(q), q);
  }

  public void push_back(Point_2 c) {
    CGAL_KernelJNI.Polygon_2_push_back(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public void clear() {
    CGAL_KernelJNI.Polygon_2_clear(swigCPtr, this);
  }

  public void reverse_orientation() {
    CGAL_KernelJNI.Polygon_2_reverse_orientation(swigCPtr, this);
  }

  public void erase(int i) {
    CGAL_KernelJNI.Polygon_2_erase__SWIG_0(swigCPtr, this, i);
  }

  public void erase(int i, int j) {
    CGAL_KernelJNI.Polygon_2_erase__SWIG_1(swigCPtr, this, i, j);
  }

  public boolean is_simple() {
    return CGAL_KernelJNI.Polygon_2_is_simple(swigCPtr, this);
  }

  public boolean is_convex() {
    return CGAL_KernelJNI.Polygon_2_is_convex(swigCPtr, this);
  }

  public Orientation orientation() {
    return Orientation.swigToEnum(CGAL_KernelJNI.Polygon_2_orientation(swigCPtr, this));
  }

  public Oriented_side oriented_side(Point_2 c) {
    return Oriented_side.swigToEnum(CGAL_KernelJNI.Polygon_2_oriented_side(swigCPtr, this, Point_2.getCPtr(c), c));
  }

  public Bounded_side bounded_side(Point_2 c) {
    return Bounded_side.swigToEnum(CGAL_KernelJNI.Polygon_2_bounded_side(swigCPtr, this, Point_2.getCPtr(c), c));
  }

  public double area() {
    return CGAL_KernelJNI.Polygon_2_area(swigCPtr, this);
  }

  public int left_vertex() {
    return CGAL_KernelJNI.Polygon_2_left_vertex(swigCPtr, this);
  }

  public int right_vertex() {
    return CGAL_KernelJNI.Polygon_2_right_vertex(swigCPtr, this);
  }

  public int top_vertex() {
    return CGAL_KernelJNI.Polygon_2_top_vertex(swigCPtr, this);
  }

  public int bottom_vertex() {
    return CGAL_KernelJNI.Polygon_2_bottom_vertex(swigCPtr, this);
  }

  public boolean is_counterclockwise_oriented() {
    return CGAL_KernelJNI.Polygon_2_is_counterclockwise_oriented(swigCPtr, this);
  }

  public boolean is_clockwise_oriented() {
    return CGAL_KernelJNI.Polygon_2_is_clockwise_oriented(swigCPtr, this);
  }

  public boolean is_collinear_oriented() {
    return CGAL_KernelJNI.Polygon_2_is_collinear_oriented(swigCPtr, this);
  }

  public boolean has_on_positive_side(Point_2 c) {
    return CGAL_KernelJNI.Polygon_2_has_on_positive_side(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean has_on_negative_side(Point_2 c) {
    return CGAL_KernelJNI.Polygon_2_has_on_negative_side(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean has_on_boundary(Point_2 c) {
    return CGAL_KernelJNI.Polygon_2_has_on_boundary(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean has_on_bounded_side(Point_2 c) {
    return CGAL_KernelJNI.Polygon_2_has_on_bounded_side(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean has_on_unbounded_side(Point_2 c) {
    return CGAL_KernelJNI.Polygon_2_has_on_unbounded_side(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public Point_2 vertex(int c) {
    return new Point_2(CGAL_KernelJNI.Polygon_2_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Point_2 ret) {
    CGAL_KernelJNI.Polygon_2_vertex__SWIG_1(swigCPtr, this, c, Point_2.getCPtr(ret), ret);
  }

  public Segment_2 edge(int c) {
    return new Segment_2(CGAL_KernelJNI.Polygon_2_edge__SWIG_0(swigCPtr, this, c), true);
  }

  public void edge(int c, Segment_2 ret) {
    CGAL_KernelJNI.Polygon_2_edge__SWIG_1(swigCPtr, this, c, Segment_2.getCPtr(ret), ret);
  }

  public int size() {
    return CGAL_KernelJNI.Polygon_2_size(swigCPtr, this);
  }

  public boolean is_empty() {
    return CGAL_KernelJNI.Polygon_2_is_empty(swigCPtr, this);
  }

  public Bbox_2 bbox() {
    return new Bbox_2(CGAL_KernelJNI.Polygon_2_bbox__SWIG_0(swigCPtr, this), true);
  }

  public void bbox(Bbox_2 ref) {
    CGAL_KernelJNI.Polygon_2_bbox__SWIG_1(swigCPtr, this, Bbox_2.getCPtr(ref), ref);
  }

  public boolean equals(Polygon_2 p) {
    return CGAL_KernelJNI.Polygon_2_equals(swigCPtr, this, Polygon_2.getCPtr(p), p);
  }

  public boolean not_equals(Polygon_2 p) {
    return CGAL_KernelJNI.Polygon_2_not_equals(swigCPtr, this, Polygon_2.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Polygon_2_toString(swigCPtr, this);
  }

  public Polygon_2 clone() {
    return new Polygon_2(CGAL_KernelJNI.Polygon_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Polygon_2 other) {
    CGAL_KernelJNI.Polygon_2_clone__SWIG_1(swigCPtr, this, Polygon_2.getCPtr(other), other);
  }

  public void insert(int i, Iterator<Point_2> range) {
    CGAL_KernelJNI.Polygon_2_insert__SWIG_1(swigCPtr, this, i, range);
  }

  public Polygon_2(Iterator<Point_2> range) {
    this(CGAL_KernelJNI.new_Polygon_2__SWIG_1(range), true);
  }

  public Polygon_2_Vertex_iterator vertices() {
    return new Polygon_2_Vertex_iterator(CGAL_KernelJNI.Polygon_2_vertices(swigCPtr, this), true);
  }

  public Polygon_2_Edge_const_iterator edges() {
    return new Polygon_2_Edge_const_iterator(CGAL_KernelJNI.Polygon_2_edges(swigCPtr, this), true);
  }

  public Polygon_2_Vertex_circulator vertices_circulator() {
    return new Polygon_2_Vertex_circulator(CGAL_KernelJNI.Polygon_2_vertices_circulator(swigCPtr, this), true);
  }

  public Polygon_2_Edge_const_circulator edges_circulator() {
    return new Polygon_2_Edge_const_circulator(CGAL_KernelJNI.Polygon_2_edges_circulator(swigCPtr, this), true);
  }

}
