/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;

public class Delaunay_mesh_plus_size_criteria_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Delaunay_mesh_plus_size_criteria_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_mesh_plus_size_criteria_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Delaunay_mesh_plus_size_criteria_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Delaunay_mesh_plus_size_criteria_2(double b, double S) {
    this(CGAL_Mesh_2JNI.new_Delaunay_mesh_plus_size_criteria_2__SWIG_0(b, S), true);
  }

  public Delaunay_mesh_plus_size_criteria_2(double b) {
    this(CGAL_Mesh_2JNI.new_Delaunay_mesh_plus_size_criteria_2__SWIG_1(b), true);
  }

  public Delaunay_mesh_plus_size_criteria_2() {
    this(CGAL_Mesh_2JNI.new_Delaunay_mesh_plus_size_criteria_2__SWIG_2(), true);
  }

  public Delaunay_mesh_plus_size_criteria_2 clone() {
    return new Delaunay_mesh_plus_size_criteria_2(CGAL_Mesh_2JNI.Delaunay_mesh_plus_size_criteria_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Delaunay_mesh_plus_size_criteria_2 other) {
    CGAL_Mesh_2JNI.Delaunay_mesh_plus_size_criteria_2_clone__SWIG_1(swigCPtr, this, Delaunay_mesh_plus_size_criteria_2.getCPtr(other), other);
  }

}
