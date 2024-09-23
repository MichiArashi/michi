public class Main {
    public static double Round(double num) {
        return Math.round(num * 100.0) / 100.0;
    }
    public static double sitOne(double num) {
        return Round(Math.tan(Math.cos(Math.pow(num/2, 2))));
    }
    public static double sitTwo(double num) {
        double n = Math.cos(Math.pow(2*num, 2));
        n = Math.pow(n, ((Math.cos(Math.log(Math.abs(num))))/((Math.pow(Math.pow(num/(num-1), 2), 2)-(3/4)))));
        return Round(n);
    }
    public static double sitThree(double num) {
        return Round(Math.asin(Math.sin(3/4*Math.cos(Math.pow(1/4/num, 2)))));
    }
    public static void print(double[][] arr) {
        System.out.println("3:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.2f ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        short[] z = new short[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println("1:");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
        double[] x = new double[20];
        System.out.println("2:");
        for (int i = 0; i< x.length; i++) {
            x[i] = Math.random() * 20-13;
            System.out.print(x[i] + " ");
        }
        System.out.println();
        double[][] z1 = new double[14][20];
        for (int i = 0; i < z1.length; i++) {
            for (int j = 0; j < z1[i].length; j++) {
                if (z[i] == 17)
                    z1[i][j] = sitOne(x[j]);
                else {
                    switch (z[i]) {
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                        case 16:
                            z1[i][j] = sitTwo(x[j]);
                            break;
                        default:
                            z1[i][j] = sitThree(x[j]);
                    }
                }
            }
        }
        print(z1);
    }
}
