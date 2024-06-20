package Controller;

import Driver.ConfigDB;
import Model.Mahasiswa;
import java.sql.Connection;

public class MahasiswaController {
    
    public Mahasiswa inputMahasiswa(String nim, String nama, String prodi){
        return new Mahasiswa(nim, nama, prodi);
    }
}
