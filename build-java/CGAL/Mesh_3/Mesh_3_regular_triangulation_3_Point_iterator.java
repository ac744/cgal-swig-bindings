/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;

  import CGAL.Kernel.Weighted_point_3;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Mesh_3_regular_triangulation_3_Point_iterator implements   Iterable<Weighted_point_3>, Iterator<Weighted_point_3>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_3_regular_triangulation_3_Point_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_regular_triangulation_3_Point_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_regular_triangulation_3_Point_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Weighted_point_3> iterator() {
      return this;
    }
    
    //we store an object of type Weighted_point_3 to avoid
    //creation and allocation of a java object at each iteration.
    private Weighted_point_3 objectInstance = new Weighted_point_3();
    public Weighted_point_3 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Mesh_3_regular_triangulation_3_Point_iterator() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_regular_triangulation_3_Point_iterator(), true);
  }

  public Weighted_point_3 slow_next() {
    return new Weighted_point_3(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Weighted_point_3 r) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_next(swigCPtr, this, Weighted_point_3.getCPtr(r), r);
  }

  public Mesh_3_regular_triangulation_3_Point_iterator clone() {
    return new Mesh_3_regular_triangulation_3_Point_iterator(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_3_regular_triangulation_3_Point_iterator other) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_clone__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Point_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Mesh_3_regular_triangulation_3_Point_iterator p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_equals(swigCPtr, this, Mesh_3_regular_triangulation_3_Point_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Mesh_3_regular_triangulation_3_Point_iterator p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Point_iterator_not_equals(swigCPtr, this, Mesh_3_regular_triangulation_3_Point_iterator.getCPtr(p), p);
  }

}
