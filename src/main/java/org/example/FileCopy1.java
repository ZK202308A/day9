package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {


    //bad code
    public void copy(String origin, String dest){


        //finally에서 쓰려고
        InputStream in = null;
        OutputStream out = null;

        try{
            in = new FileInputStream(origin);
            out = new FileOutputStream(dest);

            while (true) {
                int data = in.read();

                out.write(data);
                if (data == -1) {
                    break;
                }//end if
            }//end while

            //방법1 ---- 조커수준! -- 올드 스타 개발자
            in.close();
            in = null;
            out.close();
            out = null;

        }catch(Exception e){
            e.printStackTrace(); //권장할 만한 습관은 절대 아님
        }finally{
            //방법2 -------- 빌런 -- 개과천선
            if(in != null){
                try { in.close();}catch (Exception e) { }//end catch
            }
            if(out != null){
                try { out.close();}catch (Exception e) { }//end catch
            }

        }
    }
}

