package org.example.behavior.mediator;

public class Demo {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new ChatUser("toto", chatMediator);
        User user2 = new ChatUser("flavian", chatMediator);
        User user3 = new ChatUser("morgan", chatMediator);
        User user4 = new ChatUser("tanslin", chatMediator);
        User user5 = new ChatUser("aurelien", chatMediator);


        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);
        chatMediator.addUser(user5);

        user1.send("Bonjour tout le monde");
        user3.send("Je suis heureux d'être là !!");



    }
}
