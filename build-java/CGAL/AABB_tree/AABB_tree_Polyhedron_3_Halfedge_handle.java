/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.AABB_tree;
import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle; import CGAL.Kernel.Triangle_3; import CGAL.Kernel.Segment_3; import CGAL.Kernel.Plane_3; import CGAL.Kernel.Ray_3; import CGAL.Kernel.Point_3; import java.util.Iterator; import java.util.Collection;
public class AABB_tree_Polyhedron_3_Halfedge_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public AABB_tree_Polyhedron_3_Halfedge_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AABB_tree_Polyhedron_3_Halfedge_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_AABB_treeJNI.delete_AABB_tree_Polyhedron_3_Halfedge_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AABB_tree_Polyhedron_3_Halfedge_handle() {
    this(CGAL_AABB_treeJNI.new_AABB_tree_Polyhedron_3_Halfedge_handle__SWIG_0(), true);
  }

  public AABB_tree_Polyhedron_3_Halfedge_handle(Iterator<Polyhedron_3_Halfedge_handle> range) {
    this(CGAL_AABB_treeJNI.new_AABB_tree_Polyhedron_3_Halfedge_handle__SWIG_1(range), true);
  }

  public void rebuild(Iterator<Polyhedron_3_Halfedge_handle> range) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_rebuild(swigCPtr, this, range);
  }

  public void clear() {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_clear(swigCPtr, this);
  }

  public int size() {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_size(swigCPtr, this);
  }

  public boolean empty() {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_empty(swigCPtr, this);
  }

  public boolean do_intersect(Segment_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_do_intersect__SWIG_0(swigCPtr, this, Segment_3.getCPtr(c), c);
  }

  public boolean do_intersect(Triangle_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_do_intersect__SWIG_1(swigCPtr, this, Triangle_3.getCPtr(c), c);
  }

  public boolean do_intersect(Plane_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_do_intersect__SWIG_2(swigCPtr, this, Plane_3.getCPtr(c), c);
  }

  public boolean do_intersect(Ray_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_do_intersect__SWIG_3(swigCPtr, this, Ray_3.getCPtr(c), c);
  }

  public int number_of_intersected_primitives(Segment_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_number_of_intersected_primitives__SWIG_0(swigCPtr, this, Segment_3.getCPtr(c), c);
  }

  public int number_of_intersected_primitives(Triangle_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_number_of_intersected_primitives__SWIG_1(swigCPtr, this, Triangle_3.getCPtr(c), c);
  }

  public int number_of_intersected_primitives(Plane_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_number_of_intersected_primitives__SWIG_2(swigCPtr, this, Plane_3.getCPtr(c), c);
  }

  public int number_of_intersected_primitives(Ray_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_number_of_intersected_primitives__SWIG_3(swigCPtr, this, Ray_3.getCPtr(c), c);
  }

  public void all_intersected_primitives(Segment_3 query, Collection<Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersected_primitives__SWIG_0(swigCPtr, this, Segment_3.getCPtr(query), query, out);
  }

  public void all_intersected_primitives(Triangle_3 query, Collection<Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersected_primitives__SWIG_1(swigCPtr, this, Triangle_3.getCPtr(query), query, out);
  }

  public void all_intersected_primitives(Plane_3 query, Collection<Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersected_primitives__SWIG_2(swigCPtr, this, Plane_3.getCPtr(query), query, out);
  }

  public void all_intersected_primitives(Ray_3 query, Collection<Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersected_primitives__SWIG_3(swigCPtr, this, Ray_3.getCPtr(query), query, out);
  }

  public Optional_Polyhedron_3_Halfedge_handle any_intersected_primitive(Segment_3 query) {
    return new Optional_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersected_primitive__SWIG_0(swigCPtr, this, Segment_3.getCPtr(query), query), true);
  }

  public Optional_Polyhedron_3_Halfedge_handle any_intersected_primitive(Triangle_3 query) {
    return new Optional_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersected_primitive__SWIG_1(swigCPtr, this, Triangle_3.getCPtr(query), query), true);
  }

  public Optional_Polyhedron_3_Halfedge_handle any_intersected_primitive(Plane_3 query) {
    return new Optional_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersected_primitive__SWIG_2(swigCPtr, this, Plane_3.getCPtr(query), query), true);
  }

  public Optional_Polyhedron_3_Halfedge_handle any_intersected_primitive(Ray_3 query) {
    return new Optional_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersected_primitive__SWIG_3(swigCPtr, this, Ray_3.getCPtr(query), query), true);
  }

  public Optional_Object_and_Polyhedron_3_Halfedge_handle any_intersection(Segment_3 query) {
    return new Optional_Object_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersection__SWIG_0(swigCPtr, this, Segment_3.getCPtr(query), query), true);
  }

  public Optional_Object_and_Polyhedron_3_Halfedge_handle any_intersection(Triangle_3 query) {
    return new Optional_Object_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersection__SWIG_1(swigCPtr, this, Triangle_3.getCPtr(query), query), true);
  }

  public Optional_Object_and_Polyhedron_3_Halfedge_handle any_intersection(Plane_3 query) {
    return new Optional_Object_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersection__SWIG_2(swigCPtr, this, Plane_3.getCPtr(query), query), true);
  }

  public Optional_Object_and_Polyhedron_3_Halfedge_handle any_intersection(Ray_3 query) {
    return new Optional_Object_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_any_intersection__SWIG_3(swigCPtr, this, Ray_3.getCPtr(query), query), true);
  }

  public void all_intersections(Segment_3 query, Collection<Object_and_Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersections__SWIG_0(swigCPtr, this, Segment_3.getCPtr(query), query, out);
  }

  public void all_intersections(Triangle_3 query, Collection<Object_and_Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersections__SWIG_1(swigCPtr, this, Triangle_3.getCPtr(query), query, out);
  }

  public void all_intersections(Plane_3 query, Collection<Object_and_Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersections__SWIG_2(swigCPtr, this, Plane_3.getCPtr(query), query, out);
  }

  public void all_intersections(Ray_3 query, Collection<Object_and_Polyhedron_3_Halfedge_handle> out) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_all_intersections__SWIG_3(swigCPtr, this, Ray_3.getCPtr(query), query, out);
  }

  public double squared_distance(Point_3 c) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_squared_distance__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public Point_3 closest_point(Point_3 c) {
    return new Point_3(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c), true);
  }

  public Point_and_Polyhedron_3_Halfedge_handle closest_point_and_primitive(Point_3 c) {
    return new Point_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point_and_primitive__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c), true);
  }

  public Point_and_Polyhedron_3_Halfedge_handle closest_point_and_primitive(double x, double y, double z) {
    return new Point_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point_and_primitive__SWIG_1(swigCPtr, this, x, y, z), true);
  }

  public boolean accelerate_distance_queries() {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_accelerate_distance_queries__SWIG_0(swigCPtr, this);
  }

  public double squared_distance(Point_3 c1, Point_3 c2) {
    return CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_squared_distance__SWIG_1(swigCPtr, this, Point_3.getCPtr(c1), c1, Point_3.getCPtr(c2), c2);
  }

  public Point_3 closest_point(Point_3 c1, Point_3 c2) {
    return new Point_3(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point__SWIG_1(swigCPtr, this, Point_3.getCPtr(c1), c1, Point_3.getCPtr(c2), c2), true);
  }

  public void closest_point(Point_3 c1, Point_3 c2, Point_3 ret) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point__SWIG_2(swigCPtr, this, Point_3.getCPtr(c1), c1, Point_3.getCPtr(c2), c2, Point_3.getCPtr(ret), ret);
  }

  public Point_and_Polyhedron_3_Halfedge_handle closest_point_and_primitive(Point_3 c1, Point_and_Polyhedron_3_Halfedge_handle c2) {
    return new Point_and_Polyhedron_3_Halfedge_handle(CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point_and_primitive__SWIG_2(swigCPtr, this, Point_3.getCPtr(c1), c1, Point_and_Polyhedron_3_Halfedge_handle.getCPtr(c2), c2), true);
  }

  public void closest_point_and_primitive(Point_3 c1, Point_and_Polyhedron_3_Halfedge_handle c2, Point_and_Polyhedron_3_Halfedge_handle ret) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_closest_point_and_primitive__SWIG_3(swigCPtr, this, Point_3.getCPtr(c1), c1, Point_and_Polyhedron_3_Halfedge_handle.getCPtr(c2), c2, Point_and_Polyhedron_3_Halfedge_handle.getCPtr(ret), ret);
  }

  public void accelerate_distance_queries(Iterator<Point_3> range) {
    CGAL_AABB_treeJNI.AABB_tree_Polyhedron_3_Halfedge_handle_accelerate_distance_queries__SWIG_1(swigCPtr, this, range);
  }

}
