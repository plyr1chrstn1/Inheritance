public class dog extends animal{
    String dogName;
    
    public dog(String color, String numofLegs){
        super(color, numofLegs);
        this.dogName = "K";
    }
    public String getdogName(){
        return dogName;
    }
    public void setdogName(String dogName){
        this.dogName = dogName;
    }
}
