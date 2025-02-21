/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_3;

  import CGAL.Kernel.Point_3;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Triangulation_3_Point_iterator implements   Iterable<Point_3>, Iterator<Point_3>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Triangulation_3_Point_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Triangulation_3_Point_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_3JNI.delete_Triangulation_3_Point_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Point_3> iterator() {
      return this;
    }
    
    //we store an object of type Point_3 to avoid
    //creation and allocation of a java object at each iteration.
    private Point_3 objectInstance = new Point_3();
    public Point_3 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Triangulation_3_Point_iterator() {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Point_iterator(), true);
  }

  public Point_3 slow_next() {
    return new Point_3(CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Point_3 r) {
    CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_next(swigCPtr, this, Point_3.getCPtr(r), r);
  }

  public Triangulation_3_Point_iterator clone() {
    return new Triangulation_3_Point_iterator(CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Triangulation_3_Point_iterator other) {
    CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_clone__SWIG_1(swigCPtr, this, Triangulation_3_Point_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Triangulation_3_Point_iterator p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_equals(swigCPtr, this, Triangulation_3_Point_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Triangulation_3_Point_iterator p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Point_iterator_not_equals(swigCPtr, this, Triangulation_3_Point_iterator.getCPtr(p), p);
  }

}
