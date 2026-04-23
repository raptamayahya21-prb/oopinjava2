public class Main {
    public static void main(String[] args) {
        // Tes Person
        person p = new person();
        p.setNama("yahya");
        p.setEmail("yahyagmail.com"); // Contoh salah
        p.setEmail("yahya@gmail.com"); // Contoh benar

        // Tes Record Product
        Product laptop = new Product("LP01", 15000.0, 5);

        System.out.println("Data Person: " + p.getNama() + " - " + p.getEmail());
        System.out.println("Data Produk: " + laptop);
    }
}
