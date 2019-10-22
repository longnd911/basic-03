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
public class testcomplex {
    public static void main(String[] args) {
        complex sp1 = new complex(1, 2);
        complex sp2 = new complex(3, 5);
        complex a = new complex();
        complex b = new complex();
        complex c = new complex();
        complex d = new complex();
        sp1.hienthisp(sp1);
        sp2.hienthisp(sp2);
        System.out.println("tong 2 sp: ");
        a = a.tong(sp1, sp2);
        a.hienthisp(a);
        System.out.println("hieu 2 sp: ");
        b = b.hieu(sp1, sp2);
        b.hienthisp(b);
        System.out.println("tich 2 sp: ");
        c = c.tich(sp1, sp2);
        c.hienthisp(c);
        if (sp2.phanao == 0 && sp2.phanthuc == 0) {
            System.out.println("thuong ko ton tai");
        } else {

            System.out.println("thuong 2 sp: ");
            d = d.thuong(sp1, sp2);
            d.hienthisp(d);

        }
    }
}
