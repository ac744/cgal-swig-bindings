/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.AABB_tree;
import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle;
public class Object_and_Polyhedron_3_Halfedge_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Object_and_Polyhedron_3_Halfedge_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Object_and_Polyhedron_3_Halfedge_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_AABB_treeJNI.delete_Object_and_Polyhedron_3_Halfedge_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Object_and_Polyhedron_3_Halfedge_handle() {
    this(CGAL_AABB_treeJNI.new_Object_and_Polyhedron_3_Halfedge_handle__SWIG_0(), true);
  }

  public Object_and_Polyhedron_3_Halfedge_handle(Object first, Polyhedron_3_Halfedge_handle second) {
    this(CGAL_AABB_treeJNI.new_Object_and_Polyhedron_3_Halfedge_handle__SWIG_1(Object.getCPtr(first), first, Polyhedron_3_Halfedge_handle.getCPtr(second), second), true);
  }

  public Object_and_Polyhedron_3_Halfedge_handle(Object_and_Polyhedron_3_Halfedge_handle p) {
    this(CGAL_AABB_treeJNI.new_Object_and_Polyhedron_3_Halfedge_handle__SWIG_2(Object_and_Polyhedron_3_Halfedge_handle.getCPtr(p), p), true);
  }

  public void setFirst(Object value) {
    CGAL_AABB_treeJNI.Object_and_Polyhedron_3_Halfedge_handle_first_set(swigCPtr, this, Object.getCPtr(value), value);
  }

  public Object getFirst() {
    long cPtr = CGAL_AABB_treeJNI.Object_and_Polyhedron_3_Halfedge_handle_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Object(cPtr, false);
  }

  public void setSecond(Polyhedron_3_Halfedge_handle value) {
    CGAL_AABB_treeJNI.Object_and_Polyhedron_3_Halfedge_handle_second_set(swigCPtr, this, Polyhedron_3_Halfedge_handle.getCPtr(value), value);
  }

  public Polyhedron_3_Halfedge_handle getSecond() {
    long cPtr = CGAL_AABB_treeJNI.Object_and_Polyhedron_3_Halfedge_handle_second_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Polyhedron_3_Halfedge_handle(cPtr, false);
  }

}
