package org.example.tp.s;

public class LoginUser {

    public void loginUser(User user) {

        // Valider le nom d'utilisateur et le mot de passe
        if (ValidateUser.validateUsername(user) && ValidateUser.validatePassword(user)){
            // Authentifier l'utilisateur
            System.out.println("Utilisateur connecté avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}
