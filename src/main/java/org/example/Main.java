package org.example;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //bad code
    public static void main(String[] args) throws Exception {

        String path = "https://cf.lottecinema.co.kr//Media/MovieFile/MovieMedia/202406/21170_301_2.mp4";

        URL url = new URL(path);

        InputStream fin = url.openStream();

        //InputStream fin = new FileInputStream("aaa.jpg");
        OutputStream fos = new FileOutputStream("bbb.mp4");

        System.out.println(fin);

        while (true) {

            int data = fin.read();
            System.out.println(data);

            fos.write(data);
            if (data == -1) {
                break;
            }//end if
        }//end while
    }
}
//        Scanner in = new Scanner(System.in);
//
//        while(true){
//
//            System.out.println("숫자만 입력하세요");
//
//            String str = in.nextLine();
//
//            int value = Integer.parseInt(str);
//
//            System.out.println(value);
//
//        }//end while

//    }
//}