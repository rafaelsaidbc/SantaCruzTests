package android.example.com.santacruztests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rafael Said on 15/08/17.
 */
public class Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Santa Cruz x Paraguai", "08/01", "10:00", "Cachoeirinha"));


        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

    }
}

/*\nJaneiro\n
\n08/01 - 10:00\nSanta Cruz 4 x 2 Força Jovem\nGols: Du, Rafael e Érik (2)
        \n15/01 - 08:00\nSanta Cruz 2 x 6 Paraguai\nGol: Alex (2)
        \n29/01 - 10:30\nNovo Silvestre 5 x 2 Santa Cruz\nGol: Bruno e Ieiel
        \nFevereiro\n
        \n05/02 - 10:00\nSanta Cruz 1 x 3 Couceiro\nGol: Bruno
        \n12/02  - 08:00\nSanta Cruz 1 x 1 Alfa\nGol: Rafael
        \n19/02 - 10:00\nSanta Cruz 3 x 2 São Cristóvão\nGols: Rafael, Erli e Bruno
        \nMarço\n
        \n05/03 - 10:00\nSanta Cruz 2 x 3 Nova Geração\nGols: Bruno e Rafael
        \n12/03 - 08:00\nSanta Cruz 1 x 2 Sapão\nGol: Erli
        \n19/03 - 10:00\nSanta Cruz 6 x 5 Bella Vista\nGols: Erik (4), Rafael e Bruno
        \n26/03 - 10:00\nCidade Nova 1 x 2 Santa Cruz\nGols: Erik e Flávio
        \nAbril\n
        \n02/04 - 10:00\nSanta Cruz 4 x 3 Estrelas\nGols: Júnior Baiano, Rafael, Alex (2)
        \n09/04 - 08:00\nSanta Cruz 11 x 2 Galácticos de Viçosa\nGols: Bruno (5), Alex (3), Erik (2) e Bilim
        \n16/04 - 08:00\nSanta Cruz 1 x 1 Libertad de Teixeiras\nGol: Flávio
        \n23/04 - 08:00\nSanta Cruz 1 x 1 Líder do Bj\nGol: Érik
        \n30/04 - 08:00\n09 de Julho 0 x 2 Santa Cruz\nGols: Flávio e Gabriel (Ieiel)
        \n Maio\n
        \n07/05 - 08:00\nSanta Cruz 0 x 6 América Sapé
        \n14/05 - 10:00\nSanta Cruz 2 x 2 Platinus\nGols: Érik e Rafael
        \n21/05 - 08:00\nSanta Cruz 1 x 3 Audax\nGol: Flávio
        \n28/05 - 10:00\nForça Jovem 2 x 2 Santa Cruz\nGols: Érik e Bruno
        \nJunho\n
        \n04/06 - 08:00\nSanta Cruz 4 x 2 Furacão BJ\nGols: Rafael, Érik e Alex(2)
        \n11/06 - 10:00\nSanta Cruz 7 x 4 Saidera\nGols: Érik (4), Rafael (2) e Erli
        \n18/06 - 08:00\nSanta Cruz 1 x 0 Fundense\nGol: Érik
        \n25/06 - 10:00\nSanta Cruz 1 x 3 Itapir JR\nGol: Rafael
        \nJulho\n
        \n02/07 - 08:00\nSanta Cruz 6 x  3Ferro Velho de Piranga\nGols: Alex (4), Érik, Erli
        \n09/07 - 10:00\nSanta Cruz 2 x 5 Praia Danta de Araponga\nGols: Erick e Bruno
        \n16/07 - 08:00\nSanta Cruz 2 x 0 Acadêmico\nGols: Alex e Rafael
        \n23/07 - 10:00\nSanta Cruz 3 x 4 Galvão\nGols: Ieiel, Bil, contra
        \n30/07 - 10:00\nSapão 4 x 3 Santa Cruz\nGols: Érik, Alex, Rafael
        \nAgosto\n
        \n06/08 - Unidos E. C. 3 x 4 Santa Cruz\nGols: Érik (3), e Alex
        */

