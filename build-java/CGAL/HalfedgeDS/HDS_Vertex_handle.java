/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.HalfedgeDS;
import CGAL.Kernel.Point_2;
public class HDS_Vertex_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public HDS_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HDS_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_HalfedgeDSJNI.delete_HDS_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HDS_Vertex_handle() {
    this(CGAL_HalfedgeDSJNI.new_HDS_Vertex_handle(), true);
  }

  public HDS_Halfedge_handle halfedge() {
    return new HDS_Halfedge_handle(CGAL_HalfedgeDSJNI.HDS_Vertex_handle_halfedge__SWIG_0(swigCPtr, this), true);
  }

  public void halfedge(HDS_Halfedge_handle ref) {
    CGAL_HalfedgeDSJNI.HDS_Vertex_handle_halfedge__SWIG_1(swigCPtr, this, HDS_Halfedge_handle.getCPtr(ref), ref);
  }

  public void set_halfedge(HDS_Halfedge_handle c) {
    CGAL_HalfedgeDSJNI.HDS_Vertex_handle_set_halfedge(swigCPtr, this, HDS_Halfedge_handle.getCPtr(c), c);
  }

  public Point_2 point() {
    return new Point_2(CGAL_HalfedgeDSJNI.HDS_Vertex_handle_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Point_2 ref) {
    CGAL_HalfedgeDSJNI.HDS_Vertex_handle_point__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public void set_point(Point_2 p) {
    CGAL_HalfedgeDSJNI.HDS_Vertex_handle_set_point(swigCPtr, this, Point_2.getCPtr(p), p);
  }

  public HDS_Vertex_handle clone() {
    return new HDS_Vertex_handle(CGAL_HalfedgeDSJNI.HDS_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(HDS_Vertex_handle other) {
    CGAL_HalfedgeDSJNI.HDS_Vertex_handle_clone__SWIG_1(swigCPtr, this, HDS_Vertex_handle.getCPtr(other), other);
  }

  public boolean equals(HDS_Vertex_handle p) {
    return CGAL_HalfedgeDSJNI.HDS_Vertex_handle_equals(swigCPtr, this, HDS_Vertex_handle.getCPtr(p), p);
  }

  public boolean not_equals(HDS_Vertex_handle p) {
    return CGAL_HalfedgeDSJNI.HDS_Vertex_handle_not_equals(swigCPtr, this, HDS_Vertex_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_HalfedgeDSJNI.HDS_Vertex_handle_hashCode(swigCPtr, this);
  }

}
