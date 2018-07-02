package module5;

import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.Marker;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author Bingjian Gao
  * Date: 20/02/2018
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	/** Draw the earthquake as a square */
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
		/*//optional, but meet problem
		if(clicked) {
			for(Marker marker:cityMarkers) {
				if(this.getDistanceTo(marker.getLocation())<this.threatCircle()) {
					
				}
			}
			pg.line(x, y, , y2);
		}*/
	}
	

	

}
