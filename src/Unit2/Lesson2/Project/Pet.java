package Unit2.Lesson2.Project;

public class Pet {
    // Variables/Fields
    private String name, type;
    private int age;
    private double happiness, hunger, energy;
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.happiness = 50.0;
        this.hunger = 50.0;
        this.energy = 100.0;
        System.out.println("Created a new "+type+" named "+name+".");
    }
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.happiness = 50.0;
        this.hunger = 50.0;
        this.energy = 100.0;
        System.out.println("Created a new "+type+" named "+name+".");
    }
    public Pet(String name) {
        this.name = name;
        this.type = "dog";
        this.age = 1;
        this.happiness = 50.0;
        this.hunger = 50.0;
        this.energy = 100.0;
        System.out.println("Created a new "+type+" named "+name+".");
    }
    public static int randomInt(int start, int end){
        return (int)(Math.random()*(end-start))+start;
    }
    private void checkOverflowVars(){
        /*this.energy=Math.round(energy);
        this.happiness=Math.round(happiness);
        this.hunger=Math.round(hunger);*/
        if (this.energy>100.0) {
            this.energy=100.0;
        }
        if (this.happiness>100.0) {
            this.happiness=100.0;
        }
        if (this.hunger>100.0) {
            this.hunger=100.0;
        }
        if (this.energy<0) {
            this.energy=0;
        }
        if (this.happiness<0) {
            this.happiness=0;
        }
        if (this.hunger<0) {
            this.hunger=0;
        }
    }
    public void feed(){
        this.hunger-=randomInt(10, 25);
        checkOverflowVars();
        System.out.println("Feeding "+name+"... "+name+" is less hungry now!");
    }
    public void play(){
        this.happiness+=randomInt(10, 20);
        this.hunger+=randomInt(5, 15);
        this.energy-=randomInt(5, 15);
        checkOverflowVars();
        System.out.println("Playing with "+name+"... "+name+" is happier but more tired.");
    }
    public void sleep(){
        this.energy=100;
        this.hunger+=randomInt(1, 3);
        checkOverflowVars();
        
    }
    private String percentBar(double percentage){
        int percent = (int)percentage/4;
        String percentBar = "";
        for (int i = 0; i < 25; i++) {
            if(i<percent){
            percentBar+="#";}else{percentBar+=" ";}
        }
        return "["+percentBar+"] ("+percentage+"%)";
    }
    public String getStatus(){
        return "Pet Status ("+name+"):\n -> Name: "+name+"\n -> Age: "+age+"\n -> Happiness Level: "+percentBar(happiness)+"\n -> Hunger: "+percentBar(hunger)+"\n -> Energy: "+percentBar(energy);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHappiness(){
        return happiness;
    }
    public double getHunger(){
        return hunger;
    }
    public double getEnergy(){
        return energy;
    }
    public String getType(){
        return type;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public boolean checkIfHappy(){
        if (this.happiness>50) {
            return true;
        }else{
            return false;
        }
    }
}