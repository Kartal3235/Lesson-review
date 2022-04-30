package interview3004;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q4 {

  /*
    1)Create a text file inside this package
    2)Type the following text inside the text file
       Java is easy to learn.
       Learn Java, earn money?
       Java is easy if you study well.
       To learn Java, type codes.
    3)Type code to print every word is used how many times in the text.
   */
  public static void main(String[] args) throws IOException {

    Map<String,Integer>wordCounter=new HashMap<>();//wordCounter map'i oluşturduk

    List<String>satırlar= Files.readAllLines(Paths.get("src/interview3004/Q4.java"), StandardCharsets.UTF_8);
    // StandardCharsets:UTF_8 adhil olmak üzere Charset için sabitleri tanımlar..
    // UTF_8(Unicode Transformation Format)     8:(8 bitlik bir unicode dönüşüm biçimidir.)..

    for (String each:satırlar) {
      String kelimeler[]=each.split("");// her kelimeyi ayırdık...arr yaptık
      for (String item:kelimeler
           ) {
        if(item.endsWith(",")||item.endsWith(".")||item.endsWith("?")){// kelime ayrımları dusunulerek yazıldı
          item=item.substring(0,item.length()-1);// kelimenin 0.indexinden son karakterine kadar dahil olarak al
                                                // noktalama işaretlerini almaz

        }
        if(!wordCounter.containsKey(item)){//önceden bakılan bir kelime yoksa
          wordCounter.put(item,1);//sayısı 1 olsun
        }else{
          wordCounter.put(item,wordCounter.get(item)+1);// önceden bakılan bir kelime ise sayısını 1 arttır.
        }
      }
    }
    System.out.println(wordCounter);


  }
}
