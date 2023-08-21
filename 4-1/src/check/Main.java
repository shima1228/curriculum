package check;

import constants.Constants;

public class Main {
    private static String firstName = "島";
    private static String lastName = "村田";

    public void setName(String firstName) {
        Main.firstName = firstName;
    }

    public String getName() {
        return Main.firstName;
    }

    public void setName1(String lastName) {
        Main.lastName = lastName;
    }

    public String getName1() {
        return Main.lastName;
    }
    
    private static String printName(String firstName, String lastName) {
       return lastName + firstName;
    }

    public static void main(String[] args) {
        System.out.println("printNameメソッド→" + printName(firstName, lastName));
        

        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE );
        pet.introduce();

        Pet RoboPet = new RobotPet( Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        RoboPet.introduce();

    }

}

