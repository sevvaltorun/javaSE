package org.sevvaltorun;

import javax.swing.JOptionPane;

public class _9_jOptionalPaneLesson {
    public static void main(String[] args) {
        /*
        JOptionalPane, Java Swing kütüphaneside bulunan bir sınıftır ve kullanıcı arayüzü bileşenlerini
        kullanarak iletişim kutuları(dialog) oluşturmak için kullanılır.
        Bu iletişim kutuları, kullanıcıya mesaj göstermek için bilgi almak ve onaylamak gibi işlevleri için kullanılabilir.
         */
        //kullanıcıya basit bir iletişim kutusu gösterme
        JOptionPane.showMessageDialog(null, "Hello!");

        //kullanıcıdan metin girişi alma
        String name = JOptionPane.showInputDialog("What's u name?");
        JOptionPane.showMessageDialog(null, "Hi," + name + " !");

    }
}
