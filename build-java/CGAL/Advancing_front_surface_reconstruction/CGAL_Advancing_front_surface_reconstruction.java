/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Advancing_front_surface_reconstruction;

  import CGAL.Kernel.Point_3;
  import java.util.Iterator;
  import java.util.Collection;
  import CGAL.Polyhedron_3.Polyhedron_3;

public class CGAL_Advancing_front_surface_reconstruction {
  public static void advancing_front_surface_reconstruction(Iterator<Point_3> arg0, Collection<Integer> arg1, double arg2, double arg3) {
    CGAL_Advancing_front_surface_reconstructionJNI.advancing_front_surface_reconstruction__SWIG_0(arg0, arg1, arg2, arg3);
  }

  public static void advancing_front_surface_reconstruction(Iterator<Point_3> arg0, Collection<Integer> arg1, double arg2) {
    CGAL_Advancing_front_surface_reconstructionJNI.advancing_front_surface_reconstruction__SWIG_1(arg0, arg1, arg2);
  }

  public static void advancing_front_surface_reconstruction(Iterator<Point_3> arg0, Collection<Integer> arg1) {
    CGAL_Advancing_front_surface_reconstructionJNI.advancing_front_surface_reconstruction__SWIG_2(arg0, arg1);
  }

  public static void advancing_front_surface_reconstruction(Iterator<Point_3> arg0, Polyhedron_3 P, double arg2, double arg3) {
    CGAL_Advancing_front_surface_reconstructionJNI.advancing_front_surface_reconstruction__SWIG_3(arg0, Polyhedron_3.getCPtr(P), P, arg2, arg3);
  }

  public static void advancing_front_surface_reconstruction(Iterator<Point_3> arg0, Polyhedron_3 P, double arg2) {
    CGAL_Advancing_front_surface_reconstructionJNI.advancing_front_surface_reconstruction__SWIG_4(arg0, Polyhedron_3.getCPtr(P), P, arg2);
  }

  public static void advancing_front_surface_reconstruction(Iterator<Point_3> arg0, Polyhedron_3 P) {
    CGAL_Advancing_front_surface_reconstructionJNI.advancing_front_surface_reconstruction__SWIG_5(arg0, Polyhedron_3.getCPtr(P), P);
  }

}
