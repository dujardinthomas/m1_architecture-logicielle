package org.example.tp.s;

public class LoginUser {

    ValidateUser validateUser = new ValidateUser();

    public void loginUser(User user) {

        // Valider le nom d'utilisateur et le mot de passe
        if (validateUser.validateUsername(user) && validateUser.validatePassword(user)){
            // Authentifier l'utilisateur
            System.out.println("Utilisateur connecté avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}
