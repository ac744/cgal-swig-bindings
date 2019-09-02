#include <SWIG_CGAL/Common/Wrapper_iterator_helper.h>
#include <SWIG_CGAL/Kernel/Point_3.h>
#include <SWIG_CGAL/Kernel/Vector_3.h>
#include <SWIG_CGAL/Kernel/Triangle_3.h>

#include <CGAL/Exact_predicates_inexact_constructions_kernel.h>
#include <CGAL/Alpha_shape_3.h>
#include <CGAL/Alpha_shape_cell_base_3.h>
#include <CGAL/Alpha_shape_vertex_base_3.h>
#include <CGAL/Delaunay_triangulation_3.h>
#include <fstream>
#include <list>
#include <cassert>
typedef CGAL::Exact_predicates_inexact_constructions_kernel K;
typedef CGAL::Alpha_shape_vertex_base_3<K>               Vb;
typedef CGAL::Alpha_shape_cell_base_3<K>                 Fb;
typedef CGAL::Triangulation_data_structure_3<Vb,Fb>      Tds;
typedef CGAL::Delaunay_triangulation_3<K,Tds,CGAL::Fast_location>  Delaunay;
typedef CGAL::Alpha_shape_3<Delaunay>                    Alpha_shape_3;
typedef K::Point_3                                       Point;
typedef K::Triangle_3                                       Triangle;
typedef Alpha_shape_3::Alpha_iterator                    Alpha_iterator;
typedef Alpha_shape_3::NT                                NT;

void getAlphaShape(Wrapper_iterator_helper<Point_3>::input point_range, Wrapper_iterator_helper<Point_3>::output pointsOut,Wrapper_iterator_helper<Triangle_3>::output triOut){
  typedef Wrapper_iterator_helper<Point_3>::input::first_type Iterator;

  Delaunay dt;
  for (Iterator it=point_range.first; it!=point_range.second; ++it){
    dt.insert(*it);
  }
  Alpha_shape_3 as(dt);
  Alpha_shape_3::NT alpha_solid = as.find_alpha_solid();
  Alpha_iterator opt = as.find_optimal_alpha(1);

  as.set_alpha(*opt);
  assert(as.number_of_solid_components() == 1);

  //Output of coordinates of vertex in the alpha shape
  std::list<Alpha_shape_3::Vertex_handle> outPointsList;
  std::list<Alpha_shape_3::Vertex_handle>::iterator it2;
  as.get_alpha_shape_vertices(std::back_inserter(outPointsList),Alpha_shape_3::REGULAR,*opt);

  for (it2=outPointsList.begin();it2!=outPointsList.end();it2++){
        *pointsOut++=(*it2)->point();
  }

  //Output of the triangles
  std::list<Alpha_shape_3::Facet> outFacetsList;
  std::list<Alpha_shape_3::Facet>::iterator it3;
  as.get_alpha_shape_facets(std::back_inserter(outFacetsList),Alpha_shape_3::REGULAR,*opt);
  
  for (it3=outFacetsList.begin();it3!=outFacetsList.end();it3++){
        *triOut++=dt.triangle(*it3);

  }

}

