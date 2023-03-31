package main.java.patterns.behavioral.mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
