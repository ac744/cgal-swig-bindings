/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polygon_mesh_processing;

import java.util.Iterator;
import java.util.Collection;
import CGAL.Polyhedron_3.Polyhedron_3;
import CGAL.Polyhedron_3.Polyhedron_3_Facet_handle;
import CGAL.Polyhedron_3.Polyhedron_3_Vertex_handle;
import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle;
import CGAL.Kernel.Point_3;
import CGAL.Kernel.Vector_3;
import CGAL.Kernel.Bbox_3;

public class CGAL_Polygon_mesh_processing implements CGAL_Polygon_mesh_processingConstants {
  public static void fair(Polyhedron_3 P, Iterator<Polyhedron_3_Vertex_handle> vertex_range) {
    CGAL_Polygon_mesh_processingJNI.fair__SWIG_0(Polyhedron_3.getCPtr(P), P, vertex_range);
  }

  public static void fair(Polyhedron_3 P, Iterator<Polyhedron_3_Vertex_handle> vertex_range, int fairing_continuity) {
    CGAL_Polygon_mesh_processingJNI.fair__SWIG_1(Polyhedron_3.getCPtr(P), P, vertex_range, fairing_continuity);
  }

  public static void refine(Polyhedron_3 P, Iterator<Polyhedron_3_Facet_handle> facet_range, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output) {
    CGAL_Polygon_mesh_processingJNI.refine__SWIG_0(Polyhedron_3.getCPtr(P), P, facet_range, facet_output, vertex_output);
  }

  public static void refine(Polyhedron_3 P, Iterator<Polyhedron_3_Facet_handle> facet_range, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output, double density_control_factor) {
    CGAL_Polygon_mesh_processingJNI.refine__SWIG_1(Polyhedron_3.getCPtr(P), P, facet_range, facet_output, vertex_output, density_control_factor);
  }

  public static void triangulate_face(Polyhedron_3_Facet_handle face, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.triangulate_face(Polyhedron_3_Facet_handle.getCPtr(face), face, Polyhedron_3.getCPtr(P), P);
  }

  public static void triangulate_faces(Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.triangulate_faces__SWIG_0(Polyhedron_3.getCPtr(P), P);
  }

  public static void triangulate_faces(Iterator<Polyhedron_3_Facet_handle> facet_range, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.triangulate_faces__SWIG_1(facet_range, Polyhedron_3.getCPtr(P), P);
  }

  public static void isotropic_remeshing(Iterator<Polyhedron_3_Facet_handle> facet_range, double target_edge_length, Polyhedron_3 P, int number_of_iterations, Iterator<Polyhedron_3_Halfedge_handle> constraints, boolean protect_constraints) {
    CGAL_Polygon_mesh_processingJNI.isotropic_remeshing__SWIG_0(facet_range, target_edge_length, Polyhedron_3.getCPtr(P), P, number_of_iterations, constraints, protect_constraints);
  }

  public static void isotropic_remeshing(Iterator<Polyhedron_3_Facet_handle> facet_range, double target_edge_length, Polyhedron_3 P, int number_of_iterations, Iterator<Polyhedron_3_Halfedge_handle> constraints) {
    CGAL_Polygon_mesh_processingJNI.isotropic_remeshing__SWIG_1(facet_range, target_edge_length, Polyhedron_3.getCPtr(P), P, number_of_iterations, constraints);
  }

  public static void isotropic_remeshing(Iterator<Polyhedron_3_Facet_handle> facet_range, double target_edge_length, Polyhedron_3 P, int number_of_iterations) {
    CGAL_Polygon_mesh_processingJNI.isotropic_remeshing__SWIG_2(facet_range, target_edge_length, Polyhedron_3.getCPtr(P), P, number_of_iterations);
  }

  public static void isotropic_remeshing(Iterator<Polyhedron_3_Facet_handle> facet_range, double target_edge_length, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.isotropic_remeshing__SWIG_3(facet_range, target_edge_length, Polyhedron_3.getCPtr(P), P);
  }

