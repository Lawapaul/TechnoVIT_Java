package object_oriented;
import java.util.*;

public class Area_Of_Circle {
	
	private float area,radius;
	public Area_Of_Circle() {
		radius=10;
	}
	public Area_Of_Circle(int r) {
		radius=r;
	}
	public void findArea() {
		
		area=3.14f *(radius*radius);
		System.out.println(area);
	}
	
}