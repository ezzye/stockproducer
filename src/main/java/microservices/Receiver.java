package microservices;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Component
public class Receiver {

    @JmsListener(destination = "stock.queue", containerFactory = "myFactory")
    public void receiveMessage(Stock stock) {
        System.out.println("do stock stuff");
    }

}
