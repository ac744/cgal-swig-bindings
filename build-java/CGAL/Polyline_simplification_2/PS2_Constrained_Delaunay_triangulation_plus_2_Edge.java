/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyline_simplification_2;

public class PS2_Constrained_Delaunay_triangulation_plus_2_Edge {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public PS2_Constrained_Delaunay_triangulation_plus_2_Edge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PS2_Constrained_Delaunay_triangulation_plus_2_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyline_simplification_2JNI.delete_PS2_Constrained_Delaunay_triangulation_plus_2_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Edge() {
    this(CGAL_Polyline_simplification_2JNI.new_PS2_Constrained_Delaunay_triangulation_plus_2_Edge__SWIG_0(), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Edge(PS2_Constrained_Delaunay_triangulation_plus_2_Face_handle first, int second) {
    this(CGAL_Polyline_simplification_2JNI.new_PS2_Constrained_Delaunay_triangulation_plus_2_Edge__SWIG_1(PS2_Constrained_Delaunay_triangulation_plus_2_Face_handle.getCPtr(first), first, second), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Edge(PS2_Constrained_Delaunay_triangulation_plus_2_Edge p) {
    this(CGAL_Polyline_simplification_2JNI.new_PS2_Constrained_Delaunay_triangulation_plus_2_Edge__SWIG_2(PS2_Constrained_Delaunay_triangulation_plus_2_Edge.getCPtr(p), p), true);
  }

  public void setFirst(PS2_Constrained_Delaunay_triangulation_plus_2_Face_handle value) {
    CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_Edge_first_set(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Face_handle.getCPtr(value), value);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Face_handle getFirst() {
    long cPtr = CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_Edge_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PS2_Constrained_Delaunay_triangulation_plus_2_Face_handle(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_Edge_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_Edge_second_get(swigCPtr, this);
  }

}
