/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator implements   Iterable<Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge>, Iterator<Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge> iterator() {
      return this;
    }
    
    //we store an object of type Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge to avoid
    //creation and allocation of a java object at each iteration.
    private Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge objectInstance = new Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge();
    public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator() {
    this(CGAL_Mesh_2JNI.new_Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator(), true);
  }

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge slow_next() {
    return new Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge r) {
    CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_next(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge.getCPtr(r), r);
  }

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator clone() {
    return new Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator other) {
    CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_clone__SWIG_1(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator.getCPtr(other), other);
  }

  public Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge prev() {
    return new Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_hasNext(swigCPtr, this);
  }

  public boolean equals(Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator p) {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_equals(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator.getCPtr(p), p);
  }

  public boolean not_equals(Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator p) {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator_not_equals(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_plus_2_Edge_circulator.getCPtr(p), p);
  }

}
