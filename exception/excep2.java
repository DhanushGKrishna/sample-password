class illegalArgumentException extends Exception{
    public illegalArgumentException(String message){
        super(message);
    }
}
class excep2{
    
    public static void checkage(int age) throws illegalArgumentException{
        if(age < 18){
            throw new illegalArgumentException("Age must be 18 or above");
        } else{
            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args){
        try {checkage(16);
        }
        catch(illegalArgumentException e){
            System.out.println("Caught :" + e.getMessage());
        }
    }

}
