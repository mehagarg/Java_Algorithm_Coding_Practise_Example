package ooo_design_ParkingLot;

public abstract class  Vehicle {
	 public abstract boolean park(ParkingLot pLot);
	 
	    public boolean unpark(ParkingLot pLot){
	        if(pspace != null){
	            pLot.reclaimParkedSpace(pspace);
	            return true;
	        }
	        return false;
	    };
	    
	    private ParkingSpace pspace;

}
