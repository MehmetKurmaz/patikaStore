import java.util.Scanner;

public class PatikaStore {

    public static void Start(){
        boolean status=true;
        while (status) {
            System.out.println("Patika Store Ürün Yönetim Paneli...\n1-Notebook İşlemleri\n2-Cep Telefonu İşlemleri\n3-Marka Listele\n0-Cikis");
            Scanner input = new Scanner(System.in);
            int select = input.nextInt();
            switch (select) {
                case 1: Product.notebookMenu();
                    break;
                case 2:Product.phoneMenu();
                    break;
                case 3:Brands.brandsList();
                    break;
                case 0: status=false;
                System.out.println("Tekrar Görüşünceye Kadar Hoşça Kalın...");

            }
        }
    }
}
