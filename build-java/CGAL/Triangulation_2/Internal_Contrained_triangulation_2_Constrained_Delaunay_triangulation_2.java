/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Kernel.Point_2; import java.util.Iterator; import java.util.Collection;  import CGAL.Triangulation_2.Constraint;
public class Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2 extends Internal_Triangulation_2_Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2 {
  private transient long swigCPtr;

  public Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2() {
    this(CGAL_Triangulation_2JNI.new_Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2__SWIG_0(), true);
  }

  public Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2(Iterator<Constraint> range) {
    this(CGAL_Triangulation_2JNI.new_Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2__SWIG_1(range), true);
  }

  public boolean is_constrained(Constrained_Delaunay_triangulation_2_Edge c) {
    return CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_is_constrained(swigCPtr, this, Constrained_Delaunay_triangulation_2_Edge.getCPtr(c), c);
  }

  public boolean are_there_incident_constraints(Constrained_Delaunay_triangulation_2_Vertex_handle c) {
    return CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_are_there_incident_constraints(swigCPtr, this, Constrained_Delaunay_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public void push_back(Constraint c) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_push_back(swigCPtr, this, Constraint.getCPtr(c), c);
  }

  public void incident_constraints(Constrained_Delaunay_triangulation_2_Vertex_handle v, Collection<Constrained_Delaunay_triangulation_2_Edge> edge_output_iterator) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_incident_constraints(swigCPtr, this, Constrained_Delaunay_triangulation_2_Vertex_handle.getCPtr(v), v, edge_output_iterator);
  }

  public void insert_constraint(Point_2 c1, Point_2 c2) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_insert_constraint__SWIG_0(swigCPtr, this, Point_2.getCPtr(c1), c1, Point_2.getCPtr(c2), c2);
  }

  public void insert_constraint(Constrained_Delaunay_triangulation_2_Vertex_handle c1, Constrained_Delaunay_triangulation_2_Vertex_handle c2) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_insert_constraint__SWIG_1(swigCPtr, this, Constrained_Delaunay_triangulation_2_Vertex_handle.getCPtr(c1), c1, Constrained_Delaunay_triangulation_2_Vertex_handle.getCPtr(c2), c2);
  }

  public void remove(Constrained_Delaunay_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_remove(swigCPtr, this, Constrained_Delaunay_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public void remove_incident_constraints(Constrained_Delaunay_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_remove_incident_constraints(swigCPtr, this, Constrained_Delaunay_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public void remove_constrained_edge(Constrained_Delaunay_triangulation_2_Face_handle c1, int c2) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_remove_constrained_edge(swigCPtr, this, Constrained_Delaunay_triangulation_2_Face_handle.getCPtr(c1), c1, c2);
  }

  public void insert_constraint_range(Iterator<Constraint> range) {
    CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_insert_constraint_range(swigCPtr, this, range);
  }

  public Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2 clone() {
    return new Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2(CGAL_Triangulation_2JNI.Internal_Contrained_triangulation_2_Constrained_Delaunay_triangulation_2_clone(swigCPtr, this), true);
  }

}
