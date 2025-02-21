/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_3;
import CGAL.Kernel.Point_3; import CGAL.Kernel.Ref_int;
public class Triangulation_3_Cell_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Triangulation_3_Cell_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Triangulation_3_Cell_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_3JNI.delete_Triangulation_3_Cell_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Triangulation_3_Cell_handle() {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Cell_handle(), true);
  }

  public Triangulation_3_Vertex_handle vertex(int c) {
    return new Triangulation_3_Vertex_handle(CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Triangulation_3_Vertex_handle ret) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_vertex__SWIG_1(swigCPtr, this, c, Triangulation_3_Vertex_handle.getCPtr(ret), ret);
  }

  public int index(Triangulation_3_Vertex_handle c) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_index__SWIG_0(swigCPtr, this, Triangulation_3_Vertex_handle.getCPtr(c), c);
  }

  public boolean has_vertex(Triangulation_3_Vertex_handle c) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_has_vertex__SWIG_0(swigCPtr, this, Triangulation_3_Vertex_handle.getCPtr(c), c);
  }

  public Triangulation_3_Cell_handle neighbor(int c) {
    return new Triangulation_3_Cell_handle(CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_neighbor__SWIG_0(swigCPtr, this, c), true);
  }

  public void neighbor(int c, Triangulation_3_Cell_handle ret) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_neighbor__SWIG_1(swigCPtr, this, c, Triangulation_3_Cell_handle.getCPtr(ret), ret);
  }

  public int index(Triangulation_3_Cell_handle c) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_index__SWIG_1(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public boolean has_neighbor(Triangulation_3_Cell_handle c) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_has_neighbor__SWIG_0(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public void set_vertex(int c1, Triangulation_3_Vertex_handle c2) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_set_vertex(swigCPtr, this, c1, Triangulation_3_Vertex_handle.getCPtr(c2), c2);
  }

  public void set_vertices(Triangulation_3_Vertex_handle c1, Triangulation_3_Vertex_handle c2, Triangulation_3_Vertex_handle c3, Triangulation_3_Vertex_handle c4) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_set_vertices(swigCPtr, this, Triangulation_3_Vertex_handle.getCPtr(c1), c1, Triangulation_3_Vertex_handle.getCPtr(c2), c2, Triangulation_3_Vertex_handle.getCPtr(c3), c3, Triangulation_3_Vertex_handle.getCPtr(c4), c4);
  }

  public void set_neighbor(int c1, Triangulation_3_Cell_handle c2) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_set_neighbor(swigCPtr, this, c1, Triangulation_3_Cell_handle.getCPtr(c2), c2);
  }

  public void set_neighbors(Triangulation_3_Cell_handle c1, Triangulation_3_Cell_handle c2, Triangulation_3_Cell_handle c3, Triangulation_3_Cell_handle c4) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_set_neighbors(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(c1), c1, Triangulation_3_Cell_handle.getCPtr(c2), c2, Triangulation_3_Cell_handle.getCPtr(c3), c3, Triangulation_3_Cell_handle.getCPtr(c4), c4);
  }

  public boolean is_valid() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_is_valid__SWIG_0(swigCPtr, this);
  }

  public boolean is_valid(boolean c) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_is_valid__SWIG_1(swigCPtr, this, c);
  }

  public boolean is_valid(boolean c1, int c2) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_is_valid__SWIG_2(swigCPtr, this, c1, c2);
  }

  public boolean has_vertex(Triangulation_3_Vertex_handle v, Ref_int i) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_has_vertex__SWIG_1(swigCPtr, this, Triangulation_3_Vertex_handle.getCPtr(v), v, Ref_int.getCPtr(i), i);
  }

  public boolean has_neighbor(Triangulation_3_Cell_handle n, Ref_int i) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_has_neighbor__SWIG_1(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(n), n, Ref_int.getCPtr(i), i);
  }

  public boolean lt(Triangulation_3_Cell_handle p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_lt(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean gt(Triangulation_3_Cell_handle p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_gt(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean le(Triangulation_3_Cell_handle p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_le(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean ge(Triangulation_3_Cell_handle p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_ge(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean equals(Triangulation_3_Cell_handle p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_equals(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean not_equals(Triangulation_3_Cell_handle p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_not_equals(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_hashCode(swigCPtr, this);
  }

  public Triangulation_3_Cell_handle clone() {
    return new Triangulation_3_Cell_handle(CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Triangulation_3_Cell_handle other) {
    CGAL_Triangulation_3JNI.Triangulation_3_Cell_handle_clone__SWIG_1(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(other), other);
  }

}
