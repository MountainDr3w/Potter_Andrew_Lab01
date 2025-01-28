public class ObjInputTest {
    public static void main(String[] args) {
        SafeInputObj testing = new SafeInputObj();

        //Non zero string
        String name = testing.getNonZeroLenString("Please enter your name");
        System.out.println("Non-zero length string: " + name);

        //Ranged int
        int age = testing.getRangedInt("enter your age",0,200);
        System.out.println("Ranged int: " + age);

        //Int
        int favNum = testing.getInt("Enter your favorite number");
        System.out.println("Get int: " + favNum);

        //Ranged double
        double decimal = testing.getRangedDouble("enter a number", 0, 1);
        System.out.println("Ranged double:" + decimal);

        //Double
        double cost = testing.getDouble("Enter the price of a happy meal");
        System.out.println("Double: " + cost);

        //Yes/No
        boolean yesNo = testing.getYNConfirm("yes or no");
        System.out.println("Yes or No: " + yesNo);

        //regEx
        String regEx = testing.getRegExString("Enter the pattern", "%d");
        System.out.println("Reg ex pattern (1 number): " + regEx);

    }
}
