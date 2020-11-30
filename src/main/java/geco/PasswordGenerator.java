package geco;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Classe permettant de générer des mots de passe.
 */
public class PasswordGenerator {

    /**
     * Attribut représentant le liste de caractères possible du password.
     */
    private String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";

    /**
     * Créer un mot de passe de 8 caractères généré de
     * manière aléatoire.
     * @return le string contenant le password.
     */
    public String getRandomPassword() {

        Random random = new Random();
        StringBuilder returnPassword = new StringBuilder();

        for(int i=0;i<8;i++){
            returnPassword.append(characters.charAt(random.nextInt(characters.length())));
        }

        return returnPassword.toString();
    }
}
