package pemrogramanlanjut;

import java.util.Scanner;

public class DaftarAkunMobileLegends {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, email, password;

        String regexUsername = "^[a-zA-Z0-9_]{5,15}$";
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
        String regexPassword = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

        System.out.println("=========SELAMAT DATANG DI MOBILE LEGENDS===========");
        
        do {
            System.out.println("");
            System.out.print("Masukkan Username: ");
            username = input.nextLine();

            if (!username.matches(regexUsername)) {
                System.out.println(" Username tidak valid! (5-15 karakter, huruf dan angka)");
            }

        } while (!username.matches(regexUsername));

        do {
            System.out.print("Masukkan Email: ");
            email = input.nextLine();

            if (!email.matches(regexEmail)) {
                System.out.println("Email tidak valid! (contoh@gmail.com)");
            }

        } while (!email.matches(regexEmail));

        do {
            System.out.print("Masukkan Password: ");
            password = input.nextLine();

            if (!password.matches(regexPassword)) {
                System.out.println(" Password tidak valid! (min 8 karakter, ada huruf besar & angka)");
            }

        } while (!password.matches(regexPassword));
        System.out.println("================SELAMAT BERMAIN!===================");
        System.out.println(" Pendaftaran akun Mobile Legends berhasil!");
    }
}
