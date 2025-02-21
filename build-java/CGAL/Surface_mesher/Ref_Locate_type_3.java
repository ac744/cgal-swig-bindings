/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Surface_mesher;

public class Ref_Locate_type_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Ref_Locate_type_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ref_Locate_type_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Surface_mesherJNI.delete_Ref_Locate_type_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ref_Locate_type_3() {
    this(CGAL_Surface_mesherJNI.new_Ref_Locate_type_3__SWIG_0(), true);
  }

  public Ref_Locate_type_3(Locate_type k) {
    this(CGAL_Surface_mesherJNI.new_Ref_Locate_type_3__SWIG_1(k.swigValue()), true);
  }

  public void set(Locate_type t) {
    CGAL_Surface_mesherJNI.Ref_Locate_type_3_set(swigCPtr, this, t.swigValue());
  }

  public Locate_type object() {
    return Locate_type.swigToEnum(CGAL_Surface_mesherJNI.Ref_Locate_type_3_object(swigCPtr, this));
  }

  public Ref_Locate_type_3 clone() {
    return new Ref_Locate_type_3(CGAL_Surface_mesherJNI.Ref_Locate_type_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Ref_Locate_type_3 other) {
    CGAL_Surface_mesherJNI.Ref_Locate_type_3_clone__SWIG_1(swigCPtr, this, Ref_Locate_type_3.getCPtr(other), other);
  }

}
