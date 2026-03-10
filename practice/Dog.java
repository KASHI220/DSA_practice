package practice;

public class Dog {
    String name;
    public Dog(String name){
        this.name=name;
    }
    public static void main(String[] args){
        String name;
        Dog[] myDog = new Dog[5];
        Dog go = new Dog("jacky");
        go.createDog(myDog);

        go.display(myDog);
    }
    public  void createDog(Dog[] myDog){

        myDog[0]= new Dog("jack");
        myDog[1]= new Dog("may");
        myDog[2]= new Dog("buff");
        myDog[3]= new Dog("punk");
        myDog[4]= new Dog("jimmy");

    }
    public void display(Dog[] myDog){
        int x=0;
        while(x < myDog.length){
            System.out.println(myDog[x].name);
            x=x+1;
        }
    }


}
