//
//// OOPS -
//// 1. Inheritance - IS-A relationship should be satisfied
//// 2. Method overriding -
//// 3. Method overloading - boolean remove(float var1);
// //                      boolean remove(int var1);
//// 4. Runtime polymorphism
//
//class abstarct Animal { // Parent class
//    int noOfLegs;   // No of legs is 4 for all animals
//    boolean isTail;
//    String sound;
//
//    Animal(boolean isTail){
//        this.isTail = isTail;
//    }
//
//    int getNoOfLegs(){
//        return this.noOfLegs;
//    }
//
//   default String getSound(){
//        return "default sound... something";
//    }
//}
//
//
//class Cow extends Animal {   // Child class
//// int noOfLegs;
//// boolean isTail;
//   int horn;
//
//   int getHorn(){
//    return horn;
//   }
//
//   @Override    // Method overriding
//   String getSound(){
//        return "maaaaa";
//    }
//}
//
//class Dog extends Animal {
//// int noOfLegs;
//// boolean isTail;
//int mustache;
//
//String getSound(){
//    return "bow bow";
//}
//
//}
//
//class Elephant {
//int noOfLegs;
//boolean isTail;
//int tusk;
//
//
//}
//
//class Cat extends Animal {
//// int noOfLegs;
//// boolean isTail;
//}
//
//
//Cow cow = new Cow();
//cow.getNoOfLegs();
//cow.getHorn();
//cow.getSound()
//
////Animal a = new Animal() - Can't create an instance of Animal since it's abstract
//Animal cow = new Cow()
//Animal dog = new Dog()
//
//Cow cow = new Dog()
//
//Object a = new Cow()