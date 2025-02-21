/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.HalfedgeDS;

  import java.util.Iterator;
  import java.util.Collection;
  import CGAL.Kernel.Point_2;

public class CGAL_HalfedgeDSJNI {

    static {
      try {
          System.loadLibrary("CGAL_HalfedgeDS");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_HalfedgeDS failed to load. \n" + e);
        throw e;
      }
    }
  

    static{
      try {
          System.loadLibrary("CGAL_Java");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Java failed to load. \n" + e);
        throw e;
      }
    }
  
  public final static native long new_HDS_Halfedge_handle();
  public final static native long HDS_Halfedge_handle_opposite__SWIG_0(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void HDS_Halfedge_handle_opposite__SWIG_1(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HDS_Halfedge_handle_next__SWIG_0(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void HDS_Halfedge_handle_next__SWIG_1(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HDS_Halfedge_handle_set_next(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native boolean HDS_Halfedge_handle_is_border(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native long HDS_Halfedge_handle_prev__SWIG_0(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void HDS_Halfedge_handle_prev__SWIG_1(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HDS_Halfedge_handle_set_prev(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HDS_Halfedge_handle_vertex__SWIG_0(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void HDS_Halfedge_handle_vertex__SWIG_1(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native void HDS_Halfedge_handle_set_vertex(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native long HDS_Halfedge_handle_face(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void HDS_Halfedge_handle_set_face(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native long HDS_Halfedge_handle_clone__SWIG_0(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void HDS_Halfedge_handle_clone__SWIG_1(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native boolean HDS_Halfedge_handle_equals(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native boolean HDS_Halfedge_handle_not_equals(long jarg1, HDS_Halfedge_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native int HDS_Halfedge_handle_hashCode(long jarg1, HDS_Halfedge_handle jarg1_);
  public final static native void delete_HDS_Halfedge_handle(long jarg1);
  public final static native long new_HDS_Face_handle();
  public final static native long HDS_Face_handle_halfedge__SWIG_0(long jarg1, HDS_Face_handle jarg1_);
  public final static native void HDS_Face_handle_halfedge__SWIG_1(long jarg1, HDS_Face_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HDS_Face_handle_set_halfedge(long jarg1, HDS_Face_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HDS_Face_handle_clone__SWIG_0(long jarg1, HDS_Face_handle jarg1_);
  public final static native void HDS_Face_handle_clone__SWIG_1(long jarg1, HDS_Face_handle jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native boolean HDS_Face_handle_equals(long jarg1, HDS_Face_handle jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native boolean HDS_Face_handle_not_equals(long jarg1, HDS_Face_handle jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native int HDS_Face_handle_hashCode(long jarg1, HDS_Face_handle jarg1_);
  public final static native void delete_HDS_Face_handle(long jarg1);
  public final static native long new_HDS_Vertex_handle();
  public final static native long HDS_Vertex_handle_halfedge__SWIG_0(long jarg1, HDS_Vertex_handle jarg1_);
  public final static native void HDS_Vertex_handle_halfedge__SWIG_1(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HDS_Vertex_handle_set_halfedge(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HDS_Vertex_handle_point__SWIG_0(long jarg1, HDS_Vertex_handle jarg1_);
  public final static native void HDS_Vertex_handle_point__SWIG_1(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, Point_2 jarg2_);
  public final static native void HDS_Vertex_handle_set_point(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, Point_2 jarg2_);
  public final static native long HDS_Vertex_handle_clone__SWIG_0(long jarg1, HDS_Vertex_handle jarg1_);
  public final static native void HDS_Vertex_handle_clone__SWIG_1(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native boolean HDS_Vertex_handle_equals(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native boolean HDS_Vertex_handle_not_equals(long jarg1, HDS_Vertex_handle jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native int HDS_Vertex_handle_hashCode(long jarg1, HDS_Vertex_handle jarg1_);
  public final static native void delete_HDS_Vertex_handle(long jarg1);
  public final static native long new_HDS_Vertex_iterator();
  public final static native long HDS_Vertex_iterator_slow_next(long jarg1, HDS_Vertex_iterator jarg1_);
  public final static native void HDS_Vertex_iterator_next(long jarg1, HDS_Vertex_iterator jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native long HDS_Vertex_iterator_clone__SWIG_0(long jarg1, HDS_Vertex_iterator jarg1_);
  public final static native void HDS_Vertex_iterator_clone__SWIG_1(long jarg1, HDS_Vertex_iterator jarg1_, long jarg2, HDS_Vertex_iterator jarg2_);
  public final static native boolean HDS_Vertex_iterator_hasNext(long jarg1, HDS_Vertex_iterator jarg1_);
  public final static native boolean HDS_Vertex_iterator_equals(long jarg1, HDS_Vertex_iterator jarg1_, long jarg2, HDS_Vertex_iterator jarg2_);
  public final static native boolean HDS_Vertex_iterator_not_equals(long jarg1, HDS_Vertex_iterator jarg1_, long jarg2, HDS_Vertex_iterator jarg2_);
  public final static native void delete_HDS_Vertex_iterator(long jarg1);
  public final static native long new_HDS_Halfedge_iterator();
  public final static native long HDS_Halfedge_iterator_slow_next(long jarg1, HDS_Halfedge_iterator jarg1_);
  public final static native void HDS_Halfedge_iterator_next(long jarg1, HDS_Halfedge_iterator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HDS_Halfedge_iterator_clone__SWIG_0(long jarg1, HDS_Halfedge_iterator jarg1_);
  public final static native void HDS_Halfedge_iterator_clone__SWIG_1(long jarg1, HDS_Halfedge_iterator jarg1_, long jarg2, HDS_Halfedge_iterator jarg2_);
  public final static native boolean HDS_Halfedge_iterator_hasNext(long jarg1, HDS_Halfedge_iterator jarg1_);
  public final static native boolean HDS_Halfedge_iterator_equals(long jarg1, HDS_Halfedge_iterator jarg1_, long jarg2, HDS_Halfedge_iterator jarg2_);
  public final static native boolean HDS_Halfedge_iterator_not_equals(long jarg1, HDS_Halfedge_iterator jarg1_, long jarg2, HDS_Halfedge_iterator jarg2_);
  public final static native void delete_HDS_Halfedge_iterator(long jarg1);
  public final static native long new_HDS_Face_iterator();
  public final static native long HDS_Face_iterator_slow_next(long jarg1, HDS_Face_iterator jarg1_);
  public final static native void HDS_Face_iterator_next(long jarg1, HDS_Face_iterator jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native long HDS_Face_iterator_clone__SWIG_0(long jarg1, HDS_Face_iterator jarg1_);
  public final static native void HDS_Face_iterator_clone__SWIG_1(long jarg1, HDS_Face_iterator jarg1_, long jarg2, HDS_Face_iterator jarg2_);
  public final static native boolean HDS_Face_iterator_hasNext(long jarg1, HDS_Face_iterator jarg1_);
  public final static native boolean HDS_Face_iterator_equals(long jarg1, HDS_Face_iterator jarg1_, long jarg2, HDS_Face_iterator jarg2_);
  public final static native boolean HDS_Face_iterator_not_equals(long jarg1, HDS_Face_iterator jarg1_, long jarg2, HDS_Face_iterator jarg2_);
  public final static native void delete_HDS_Face_iterator(long jarg1);
  public final static native long new_HalfedgeDS_modifier();
  public final static native void HalfedgeDS_modifier_begin_surface__SWIG_0(long jarg1, HalfedgeDS_modifier jarg1_, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native void HalfedgeDS_modifier_begin_surface__SWIG_1(long jarg1, HalfedgeDS_modifier jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void HalfedgeDS_modifier_begin_surface__SWIG_2(long jarg1, HalfedgeDS_modifier jarg1_, int jarg2, int jarg3);
  public final static native void HalfedgeDS_modifier_end_surface(long jarg1, HalfedgeDS_modifier jarg1_);
  public final static native void HalfedgeDS_modifier_add_vertex(long jarg1, HalfedgeDS_modifier jarg1_, long jarg2, Point_2 jarg2_);
  public final static native void HalfedgeDS_modifier_begin_facet(long jarg1, HalfedgeDS_modifier jarg1_);
  public final static native void HalfedgeDS_modifier_end_facet(long jarg1, HalfedgeDS_modifier jarg1_);
  public final static native void HalfedgeDS_modifier_add_vertex_to_facet(long jarg1, HalfedgeDS_modifier jarg1_, int jarg2);
  public final static native void HalfedgeDS_modifier_rollback(long jarg1, HalfedgeDS_modifier jarg1_);
  public final static native void HalfedgeDS_modifier_clear(long jarg1, HalfedgeDS_modifier jarg1_);
  public final static native void delete_HalfedgeDS_modifier(long jarg1);
  public final static native long new_HalfedgeDS__SWIG_0();
  public final static native long new_HalfedgeDS__SWIG_1(int jarg1, int jarg2, int jarg3);
  public final static native long new_HalfedgeDS__SWIG_2(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_reserve(long jarg1, HalfedgeDS jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int HalfedgeDS_size_of_vertices(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_size_of_halfedges(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_size_of_faces(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_capacity_of_vertices(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_capacity_of_halfedges(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_capacity_of_faces(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_bytes(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_bytes_reserved(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_vertices(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_halfedges(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_faces(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_vertices_push_back__SWIG_0(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_vertices_push_back__SWIG_1(long jarg1, HalfedgeDS jarg1_, long jarg2, Point_2 jarg2_);
  public final static native long HalfedgeDS_edges_push_back(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_faces_push_back(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_vertices_pop_front(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_vertices_pop_back(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_vertices_erase__SWIG_0(long jarg1, HalfedgeDS jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native void HalfedgeDS_vertices_erase__SWIG_1(long jarg1, HalfedgeDS jarg1_, long jarg2, HDS_Vertex_handle jarg2_, long jarg3, HDS_Vertex_handle jarg3_);
  public final static native void HalfedgeDS_edges_pop_front(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_edges_pop_back(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_edges_erase__SWIG_0(long jarg1, HalfedgeDS jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HalfedgeDS_edges_erase__SWIG_1(long jarg1, HalfedgeDS jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native void HalfedgeDS_faces_pop_front(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_faces_pop_back(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_faces_erase__SWIG_0(long jarg1, HalfedgeDS jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native void HalfedgeDS_faces_erase__SWIG_1(long jarg1, HalfedgeDS jarg1_, long jarg2, HDS_Face_handle jarg2_, long jarg3, HDS_Face_handle jarg3_);
  public final static native void HalfedgeDS_vertices_clear(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_edges_clear(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_faces_clear(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_clear(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_normalize_border(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_size_of_border_halfedges(long jarg1, HalfedgeDS jarg1_);
  public final static native int HalfedgeDS_size_of_border_edges(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_border_halfedges(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_clone__SWIG_0(long jarg1, HalfedgeDS jarg1_);
  public final static native void HalfedgeDS_clone__SWIG_1(long jarg1, HalfedgeDS jarg1_, long jarg2, HalfedgeDS jarg2_);
  public final static native void HalfedgeDS_delegate(long jarg1, HalfedgeDS jarg1_, long jarg2, HalfedgeDS_modifier jarg2_);
  public final static native void delete_HalfedgeDS(long jarg1);
  public final static native long new_HalfedgeDS_decorator(long jarg1, HalfedgeDS jarg1_);
  public final static native long HalfedgeDS_decorator_vertices_push_back__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, Point_2 jarg2_);
  public final static native long HalfedgeDS_decorator_vertices_push_back__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native long HalfedgeDS_decorator_faces_push_back(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native long HalfedgeDS_decorator_create_loop(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native long HalfedgeDS_decorator_create_segment(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void HalfedgeDS_decorator_vertices_pop_front(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void HalfedgeDS_decorator_vertices_pop_back(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void HalfedgeDS_decorator_vertices_erase__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Vertex_handle jarg2_);
  public final static native void HalfedgeDS_decorator_vertices_erase__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Vertex_handle jarg2_, long jarg3, HDS_Vertex_handle jarg3_);
  public final static native void HalfedgeDS_decorator_faces_pop_front(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void HalfedgeDS_decorator_faces_pop_back(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void HalfedgeDS_decorator_faces_erase__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Face_handle jarg2_);
  public final static native void HalfedgeDS_decorator_faces_erase__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Face_handle jarg2_, long jarg3, HDS_Face_handle jarg3_);
  public final static native void HalfedgeDS_decorator_erase_face(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HalfedgeDS_decorator_erase_connected_component(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native int HalfedgeDS_decorator_keep_largest_connected_components(long jarg1, HalfedgeDS_decorator jarg1_, int jarg2);
  public final static native void HalfedgeDS_decorator_make_hole(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HalfedgeDS_decorator_fill_hole(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native long HalfedgeDS_decorator_add_face_to_border(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native long HalfedgeDS_decorator_split_face__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native void HalfedgeDS_decorator_split_face__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_, long jarg4, HDS_Halfedge_handle jarg4_);
  public final static native long HalfedgeDS_decorator_join_face__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HalfedgeDS_decorator_join_face__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native long HalfedgeDS_decorator_split_vertex__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native void HalfedgeDS_decorator_split_vertex__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_, long jarg4, HDS_Halfedge_handle jarg4_);
  public final static native long HalfedgeDS_decorator_join_vertex__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HalfedgeDS_decorator_join_vertex__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native long HalfedgeDS_decorator_create_center_vertex__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HalfedgeDS_decorator_create_center_vertex__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native long HalfedgeDS_decorator_erase_center_vertex__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_);
  public final static native void HalfedgeDS_decorator_erase_center_vertex__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native long HalfedgeDS_decorator_split_loop__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_, long jarg4, HDS_Halfedge_handle jarg4_);
  public final static native void HalfedgeDS_decorator_split_loop__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_, long jarg4, HDS_Halfedge_handle jarg4_, long jarg5, HDS_Halfedge_handle jarg5_);
  public final static native long HalfedgeDS_decorator_join_loop__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_);
  public final static native void HalfedgeDS_decorator_join_loop__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, long jarg2, HDS_Halfedge_handle jarg2_, long jarg3, HDS_Halfedge_handle jarg3_, long jarg4, HDS_Halfedge_handle jarg4_);
  public final static native boolean HalfedgeDS_decorator_is_valid__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, boolean jarg2, int jarg3);
  public final static native boolean HalfedgeDS_decorator_is_valid__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_, boolean jarg2);
  public final static native boolean HalfedgeDS_decorator_is_valid__SWIG_2(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native boolean HalfedgeDS_decorator_normalized_border_is_valid__SWIG_0(long jarg1, HalfedgeDS_decorator jarg1_, boolean jarg2);
  public final static native boolean HalfedgeDS_decorator_normalized_border_is_valid__SWIG_1(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void HalfedgeDS_decorator_inside_out(long jarg1, HalfedgeDS_decorator jarg1_);
  public final static native void delete_HalfedgeDS_decorator(long jarg1);
}
