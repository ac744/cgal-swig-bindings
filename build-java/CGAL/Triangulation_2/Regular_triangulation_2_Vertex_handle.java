/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Kernel.Weighted_point_2;
public class Regular_triangulation_2_Vertex_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Regular_triangulation_2_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Regular_triangulation_2_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Regular_triangulation_2_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Regular_triangulation_2_Vertex_handle() {
    this(CGAL_Triangulation_2JNI.new_Regular_triangulation_2_Vertex_handle(), true);
  }

  public Weighted_point_2 point() {
    return new Weighted_point_2(CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Weighted_point_2 ref) {
    CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_point__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(ref), ref);
  }

  public void set_point(Weighted_point_2 c) {
    CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_set_point(swigCPtr, this, Weighted_point_2.getCPtr(c), c);
  }

  public boolean lt(Regular_triangulation_2_Vertex_handle p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_lt(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(p), p);
  }

  public boolean gt(Regular_triangulation_2_Vertex_handle p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_gt(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(p), p);
  }

  public boolean le(Regular_triangulation_2_Vertex_handle p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_le(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(p), p);
  }

  public boolean ge(Regular_triangulation_2_Vertex_handle p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_ge(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(p), p);
  }

  public boolean equals(Regular_triangulation_2_Vertex_handle p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_equals(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(p), p);
  }

  public boolean not_equals(Regular_triangulation_2_Vertex_handle p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_not_equals(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_hashCode(swigCPtr, this);
  }

  public Regular_triangulation_2_Vertex_handle clone() {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Regular_triangulation_2_Vertex_handle other) {
    CGAL_Triangulation_2JNI.Regular_triangulation_2_Vertex_handle_clone__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(other), other);
  }

}
