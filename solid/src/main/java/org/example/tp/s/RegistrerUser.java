package org.example.tp.s;

public class RegistrerUser {

    ValidateUser validateUser = new ValidateUser();

    public void registerUser(User user) {
        // Valider le nom d'utilisateur et le mot de passe
        if (validateUser.validateUsername(user) && validateUser.validatePassword(user)) {
            // Enregistrer l'utilisateur dans la base de données
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }

}
