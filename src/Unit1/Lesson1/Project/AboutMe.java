package Unit1.Lesson1.Project;
public class AboutMe {
    public static void main(String[] args) { //make program run
        System.out.println("hello there"); // we tell user hi because we want to make them feel at home (not true)
        /*
        This program is really just an introduction about me.
        No really, its really just about me
         */
        // Variable init
        final String name = "Aarush Mohapatra";
        int age = 15;
        double height = 5.11;
        boolean isValidInfo = true;
        //Story time >:D
        System.out.println("Well, welcome to my not so first Java program!\nI have programmed in Java before and know some things in Java.");
        System.out.println("I have learned Java in Computer Science 1 and 2, which are course requirements for AP Computer Science.");
        System.out.println("You might be asking 'who are you!?!?!?!' so lets get to the facts :D");
        System.out.println("My name is " + name + ", and I am " + age + " years old. My height is " + height + " feet, but I don't know why you wanna know that ;-;");
        if (isValidInfo) { // if statement to validate info (not so)
            System.out.println("And yes, I am who I am. This is valid info.");
        } else {
            System.out.println("yo WHAT i guess this is not valid info noooooooooo");
        }
        System.out.print("I pretty much know the basics of Java like ");
        for (int i = 0; i < 5; i++) { //loops yes
            System.out.print("for loops (i=" + i + ") - ");
        }
        System.out.println("\n...and much more. I also programmed a chess game in Java. If you're interested, heres the GitHub link: https://github.com/AarushMohapatra/Chess-Java");

    }
}