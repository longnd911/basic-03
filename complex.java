/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

/**
 *
 * @author Administrator
 */
public class complex {

    float phanthuc;
    float phanao;

    complex() {
        
    }

    complex(float z) {
        phanthuc = z;
    }

    complex(float x, float y) {
        phanthuc = x;
        phanao = y;
    }

    void hienthisp(complex sp) {
        System.out.println(phanthuc + "+" + phanao + "i");
    }

    complex tong(complex sp1, complex sp2) {
        complex kq = new complex();
        kq.phanthuc = sp1.phanthuc + sp2.phanthuc;
        kq.phanao = sp1.phanao + sp2.phanao;
        return kq;

    }

    complex hieu(complex sp1, complex sp2) {
        complex kq = new complex();
        kq.phanthuc = sp1.phanthuc - sp2.phanthuc;
        kq.phanao = sp1.phanao - sp2.phanao;
        return kq;

    }

    complex tich(complex sp1, complex sp2) {
        complex kq = new complex();
        kq.phanthuc = sp1.phanthuc * sp2.phanthuc - sp1.phanao * sp2.phanao;
        kq.phanao = sp1.phanao * sp2.phanthuc + sp1.phanthuc * sp2.phanao;
        return kq;

    }

    complex thuong(complex sp1, complex sp2) {
        complex kq = new complex();

        kq.phanthuc = (sp1.phanthuc * sp2.phanthuc + sp1.phanao * sp2.phanao) / (sp2.phanao * sp2.phanao + sp2.phanthuc * sp2.phanthuc);
        kq.phanao = (sp1.phanao * sp2.phanthuc - sp1.phanthuc * sp2.phanao) / (sp2.phanao * sp2.phanao + sp2.phanthuc * sp2.phanthuc);;

        return kq;

    }
    
}
