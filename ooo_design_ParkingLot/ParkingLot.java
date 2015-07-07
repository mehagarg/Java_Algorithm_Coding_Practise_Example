package ooo_design_ParkingLot;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import ooo_design_ParkingLot.ParkingSpace.ParkingSpaceType;

/**
 * 1) ParkingLot has a function to manage Parking Space => AllocateFreeSpace and ReclaimParkedSpace
 * 2) ParkingSpace has a function to provide spaces based on 
 * 		a) Vehicle type
 * 		b) Duration of Parked Vehicle
 * 		c) Has a Parking meter
 * 3) Vehicle has a function to ParkaVechicle or UnParkAVehicle if ParkingSpace is availbale or not.
 * 4) Motorbike, HC, EV, RegulareCars should extend from Vehicle.
 * 5) Need an interface called Permissions to getFee from the parked Vehicle.
 * 
 *http://www.delbertbao.net/2011/12/06/object-oriented-design-part-1/
 *http://www.careercup.com/question?id=56632

 */
public class ParkingLot {
	List<ParkingSpace> regularSpace = new ArrayList<ParkingSpace>();
	List<ParkingSpace> handicappedSpace =  new ArrayList<ParkingSpace>();
	List<ParkingSpace> motorBikeSpace = new ArrayList<ParkingSpace>();
	List<ParkingSpace> pluginVehicles = new ArrayList<ParkingSpace>();
	
	private Permission perm;
	
	public ParkingSpace allocateFreeSpace(ParkingSpaceType pspaceType){
		return null;
		
	}
	
	public float reclaimParkedSpace(ParkingSpace pspace){
		pspace.setEnd();
		pspace.getFee(perm);
		return 0;
	}
}



