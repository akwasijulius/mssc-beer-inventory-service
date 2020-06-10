package guru.sfg.beer.inventory.service.services;

import guru.sfg.brewery.model.events.NewInventoryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by Julius Oduro on 07/04/2020.
 */
@Slf4j
@Service
public class InventoryService {

    @JmsListener(destination = "brewing-request")
    public void processMessage(NewInventoryEvent event){
        log.info("Event received {}", event);
        //BeerDto beerDto = event.getBeerDto();
    }
}
