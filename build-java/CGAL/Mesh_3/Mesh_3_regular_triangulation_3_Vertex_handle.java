/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;
import CGAL.Kernel.Weighted_point_3;
public class Mesh_3_regular_triangulation_3_Vertex_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_3_regular_triangulation_3_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_regular_triangulation_3_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_regular_triangulation_3_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_3_regular_triangulation_3_Vertex_handle() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_regular_triangulation_3_Vertex_handle(), true);
  }

  public Weighted_point_3 point() {
    return new Weighted_point_3(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Weighted_point_3 ref) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_point__SWIG_1(swigCPtr, this, Weighted_point_3.getCPtr(ref), ref);
  }

  public Mesh_3_regular_triangulation_3_Cell_handle cell() {
    return new Mesh_3_regular_triangulation_3_Cell_handle(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_cell__SWIG_0(swigCPtr, this), true);
  }

  public void cell(Mesh_3_regular_triangulation_3_Cell_handle ref) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_cell__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(ref), ref);
  }

  public void set_cell(Mesh_3_regular_triangulation_3_Cell_handle c) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_set_cell(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public void set_point(Weighted_point_3 c) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_set_point(swigCPtr, this, Weighted_point_3.getCPtr(c), c);
  }

  public boolean is_valid() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_is_valid__SWIG_0(swigCPtr, this);
  }

  public boolean is_valid(boolean c) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_is_valid__SWIG_1(swigCPtr, this, c);
  }

  public boolean lt(Mesh_3_regular_triangulation_3_Vertex_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_lt(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(p), p);
  }

  public boolean gt(Mesh_3_regular_triangulation_3_Vertex_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_gt(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(p), p);
  }

  public boolean le(Mesh_3_regular_triangulation_3_Vertex_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_le(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(p), p);
  }

  public boolean ge(Mesh_3_regular_triangulation_3_Vertex_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_ge(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(p), p);
  }

  public boolean equals(Mesh_3_regular_triangulation_3_Vertex_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_equals(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(p), p);
  }

  public boolean not_equals(Mesh_3_regular_triangulation_3_Vertex_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_not_equals(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_hashCode(swigCPtr, this);
  }

  public Mesh_3_regular_triangulation_3_Vertex_handle clone() {
    return new Mesh_3_regular_triangulation_3_Vertex_handle(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_3_regular_triangulation_3_Vertex_handle other) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_clone__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(other), other);
  }

  public int in_dimension() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_in_dimension(swigCPtr, this);
  }

  public void set_dimension(int d) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_set_dimension(swigCPtr, this, d);
  }

  public Mesh_3_Index index() {
    return new Mesh_3_Index(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_index(swigCPtr, this), true);
  }

  public void set_index(Mesh_3_Index v) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_set_index(swigCPtr, this, Mesh_3_Index.getCPtr(v), v);
  }

  public double meshing_info() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_meshing_info(swigCPtr, this);
  }

  public void set_meshing_info(double d) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Vertex_handle_set_meshing_info(swigCPtr, this, d);
  }

}
