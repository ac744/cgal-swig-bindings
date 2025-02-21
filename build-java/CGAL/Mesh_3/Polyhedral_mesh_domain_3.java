/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;
import CGAL.Polyhedron_3.Polyhedron_3;
public class Polyhedral_mesh_domain_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Polyhedral_mesh_domain_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polyhedral_mesh_domain_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Polyhedral_mesh_domain_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Polyhedral_mesh_domain_3(Polyhedron_3 poly) {
    this(CGAL_Mesh_3JNI.new_Polyhedral_mesh_domain_3(Polyhedron_3.getCPtr(poly), poly), true);
  }

  public Mesh_3_Index index_from_surface_index(Mesh_3_Surface_index c) {
    return new Mesh_3_Index(CGAL_Mesh_3JNI.Polyhedral_mesh_domain_3_index_from_surface_index(swigCPtr, this, Mesh_3_Surface_index.getCPtr(c), c), true);
  }

  public Mesh_3_Index index_from_subdomain_index(int c) {
    return new Mesh_3_Index(CGAL_Mesh_3JNI.Polyhedral_mesh_domain_3_index_from_subdomain_index(swigCPtr, this, c), true);
  }

  public Mesh_3_Surface_index surface_index(Mesh_3_Index c) {
    return new Mesh_3_Surface_index(CGAL_Mesh_3JNI.Polyhedral_mesh_domain_3_surface_index(swigCPtr, this, Mesh_3_Index.getCPtr(c), c), true);
  }

  public int subdomain_index(Mesh_3_Index c) {
    return CGAL_Mesh_3JNI.Polyhedral_mesh_domain_3_subdomain_index(swigCPtr, this, Mesh_3_Index.getCPtr(c), c);
  }

}
