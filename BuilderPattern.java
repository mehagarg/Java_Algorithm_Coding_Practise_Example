
public class BuilderPattern {
	
	public class Pet{
		public static class Builder{
			private Animal animal; 
			private String petName; 
			private String ownerName; 
			private String address; 
			private String telephone; 
			private Date dateOfBirth; 
			private String emailAddress;
			
			public Builder withAnimal(Animal animal){
				this.animal = animal;
				return this;
			}
			
		}
		
	}

}
