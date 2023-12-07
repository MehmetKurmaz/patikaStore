import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Product {
    private String name;
    private String color;
    private String brand;
    private String type;
    private int camera;
    private int memory;
    private int ram;
    private int batteryPower;
    private int nextİd = 1;
    private int idPhone;
    private int idNotebook;
    private static int id;
    private double price;
    private int discountPrice;
    private int stockQuantity;
    private double screenSize;
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCamera() {
        return this.camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getNextİd() {
        return nextİd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    Product() {
    }

    Product(String Type, String name, double price, String brand, int memory, int camera, String color, double screenSize, int ram, int batteryPower, int discountPrice, int stockQuantity) {
        Product.id++;
        this.idNotebook = Product.id;
        this.idPhone = Product.id;
        this.type = Type;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.memory = memory;
        this.camera = camera;
        this.color = color;
        this.screenSize = screenSize;
        this.ram = ram;
        this.batteryPower = batteryPower;
        this.discountPrice = discountPrice;
        this.stockQuantity = stockQuantity;


    }

    private static HashMap<String, ArrayList<Product>> products = new HashMap<>() {
        {
            put("Notebook", new ArrayList<Product>());
            put("Phone", new ArrayList<Product>());
        }

    };

    static {
        Product huawei = new Product("Notebook", "HUAWEI MATEBOOK 14", 7000.0, "Huawei", 512, 5, "METALİK GRİ", 14.0, 16, 10000, 6500, 50);
        Product.products.get("Notebook").add(huawei);
        Product lenovo = new Product("Notebook", "LENOVO V14 IGL", 3699.0, "Lenovo", 1024, 3, "BEYAZ", 14.0, 8, 1000, 3450, 25);
        Product.products.get("Notebook").add(lenovo);
        Product asus = new Product("Notebook", "ASUS TUF GAMİNG", 8199.0, "Asus", 2048, 8, "Siyah", 15.6, 32, 10000, 7900, 150);
        Product.products.get("Notebook").add(asus);
        Product samsung = new Product("Telefon", "Samsung Galaxy A51", 3199.0, "Samsung", 128, 32, "Siyah", 6.5, 6, 4000, 2800, 100);
        Product iphone = new Product("Telefon", "iPhone 11", 7379.0, "Apple", 64, 5, "Mavi", 6.1, 6, 3046, 7000, 125);
        Product xiaomi = new Product("Telefon", "Redmi Note 10 Pro", 4012.0, "Xiaomi", 128, 35, "Beyaz", 6.5, 12, 4000, 3850, 200);
        products.get("Phone").add(samsung);
        products.get("Phone").add(iphone);
        products.get("Phone").add(xiaomi);

    }

    public static void phoneMenu() {
        boolean status = true;
        while (true) {
            System.out.println("CEP TELEFONU MENüSüNE HOŞGELDİNİZ...\n1-Ürünleri Listele\n2-Ürün Ekle\n3-Ürün Sil\n4-Ürün Güncelle\n5-ÇIKIŞ");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    showPhoneList();
                    break;
                case 2:
                    productAdd();
                    break;
                case 3:
                    productDelete();
                    break;
                case 4:
                    productUpdate();
                    break;
                case 5:
                    PatikaStore.Start();
                    break;
            }
        }
    }

    public static void notebookMenu() {
        boolean status = true;
        while (status) {
            System.out.println("BİLGİSAYAR MENÜSÜNE HOŞGELDİNİZ...\n1-Ürünleri Listele\n2-Ürün Ekle\n3-Ürün Sil\n4-Ürün Güncelle\n5-ÇIKIŞ");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    showNotebookList();
                    break;
                case 2:
                    productAdd();
                    break;
                case 3:
                    productDelete();
                    break;
                case 4:
                    productUpdate();
                    break;
                case 5:
                    PatikaStore.Start();
                    break;
            }
        }
    }

    public static void productList() {


    }

    public static void showNotebookList() {

        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println(
                "|  ID  |      Ürün Adı       |     Fiyatı    |    Markası   |   Hafıza  | Ekran Boyutu |  Ram  |");
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        ArrayList<Product> listNotebook = products.get("Notebook");
        if (!listNotebook.isEmpty()) {
            for (Product product : listNotebook) {
                System.out.format("| %-4s | %-19s | %-13s | %-12s | %-9s | %-12s | %-5s |\n",
                        product.idNotebook, product.name, product.price + " TL", product.brand, product.memory + " GB", product.screenSize + " INC", product.ram + " GB");

            }
            System.out.println("------------------------------------------------------------------------------------------------");
        } else System.out.println("Listede Gösterilecek Eleman Yok..");
    }

    public static void showPhoneList() {

        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID |      Ürün Adı      |     Fiyatı    |    Markası   |   Hafıza  | Ekran Boyutu |  Kamera  |    Pil   |  Ram  |   Renk   |");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        ArrayList<Product> listPhone = products.get("Phone");
        if (!listPhone.isEmpty()) {
            for (Product product : listPhone) {
                System.out.format("| %-2s | %-18s | %-13s | %-12s | %-9s | %-12s | %-8s | %-8s | %-5s | %-8s |\n",
                        product.idPhone, product.name, product.price + " TL", product.brand, product.memory + " GB", product.screenSize + " INC", product.camera + " MP", product.batteryPower + " mhA", product.ram + " GB", product.color);
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        } else System.out.println("Listede Gösterilecek Eleman Yok..");
    }

    public static void productAdd() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün Türünü Giriniz (UYARI :Başlangıç Harfi Büyük Olmalıdır) :");
        product.type = scanner.nextLine();
        System.out.print("Ürünün Adını Giriniz :");
        product.name = scanner.nextLine();
        System.out.print("Ürünün Fiyatını Giriniz :");
        product.price = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün Markasını Giriniz :");
        product.brand = scanner.nextLine();
        System.out.print("Ürünün Hafıza Bilgisini Giriniz :");
        product.memory = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün Kamera Özelliğini Giriniz :");
        product.camera = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün Rengini Giriniz :");
        product.color = scanner.nextLine();
        System.out.print("Ürünün Ekran Boyutunu Giriniz :");
        product.screenSize = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün RAM Bilgisini Giriniz :");
        product.ram = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün Batarya Kapasitesini Giriniz :");
        product.batteryPower = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün İndirimli Fiyatını Giriniz :");
        product.discountPrice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün Stok Miktarını Giriniz :");
        product.stockQuantity = scanner.nextInt();
        if (product.type.equals("Telefon")) {

            try {
                Product.id++;
                product.idPhone = Product.id;
                ArrayList<Product> listPhone = products.get("Phone");
                listPhone.add(product);
                System.out.println("Ürün Telefon Listesine Başarılı Bir Şekilde Eklendi...");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (product.type.equals("Notebook")) {

            try {
                Product.id++;
                product.idNotebook = Product.id;
                ArrayList<Product> listNotebook = products.get("Notebook");
                listNotebook.add(product);
                System.out.println("Ürün Notebook Listesine Başarılı Bir Şekilde Eklendi...");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else System.out.println("Ürün Tipi veya  Yazımı Hatalı...\nÜrün Ekleme Başarısız!! ");


    }

    public void setNextİd(int nextİd) {
        this.nextİd = nextİd;
    }

    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    public int getIdNotebook() {
        return idNotebook;
    }

    public void setIdNotebook(int idNotebook) {
        this.idNotebook = idNotebook;
    }

    public static void productDelete() {
        System.out.print("Silmek İstediğiniz Ürün Tipini Seçiniz :\n1-Notebook\n2-Phone");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                showNotebookList();
                System.out.println("Silmek istediğiniz Ürünün İd numarasını Giriniz :");
                int selectİd = scanner.nextInt();
                try {
                    if (selectİd > 0 && selectİd % 1 == 0) {
                        for (Product product : products.get("Notebook")) {
                            if (selectİd == product.getIdNotebook()) {
                                products.get("Notebook").remove(product);
                                System.out.println(selectİd + " numaralı ürün Silindi..");
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                showPhoneList();
                System.out.println("Silmek istediğiniz Ürün İd Giriniz..");
                selectİd = scanner.nextInt();
                try {
                    if (selectİd > 0 && selectİd % 1 == 0) {
                        for (Product product : products.get("Phone")) {
                            if (selectİd == product.getIdPhone()) {
                                products.get("Phone").remove(product);
                                System.out.println(selectİd + " numaralı ürün Silindi..");

                            }
                        }
                    } else System.out.println("Ürün id eşleşmiyor..");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

        }

    }

    public static void productUpdate() {
        boolean status = true;
        while (status) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Güncellemek istediğiniz ürün sınıfını Giriniz :\n1-Telefon\n2-Notebook\n3-ÇIKIŞ");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    showPhoneList();
                    System.out.print("Güncellemek istediğniz ürünün id numarasını giriniz :");
                    select = scanner.nextInt();
                    if (select > 0 && select % 1 == 0) {
                        for (Product product : products.get("Phone")) {
                            if (select == product.getIdPhone()) {
                                System.out.println("Ürünün Hangi alanını Güncellemek İstersiniz?\n1-Adını\n2-Fiyatını\n3-Markası\n4-Hafıza Bilgisi\n5-Ekran Boyutunu\n6-Kamera Özelliğini\n7-Pil Kapasitesini\n8-Ram Bilgisini\n9-Ürün Rengini");
                                int update = scanner.nextInt();
                                switch (update) {
                                    case 1:
                                        System.out.print("Yeni İsim Giriniz :");
                                        scanner.nextLine();
                                        String updateName = scanner.nextLine();
                                        if (updateName != "") {
                                            try {
                                                product.setName(updateName);
                                                System.out.println("Ürünün İsim  Bilgisi Güncellendi..");

                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı : Boş Olamaz..!");
                                        break;
                                    case 2:
                                        System.out.print("Yeni Fiyatı Giriniz :");
                                        int updatePrice = scanner.nextInt();
                                        if (updatePrice > 0 && updatePrice % 1 == 0) {
                                            try {
                                                product.setPrice(updatePrice);
                                                System.out.println("Ürünün Fiyat Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı: Tamsayı olmalıdır..");
                                        break;
                                    case 3:
                                        System.out.print("Yeni Marka Giriniz :");
                                        scanner.nextLine();
                                        String updateBrand = scanner.nextLine();
                                        if (updateBrand != " ") {
                                            try {
                                                product.setBrand(updateBrand);
                                                System.out.println("Ürünün Marka Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı : Boş olamaz...");
                                        break;
                                    case 4:
                                        System.out.print("Yeni Hafıza Bilgisini Giriniz :");
                                        int updateMemory = scanner.nextInt();
                                        if (updateMemory > 0 && updateMemory % 1 == 0) {
                                            try {
                                                product.setMemory(updateMemory);
                                                System.out.println("Ürünün Hafıza Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı: Tamsayı olmalıdır..");

                                        break;
                                    case 5:
                                        System.out.print("Yeni Ekran Bilgini Giriniz :");
                                        int updateScreen = scanner.nextInt();
                                        if (updateScreen > 0) {
                                            try {
                                                product.setScreenSize(updateScreen);
                                                System.out.println("Ürünün Ekran Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı Hatalı..");

                                        break;
                                    case 6:
                                        System.out.print("Yeni Kamera Bilgisini Giriniz :");
                                        int updateCamera = scanner.nextInt();
                                        if (updateCamera > 0 && updateCamera % 1 == 0) {
                                            try {
                                                product.setCamera(updateCamera);
                                                System.out.println("Ürünün Kamera Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else
                                            System.out.println("Giriş Formatı : Tamsayı ve Sıfırdan büyük Olmalıdır");

                                        break;
                                    case 7:
                                        System.out.print("Yeni Pil Kapasitesini Giriniz :");
                                        int updateBattery = scanner.nextInt();
                                        if (updateBattery > 0 && updateBattery % 1 == 0) {
                                            try {
                                                product.setBatteryPower(updateBattery);
                                                System.out.println("Ürünün Pil Kapasitesi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else
                                            System.out.println("Giriş Formatı : Tamsayı ve Sıfırdan büyük Olmalıdır");

                                        break;
                                    case 8:
                                        System.out.print("Yeni Ram Bilgisini Giriniz :");
                                        int updateRam = scanner.nextInt();
                                        if (updateRam > 0 && updateRam % 1 == 0) {
                                            try {
                                                product.setRam(updateRam);
                                                System.out.println("Ürün Ram Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else
                                            System.out.println("Giriş Formatı : Tamsayı ve Sıfırdan büyük Olmalıdır");

                                        break;

                                    case 9:
                                        System.out.print("Yeni Renk Giriniz :");
                                        scanner.nextLine();
                                        String updateColor = scanner.nextLine();
                                        if (!updateColor.equals(" ")) {
                                            try {
                                                product.setColor(updateColor);
                                                System.out.println("Ürün Rengi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı : Boş bırakılamaz..");

                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 2: showNotebookList();
                    System.out.print("Güncellemek istediğniz ürünün id numarasını giriniz :");
                    select = scanner.nextInt();
                    if (select > 0 && select % 1 == 0) {
                        for (Product product : products.get("Notebook")) {
                            if (select == product.getIdNotebook()) {
                                System.out.println("Ürünün Hangi alanını Güncellemek İstersiniz?\n1-Adını\n2-Fiyatını\n3-Markası\n4-Hafıza Bilgisi\n5-Ekran Boyutunu\n6-Ram Bilgisini");
                                int update = scanner.nextInt();
                                switch (update) {
                                    case 1:
                                        System.out.print("Yeni İsim Giriniz :");
                                        scanner.nextLine();
                                        String updateName = scanner.nextLine();
                                        if (updateName != "") {
                                            try {
                                                product.setName(updateName);
                                                System.out.println("Ürünün İsim  Bilgisi Güncellendi..");

                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı : Boş Olamaz..!");
                                        break;
                                    case 2:
                                        System.out.print("Yeni Fiyatı Giriniz :");
                                        int updatePrice = scanner.nextInt();
                                        if (updatePrice > 0 && updatePrice % 1 == 0) {
                                            try {
                                                product.setPrice(updatePrice);
                                                System.out.println("Ürünün Fiyat Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı: Tamsayı olmalıdır..");
                                        break;
                                    case 3:
                                        System.out.print("Yeni Marka Giriniz :");
                                        scanner.nextLine();
                                        String updateBrand = scanner.nextLine();
                                        if (updateBrand != " ") {
                                            try {
                                                product.setBrand(updateBrand);
                                                System.out.println("Ürünün Marka Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı : Boş olamaz...");
                                        break;
                                    case 4:
                                        System.out.print("Yeni Hafıza Bilgisini Giriniz :");
                                        int updateMemory = scanner.nextInt();
                                        if (updateMemory > 0 && updateMemory % 1 == 0) {
                                            try {
                                                product.setMemory(updateMemory);
                                                System.out.println("Ürünün Hafıza Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı: Tamsayı olmalıdır..");

                                        break;
                                    case 5:
                                        System.out.print("Yeni Ekran Bilgini Giriniz :");
                                        int updateScreen = scanner.nextInt();
                                        if (updateScreen > 0) {
                                            try {
                                                product.setScreenSize(updateScreen);
                                                System.out.println("Ürünün Ekran Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else System.out.println("Giriş Formatı Hatalı..");

                                        break;
                                    case 6:
                                        System.out.print("Yeni Ram Bilgisini Giriniz :");
                                        int updateRam = scanner.nextInt();
                                        if (updateRam > 0 && updateRam % 1 == 0) {
                                            try {
                                                product.setRam(updateRam);
                                                System.out.println("Ürün Ram Bilgisi Güncellendi..");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }
                                        } else
                                            System.out.println("Giriş Formatı : Tamsayı ve Sıfırdan büyük Olmalıdır");

                                        break;


                                }




                            }
                        }


                    }
                break;
                case 3: notebookMenu();
                break;
            }
        }
    }
}