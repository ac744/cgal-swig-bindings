/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Kernel.Point_2; import java.util.Iterator; import java.util.Collection;
public class Delaunay_triangulation_2 extends Internal_Triangulation_2_Delaunay_triangulation_2 {
  private transient long swigCPtr;

  public Delaunay_triangulation_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Delaunay_triangulation_2() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2(), true);
  }

  public Delaunay_triangulation_2_Vertex_handle nearest_vertex(Point_2 c1, Delaunay_triangulation_2_Face_handle c2) {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_nearest_vertex__SWIG_0(swigCPtr, this, Point_2.getCPtr(c1), c1, Delaunay_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void nearest_vertex(Point_2 c1, Delaunay_triangulation_2_Face_handle c2, Delaunay_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_nearest_vertex__SWIG_1(swigCPtr, this, Point_2.getCPtr(c1), c1, Delaunay_triangulation_2_Face_handle.getCPtr(c2), c2, Delaunay_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Delaunay_triangulation_2_Vertex_handle nearest_vertex(Point_2 c) {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_nearest_vertex__SWIG_2(swigCPtr, this, Point_2.getCPtr(c), c), true);
  }

  public void nearest_vertex(Point_2 c, Delaunay_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_nearest_vertex__SWIG_3(swigCPtr, this, Point_2.getCPtr(c), c, Delaunay_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public void get_conflicts_and_boundary(Point_2 p, Collection<Delaunay_triangulation_2_Face_handle> fout, Collection<Delaunay_triangulation_2_Edge> eout, Delaunay_triangulation_2_Face_handle start) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_get_conflicts_and_boundary(swigCPtr, this, Point_2.getCPtr(p), p, fout, eout, Delaunay_triangulation_2_Face_handle.getCPtr(start), start);
  }

  public void get_conflicts(Point_2 p, Collection<Delaunay_triangulation_2_Face_handle> fout, Delaunay_triangulation_2_Face_handle start) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_get_conflicts(swigCPtr, this, Point_2.getCPtr(p), p, fout, Delaunay_triangulation_2_Face_handle.getCPtr(start), start);
  }

  public void get_boundary_of_conflicts(Point_2 p, Collection<Delaunay_triangulation_2_Edge> out, Delaunay_triangulation_2_Face_handle start) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_get_boundary_of_conflicts(swigCPtr, this, Point_2.getCPtr(p), p, out, Delaunay_triangulation_2_Face_handle.getCPtr(start), start);
  }

  public Point_2 dual(Delaunay_triangulation_2_Face_handle c) {
    return new Point_2(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_dual__SWIG_0(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(c), c), true);
  }

  public void dual(Delaunay_triangulation_2_Face_handle c, Point_2 ret) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_dual__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Face_handle.getCPtr(c), c, Point_2.getCPtr(ret), ret);
  }

  public Object dual(Delaunay_triangulation_2_Edge c) {
    return new Object(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_dual__SWIG_2(swigCPtr, this, Delaunay_triangulation_2_Edge.getCPtr(c), c), true);
  }

  public void dual(Delaunay_triangulation_2_Edge c, Object ret) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_dual__SWIG_3(swigCPtr, this, Delaunay_triangulation_2_Edge.getCPtr(c), c, Object.getCPtr(ret), ret);
  }

  public Delaunay_triangulation_2 clone() {
    return new Delaunay_triangulation_2(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_clone(swigCPtr, this), true);
  }

}
