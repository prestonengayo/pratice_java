public class Person {

    private String name;
    private double height;
    private double weight;
    private String eyesColor;
    private char gender;
    private int age;

    public Person(String name, double height, double weight, String eyesColor, char gender, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(this.name + "est entrain de manger");
    }

    public void run(){
        System.out.println(this.name + "est entrain de courrir ");
    }
}
