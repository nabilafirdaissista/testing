import java.util.Scanner;

public class konversiSatuan {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Program Konversi Satuan");
            System.out.println("1. Mil ke Km");
            System.out.println("2. Km ke M");
            System.out.println("3. M ke Sm");
            System.out.println("4. Sm ke Mm");

            System.out.print("Pilih opsi (1,2,3,4): ");

            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                konversiMilKeKilometer();
            } else if (pilihan == 2) {
                konversiKilometerKeMeter();
            } else if(pilihan == 3){
                konversiMeterkeSentiMeter();
            }else if(pilihan== 4){
                konversiSentimeterkeMiliMeter();
            }else {
                System.out.println("Pilihan tidak valid");
            }

            scanner.close();
        }

        public static void konversiMilKeKilometer() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah mil: ");
            double mil = scanner.nextDouble();

            double kilometer = mil * 1.60934;
            System.out.println(mil + " mil sama dengan " + kilometer + " km.");
            scanner.close();

        }
        public static void konversiKilometerKeMeter() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah kilometer: ");
            double kilometer = scanner.nextDouble();

            double meter = kilometer / 1000;
            System.out.println(kilometer + " km sama dengan " +meter+ " m.");
            scanner.close();
        }
        public static void konversiMeterkeSentiMeter() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah meter: ");
            double meter = scanner.nextDouble();

            double Sm = meter/100;
            System.out.println(meter + " M sama dengan " +Sm+ " cm.");
            scanner.close();
        }
        public static void konversiSentimeterkeMiliMeter() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah Sentimeter: ");
            double sm = scanner.nextDouble();

            double mm = sm /10;
            System.out.println(sm + " sm sama dengan " +mm+ " cm.");
            scanner.close();
        }
}
