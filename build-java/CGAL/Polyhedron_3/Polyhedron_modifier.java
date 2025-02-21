/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyhedron_3;
import CGAL.Kernel.Point_3;
public class Polyhedron_modifier {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Polyhedron_modifier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polyhedron_modifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyhedron_3JNI.delete_Polyhedron_modifier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Polyhedron_modifier() {
    this(CGAL_Polyhedron_3JNI.new_Polyhedron_modifier(), true);
  }

  public void begin_surface(int v, int f, int h, Modifier_mode mode) {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_begin_surface__SWIG_0(swigCPtr, this, v, f, h, mode.swigValue());
  }

  public void begin_surface(int v, int f, int h) {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_begin_surface__SWIG_1(swigCPtr, this, v, f, h);
  }

  public void begin_surface(int v, int f) {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_begin_surface__SWIG_2(swigCPtr, this, v, f);
  }

  public void end_surface() {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_end_surface(swigCPtr, this);
  }

  public void add_vertex(Point_3 p) {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_add_vertex(swigCPtr, this, Point_3.getCPtr(p), p);
  }

  public void begin_facet() {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_begin_facet(swigCPtr, this);
  }

  public void end_facet() {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_end_facet(swigCPtr, this);
  }

  public void add_vertex_to_facet(int i) {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_add_vertex_to_facet(swigCPtr, this, i);
  }

  public void rollback() {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_rollback(swigCPtr, this);
  }

  public void clear() {
    CGAL_Polyhedron_3JNI.Polyhedron_modifier_clear(swigCPtr, this);
  }

}
