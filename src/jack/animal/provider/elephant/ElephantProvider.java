package jack.animal.provider.elephant;

import jack.animal.provider.Provider;
import jack.animal.service.AnimalService;

public class ElephantProvider implements Provider {

    @Override
    public AnimalService createService() {
        return new ElephantService();
    }
    
}
