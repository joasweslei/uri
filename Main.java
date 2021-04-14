
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cliente
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, ascii, newCod;
        String line = "", aux = "";
        char c;

        N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            line = in.readLine();
            for (int j = 0; j < line.length(); j++) {
                ascii = line.charAt(j);
                if( ( ascii > 64 && ascii < 90 ) || ( ascii > 96 && ascii < 123) ) {
                    newCod = ascii + 3;
                    c = (char) newCod;
                    line = line.substring(0, j) + c + line.substring(j + 1, line.length());
                }
            }
            for (int l = line.length() - 1; l >= 0 ; l--) {
                aux = aux.concat( line.charAt(l)+"");
            }
            line = aux;
            aux = "";
            for (int k = line.length() / 2; k < line.length(); k++) {
                ascii = line.charAt(k);            
                newCod = ascii - 1;
                c = (char) newCod;
                line = line.substring(0, k) + c + line.substring(k + 1, line.length());            
            }
            System.out.printf("%s\n", line);
        }        
    }    
      
  }
