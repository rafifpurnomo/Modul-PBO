package Driver;

import Controller.MahasiswaController;
import Model.Mahasiswa;
import View.DataMahasiswa;
import View.editDataMahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverMahasiswa {
    private DataMahasiswa asDataMahasiswa;
    private editDataMahasiswa asEditDataMahasiswa;
    MahasiswaController mhsCNTRL;

    public DriverMahasiswa(DataMahasiswa asDataMahasiswa) {
        this.asDataMahasiswa = asDataMahasiswa;
    }
    
    public DriverMahasiswa(editDataMahasiswa asEditDataMahasiswa) {
        this.asEditDataMahasiswa = asEditDataMahasiswa;
    }
    
    public Mahasiswa search(String nama){
        String sql = "SELECT * FROM mahasiswa WHERE nama=?";
        
        try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                Mahasiswa newMhs = new Mahasiswa(rs.getString("nim"), rs.getString("nama"), rs.getString("prodi"));
                return newMhs;
            }
        } catch (SQLException e) {
            Logger.getLogger(DriverMahasiswa.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return null;
    }
    
    public boolean inputNewMahasiswa(Mahasiswa newMHS){
        String sql = "INSERT INTO mahasiswa (nim, nama, prodi) VALUES (?, ?, ?)";

    try (Connection conn = ConfigDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newMHS.getNim());
            stmt.setString(2, newMHS.getNama());
            stmt.setString(3, newMHS.getProdi());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverMahasiswa.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
        
    public boolean hapusMahasiswa(String nim){
    String sql = "DELETE FROM mahasiswa WHERE nim=?";
    
        try (Connection conn = ConfigDB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, nim);
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverMahasiswa.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
    public boolean editMahasiswa(String oldNIM, String newNim, String newNama, String newProdi) {
        String sql = "UPDATE mahasiswa SET nim = ?, nama = ?, prodi = ? WHERE nim = ?";        
        try (Connection conn = ConfigDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            
            stmt.setString(1, newNim);
            stmt.setString(2, newNama);
            stmt.setString(3, newProdi);
            stmt.setString(4, oldNIM);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverMahasiswa.class.getName()).log(Level.SEVERE, "Error updating data", e);
        }
        return false;
    }

}
