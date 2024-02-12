
/*class Person {
  String firstName;
  String lastName;
  int age;
  String address;
  String phoneNumber;
  boolean isStudent;

    // Constructor 1
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor 2 (overloading)
    public Person(String firstName, String lastName, int age, String address, String phoneNumber, boolean isStudent) {
        // Constructor chaining
        this(firstName, lastName, age);

        // Additional instance variables
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isStudent = isStudent;
    }
    // Method 1
    public String getFirstName() {
        return firstName;
    }
    // Method 2
    public String getLastName() {
        return lastName;
    }
    // Method 3
    public int getAge() {
        return age;
    }
    // Method 1
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }


    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", 25);

        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() +
                ", Age: " + person1.getAge() + ", Teen: " + person1.isTeen());

        // Instance 2
        Person person2 = new Person("Jane", "Smith", 18, "123 Main St", "555-1234", true);

        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() +
                ", Age: " + person2.getAge() + ", Teen: " + person2.isTeen());
    }
}

 */
class Wall{

    //
    double width;
    double height;


    // Constructor
    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }
    // Method 1
    public double getWidth (){
        return width;
    }
    // Method 2
    public double getHeight(){
        return height;
    }

    // Method 3
    public  double setWidth(double width){
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
      return width;
    }
    // Method 4
    public  double setHeight(double height){
        if (height < 0) {
            this.height = 0;
        } else {
            return this.height = height;
        } return height;
    }

    // Method 5
    public double getArea(){
        return width*height;
    }

    public static void main(String[] args) {

        Wall wall = new Wall(5,4);  //Wall instance

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
