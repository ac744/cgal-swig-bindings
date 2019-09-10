%module CGAL_genepy3d

%include "SWIG_CGAL/common.i"
Decl_void_type()

%import  "SWIG_CGAL/Common/Macros.h"
%import  "SWIG_CGAL/Kernel/CGAL_Kernel.i"
%include "SWIG_CGAL/Common/Iterator.h" 
%include  "SWIG_CGAL/Common/Output_iterator_wrapper.h"
%import "SWIG_CGAL/Polyhedron_3/CGAL_Polyhedron_3.i"
%{
        #include <SWIG_CGAL/Polyhedron_3/all_includes.h>
        #include <SWIG_CGAL/Kernel/Point_3.h>
        #include <SWIG_CGAL/Common/Output_iterator_wrapper.h> 
%}
SWIG_CGAL_import_Polyhedron_3_SWIG_wrapper

%types(Point_3*,Point_3);//needed so that the identifier SWIGTYPE_p_Point_3 is generated
SWIG_CGAL_set_wrapper_iterator_helper_input(Point_3)
SWIG_CGAL_set_wrapper_iterator_helper_output(Point_3)

%types(Triangle_3*,Triangle_3);//needed so that the identifier SWIGTYPE_p_Point_3 is generated
SWIG_CGAL_set_wrapper_iterator_helper_input(Triangle_3)
SWIG_CGAL_set_wrapper_iterator_helper_output(Triangle_3)

%define Integer_output_iterator boost::function_output_iterator<Container_writer<int,int> > %enddef
SWIG_CGAL_output_iterator_typemap_in(Integer_output_iterator,int,Integer,int,swig_types[0],"Ljava/lang/Integer;")
 

%include "SWIG_CGAL/User_packages/genepy3d/myAlphaShape3.h" //this one is for SWIG
%{
#include <SWIG_CGAL/User_packages/genepy3d/myAlphaShape3.h> //this one is for the C++ wrapper
%}
  

