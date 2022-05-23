class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person();

    person1.name = "Herman";
    person1.address = "Makassar";
    // person1.country = "tidak bisa diubah!!!";

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Budi");


    Person person2 = new Person();
    Person person3;
    person3 = new Person();

 
  }
}