/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_3;
public class Fuzzy_iso_box_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Fuzzy_iso_box_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Fuzzy_iso_box_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Fuzzy_iso_box_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Fuzzy_iso_box_3(Point_3 p, Point_3 q, double epsilon) {
    this(CGAL_Spatial_searchingJNI.new_Fuzzy_iso_box_3__SWIG_0(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, epsilon), true);
  }

  public Fuzzy_iso_box_3(Point_3 p, Point_3 q) {
    this(CGAL_Spatial_searchingJNI.new_Fuzzy_iso_box_3__SWIG_1(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q), true);
  }

  public boolean contains(Point_3 c) {
    return CGAL_Spatial_searchingJNI.Fuzzy_iso_box_3_contains(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public Fuzzy_iso_box_3 clone() {
    return new Fuzzy_iso_box_3(CGAL_Spatial_searchingJNI.Fuzzy_iso_box_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Fuzzy_iso_box_3 other) {
    CGAL_Spatial_searchingJNI.Fuzzy_iso_box_3_clone__SWIG_1(swigCPtr, this, Fuzzy_iso_box_3.getCPtr(other), other);
  }

}
