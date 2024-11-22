package org.example.behavior.mediator;

public interface ChatMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
