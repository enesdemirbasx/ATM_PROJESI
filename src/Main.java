import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String userName,password;
        int bakiye=2000,deneme=3;
        int islem;
        while(deneme>0) {
            System.out.println(" ");
            System.out.print("Kullanıcı adı: ");
            userName = inp.nextLine();
            System.out.print("Şifre: ");
            password = inp.nextLine();

            if (userName.equals("yusaemo") && password.equals("enes1252")) {
                System.out.println(" ");
                System.out.println("Giriş Başarılı!");
                System.out.println("Merhaba, DEMİRBAŞ Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(" ");
                    System.out.println("Lütfen yapmak istediğiniz işlemi yazınız");
                    System.out.print("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış yap\n");
                    islem = inp.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.println(" ");
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int yatir = inp.nextInt();
                            bakiye += yatir;
                            break;
                        case 2:
                            System.out.println(" ");
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int cek = inp.nextInt();
                            bakiye -= cek;
                            break;
                        case 3:
                            System.out.println(" ");
                            System.out.print("Mevcut bakiyeniz: " + bakiye+" TL"+"\n");
                            break;
                    }
                } while (islem != 4);
                System.out.println(" ");
                System.out.println("Bizi tercih ettiğiniz için teşekkürler. Yine Bekleriz :)");
                break;
            } else {
                deneme--;
                System.out.println(" ");
                System.out.println("Yanlış şifre girdiniz!Lütfen tekrar deneyiniz");
                if(deneme==0){
                    System.out.println(" ");
                    System.out.println("Hesabınız bloke olmuştur lütfen bankamızla iletişime geçiniz.");
                }else {
                    System.out.println(" ");
                    System.out.println("Kalan hakkınız: "+ deneme);
                }
            }
        }
    }
}