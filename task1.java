class task1{
    public static void main(String[] args){
        int a = 50, b = 60, c = 70, d = 72, e = 73;
        int great;

        if (a > b){
            if (a > c){
                if (a > d){
                    if (a > e){
                        great = a;
                    } else {
                        great = e;
                    }
                } else {
                    if (d > e){
                        great = d;
                    } else {
                        great = e;
                    }
                }
            } else {
                 if(c > d){
                    if(c > e){
                        great = c;
                    } else {
                        great = e;
                    }
                 } else {
                    if (d > e) {
                        great = d;
                    } else {
                        great = e;
                    }
                 }
            }
        } else {
            if (b > c){
                if (b > d){
                    if (b > e) {
                        great = b;
                    } else {
                        great = e;
                    }
                } else {
                    if (d > e) {
                        great = d;
                    } else {
                         great = e;
                    }
                }
            } else {
                 if (c > d) {
                    if (c > e) {
                        great = c;
                    } else {
                        great = e;
                    }
                 } else {
                     if (d > e) {
                        great = d; 
                     } else {
                        great = e;
                     }
                 }
            }
        }
        System.out.println(great);
    }
}