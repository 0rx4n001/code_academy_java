package DB_less;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";  // PostgreSQL bağlantısı
        String username = "myuser";  // İstifadəçi adı
        String password = "mypassword";  // Şifrə

        try {
            // Bağlantı qurulur
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Bağlantı uğurla quruldu!");

            // SQL sorğusu işlədilir
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT version();");

            // Sorğudan alınan nəticə çap olunur
            if (rs.next()) {
                System.out.println("PostgreSQL versiyası: " + rs.getString(1));
            }

            // Bağlantı və resursları bağla
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // Xətalar üçün
            System.out.println("❌ Xəta baş verdi:");
            e.printStackTrace();
        }
    }
}
