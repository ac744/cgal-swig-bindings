/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Alpha_shape_2_Line_face_circulator implements   Iterable<Alpha_shape_2_Face_handle>, Iterator<Alpha_shape_2_Face_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Alpha_shape_2_Line_face_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Alpha_shape_2_Line_face_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Alpha_shape_2_Line_face_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Alpha_shape_2_Face_handle> iterator() {
      return this;
    }
    
    //we store an object of type Alpha_shape_2_Face_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Alpha_shape_2_Face_handle objectInstance = new Alpha_shape_2_Face_handle();
    public Alpha_shape_2_Face_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Alpha_shape_2_Line_face_circulator() {
    this(CGAL_Alpha_shape_2JNI.new_Alpha_shape_2_Line_face_circulator(), true);
  }

  public Alpha_shape_2_Face_handle slow_next() {
    return new Alpha_shape_2_Face_handle(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Alpha_shape_2_Face_handle r) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_next(swigCPtr, this, Alpha_shape_2_Face_handle.getCPtr(r), r);
  }

  public Alpha_shape_2_Line_face_circulator clone() {
    return new Alpha_shape_2_Line_face_circulator(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Alpha_shape_2_Line_face_circulator other) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_clone__SWIG_1(swigCPtr, this, Alpha_shape_2_Line_face_circulator.getCPtr(other), other);
  }

  public Alpha_shape_2_Face_handle prev() {
    return new Alpha_shape_2_Face_handle(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_hasNext(swigCPtr, this);
  }

  public boolean equals(Alpha_shape_2_Line_face_circulator p) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_equals(swigCPtr, this, Alpha_shape_2_Line_face_circulator.getCPtr(p), p);
  }

  public boolean not_equals(Alpha_shape_2_Line_face_circulator p) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Line_face_circulator_not_equals(swigCPtr, this, Alpha_shape_2_Line_face_circulator.getCPtr(p), p);
  }

}