  public static void split_long_edges(Iterator<Polyhedron_3_Halfedge_handle> halfedge_range, double max_length, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.split_long_edges(halfedge_range, max_length, Polyhedron_3.getCPtr(P), P);
  }

  public static void triangulate_hole(Polyhedron_3 P, Polyhedron_3_Halfedge_handle h, Collection<Polyhedron_3_Facet_handle> output) {
    CGAL_Polygon_mesh_processingJNI.triangulate_hole(Polyhedron_3.getCPtr(P), P, Polyhedron_3_Halfedge_handle.getCPtr(h), h, output);
  }

  public static void triangulate_and_refine_hole(Polyhedron_3 P, Polyhedron_3_Halfedge_handle h, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output) {
    CGAL_Polygon_mesh_processingJNI.triangulate_and_refine_hole__SWIG_0(Polyhedron_3.getCPtr(P), P, Polyhedron_3_Halfedge_handle.getCPtr(h), h, facet_output, vertex_output);
  }

  public static void triangulate_and_refine_hole(Polyhedron_3 P, Polyhedron_3_Halfedge_handle h, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output, double density_control_factor) {
    CGAL_Polygon_mesh_processingJNI.triangulate_and_refine_hole__SWIG_1(Polyhedron_3.getCPtr(P), P, Polyhedron_3_Halfedge_handle.getCPtr(h), h, facet_output, vertex_output, density_control_factor);
  }

  public static void triangulate_refine_and_fair_hole(Polyhedron_3 P, Polyhedron_3_Halfedge_handle h, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output) {
    CGAL_Polygon_mesh_processingJNI.triangulate_refine_and_fair_hole__SWIG_0(Polyhedron_3.getCPtr(P), P, Polyhedron_3_Halfedge_handle.getCPtr(h), h, facet_output, vertex_output);
  }

  public static void triangulate_refine_and_fair_hole(Polyhedron_3 P, Polyhedron_3_Halfedge_handle h, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output, double density_control_factor) {
    CGAL_Polygon_mesh_processingJNI.triangulate_refine_and_fair_hole__SWIG_1(Polyhedron_3.getCPtr(P), P, Polyhedron_3_Halfedge_handle.getCPtr(h), h, facet_output, vertex_output, density_control_factor);
  }

  public static void triangulate_refine_and_fair_hole(Polyhedron_3 P, Polyhedron_3_Halfedge_handle h, Collection<Polyhedron_3_Facet_handle> facet_output, Collection<Polyhedron_3_Vertex_handle> vertex_output, double density_control_factor, int fairing_continuity) {
    CGAL_Polygon_mesh_processingJNI.triangulate_refine_and_fair_hole__SWIG_2(Polyhedron_3.getCPtr(P), P, Polyhedron_3_Halfedge_handle.getCPtr(h), h, facet_output, vertex_output, density_control_factor, fairing_continuity);
  }

  public static void triangulate_hole_polyline(Iterator<Point_3> points, Iterator<Point_3> third_points, Collection<Integer_triple> out) {
    CGAL_Polygon_mesh_processingJNI.triangulate_hole_polyline__SWIG_0(points, third_points, out);
  }

  public static void triangulate_hole_polyline(Iterator<Point_3> points, Collection<Integer_triple> out) {
    CGAL_Polygon_mesh_processingJNI.triangulate_hole_polyline__SWIG_1(points, out);
  }

  public static boolean does_self_intersect(Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.does_self_intersect(Polyhedron_3.getCPtr(P), P);
  }

  public static void self_intersections(Polyhedron_3 P, Collection<Facet_pair> out) {
    CGAL_Polygon_mesh_processingJNI.self_intersections(Polyhedron_3.getCPtr(P), P, out);
  }

  public static boolean is_outward_oriented(Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.is_outward_oriented(Polyhedron_3.getCPtr(P), P);
  }

