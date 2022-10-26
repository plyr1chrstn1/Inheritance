public class inhertanceTest
{
    public static void main(String[] args){
        //animal animal1 = new animal();
        
        //animal1.setcolor("Blue");
        //animal1.setnumofLegs("4");
        //animal1.showInfo();
        
        dog dog1 = new dog("Black","3");
        System.out.println("Name: " + dog1.getdogName());
        System.out.println(dog1.getcolor());
        System.out.println(dog1.getnumofLegs());
    }
}
