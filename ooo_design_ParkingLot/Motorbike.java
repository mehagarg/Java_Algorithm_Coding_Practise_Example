package ooo_design_ParkingLot;

import ooo_design_ParkingLot.ParkingSpace.ParkingSpaceType;

public class Motorbike {
	public boolean park(ParkingLot pLot){
        ParkingSpace pspace;
		if((pspace=pLot.allocateFreeSpace(ParkingSpaceType.MOTORBIKE))==null){
            return false;
        }
        return true;
    }
}
