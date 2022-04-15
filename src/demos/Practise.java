package demos;

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class Practise extends PApplet{
	
	UnfoldingMap map;
	
	
	
	public void setup() {
		size(900, 600, OPENGL);
		
		AbstractMapProvider provider = new Google.GoogleTerrainProvider();
		
		map = new UnfoldingMap(this, 50, 50, 600, 500, provider);
		
		
		
		
	}
	
	public void draw() {
		map.draw();
	}
	
	public static void main (String[] args) {
		//Add main method for running as application
		PApplet.main(new String[] {"--present", "Practise"});
	}
}
