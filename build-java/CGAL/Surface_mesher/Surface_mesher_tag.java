/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Surface_mesher;

public enum Surface_mesher_tag {
  MANIFOLD_TAG,
  MANIFOLD_WITH_BOUNDARY_TAG,
  NON_MANIFOLD_TAG;

  public final int swigValue() {
    return swigValue;
  }

  public static Surface_mesher_tag swigToEnum(int swigValue) {
    Surface_mesher_tag[] swigValues = Surface_mesher_tag.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Surface_mesher_tag swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Surface_mesher_tag.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Surface_mesher_tag() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Surface_mesher_tag(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Surface_mesher_tag(Surface_mesher_tag swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

