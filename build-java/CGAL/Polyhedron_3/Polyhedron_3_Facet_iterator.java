/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyhedron_3;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Polyhedron_3_Facet_iterator implements   Iterable<Polyhedron_3_Facet_handle>, Iterator<Polyhedron_3_Facet_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Polyhedron_3_Facet_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polyhedron_3_Facet_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyhedron_3JNI.delete_Polyhedron_3_Facet_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Polyhedron_3_Facet_handle> iterator() {
      return this;
    }
    
    //we store an object of type Polyhedron_3_Facet_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Polyhedron_3_Facet_handle objectInstance = new Polyhedron_3_Facet_handle();
    public Polyhedron_3_Facet_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Polyhedron_3_Facet_iterator() {
    this(CGAL_Polyhedron_3JNI.new_Polyhedron_3_Facet_iterator(), true);
  }

  public Polyhedron_3_Facet_handle slow_next() {
    return new Polyhedron_3_Facet_handle(CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Polyhedron_3_Facet_handle r) {
    CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_next(swigCPtr, this, Polyhedron_3_Facet_handle.getCPtr(r), r);
  }

  public Polyhedron_3_Facet_iterator clone() {
    return new Polyhedron_3_Facet_iterator(CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Polyhedron_3_Facet_iterator other) {
    CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_clone__SWIG_1(swigCPtr, this, Polyhedron_3_Facet_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Polyhedron_3_Facet_iterator p) {
    return CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_equals(swigCPtr, this, Polyhedron_3_Facet_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Polyhedron_3_Facet_iterator p) {
    return CGAL_Polyhedron_3JNI.Polyhedron_3_Facet_iterator_not_equals(swigCPtr, this, Polyhedron_3_Facet_iterator.getCPtr(p), p);
  }

}
