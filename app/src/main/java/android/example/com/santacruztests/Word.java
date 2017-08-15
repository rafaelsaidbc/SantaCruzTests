package android.example.com.santacruztests;

/**
 * Created by Rafael Said on 14/08/17.
 * <p>
 * representa um vocabulário de palavras que o usuário quer aprender.
 * Contém a palavra do idioma padrão (nativo), neste caso o inglês, e a palavra traduzida para o idioma
 * que se quer aprender, neste caso o Miwok
 */


public class Word {

    private String mAdversarios;

    //Define o nome do jogador
    private String mData;

    //define o apelido do jogador
    private String mHora;

    //Define a data de nascimento do jogador
    private String mLocal;

    public Word(String adversarioJogo, String dataJogo, String horaJogo, String localJogo) {
        mAdversarios = adversarioJogo;
        mData = dataJogo;
        mHora = horaJogo;
        mLocal = localJogo;
    }


    //get the default translation word.
    /*public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    */

    public String getAdversarioJogo() {
        return mAdversarios;
    }

    //retorna o data do jogo
    public String getDataJogo() {
        return mData;
    }

    //retorna o hora do jogo
    public String getHoraJogo() {
        return mHora;
    }

    //get the Miwok translation word.
    /*public String getMiwokTranslation() {
        return mMiwokTranslation;
    }*/

    //retorna a local do jogo
    public String getLocalJogo() {
        return mLocal;
    }


}
