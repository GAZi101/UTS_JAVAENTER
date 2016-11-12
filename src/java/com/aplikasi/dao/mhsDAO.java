package com.aplikasi.dao;


import com.aplikasi.bean.Mahasiswa;
import java.math.BigDecimal;
import javafx.util.converter.BigDecimalStringConverter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juned
 */
public class mhsDAO {
    public void addMhsDetails(String nim, String nama, String alamat, String jenkel, String noHp, 
            String falultas, String jurusan, BigDecimalStringConverter ipk ){
        try{
            Configuration config = new Configuration();
            SessionFactory sesiFactory = config.buildSessionFactory();
            
            Session sesi = sesiFactory.openSession();
            Transaction tansaksi = sesi.beginTransaction();
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(nim);
            mhs.setNama(nama);
            mhs.setAlamat(alamat);
            mhs.setJenkel(jenkel);
            mhs.setNoHp(noHp);
            mhs.setFakultas(falultas);
            mhs.setJurusan(jurusan);
            mhs.setIpk(BigDecimal.ONE);
            
            sesi.save(mhs);
            tansaksi.commit();
            System.out.println("Details Added");
        }catch (HibernateException e){
            System.out.println(e.getMessage());
            System.out.println("");
            
        }
        
    }

    private Session sesiFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
