package guru.sfg.beer.inventory.service.event;

import lombok.NoArgsConstructor;

/**
 * Created by Julius Oduro on 07/04/2020.
 */
@NoArgsConstructor
public class BrewBeerEvent  extends BeerEvent {

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