  public static void reverse_face_orientations(Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.reverse_face_orientations__SWIG_0(Polyhedron_3.getCPtr(P), P);
  }

  public static void reverse_face_orientations(Iterator<Polyhedron_3_Facet_handle> face_range, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.reverse_face_orientations__SWIG_1(face_range, Polyhedron_3.getCPtr(P), P);
  }

  public static boolean orient_polygon_soup(Point_3_Vector points, Polygon_Vector polygons) {
    return CGAL_Polygon_mesh_processingJNI.orient_polygon_soup(Point_3_Vector.getCPtr(points), points, Polygon_Vector.getCPtr(polygons), polygons);
  }

  public static void stitch_borders(Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.stitch_borders__SWIG_0(Polyhedron_3.getCPtr(P), P);
  }

  public static void stitch_borders(Polyhedron_3 P, Iterator<Halfedge_pair> hedges) {
    CGAL_Polygon_mesh_processingJNI.stitch_borders__SWIG_1(Polyhedron_3.getCPtr(P), P, hedges);
  }

  public static void polygon_soup_to_polygon_mesh(Point_3_Vector points, Polygon_Vector polygons, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.polygon_soup_to_polygon_mesh__SWIG_0(Point_3_Vector.getCPtr(points), points, Polygon_Vector.getCPtr(polygons), polygons, Polyhedron_3.getCPtr(P), P);
  }

  public static void remove_isolated_vertices(Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.remove_isolated_vertices(Polyhedron_3.getCPtr(P), P);
  }

  public static Vector_3 compute_face_normal(Polyhedron_3_Facet_handle face, Polyhedron_3 P) {
    return new Vector_3(CGAL_Polygon_mesh_processingJNI.compute_face_normal__SWIG_0(Polyhedron_3_Facet_handle.getCPtr(face), face, Polyhedron_3.getCPtr(P), P), true);
  }

  public static void compute_face_normal(Polyhedron_3_Facet_handle face, Polyhedron_3 P, Vector_3 output_normal) {
    CGAL_Polygon_mesh_processingJNI.compute_face_normal__SWIG_1(Polyhedron_3_Facet_handle.getCPtr(face), face, Polyhedron_3.getCPtr(P), P, Vector_3.getCPtr(output_normal), output_normal);
  }

  public static void compute_face_normals(Polyhedron_3 P, Collection<Vector_3> out) {
    CGAL_Polygon_mesh_processingJNI.compute_face_normals(Polyhedron_3.getCPtr(P), P, out);
  }

  public static Vector_3 compute_vertex_normal(Polyhedron_3_Vertex_handle vertex, Polyhedron_3 P) {
    return new Vector_3(CGAL_Polygon_mesh_processingJNI.compute_vertex_normal__SWIG_0(Polyhedron_3_Vertex_handle.getCPtr(vertex), vertex, Polyhedron_3.getCPtr(P), P), true);
  }

  public static void compute_vertex_normal(Polyhedron_3_Vertex_handle vertex, Polyhedron_3 P, Vector_3 output_normal) {
    CGAL_Polygon_mesh_processingJNI.compute_vertex_normal__SWIG_1(Polyhedron_3_Vertex_handle.getCPtr(vertex), vertex, Polyhedron_3.getCPtr(P), P, Vector_3.getCPtr(output_normal), output_normal);
  }

  public static void compute_vertex_normals(Polyhedron_3 P, Collection<Vector_3> out) {
    CGAL_Polygon_mesh_processingJNI.compute_vertex_normals(Polyhedron_3.getCPtr(P), P, out);
  }

  public static void connected_component(Polyhedron_3_Facet_handle seed_face, Polyhedron_3 P, Collection<Polyhedron_3_Facet_handle> out) {
    CGAL_Polygon_mesh_processingJNI.connected_component(Polyhedron_3_Facet_handle.getCPtr(seed_face), seed_face, Polyhedron_3.getCPtr(P), P, out);
  }

