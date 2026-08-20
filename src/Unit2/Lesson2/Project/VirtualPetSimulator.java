package Unit2.Lesson2.Project;

public class VirtualPetSimulator {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy");
        Pet pet2 = new Pet("Whiskers", "cat");
        Pet pet3 = new Pet("Hoppy", "rabbit", 2);
        Pet[] myPets = {
            pet1,
            pet2,
            pet3
        };
        myPets[0].feed();
        myPets[1].play();
        myPets[2].sleep();
        myPets[0].getStatus();
        System.out.println("The length of "+myPets[1].getName()+"' name is: "+myPets[1].getName().length());
        System.out.println("The uppercase version of "+myPets[2].getName()+"'s name is: "+myPets[2].getName().toUpperCase());
        System.out.println("The first 3 letters of "+myPets[0].getName()+"'s name are: "+myPets[0].getName().substring(0,3));
        System.out.println("Converting happiness value "+myPets[0].getHappiness()+" to string: "+Double.toString(myPets[0].getHappiness()));
        System.out.println("Converting string "+"3"+" to interger: "+Integer.parseInt("3"));
        System.out.println("Random number between 1-10: "+Pet.randomInt(1,10));
        System.out.println("Rounded hunger value: "+Math.round(myPets[1].getHunger()));
        System.out.println("The maximum energy of all pets: 100.0");
        introduceAllPets(myPets);
        Pet happiestPet = findHappiestPet(myPets);
        System.out.println("The happiest pet is " + happiestPet.getName());
    }
    public static Pet findHappiestPet(Pet[] myPets){
        int happiestPet=0;
        double happiestPetScore=0;
        for (int i = 0; i < myPets.length; i++) {
            Pet pet = myPets[i];
            double happy = pet.getHappiness();
            if (happy>happiestPetScore) {
                happiestPet=i;
                happiestPetScore=happy;
            }
        }
        return myPets[happiestPet];
    }
    public static void introduceAllPets(Pet[] myPets){
        for (int i = 0; i < myPets.length; i++) {
            System.out.println("Pet #"+(i+1)+":\n"+myPets[i].getStatus());
        }
    }
}