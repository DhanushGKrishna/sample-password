class anmial{
    void mekeSound(){
        
    }
}

class dog extends anmial{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Project1{
    public static void main(String[] args){

        dog pet = new dog();

        pet.makeSound();
    }
}