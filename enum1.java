class enum1 {

    enum hello {
        Pending, Failed, Delivered, Cancelled;
    }

    public static void main(String[] args) {

       hello status = hello.Failed;
       
       switch(status) {
        case Pending: 
        System.out.println("Today is monday");
        break;

        case Failed:
        System.out.println("Sending failed");
        break;

        case Delivered:
            System.out.println("Item delivered");
            break;

            case Cancelled:
                System.out.println("Item Cancelled");
                break;
       }
       System.out.println("Not defined");

    
    
    }
}

        /*hello enter = hello.Failed;
        System.out.println(enter);
    
        hello[] all = hello.values();

        for(hello ss : all)
        System.out.println(ss + ": " + ss.ordinal());*/
