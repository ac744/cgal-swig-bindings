%module CGAL_genepy3d

%include "SWIG_CGAL/common.i"
Decl_void_type()

%import  "SWIG_CGAL/Common/Macros.h"
%import  "SWIG_CGAL/Kernel/CGAL_Kernel.i"
%include "SWIG_CGAL/Common/Iterator.h"

%import "SWIG_CGAL/Polyhedron_3/CGAL_Polyhedron_3.i"
%{
        #include <SWIG_CGAL/Polyhedron_3/all_includes.h>
        #include <SWIG_CGAL/Kernel/Point_3.h>
%}
SWIG_CGAL_import_Polyhedron_3_SWIG_wrapper

%types(Point_3*,Point_3);//needed so that the identifier SWIGTYPE_p_Point_3 is generated
SWIG_CGAL_set_wrapper_iterator_helper_input(Point_3)

//  typemaps for output iterator of Point_3
SWIG_CGAL_set_wrapper_iterator_helper_output(Point_3)


%include "SWIG_CGAL/User_packages/genepy3d/myAlphaShape3.h" //this one is for SWIG
%{
#include <SWIG_CGAL/User_packages/genepy3d/myAlphaShape3.h> //this one is for the C++ wrapper
%}
 
//%inline 
// void modify_polyhedron(Polyhedron_3_SWIG_wrapper& polyhedron){
//%{
//  polyhedron.make_tetrahedron(Point_3::cpp_base(0,0,0),
//	                                Point_3::cpp_base(0,0,1),
//	                                Point_3::cpp_base(0,1,0),
//	                                Point_3::cpp_base(1,1,1));
// }
//%}
