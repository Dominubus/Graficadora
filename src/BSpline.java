
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class BSpline {
    /**
	 * Our order which is the nth_degree+1
	 */
	private int order=4;

	/**
	 * Our control points as PointObject objects
	 */
	private ArrayList<Punto> controlObjects;
	
	public BSpline() {

	}	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public ArrayList<Punto> getControlObjects() {
		return controlObjects;
	}
	public void setControlObjects(ArrayList<Punto> controlObjects) {
		this.controlObjects = controlObjects;
	}
	/**
	 * Take in four PointObject Objects as containing control points and calculate our curve.
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @return
	 */
	private Punto calcPoint(Punto p1, Punto p2, Punto p3, Punto p4){

		Punto retobject=new Punto();
		
		float basisax=(float)(((-1*p1.getX())+(3*p2.getX())-(3*p3.getX())+p4.getX())/6.0);
		float basisay=(float)(((-1*p1.getY())+(3*p2.getY())-(3*p3.getY())+p4.getY())/6);
		
		float basisbx=(float)(((3*p1.getX())-(6*p2.getX())+(3*p3.getX()))/6);
		float basisby=(float)(((3*p1.getY())-(6*p2.getY())+(3*p3.getY()))/6);
		
		float basiscx=(float)(((-3*p1.getX())+(3*p3.getX()))/6);
		float basiscy=(float)(((-3*p1.getY())+(3*p3.getY()))/6);
		
		float basisdx=(float)((p1.getX()+(4*p2.getX())+p3.getX())/6);
		float basisdy=(float)((p2.getY()+(4*p2.getY())+p3.getY())/6);
		
		float t;
		
		//get the vector determinant
		for(int i=0;i<(order-1);i++){
			t=i/order;
			retobject.setX((int) ((basiscx+t*(basisbx+t*basisax))*t+basisdx));
			retobject.setY((int) ((basiscy+t*(basisby+t*basisay))*t+basisdy));
		
		}
		
		//return the point object
		return retobject;
	}
	
	
	/**
	 * Control the creation of bspline points.
	 * @return
	 */
	public ArrayList<Punto> getSplinePoints(){
		
		ArrayList<Punto> po=new ArrayList<Punto>();
		
		if(controlObjects.size()>0){
			//calc bspline
			int i=0;
			
			//add the initial points
			while(i<controlObjects.size()){
				po.add(controlObjects.get(i));
				i++;
			}
			
			//add the remaining calculated points
			if(controlObjects.size()>3){
				for(i=3;i<controlObjects.size();i++){
					po.add(calcPoint(controlObjects.get(0),controlObjects.get(1),controlObjects.get(2),controlObjects.get(3)));
				}
			}
		}
		else{
			try{
				throw new NullPointerException("No Points Provided!");
			}catch(NullPointerException e){
				e.printStackTrace();
			}
		}
		
		return po;
	}
	
	/**
	 * Run the program and get an ArrayList<PointObject> of spline points.
	 * The number of points returned depends on the number of control points provided.
	 * @return
	 */
	public ArrayList<Punto> run(){
		return getSplinePoints();
	}
}
