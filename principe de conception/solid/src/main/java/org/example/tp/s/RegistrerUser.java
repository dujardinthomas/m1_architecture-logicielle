package org.example.tp.s;

public class RegistrerUser {

    public void registerUser(User user) {
        // Valider le nom d'utilisateur et le mot de passe
        if (ValidateUser.validateUsername(user) && ValidateUser.validatePassword(user)) {
            // Enregistrer l'utilisateur dans la base de données
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }

}
