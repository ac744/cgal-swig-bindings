/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;

public class Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context() {
    this(CGAL_Mesh_2JNI.new_Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context(), true);
  }

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator vertices() {
    return new Mesh_2_Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context_vertices(swigCPtr, this), true);
  }

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator current() {
    return new Mesh_2_Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context_current(swigCPtr, this), true);
  }

  public int number_of_vertices() {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Context_number_of_vertices(swigCPtr, this);
  }

}
