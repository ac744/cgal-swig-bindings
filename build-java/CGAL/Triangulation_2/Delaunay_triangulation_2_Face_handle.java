/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Java.JavaData; 
public class Delaunay_triangulation_2_Face_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Delaunay_triangulation_2_Face_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2_Face_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2_Face_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Delaunay_triangulation_2_Face_handle() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Face_handle(), true);
  }

  public int dimension() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_dimension(swigCPtr, this);
  }

  public Delaunay_triangulation_2_Vertex_handle vertex(int c) {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Delaunay_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_vertex__SWIG_1(swigCPtr, this, c, Delaunay_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public boolean has_vertex(Delaunay_triangulation_2_Vertex_handle c) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_has_vertex(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public int index(Delaunay_triangulation_2_Vertex_handle c) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_index__SWIG_0(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public Delaunay_triangulation_2_Face_handle neighbor(int c) {
    return new Delaunay_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_neighbor__SWIG_0(swigCPtr, this, c), true);
  }

  public void neighbor(int c, Delaunay_triangulation_2_Face_handle ret) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_neighbor__SWIG_1(swigCPtr, this, c, Delaunay_triangulation_2_Face_handle.getCPtr(ret), ret);
  }

  public boolean has_neighbor(Delaunay_triangulation_2_Face_handle c) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_has_neighbor(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(c), c);
  }

  public int index(Delaunay_triangulation_2_Face_handle c) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_index__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(c), c);
  }

  public void set_vertex(int c1, Delaunay_triangulation_2_Vertex_handle c2) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_vertex(swigCPtr, this, c1, Delaunay_triangulation_2_Vertex_handle.getCPtr(c2), c2);
  }

  public void set_vertices() {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_vertices__SWIG_0(swigCPtr, this);
  }

  public void set_vertices(Delaunay_triangulation_2_Vertex_handle c1, Delaunay_triangulation_2_Vertex_handle c2, Delaunay_triangulation_2_Vertex_handle c3) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_vertices__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(c1), c1, Delaunay_triangulation_2_Vertex_handle.getCPtr(c2), c2, Delaunay_triangulation_2_Vertex_handle.getCPtr(c3), c3);
  }

  public void set_neighbor(int c1, Delaunay_triangulation_2_Face_handle c2) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_neighbor(swigCPtr, this, c1, Delaunay_triangulation_2_Face_handle.getCPtr(c2), c2);
  }

  public void set_neighbors() {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_neighbors__SWIG_0(swigCPtr, this);
  }

  public void set_neighbors(Delaunay_triangulation_2_Face_handle c1, Delaunay_triangulation_2_Face_handle c2, Delaunay_triangulation_2_Face_handle c3) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_neighbors__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(c1), c1, Delaunay_triangulation_2_Face_handle.getCPtr(c2), c2, Delaunay_triangulation_2_Face_handle.getCPtr(c3), c3);
  }

  public void reorient() {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_reorient(swigCPtr, this);
  }

  public void ccw_permute() {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_ccw_permute(swigCPtr, this);
  }

  public void cw_permute() {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_cw_permute(swigCPtr, this);
  }

  public boolean is_valid() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_is_valid__SWIG_0(swigCPtr, this);
  }

  public boolean is_valid(boolean c) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_is_valid__SWIG_1(swigCPtr, this, c);
  }

  public boolean lt(Delaunay_triangulation_2_Face_handle p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_lt(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(p), p);
  }

  public boolean gt(Delaunay_triangulation_2_Face_handle p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_gt(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(p), p);
  }

  public boolean le(Delaunay_triangulation_2_Face_handle p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_le(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(p), p);
  }

  public boolean ge(Delaunay_triangulation_2_Face_handle p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_ge(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(p), p);
  }

  public boolean equals(Delaunay_triangulation_2_Face_handle p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_equals(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(p), p);
  }

  public boolean not_equals(Delaunay_triangulation_2_Face_handle p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_not_equals(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_hashCode(swigCPtr, this);
  }

  public Delaunay_triangulation_2_Face_handle clone() {
    return new Delaunay_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Delaunay_triangulation_2_Face_handle other) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_clone__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(other), other);
  }

  public JavaData info() {
    return new JavaData(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_info(swigCPtr, this), false);
  }

  public void get_info(JavaData jd) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_get_info(swigCPtr, this, JavaData.getCPtr(jd), jd);
  }

  public void set_info(JavaData jd) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Face_handle_set_info(swigCPtr, this, JavaData.getCPtr(jd), jd);
  }

}
