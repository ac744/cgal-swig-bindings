/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Constrained_Delaunay_triangulation_plus_2_Line_face_circulator implements   Iterable<Constrained_Delaunay_triangulation_plus_2_Face_handle>, Iterator<Constrained_Delaunay_triangulation_plus_2_Face_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Constrained_Delaunay_triangulation_plus_2_Line_face_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_Delaunay_triangulation_plus_2_Line_face_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_Delaunay_triangulation_plus_2_Line_face_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Constrained_Delaunay_triangulation_plus_2_Face_handle> iterator() {
      return this;
    }
    
    //we store an object of type Constrained_Delaunay_triangulation_plus_2_Face_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Constrained_Delaunay_triangulation_plus_2_Face_handle objectInstance = new Constrained_Delaunay_triangulation_plus_2_Face_handle();
    public Constrained_Delaunay_triangulation_plus_2_Face_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Constrained_Delaunay_triangulation_plus_2_Line_face_circulator() {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2_Line_face_circulator(), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Face_handle slow_next() {
    return new Constrained_Delaunay_triangulation_plus_2_Face_handle(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Constrained_Delaunay_triangulation_plus_2_Face_handle r) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_next(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Face_handle.getCPtr(r), r);
  }

  public Constrained_Delaunay_triangulation_plus_2_Line_face_circulator clone() {
    return new Constrained_Delaunay_triangulation_plus_2_Line_face_circulator(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Constrained_Delaunay_triangulation_plus_2_Line_face_circulator other) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_clone__SWIG_1(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Line_face_circulator.getCPtr(other), other);
  }

  public Constrained_Delaunay_triangulation_plus_2_Face_handle prev() {
    return new Constrained_Delaunay_triangulation_plus_2_Face_handle(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_hasNext(swigCPtr, this);
  }

  public boolean equals(Constrained_Delaunay_triangulation_plus_2_Line_face_circulator p) {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_equals(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Line_face_circulator.getCPtr(p), p);
  }

  public boolean not_equals(Constrained_Delaunay_triangulation_plus_2_Line_face_circulator p) {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Line_face_circulator_not_equals(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Line_face_circulator.getCPtr(p), p);
  }

}
