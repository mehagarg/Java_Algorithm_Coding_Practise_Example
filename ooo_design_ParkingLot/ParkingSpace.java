package ooo_design_ParkingLot;

import java.util.GregorianCalendar;

public class ParkingSpace{
	enum ParkingSpaceType{
		MOTORBIKE, CAR, HANDICAPPED, EV;
	}
	
	 private int id;
	    private ParkingSpaceType pspaceType;
	    private ParkingMeter meter;
	 
	    public ParkingSpace(int id, ParkingSpaceType pspaceType)
	    {
	        super();
	        this.id = id;
	        this.pspaceType = pspaceType;
	    }
	    
	    private class ParkingMeter{
	        public GregorianCalendar start;
	        public GregorianCalendar end;
	    }
	    
	    public void setStart()
	    {
	        meter.start = new GregorianCalendar();
	    }
	    public void setEnd()
	    {
	        meter.end = new GregorianCalendar();
	    }
	 
	    public float getFee(Permission perm)
	    {
	        return perm.getFee(meter.start, meter.end);
	    }
	 	
}