/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_2;
public class K_neighbor_search_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public K_neighbor_search_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(K_neighbor_search_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_K_neighbor_search_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public K_neighbor_search_2(K_neighbor_search_tree_2 tree, Point_2 query) {
    this(CGAL_Spatial_searchingJNI.new_K_neighbor_search_2__SWIG_0(K_neighbor_search_tree_2.getCPtr(tree), tree, Point_2.getCPtr(query), query), true);
  }

  public K_neighbor_search_2(K_neighbor_search_tree_2 tree, Point_2 query, int k) {
    this(CGAL_Spatial_searchingJNI.new_K_neighbor_search_2__SWIG_1(K_neighbor_search_tree_2.getCPtr(tree), tree, Point_2.getCPtr(query), query, k), true);
  }

  public K_neighbor_search_2(K_neighbor_search_tree_2 tree, Point_2 query, int k, double eps) {
    this(CGAL_Spatial_searchingJNI.new_K_neighbor_search_2__SWIG_2(K_neighbor_search_tree_2.getCPtr(tree), tree, Point_2.getCPtr(query), query, k, eps), true);
  }

  public K_neighbor_search_2(K_neighbor_search_tree_2 tree, Point_2 query, int k, double eps, boolean search_nearest) {
    this(CGAL_Spatial_searchingJNI.new_K_neighbor_search_2__SWIG_3(K_neighbor_search_tree_2.getCPtr(tree), tree, Point_2.getCPtr(query), query, k, eps, search_nearest), true);
  }

  public K_neighbor_search_iterator_2 iterator() {
    return new K_neighbor_search_iterator_2(CGAL_Spatial_searchingJNI.K_neighbor_search_2_iterator(swigCPtr, this), true);
  }

}
