package jack.animal.provider.ant;

import jack.animal.provider.Provider;
import jack.animal.service.AnimalService;

public class AntProvider implements Provider {

    @Override
    public AnimalService createService() {
        return new AntService();
    }
    
}