  public static int[] connected_components(Polyhedron_3 P) {return CGAL_Polygon_mesh_processingJNI.connected_components(Polyhedron_3.getCPtr(P), P);}

  public static int keep_large_connected_components(Polyhedron_3 P, int threshold_components_to_keep) {
    return CGAL_Polygon_mesh_processingJNI.keep_large_connected_components(Polyhedron_3.getCPtr(P), P, threshold_components_to_keep);
  }

  public static int keep_largest_connected_components(Polyhedron_3 P, int nb_components_to_keep) {
    return CGAL_Polygon_mesh_processingJNI.keep_largest_connected_components(Polyhedron_3.getCPtr(P), P, nb_components_to_keep);
  }

  public static void keep_connected_components(Polyhedron_3 P, Iterator<Polyhedron_3_Facet_handle> components_to_keep) {
    CGAL_Polygon_mesh_processingJNI.keep_connected_components__SWIG_0(Polyhedron_3.getCPtr(P), P, components_to_keep);
  }

  public static void keep_connected_components(Polyhedron_3 P, int[] components_to_keep, int[] fcm) {
    CGAL_Polygon_mesh_processingJNI.keep_connected_components__SWIG_1(Polyhedron_3.getCPtr(P), P, components_to_keep, fcm);
  }

  public static void remove_connected_components(Polyhedron_3 P, Iterator<Polyhedron_3_Facet_handle> components_to_remove) {
    CGAL_Polygon_mesh_processingJNI.remove_connected_components__SWIG_0(Polyhedron_3.getCPtr(P), P, components_to_remove);
  }

  public static void remove_connected_components(Polyhedron_3 P, int[] components_to_remove, int[] fcm) {
    CGAL_Polygon_mesh_processingJNI.remove_connected_components__SWIG_1(Polyhedron_3.getCPtr(P), P, components_to_remove, fcm);
  }

  public static double face_area(Polyhedron_3_Facet_handle face, Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.face_area(Polyhedron_3_Facet_handle.getCPtr(face), face, Polyhedron_3.getCPtr(P), P);
  }

  public static double area(Iterator<Polyhedron_3_Facet_handle> facet_range, Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.area__SWIG_1(facet_range, Polyhedron_3.getCPtr(P), P);
  }

  public static double area(Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.area__SWIG_2(Polyhedron_3.getCPtr(P), P);
  }

  public static double volume(Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.volume(Polyhedron_3.getCPtr(P), P);
  }

  public static double edge_length(Polyhedron_3_Halfedge_handle hedge, Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.edge_length(Polyhedron_3_Halfedge_handle.getCPtr(hedge), hedge, Polyhedron_3.getCPtr(P), P);
  }

  public static double face_border_length(Polyhedron_3_Halfedge_handle hedge, Polyhedron_3 P) {
    return CGAL_Polygon_mesh_processingJNI.face_border_length(Polyhedron_3_Halfedge_handle.getCPtr(hedge), hedge, Polyhedron_3.getCPtr(P), P);
  }

  public static Bbox_3 bbox_3(Polyhedron_3 P) {
    return new Bbox_3(CGAL_Polygon_mesh_processingJNI.bbox_3(Polyhedron_3.getCPtr(P), P), true);
  }

  public static void border_halfedges(Iterator<Polyhedron_3_Facet_handle> facet_range, Polyhedron_3 P, Collection<Polyhedron_3_Halfedge_handle> out) {
    CGAL_Polygon_mesh_processingJNI.border_halfedges(facet_range, Polyhedron_3.getCPtr(P), P, out);
  }

  public static void polygon_soup_to_polygon_mesh(double[] points, int[] polygons, Polyhedron_3 P) {
    CGAL_Polygon_mesh_processingJNI.polygon_soup_to_polygon_mesh__SWIG_1(points, polygons, Polyhedron_3.getCPtr(P), P);
  }

}
