/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;

public class Quality_pair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Quality_pair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Quality_pair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Quality_pair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Quality_pair() {
    this(CGAL_Mesh_2JNI.new_Quality_pair__SWIG_0(), true);
  }

  public Quality_pair(double first, double second) {
    this(CGAL_Mesh_2JNI.new_Quality_pair__SWIG_1(first, second), true);
  }

  public double getFirst() {
    return CGAL_Mesh_2JNI.Quality_pair_getFirst(swigCPtr, this);
  }

  public double getSecond() {
    return CGAL_Mesh_2JNI.Quality_pair_getSecond(swigCPtr, this);
  }

  public void setFirst(double d) {
    CGAL_Mesh_2JNI.Quality_pair_setFirst(swigCPtr, this, d);
  }

  public void setSecond(double d) {
    CGAL_Mesh_2JNI.Quality_pair_setSecond(swigCPtr, this, d);
  }

}
