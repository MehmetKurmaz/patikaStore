import java.util.*;

public class Brands {
    static int id=0;
    static String brandName;
    Brands(String brandName){
        Brands.brandName=brandName;
    }
    static String[] brandsList={"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};


    static void brandsListAdd(){
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Ürün Markasını Giriniz :");
            String select=scanner.nextLine();
            int newLength=brandsList.length + 1;
            String[] newBrandList=new String[newLength];
            System.arraycopy(brandsList,0,newBrandList,0,brandsList.length);
            newBrandList[newLength - 1]=select;
            brandsList=newBrandList;
            System.out.println("Ürün Markası Ekleme Başarılı..");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }
    static void brandsList(){
        for (int i=0;i<brandsList.length;i++){
            Arrays.sort(brandsList);
            System.out.println(brandsList[i]);

        }
    }


}
