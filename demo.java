class demo {
    public static void main(String[] args){
        String [][] Students = {
            
                {"Dhanush", "25" },
                {"Arun", "25"},
                {"Nikhil", "22"},
            
            
                {"Midhun", "24"},
                {"Appu", "25"},
            
            
                {"Aravid", "22"},
                {"Achu", "22"},
            
            
                {"Aravid", "22", "Computer"},
                {"Achu", "22"},
            
        };

        // System.out.println(Students[0][1][1]);
        // System.out.println(Students[1][0][0]);

        for (int shelf = 0; shelf < Students.length; shelf++) {
            System.out.println("shelf" + (shelf + 1) + ":");
            for (int row = 0; row < Students[shelf].length; row++) {
                System.out.println(Students[shelf][row] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}