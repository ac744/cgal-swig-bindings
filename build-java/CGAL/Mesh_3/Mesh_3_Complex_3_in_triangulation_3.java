/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;

public class Mesh_3_Complex_3_in_triangulation_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_3_Complex_3_in_triangulation_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_Complex_3_in_triangulation_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_Complex_3_in_triangulation_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_3_Complex_3_in_triangulation_3() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_Complex_3_in_triangulation_3(), true);
  }

  public void swap(Mesh_3_Complex_3_in_triangulation_3 other) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_swap(swigCPtr, this, Mesh_3_Complex_3_in_triangulation_3.getCPtr(other), other);
  }

  public Mesh_3_regular_triangulation_3 triangulation() {
    return new Mesh_3_regular_triangulation_3(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_triangulation__SWIG_0(swigCPtr, this), true);
  }

  public void triangulation(Mesh_3_regular_triangulation_3 ref) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_triangulation__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3.getCPtr(ref), ref);
  }

  public void add_to_complex(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_add_to_complex__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2);
  }

  public void add_to_complex(Mesh_3_regular_triangulation_3_Facet c1, Mesh_3_Surface_index c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_add_to_complex__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Facet.getCPtr(c1), c1, Mesh_3_Surface_index.getCPtr(c2), c2);
  }

  public void add_to_complex(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2, Mesh_3_Surface_index c3) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_add_to_complex__SWIG_2(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2, Mesh_3_Surface_index.getCPtr(c3), c3);
  }

  public void remove_from_complex(Mesh_3_regular_triangulation_3_Cell_handle c) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_remove_from_complex__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public void remove_from_complex(Mesh_3_regular_triangulation_3_Facet c) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_remove_from_complex__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Facet.getCPtr(c), c);
  }

  public void remove_from_complex(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_remove_from_complex__SWIG_2(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2);
  }

  public void set_subdomain_index(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_set_subdomain_index(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2);
  }

  public void set_surface_index(Mesh_3_regular_triangulation_3_Facet c1, Mesh_3_Surface_index c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_set_surface_index__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Facet.getCPtr(c1), c1, Mesh_3_Surface_index.getCPtr(c2), c2);
  }

  public void set_surface_index(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2, Mesh_3_Surface_index c3) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_set_surface_index__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2, Mesh_3_Surface_index.getCPtr(c3), c3);
  }

  public void set_index(Mesh_3_regular_triangulation_3_Vertex_handle c1, Mesh_3_Index c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_set_index(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c1), c1, Mesh_3_Index.getCPtr(c2), c2);
  }

  public void set_dimension(Mesh_3_regular_triangulation_3_Vertex_handle c1, int c2) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_set_dimension(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c1), c1, c2);
  }

  public int number_of_cells() {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_number_of_cells(swigCPtr, this);
  }

  public int number_of_facets() {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_number_of_facets(swigCPtr, this);
  }

  public boolean is_in_complex(Mesh_3_regular_triangulation_3_Cell_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_is_in_complex__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public boolean is_in_complex(Mesh_3_regular_triangulation_3_Facet c) {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_is_in_complex__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Facet.getCPtr(c), c);
  }

  public boolean is_in_complex(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2) {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_is_in_complex__SWIG_2(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2);
  }

  public int subdomain_index(Mesh_3_regular_triangulation_3_Cell_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_subdomain_index(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public Mesh_3_Surface_index surface_index(Mesh_3_regular_triangulation_3_Facet c) {
    return new Mesh_3_Surface_index(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_surface_index__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Facet.getCPtr(c), c), true);
  }

  public Mesh_3_Surface_index surface_index(Mesh_3_regular_triangulation_3_Cell_handle c1, int c2) {
    return new Mesh_3_Surface_index(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_surface_index__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, c2), true);
  }

  public int in_dimension(Mesh_3_regular_triangulation_3_Vertex_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_in_dimension(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c), c);
  }

  public Mesh_3_Index index(Mesh_3_regular_triangulation_3_Vertex_handle c) {
    return new Mesh_3_Index(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_index(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c), c), true);
  }

  public Mesh_3_Complex_3_in_triangulation_3_Cell_iterator cells() {
    return new Mesh_3_Complex_3_in_triangulation_3_Cell_iterator(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_cells(swigCPtr, this), true);
  }

  public Mesh_3_Complex_3_in_triangulation_3_Facet_iterator facets() {
    return new Mesh_3_Complex_3_in_triangulation_3_Facet_iterator(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_facets(swigCPtr, this), true);
  }

  public void output_to_medit(String filename) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_output_to_medit(swigCPtr, this, filename);
  }

  public Mesh_3_Complex_3_in_triangulation_3 clone() {
    return new Mesh_3_Complex_3_in_triangulation_3(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_3_Complex_3_in_triangulation_3 other) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_clone__SWIG_1(swigCPtr, this, Mesh_3_Complex_3_in_triangulation_3.getCPtr(other), other);
  }

  public boolean same_internal_object(Mesh_3_Complex_3_in_triangulation_3 other) {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_same_internal_object(swigCPtr, this, Mesh_3_Complex_3_in_triangulation_3.getCPtr(other), other);
  }

}
