/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;

public class Mesh_3_regular_triangulation_3_Facet {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_3_regular_triangulation_3_Facet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_regular_triangulation_3_Facet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_regular_triangulation_3_Facet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_3_regular_triangulation_3_Facet() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_regular_triangulation_3_Facet__SWIG_0(), true);
  }

  public Mesh_3_regular_triangulation_3_Facet(Mesh_3_regular_triangulation_3_Cell_handle first, int second) {
    this(CGAL_Mesh_3JNI.new_Mesh_3_regular_triangulation_3_Facet__SWIG_1(Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(first), first, second), true);
  }

  public Mesh_3_regular_triangulation_3_Facet(Mesh_3_regular_triangulation_3_Facet p) {
    this(CGAL_Mesh_3JNI.new_Mesh_3_regular_triangulation_3_Facet__SWIG_2(Mesh_3_regular_triangulation_3_Facet.getCPtr(p), p), true);
  }

  public void setFirst(Mesh_3_regular_triangulation_3_Cell_handle value) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Facet_first_set(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(value), value);
  }

  public Mesh_3_regular_triangulation_3_Cell_handle getFirst() {
    long cPtr = CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Facet_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Mesh_3_regular_triangulation_3_Cell_handle(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Facet_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Facet_second_get(swigCPtr, this);
  }

}
