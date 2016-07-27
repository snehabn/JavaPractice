class Dog {
  
  int age;

  public Dog(int dogsAge) {
    age = dogsAge;
  
  }

  public void bark() {
    System.out.println("Woof!");
  }
  
  public void run(int feet) {
    System.out.println("Your dog ran" + feet + "feet!");
  }
  
  public int getAge() {
    return age;
  }
  
  public static void main(String[] args) {
    
    Dog spike = new Dog(6);
    spike.bark();
    spike.run(5);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);

  }

}

//When Java runs the program, the code inside of the main method is executed.

//The void keyword (which means "completely empty") indicates to the method that no value is returned after calling that method
//Alternatively, we can use data type keywords (such as int, char, etc.) to specify that a method should return a value of that type.