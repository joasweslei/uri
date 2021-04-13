import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joas
 */
public class Main {


public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N, key;
        String msg = "", msg_decifrada = "";

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            msg = in.readLine();
            key = Integer.parseInt( in.readLine() );

            char letra;
            int aux;
            for (int k = 0; k < msg.length(); k++) {
                aux = msg.charAt( k );
                aux = aux - key;
                if( aux < 65){
                    aux = aux + 26;
                }
                letra = (char) ( aux );
                msg_decifrada = msg_decifrada.concat(letra + "");
            }
            System.out.printf("%s\n", msg_decifrada);
            msg_decifrada = "";
            msg = "";
        }
    }

}
