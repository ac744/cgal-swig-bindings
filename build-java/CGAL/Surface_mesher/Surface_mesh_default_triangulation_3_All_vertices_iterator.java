/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Surface_mesher;

  import CGAL.Kernel.Point_3;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Surface_mesh_default_triangulation_3_All_vertices_iterator implements   Iterable<Surface_mesh_default_triangulation_3_Vertex_handle>, Iterator<Surface_mesh_default_triangulation_3_Vertex_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Surface_mesh_default_triangulation_3_All_vertices_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Surface_mesh_default_triangulation_3_All_vertices_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Surface_mesherJNI.delete_Surface_mesh_default_triangulation_3_All_vertices_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Surface_mesh_default_triangulation_3_Vertex_handle> iterator() {
      return this;
    }
    
    //we store an object of type Surface_mesh_default_triangulation_3_Vertex_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Surface_mesh_default_triangulation_3_Vertex_handle objectInstance = new Surface_mesh_default_triangulation_3_Vertex_handle();
    public Surface_mesh_default_triangulation_3_Vertex_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Surface_mesh_default_triangulation_3_All_vertices_iterator() {
    this(CGAL_Surface_mesherJNI.new_Surface_mesh_default_triangulation_3_All_vertices_iterator(), true);
  }

  public Surface_mesh_default_triangulation_3_Vertex_handle slow_next() {
    return new Surface_mesh_default_triangulation_3_Vertex_handle(CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Surface_mesh_default_triangulation_3_Vertex_handle r) {
    CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_next(swigCPtr, this, Surface_mesh_default_triangulation_3_Vertex_handle.getCPtr(r), r);
  }

  public Surface_mesh_default_triangulation_3_All_vertices_iterator clone() {
    return new Surface_mesh_default_triangulation_3_All_vertices_iterator(CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Surface_mesh_default_triangulation_3_All_vertices_iterator other) {
    CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_clone__SWIG_1(swigCPtr, this, Surface_mesh_default_triangulation_3_All_vertices_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Surface_mesh_default_triangulation_3_All_vertices_iterator p) {
    return CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_equals(swigCPtr, this, Surface_mesh_default_triangulation_3_All_vertices_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Surface_mesh_default_triangulation_3_All_vertices_iterator p) {
    return CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_All_vertices_iterator_not_equals(swigCPtr, this, Surface_mesh_default_triangulation_3_All_vertices_iterator.getCPtr(p), p);
  }

}
