package com.aplikasi.controller;


import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aplikasi.dao.mhsDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juned
 */
public class mhsControllerServlet extends HttpServlet{
    private static final long serialVersionUID =1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
   {
                String nim = request.getParameter("txt_nim");
                String nama = request.getParameter("txt_nama");
                String alamat = request.getParameter("txt_alamat");
                String jenkel = request.getParameter("jenkel");
                String noHp = request.getParameter("txt_no_hp");
                String fakultas = request.getParameter("cmb_fakultas");
                String jurusan = request.getParameter("cmb_jurusan");
                String ipk = request.getParameter("txt_ipk");
        HttpSession session = request.getSession(true);
        try{
            mhsDAO mhsDao = new mhsDAO();
            mhsDao.addMhsDetails(nim, nama, alamat, jenkel, noHp, fakultas, jurusan, null);
            response.sendRedirect("Success");
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    
}
