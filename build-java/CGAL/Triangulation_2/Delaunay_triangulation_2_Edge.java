/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

public class Delaunay_triangulation_2_Edge {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Delaunay_triangulation_2_Edge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Delaunay_triangulation_2_Edge() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Edge__SWIG_0(), true);
  }

  public Delaunay_triangulation_2_Edge(Delaunay_triangulation_2_Face_handle first, int second) {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Edge__SWIG_1(Delaunay_triangulation_2_Face_handle.getCPtr(first), first, second), true);
  }

  public Delaunay_triangulation_2_Edge(Delaunay_triangulation_2_Edge p) {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Edge__SWIG_2(Delaunay_triangulation_2_Edge.getCPtr(p), p), true);
  }

  public void setFirst(Delaunay_triangulation_2_Face_handle value) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_first_set(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(value), value);
  }

  public Delaunay_triangulation_2_Face_handle getFirst() {
    long cPtr = CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Delaunay_triangulation_2_Face_handle(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_second_get(swigCPtr, this);
  }

}
