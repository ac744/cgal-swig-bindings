/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  import CGAL.Kernel.Point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Triangulation_2_Finite_vertices_iterator implements   Iterable<Triangulation_2_Vertex_handle>, Iterator<Triangulation_2_Vertex_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Triangulation_2_Finite_vertices_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Triangulation_2_Finite_vertices_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Triangulation_2_Finite_vertices_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Triangulation_2_Vertex_handle> iterator() {
      return this;
    }
    
    //we store an object of type Triangulation_2_Vertex_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Triangulation_2_Vertex_handle objectInstance = new Triangulation_2_Vertex_handle();
    public Triangulation_2_Vertex_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Triangulation_2_Finite_vertices_iterator() {
    this(CGAL_Triangulation_2JNI.new_Triangulation_2_Finite_vertices_iterator(), true);
  }

  public Triangulation_2_Vertex_handle slow_next() {
    return new Triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Triangulation_2_Vertex_handle r) {
    CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_next(swigCPtr, this, Triangulation_2_Vertex_handle.getCPtr(r), r);
  }

  public Triangulation_2_Finite_vertices_iterator clone() {
    return new Triangulation_2_Finite_vertices_iterator(CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Triangulation_2_Finite_vertices_iterator other) {
    CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_clone__SWIG_1(swigCPtr, this, Triangulation_2_Finite_vertices_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Triangulation_2_Finite_vertices_iterator p) {
    return CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_equals(swigCPtr, this, Triangulation_2_Finite_vertices_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Triangulation_2_Finite_vertices_iterator p) {
    return CGAL_Triangulation_2JNI.Triangulation_2_Finite_vertices_iterator_not_equals(swigCPtr, this, Triangulation_2_Finite_vertices_iterator.getCPtr(p), p);
  }

}
