//Color, Number of legs
//ShowInfo

public class animal
{
    String color;
    String numofLegs;
    
    public animal(){
        
    }
    public animal(String color, String numofLegs){
        this.color = color;
        this.numofLegs = numofLegs;
    }
    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public String getnumofLegs(){
        return numofLegs;
    }
    public void setnumofLegs(String numofLegs){
        this.numofLegs = numofLegs;
    }
    public void showInfo(){
        System.out.println("Color: " + color);
        System.out.println("Number of legs: " + numofLegs);
    }
}
