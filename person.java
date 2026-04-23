public class person {
    private String nama;
    private int usia;
    private String email;

    // Getter dan Setter untuk nama
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    // Getter dan Setter untuk usia
    public int getUsia() { return usia; }
    public void setUsia(int usia) { this.usia = usia; }

    // Getter dan Setter untuk email
    public String getEmail() {return email; }

    // Setter email biar ada "@" dan "."
    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.print("LOG: Format email" + email + "ditolak!");
        }
    }
}
